package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.yx360.design.compose.Ds

/**
 * [Figma](https://nda.ya.ru/t/AukG25XG77bSCo)
 */
@Composable
fun DsRadio(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val outerColor = when {
        isPressed && !enabled -> Ds.Color.SurfaceGenericPressed
        isPressed && selected -> Ds.BrandColor.SurfaceBrandPressed
        isPressed && !selected ->  Ds.Color.SurfaceGenericPressed
        !enabled && selected -> Ds.BrandColor.SurfaceBrandPressed.copy(alpha = Ds.Opacity.M16)
        !enabled && !selected -> Ds.Color.SurfaceGeneric.copy(alpha = Ds.Opacity.M24)
        selected -> Ds.BrandColor.SurfaceBrand
        else -> Ds.Color.SurfaceGeneric
    }

    val innerColor = when {
        selected && !enabled -> Ds.BrandColor.TextBrandStatic
        selected -> Ds.BrandColor.TextBrandStatic
        !selected && enabled -> Ds.BrandColor.TextBrandStatic
        isPressed -> Ds.BrandColor.TextBrandStatic
        else -> Ds.BrandColor.TextBrandStatic.copy(alpha = Ds.Opacity.M24)
    }
    Box(
        modifier = modifier
            .size(Ds.Size.M14)
            .background(outerColor, CircleShape)
            .clickable(
                onClick = {
                    if (enabled) {
                        onClick()
                    }
                },
                enabled = enabled,
                interactionSource = interactionSource,
                indication = null
            ),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        if (selected) {
            Box(
                Modifier
                    .size(Ds.Size.M4)
                    .background(innerColor, CircleShape)
            )
        }
    }
}

