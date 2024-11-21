package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.atoms.utils.drawLoading
import com.yx360.design.compose.atoms.utils.getLoadingOffsetState
import com.yx360.design.compose.atoms.utils.vectorToBitmap
import com.yx360.design.compose.icons.dsicon.LoadingPattern

/**
 * [Figma](https://nda.ya.ru/t/BISWk-c577cp8v)
 */
@Suppress("LongMethod")
@ExperimentalOrbitaDsAtom
@Composable
fun DsButtonIconTransparent(
    icon: Painter,
    onClick: () -> Unit,
    variant: DsButton.Style,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loadingIndicator: Boolean = false,
    size: DsButton.Size = DsButton.Size.Md,
) {
    val backgroundPressedColor: Color
    val backgroundDisabledColor = Ds.Color.SurfaceDisabled
    val contentDisabledColor = Ds.Color.TextDisabled
    val loadingIndicatorColor: Color
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
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.BrandColor.TextBrand
        }

        DsButton.Style.Neutral -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextSecondary
        }

        DsButton.Style.Contrast -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextPrimary
        }

        DsButton.Style.StaticLight -> {
            backgroundPressedColor = Ds.Color.SurfaceGenericPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Danger -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackDangerLight
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextFeedbackDanger
        }

        DsButton.Style.Success -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackSuccessLight
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextFeedbackSuccess
        }

        DsButton.Style.Warning -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackWarningLight
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextFeedbackWarning
        }

        DsButton.Style.Info -> {
            backgroundPressedColor = Ds.Color.SurfaceFeedbackInfoLight
            loadingIndicatorColor = Ds.Color.TextStaticHeavy.copy(alpha = Ds.Opacity.M6)
            iconColor = Ds.Color.TextFeedbackInfo
        }
    }
    val iconSize = remember(size) {
        when (size) {
            DsButton.Size.Lg -> Ds.Spacing.M12
            DsButton.Size.Md -> Ds.Spacing.M8
            DsButton.Size.Sm -> Ds.Spacing.M8
        }
    }
    Box(
        modifier = modifier
            .size(
                when (size) {
                    DsButton.Size.Lg -> Ds.Size.M28
                    DsButton.Size.Md -> Ds.Size.M20
                    DsButton.Size.Sm -> Ds.Size.M16
                }
            )
            .clip(RoundedCornerShape(Ds.Rounding.Full))
            .background(
                when (state) {
                    DsButton.State.Disabled -> backgroundDisabledColor
                    DsButton.State.Default -> Color.Transparent
                    DsButton.State.Pressed -> backgroundPressedColor
                }
            )
            .clickable(
                onClick = onClick,
                enabled = enabled && !loadingIndicator,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = ripple(bounded = false),
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(iconSize),
            painter = icon,
            contentDescription = null,
            tint = if (state == DsButton.State.Disabled) {
                contentDisabledColor
            } else { iconColor }
        )
        if (loadingIndicator) {
            val loadingIcon = rememberVectorPainter(Ds.Icon.LoadingPattern)
            val bitmap = vectorToBitmap(loadingIcon, loadingIndicatorColor)
            Box(modifier) {
                drawLoading(
                    brush = ImageShader(
                        bitmap,
                        TileMode.Repeated,
                        TileMode.Repeated
                    ),
                    offset = getLoadingOffsetState(target = bitmap.width.toFloat())
                )
            }
        }
    }
}
