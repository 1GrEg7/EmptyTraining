package com.yx360.design.compose.internal

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsBrandColor
import com.yx360.design.compose.DsColor
import com.yx360.design.compose.DsPalette
import com.yx360.design.compose.DsTypography

internal object DsMaterial {

    fun createColorScheme(dsColorScheme: DsColor, brandColor: DsBrandColor? = null): ColorScheme {
        val brandSurface = brandColor?.SurfaceBrand ?: DsPalette.CoolGray1000
        val textStaticBrand = brandColor?.TextBrandStatic ?: dsColorScheme.TextStaticLight
        val surfaceBrandLight = brandColor?.SurfaceBrandLight ?: DsPalette.CoolGray100
        val textBrand = brandColor?.TextBrand ?: DsPalette.CoolGray1000
        return ColorScheme(
            primary = brandSurface,
            onPrimary = textStaticBrand,
            primaryContainer = surfaceBrandLight,
            onPrimaryContainer = textBrand,
            inversePrimary = brandSurface,
            secondary = brandSurface,
            onSecondary = textStaticBrand,
            secondaryContainer = surfaceBrandLight,
            onSecondaryContainer = textBrand,
            tertiary = brandSurface,
            onTertiary = textStaticBrand,
            tertiaryContainer = surfaceBrandLight,
            onTertiaryContainer = textBrand,
            background = dsColorScheme.ElevationBase,
            onBackground = dsColorScheme.TextPrimary,
            surface = dsColorScheme.SurfaceGenericMedium,
            onSurface = dsColorScheme.TextPrimary,
            surfaceVariant = dsColorScheme.ElevationBase,
            onSurfaceVariant = dsColorScheme.TextSecondary,
            surfaceTint = dsColorScheme.SurfaceGenericMedium,
            inverseSurface = dsColorScheme.SurfaceInverse,
            inverseOnSurface = dsColorScheme.TextInverse,
            error = dsColorScheme.SurfaceFeedbackDanger,
            onError = dsColorScheme.TextStaticLight,
            errorContainer = dsColorScheme.SurfaceFeedbackDangerLight,
            onErrorContainer = dsColorScheme.TextFeedbackDanger,
            outline = dsColorScheme.LineGeneric,
            outlineVariant = dsColorScheme.LineGenericMedium,
            scrim = DsPalette.Black,
        )
    }

    fun createShapes(): Shapes {
        return Shapes(
            extraSmall = RoundedCornerShape(Ds.Rounding.M2),
            small = RoundedCornerShape(Ds.Rounding.M4),
            medium = RoundedCornerShape(Ds.Rounding.M6),
            large = RoundedCornerShape(Ds.Rounding.M8),
            extraLarge = RoundedCornerShape(Ds.Rounding.M16),
        )
    }

    @Composable
    fun createTypography(): Typography {
        return Typography(
            displayLarge = DsTypography.HeadingXl,
            displayMedium = DsTypography.HeadingXl,
            displaySmall = DsTypography.HeadingXl,
            headlineLarge = DsTypography.HeadingLg,
            headlineMedium = DsTypography.HeadingMd,
            headlineSmall = DsTypography.HeadingSm,
            titleLarge = DsTypography.HeadingSm,
            titleMedium = DsTypography.HeadingXs,
            titleSmall = DsTypography.BodyMdMedium,
            bodyLarge = DsTypography.BodyLgRegular,
            bodyMedium = DsTypography.BodyMdRegular,
            bodySmall = DsTypography.CaptionMdRegular,
            labelLarge = DsTypography.BodyShortLgMedium,
            labelMedium = DsTypography.BodyShortLgMedium,
            labelSmall = DsTypography.CaptionMdMedium,
        )
    }
}
