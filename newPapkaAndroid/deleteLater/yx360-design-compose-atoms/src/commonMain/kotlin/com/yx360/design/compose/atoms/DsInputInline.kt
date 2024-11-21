package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom

/**
 * [Figma](https://nda.ya.ru/t/xSlZy_6l77jciM)
 */
@ExperimentalOrbitaDsAtom
@Composable
fun DsInputInline(
    value: String,
    placeholder: String,
    size: DsInputInline.Size,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    valueLinesLimit: Int = Int.MAX_VALUE,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                vertical = Ds.Spacing.M4,
                horizontal = Ds.Spacing.M8
            )
    ) {
        BasicTextField(
            modifier = Modifier
                .widthIn(max = this.maxWidth),
            textStyle = when (size) {
                DsInputInline.Size.Md -> Ds.Typography.BodyLgRegular
                DsInputInline.Size.Lg -> Ds.Typography.HeadingMd
            }.copy(
                color = Ds.Color.TextPrimary
            ),
            value = value,
            maxLines = valueLinesLimit,
            enabled = enabled,
            onValueChange = onValueChange,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            cursorBrush = SolidColor(Ds.Color.TextPrimary),
        )
        if (value.isEmpty()) {
            Text(
                modifier = Modifier
                    .widthIn(max = this.maxWidth),
                text = placeholder,
                style = when (size) {
                    DsInputInline.Size.Md -> Ds.Typography.BodyLgRegular
                    DsInputInline.Size.Lg -> Ds.Typography.HeadingMd
                },
                color = Ds.Color.TextTertiary
            )
        }
    }
}

object DsInputInline {
    enum class Size {
        Md, Lg
    }
}
