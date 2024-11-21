package com.yx360.design.compose.atoms

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.contentPaddingWithLabel
import androidx.compose.material3.TextFieldDefaults.contentPaddingWithoutLabel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.SuccessOutlineSm
import com.yx360.design.compose.icons.dsicon.WarningOutlineSm

/**
 * [Figma](https://nda.ya.ru/t/nyYf844w77KKKn)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DsInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    state: DsInput.State = DsInput.State.Default(),
    maxLines: Int = 1,
    maxValue: Int? = null,
    label: String? = null,
    placeholder: String? = null,
    icon: Painter? = null,
    iconColor: Color = Ds.Color.TextSecondary,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
) {
    val customLabel = label.takeIf { placeholder == null }
    val enabled = when (state) {
        is DsInput.State.Default -> state.enabled
        is DsInput.State.Error,
        is DsInput.State.Success -> true
    }
    val description = when (state) {
        is DsInput.State.Default -> state.description
        is DsInput.State.Error -> state.description
        is DsInput.State.Success -> state.description
    }
    val interactionSource = remember { MutableInteractionSource() }
    BasicTextField(
        value = value.take(maxValue ?: Int.MAX_VALUE),
        textStyle = Ds.Typography.BodyShortLgRegular.copy(color = Ds.Color.TextPrimary),
        onValueChange = { onValueChange(it.take(maxValue ?: Int.MAX_VALUE)) },
        enabled = enabled,
        readOnly = false,
        modifier = modifier
            .defaultMinSize(
                minHeight = Ds.Size.M14,
            )
            .fillMaxWidth()
            .padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
        maxLines = maxLines,
        cursorBrush = SolidColor(Ds.Color.TextPrimary),
        interactionSource = interactionSource,
        decorationBox = { innerTextField ->
            TextFieldDefaults.DecorationBox(
                value = value.take(maxValue ?: Int.MAX_VALUE),
                innerTextField = innerTextField,
                enabled = enabled,
                singleLine = true,
                isError = state is DsInput.State.Error,
                label = customLabel?.let {
                    @Composable {
                        Text(text = it)
                    }
                },
                placeholder = placeholder?.let {
                    @Composable {
                        Column {
                            Text(text = it, overflow = TextOverflow.Ellipsis, maxLines = 1)
                        }
                    }
                },
                leadingIcon = icon?.let {
                    @Composable {
                        Icon(
                            painter = it,
                            contentDescription = null,
                            tint = iconColor,
                            modifier = Modifier
                                .size(Ds.Size.M12)
                        )
                    }
                },
                supportingText = if (description != null || maxValue != null) {
                    Description(description, value, state, maxValue)
                } else {
                    null
                },
                shape = RoundedCornerShape(Ds.Size.M8),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Ds.Color.TextPrimary,
                    unfocusedTextColor = Ds.Color.TextPrimary,
                    disabledTextColor = Ds.Color.TextPrimary,
                    errorTextColor = Ds.Color.TextPrimary,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    focusedLabelColor = Ds.Color.TextSecondary,
                    unfocusedLabelColor = Ds.Color.TextSecondary,
                    disabledLabelColor = Ds.Color.TextDisabled,
                    errorLabelColor = Ds.Color.TextSecondary,
                    unfocusedContainerColor = Ds.Color.SurfaceGeneric,
                    focusedContainerColor = Ds.Color.SurfaceGeneric,
                    disabledContainerColor = Ds.Color.SurfaceDisabled,
                    errorContainerColor = Ds.Color.SurfaceFeedbackDangerLight,
                    cursorColor = Ds.Color.TextPrimary,
                    errorCursorColor = Ds.Color.TextPrimary,
                    focusedLeadingIconColor = Ds.Color.TextTertiary,
                    errorLeadingIconColor = Ds.Color.TextTertiary,
                    disabledLeadingIconColor = Ds.Color.TextTertiary,
                    unfocusedLeadingIconColor = Ds.Color.TextTertiary,
                ),
                contentPadding = if (label == null) {
                    contentPaddingWithoutLabel(start = Ds.Spacing.M6, end = Ds.Spacing.M8)
                } else {
                    contentPaddingWithLabel(start = Ds.Spacing.M6, end = Ds.Spacing.M8)
                },
                interactionSource = interactionSource,
                visualTransformation = VisualTransformation.None,
            )
        },
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
    )
}

object DsInput {

    sealed interface State {
        data class Default(
            val description: String? = null,
            val enabled: Boolean = true
        ) : State

        data class Error(val description: String? = null) : State

        data class Success(val description: String? = null) : State
    }
}

@Composable
private fun Description(
    description: String?,
    value: String,
    state: DsInput.State,
    maxValue: Int?,
): @Composable (() -> Unit) = {
    Row(
        modifier = Modifier
            .padding(
                // M4 Figma, but now it's already 4.dp top padding internally in lib for supportingText
                top = Ds.Spacing.M2,
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M2),
    ) {
        if (description != null) {
            val color = when (state) {
                is DsInput.State.Default -> Ds.Color.TextSecondary
                is DsInput.State.Error -> Ds.Color.TextFeedbackDanger
                is DsInput.State.Success -> Ds.Color.TextFeedbackSuccess
            }
            val image = when (state) {
                is DsInput.State.Default -> null
                is DsInput.State.Error -> Ds.Icon.WarningOutlineSm
                is DsInput.State.Success -> Ds.Icon.SuccessOutlineSm
            }
            if (image != null) {
                Icon(
                    painter = rememberVectorPainter(image = image),
                    contentDescription = null,
                    tint = color,
                )
            }
            Text(
                modifier = Modifier.weight(1f),
                text = description,
                style = Ds.Typography.BodyShortMdRegular,
                color = color,
            )
        }
        if (maxValue != null) {
            if (description == null) {
                Spacer(modifier = Modifier.weight(1f))
            }
            val charCount = value.length
            Text(
                text = "$charCount / $maxValue",
                color = Ds.Color.TextSecondary,
                style = Ds.Typography.BodyShortMdRegular,
            )
        }
    }
}
