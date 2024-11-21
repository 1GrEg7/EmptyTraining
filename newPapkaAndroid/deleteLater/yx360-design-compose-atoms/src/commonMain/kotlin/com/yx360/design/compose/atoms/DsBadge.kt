package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsSize
import com.yx360.design.compose.DsTypography

private const val MIN_COUNTER = 1
private const val MAX_COUNTER = 99

/**
 * [Figma](https://nda.ya.ru/t/a1nc82p-77Qg6a)
 */
@Composable
fun DsBadge(
    counter: Int,
    modifier: Modifier = Modifier,
    size: DsBadge.Size = DsBadge.Size.Md,
    variant: DsBadge.Variant = DsBadge.Variant.Primary,
) {
    val realCounter = when {
        counter < MIN_COUNTER -> "$MIN_COUNTER"
        counter > MAX_COUNTER -> "$MAX_COUNTER+"
        else -> "$counter"
    }
    val badgeSize = when (size) {
        DsBadge.Size.Md -> DsSize.M12
        DsBadge.Size.Sm -> DsSize.M8
    }
    val textStyle = when (size) {
        DsBadge.Size.Md -> DsTypography.BodyMdMedium
        DsBadge.Size.Sm -> DsTypography.CaptionMdMedium
    }
    Box(
        modifier = modifier
            .height(badgeSize)
            .defaultMinSize(badgeSize)
            .clip(RoundedCornerShape(badgeSize))
            .background(
                color = when (variant) {
                    DsBadge.Variant.Primary -> Ds.Color.SurfaceGeneric
                    DsBadge.Variant.Secondary -> Ds.Color.SurfaceGenericAlt
                    DsBadge.Variant.Brand -> Ds.BrandColor.SurfaceBrand
                }
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = Modifier.padding(horizontal = Ds.Size.M2),
            text = realCounter,
            color = when (variant) {
                DsBadge.Variant.Primary,
                DsBadge.Variant.Secondary -> Ds.Color.TextSecondary
                DsBadge.Variant.Brand -> Ds.BrandColor.TextBrandStatic
            },
            fontFamily = textStyle.fontFamily,
            fontSize = textStyle.fontSize,
            lineHeight = textStyle.lineHeight
        )
    }
}

object DsBadge {
    enum class Size {
        Md,
        Sm,
    }

    enum class Variant {
        Primary,
        Secondary,
        Brand
    }
}
