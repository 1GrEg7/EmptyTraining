package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.atoms.utils.drawLoading
import com.yx360.design.compose.atoms.utils.getLoadingOffsetState
import com.yx360.design.compose.atoms.utils.vectorToBitmap
import com.yx360.design.compose.icons.dsicon.LoadingPattern

/**
 * [Figma](https://nda.ya.ru/t/_S-y8ApG77cp6i)
 */
@Suppress("LongMethod")
@ExperimentalOrbitaDsAtom
@Composable
fun DsButtonTransparent(
    title: String,
    onClick: () -> Unit,
    variant: DsButton.Style,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: DsButton.Size = DsButton.Size.Md,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    description: String? = null,
    loadingIndicator: Boolean = false,
    sideMargins: Boolean = false,
    contentDescription: String? = null,
) {
    val backgroundPressedColor: Color
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
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandLight
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.BrandColor.TextBrand
            descriptionColor = Ds.BrandColor.TextBrand
            iconColor = Ds.BrandColor.TextBrand
        }

        DsButton.Style.Neutral -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericMediumPressed
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextSecondary
            descriptionColor = Ds.Color.TextSecondary
            iconColor = Ds.Color.TextSecondary
        }

        DsButton.Style.Contrast -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericMediumPressed
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextPrimary
            descriptionColor = Ds.Color.TextPrimary
            iconColor = Ds.Color.TextPrimary
        }

        DsButton.Style.StaticLight -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericMediumPressed
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextStaticLight
            descriptionColor = Ds.Color.TextStaticLight
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Danger -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackDangerLight
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextFeedbackDanger
            descriptionColor = Ds.Color.TextFeedbackDanger
            iconColor = Ds.Color.TextFeedbackDanger
        }

        DsButton.Style.Success -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackSuccessLight
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextFeedbackSuccess
            descriptionColor = Ds.Color.TextFeedbackSuccess
            iconColor = Ds.Color.TextFeedbackSuccess
        }

        DsButton.Style.Warning -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackWarningLight
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextFeedbackWarning
            descriptionColor = Ds.Color.TextFeedbackWarning
            iconColor = Ds.Color.TextFeedbackWarning
        }

        DsButton.Style.Info -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackInfoLight
            loadingIndicatorColor = Ds.Color.TextPrimary.copy(alpha = Ds.Opacity.M6)
            labelColor = Ds.Color.TextFeedbackInfo
            descriptionColor = Ds.Color.TextFeedbackInfo
            iconColor = Ds.Color.TextFeedbackInfo
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
            .clip(RectangleShape)
            .background(
                when (state) {
                    DsButton.State.Disabled -> Color.Transparent
                    DsButton.State.Default -> Color.Transparent
                    DsButton.State.Pressed -> backgroundPressedColor
                }
            )
            .clickable(
                onClick = onClick,
                enabled = state != DsButton.State.Disabled && !loadingIndicator,
                role = Role.Button,
                indication = ripple(),
                interactionSource = interactionSource,
            )
            .then(
                if (sideMargins) {
                    Modifier.padding(
                        PaddingValues(
                            horizontal = when (size) {
                                DsButton.Size.Lg -> Ds.Size.M10
                                DsButton.Size.Md -> Ds.Size.M8
                                DsButton.Size.Sm -> Ds.Size.M6
                            }
                        )
                    )
                } else {
                    Modifier
                }
            ),
        contentAlignment = Alignment.Center
    ) {
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
}
