package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.DsIcon
import com.yx360.design.compose.DsTypography
import com.yx360.design.compose.icons.dsicon.CloseCircleSolidSm
import com.yx360.design.compose.icons.dsicon.SearchOutlineMd
import com.yx360.design.compose.icons.dsicon.SearchOutlineSm
import kotlin.math.abs

/**
 * [Figma](https://nda.ya.ru/t/DU5gR_0377PpBR)
 */
@Composable
fun DsSearch(
    value: String,
    placeholder: String,
    size: DsSearch.Size,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClear: (() -> Unit)? = null,
    sidePaddings: Boolean = true,
) {
    val textStyle = when (size) {
        DsSearch.Size.Lg -> DsTypography.BodyShortLgRegular
        DsSearch.Size.Md -> DsTypography.BodyShortMdRegular
    }
    var isFocused by remember { mutableStateOf(true) }
    var containerY by remember { mutableStateOf(0f) }
    var clearButtonY by remember { mutableStateOf(0f) }
    val clearButtonTopPadding = remember { derivedStateOf { abs(clearButtonY - containerY) } }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(
                vertical = if (sidePaddings) Ds.Spacing.M4 else 0.dp,
                horizontal = if (sidePaddings) Ds.Spacing.M8 else 0.dp,
            )
            .fillMaxWidth()
            .background(
                color = Ds.Color.SurfaceGeneric,
                shape = RoundedCornerShape(size.shapeRadius),
            )
            .height(size.height)
            .onGloballyPositioned { coordinates: LayoutCoordinates ->
                containerY = coordinates.positionInWindow().y
            }
    ) {
        Icon(
            imageVector = size.image,
            contentDescription = null,
            tint = Ds.Color.TextSecondary,
            modifier = Modifier
                .padding(
                    start = size.iconStartPadding,
                    end = Ds.Spacing.M6,
                )
        )
        BasicTextField(
            value = value,
            onValueChange = {
                onValueChanged(makeSingleLine(it))
            },
            modifier = Modifier
                .onFocusChanged { focusState ->
                    isFocused = focusState.isFocused
                }
                .weight(1f),
            enabled = enabled,
            readOnly = !enabled,
            textStyle = textStyle.copy(color = Ds.Color.TextPrimary),
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Sentences),
            keyboardActions = KeyboardActions.Default,
            maxLines = 1,
            singleLine = true,
            cursorBrush = SolidColor(Ds.Color.TextPrimary),
            decorationBox = { innerTextField ->
                if (!isFocused) {
                    if (value.isEmpty()) {
                        Text(
                            modifier = Modifier
                                .padding(end = Ds.Spacing.M8),
                            text = placeholder,
                            maxLines = 1,
                            style = textStyle,
                            color = Ds.Color.TextTertiary,
                            overflow = TextOverflow.Ellipsis,
                        )
                        innerTextField()
                    } else {
                        Text(
                            text = value,
                            maxLines = 1,
                            style = textStyle,
                            color = Ds.Color.TextPrimary,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                } else {
                    innerTextField()
                }
            }
        )
        if (value.isNotEmpty() && enabled) {
            IconButton(
                onClick = {
                    onClear?.invoke()
                    onValueChanged("")
                },
                modifier = Modifier
                    .onGloballyPositioned { coordinates: LayoutCoordinates ->
                        clearButtonY = coordinates.positionInWindow().y
                    }
                    .padding(
                        start = Ds.Spacing.M6,
                        end = with(LocalDensity.current) {
                            clearButtonTopPadding.value.toDp()
                        }
                    )
                    .size(Ds.Size.M20),
            ) {
                Icon(
                    imageVector = Ds.Icon.CloseCircleSolidSm,
                    tint = Ds.Color.TextTertiary,
                    contentDescription = null,
                )
            }
        }
    }
}

object DsSearch {
    enum class Size(
        val shapeRadius: Dp,
        val height: Dp,
        val image: ImageVector,
        val iconStartPadding: Dp,
    ) {
        Lg(
            shapeRadius = Ds.Rounding.M8,
            height = Ds.Size.M24,
            image = DsIcon.SearchOutlineMd,
            iconStartPadding = Ds.Spacing.M8,
        ),
        Md(
            shapeRadius = Ds.Rounding.M6,
            height = Ds.Size.M18,
            image = DsIcon.SearchOutlineSm,
            iconStartPadding = Ds.Spacing.M6,
        ),
    }
}

private fun makeSingleLine(value: String) = value.substringBefore("\n")
