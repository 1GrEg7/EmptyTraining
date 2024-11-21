package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.atoms.utils.drawLoading
import com.yx360.design.compose.atoms.utils.getLoadingOffsetState
import com.yx360.design.compose.atoms.utils.vectorToBitmap
import com.yx360.design.compose.icons.dsicon.LoadingPattern

/**
 * [Figma](https://nda.ya.ru/t/HFyzOss777cp55)
 */
@Suppress("LongMethod")
@ExperimentalOrbitaDsAtom
@Composable
fun DsButton(
    title: String,
    onClick: () -> Unit,
    variant: DsButton.Style,
    modifier: Modifier = Modifier,
    size: DsButton.Size = DsButton.Size.Md,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    description: String? = null,
    loadingIndicator: Boolean = false,
    contentDescription: String? = null,
    enabled: Boolean = true,
) {
    DsButton(
        title = AnnotatedString(title),
        onClick = onClick,
        variant = variant,
        modifier = modifier,
        size = size,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        description = description,
        loadingIndicator = loadingIndicator,
        contentDescription = contentDescription,
        enabled = enabled,
    )
}

@Suppress("LongMethod")
@ExperimentalOrbitaDsAtom
@Composable
fun DsButton(
    title: AnnotatedString,
    onClick: () -> Unit,
    variant: DsButton.Style,
    modifier: Modifier = Modifier,
    size: DsButton.Size = DsButton.Size.Md,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    description: String? = null,
    loadingIndicator: Boolean = false,
    contentDescription: String? = null,
    enabled: Boolean = true,
) {
    val backgroundDefaultColor: Color
    val backgroundPressedColor: Color
    val backgroundDisabledColor = Ds.Color.SurfaceDisabled
    val contentDisabledColor = Ds.Color.TextDisabled
    val loadingIndicatorColor: Color
    val labelColor: Color
    val descriptionColor: Color
    val iconColor: Color
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val state = remember(enabled, isPressed) {
        when {
            !enabled -> DsButton.State.Disabled
            isPressed -> DsButton.State.Pressed
            else -> DsButton.State.Default
        }
    }
    when (variant) {
        DsButton.Style.Brand -> {
            backgroundDefaultColor = Ds.BrandColor.SurfaceBrand
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.BrandColor.TextBrandStatic
            descriptionColor = Ds.BrandColor.TextBrandStatic
            iconColor = Ds.BrandColor.TextBrandStatic
        }

        DsButton.Style.Neutral -> {
            backgroundDefaultColor = Ds.Color.SurfaceGeneric
            backgroundPressedColor = Ds.Color.SurfaceGenericMediumPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.Color.TextPrimary
            descriptionColor = Ds.Color.TextPrimary
            iconColor = Ds.Color.TextPrimary
        }

        DsButton.Style.Contrast -> {
            backgroundDefaultColor = Ds.Color.SurfaceInverse
            backgroundPressedColor = Ds.Color.SurfaceInversePressed
            loadingIndicatorColor = Ds.Color.TextInverse
            labelColor = Ds.Color.TextInverse
            descriptionColor = Ds.Color.TextInverse
            iconColor = Ds.Color.TextInverse
        }

        DsButton.Style.StaticLight -> {
            backgroundDefaultColor = Ds.Color.SurfaceStaticLight
            backgroundPressedColor = Ds.Color.SurfaceStaticLight
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.Color.TextStaticHeavy
            descriptionColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextStaticHeavy
        }

        DsButton.Style.Danger -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackDanger
            backgroundPressedColor = Ds.Color.SurfaceFeedbackDangerPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.Color.TextStaticLight
            descriptionColor = Ds.Color.TextStaticLight
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Success -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackSuccess
            backgroundPressedColor = Ds.Color.SurfaceFeedbackSuccessPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.Color.TextStaticLight
            descriptionColor = Ds.Color.TextStaticLight
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Warning -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackWarning
            backgroundPressedColor = Ds.Color.SurfaceFeedbackWarningPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.Color.TextStaticLight
            descriptionColor = Ds.Color.TextStaticLight
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Info -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackInfo
            backgroundPressedColor = Ds.Color.SurfaceFeedbackInfoPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            labelColor = Ds.BrandColor.TextBrandStatic
            descriptionColor = Ds.BrandColor.TextBrandStatic
            iconColor = Ds.BrandColor.TextBrandStatic
        }
    }
    Box(
        modifier = modifier
            .height(
                when (size) {
                    DsButton.Size.Lg -> Ds.Size.M28
                    DsButton.Size.Md -> Ds.Size.M20
                    DsButton.Size.Sm -> Ds.Size.M16
                }
            )
            .clip(
                RoundedCornerShape(
                    when (size) {
                        DsButton.Size.Lg -> Ds.Rounding.M8
                        DsButton.Size.Md -> Ds.Rounding.M6
                        DsButton.Size.Sm -> Ds.Rounding.M5
                    }
                )
            )
            .background(
                when (state) {
                    DsButton.State.Disabled -> backgroundDisabledColor
                    DsButton.State.Default -> backgroundDefaultColor
                    DsButton.State.Pressed -> backgroundPressedColor
                }
            )
            .clickable(
                interactionSource = interactionSource,
                role = Role.Button,
                indication = ripple(),
                enabled = enabled && !loadingIndicator,
                onClick = onClick,
            )
            .padding(
                horizontal = when (size) {
                    DsButton.Size.Lg -> Ds.Size.M10
                    DsButton.Size.Md -> Ds.Size.M8
                    DsButton.Size.Sm -> Ds.Size.M6
                }
            ),
        contentAlignment = Alignment.Center,
        content = {
            ButtonContent(
                title,
                state,
                size,
                leftIcon,
                rightIcon,
                description,
                contentDescription,
                contentDisabledColor,
                labelColor,
                descriptionColor,
                iconColor
            )
            if (loadingIndicator) {
                val loadingIcon = rememberVectorPainter(Ds.Icon.LoadingPattern)
                val bitmap = vectorToBitmap(loadingIcon, loadingIndicatorColor)
                val brush = remember {
                    ImageShader(
                        bitmap,
                        TileMode.Repeated,
                        TileMode.Repeated
                    )
                }
                Box(modifier) {
                    drawLoading(
                        brush = brush,
                        offset = getLoadingOffsetState(target = bitmap.width.toFloat())
                    )
                }
            }
        }
    )
}

