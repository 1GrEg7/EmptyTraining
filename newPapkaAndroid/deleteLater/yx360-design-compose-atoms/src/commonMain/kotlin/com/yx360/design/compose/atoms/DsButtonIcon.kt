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
 * [Figma](https://nda.ya.ru/t/Ed9PoCkL77cp87)
 */
@Suppress("LongMethod")
@ExperimentalOrbitaDsAtom
@Composable
fun DsButtonIcon(
    icon: Painter,
    onClick: () -> Unit,
    variant: DsButton.Style,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    loadingIndicator: Boolean = false,
    contentDescription: String? = null,
    size: DsButton.Size = DsButton.Size.Md,
) {
    val backgroundDefaultColor: Color
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
            backgroundDefaultColor = Ds.BrandColor.SurfaceBrand
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.BrandColor.TextBrandStatic
        }

        DsButton.Style.Neutral -> {
            backgroundDefaultColor = Ds.Color.SurfaceGenericMedium.copy(alpha = Ds.Opacity.M24)
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextPrimary
        }

        DsButton.Style.Contrast -> {
            backgroundDefaultColor = Ds.Color.SurfaceInverse
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextInverse
            iconColor = Ds.Color.TextInverse
        }

        DsButton.Style.StaticLight -> {
            backgroundDefaultColor = Ds.Color.SurfaceStaticLight
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextStaticHeavy
        }
        DsButton.Style.Danger -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackDanger
            backgroundPressedColor = Ds.BrandColor.SurfaceBrandPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Success -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackSuccess
            backgroundPressedColor = Ds.Color.SurfaceFeedbackSuccessPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Warning -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackWarning
            backgroundPressedColor = Ds.Color.SurfaceFeedbackWarningPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.Color.TextStaticLight
        }

        DsButton.Style.Info -> {
            backgroundDefaultColor = Ds.Color.SurfaceFeedbackInfo
            backgroundPressedColor = Ds.Color.SurfaceFeedbackInfoPressed
            loadingIndicatorColor = Ds.Color.TextStaticHeavy
            iconColor = Ds.BrandColor.TextBrandStatic
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
                    DsButton.State.Default -> backgroundDefaultColor
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
            contentDescription = contentDescription,
            tint = if (state == DsButton.State.Disabled) {
                contentDisabledColor
            } else {
                iconColor
            }
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
