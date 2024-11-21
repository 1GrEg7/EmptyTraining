package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import com.yx360.design.compose.Ds

/**
 * [Figma](https://nda.ya.ru/t/tDXGfPYs77bRvm)
 */
@Composable
fun DsToggle(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val surfaceGeneric = Ds.Color.SurfaceGeneric
    val color = SwitchDefaults.colors(
        checkedThumbColor = Ds.Color.SurfaceStaticLight,
        checkedTrackColor = Ds.BrandColor.SurfaceBrand,
        checkedBorderColor = Ds.Palette.BlackAlpha00,
        checkedIconColor = Ds.Palette.BlackAlpha00,
        uncheckedThumbColor = Ds.Color.SurfaceStaticLight,
        uncheckedTrackColor = surfaceGeneric,
        uncheckedBorderColor = Ds.Palette.BlackAlpha00,
        uncheckedIconColor = Ds.Palette.BlackAlpha00,
        disabledCheckedThumbColor = Ds.Color.SurfaceStaticLight,
        disabledCheckedTrackColor = Ds.BrandColor.SurfaceBrand,
        disabledCheckedBorderColor = Ds.Palette.BlackAlpha00,
        disabledCheckedIconColor = Ds.Palette.BlackAlpha00,
        disabledUncheckedThumbColor = Ds.Color.SurfaceStaticLight,
        disabledUncheckedTrackColor = surfaceGeneric,
        disabledUncheckedBorderColor = Ds.Palette.BlackAlpha00,
        disabledUncheckedIconColor = Ds.Palette.BlackAlpha00,
    )
    Switch(
        checked = selected,
        onCheckedChange = onSelectedChange,
        thumbContent = { Spacer(Modifier.size(Ds.Size.M12)) },
        colors = color,
        modifier = if (enabled) modifier else modifier.alpha(alpha = Ds.Opacity.M24),
        enabled = enabled,
    )
}