object DsButton {

    enum class Size {
        Lg,
        Md,
        Sm,
    }

    enum class Style {
        Brand,
        Neutral,
        Contrast,
        StaticLight,
        Danger,
        Success,
        Warning,
        Info,
    }

    internal enum class State {
        Default,
        Pressed,
        Disabled,
    }
}

@Suppress("LongMethod")
@Composable
internal fun ButtonContent(
    title: String,
    state: DsButton.State,
    size: DsButton.Size,
    leftIcon: Painter?,
    rightIcon: Painter?,
    description: String?,
    contentDescription: String?,
    contentDisabledColor: Color,
    labelColor: Color,
    descriptionColor: Color,
    iconColor: Color
) {
    ButtonContent(
        title = AnnotatedString(title),
        state = state,
        size = size,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        description = description,
        contentDescription = contentDescription,
        contentDisabledColor = contentDisabledColor,
        labelColor = labelColor,
        descriptionColor = descriptionColor,
        iconColor = iconColor,
    )
}

@Suppress("LongMethod")
@Composable
internal fun ButtonContent(
    title: AnnotatedString,
    state: DsButton.State,
    size: DsButton.Size,
    leftIcon: Painter?,
    rightIcon: Painter?,
    description: String?,
    contentDescription: String?,
    contentDisabledColor: Color,
    labelColor: Color,
    descriptionColor: Color,
    iconColor: Color
) {
    val padding = remember(size) {
        when (size) {
            DsButton.Size.Lg -> Ds.Spacing.M4
            DsButton.Size.Md -> Ds.Spacing.M4
            DsButton.Size.Sm -> Ds.Spacing.M2
        }
    }
    val iconSize = remember(size) {
        when (size) {
            DsButton.Size.Lg -> Ds.Spacing.M12
            DsButton.Size.Md -> Ds.Spacing.M8
            DsButton.Size.Sm -> Ds.Spacing.M8
        }
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(padding),
    ) {
        leftIcon?.let {
            Icon(
                modifier = Modifier
                    .size(iconSize),
                painter = it,
                contentDescription = contentDescription,
                tint = if (state == DsButton.State.Disabled) {
                    contentDisabledColor
                } else {
                    iconColor
                }
            )
        }
        BoxWithConstraints {
            val maxTextWidth = remember(
                this@BoxWithConstraints.maxWidth,
                padding,
                rightIcon,
                iconSize
            ) {
                this@BoxWithConstraints.maxWidth - padding - if (rightIcon != null) {
                    iconSize
                } else {
                    0.dp
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    modifier = Modifier
                        .widthIn(max = maxTextWidth),
                    text = title,
                    color = if (state == DsButton.State.Disabled) {
                        contentDisabledColor
                    } else {
                        labelColor
                    },
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = when (size) {
                        DsButton.Size.Lg -> Ds.Typography.BodyLgMedium
                        DsButton.Size.Md -> Ds.Typography.BodyMdMedium
                        DsButton.Size.Sm -> Ds.Typography.BodyShortMdMedium
                    }
                )
                description?.let {
                    Text(
                        modifier = Modifier
                            .widthIn(max = maxTextWidth),
                        text = it,
                        color = if (state == DsButton.State.Disabled) {
                            contentDisabledColor
                        } else {
                            descriptionColor
                        },
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        style = Ds.Typography.CaptionMdRegular
                    )
                }
            }
        }
        rightIcon?.let {
            Icon(
                modifier = Modifier
                    .size(iconSize),
                painter = it,
                contentDescription = null,
                tint = if (state == DsButton.State.Disabled) {
                    contentDisabledColor
                } else {
                    iconColor
                }
            )
        }
    }
}
