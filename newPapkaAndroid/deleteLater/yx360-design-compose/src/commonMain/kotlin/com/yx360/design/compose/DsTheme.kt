package com.yx360.design.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.yx360.design.BrandTheme
import com.yx360.design.compose.internal.ApplyStatusBarColor
import com.yx360.design.compose.internal.DsBrandColorSchemas
import com.yx360.design.compose.internal.DsBrandColorScheme
import com.yx360.design.compose.internal.DsColorSchemas
import com.yx360.design.compose.internal.DsMaterial
import com.yx360.design.compose.internal.DsUserColorSchemas
import com.yx360.design.compose.internal.DsUserColorScheme
import com.yx360.design.compose.internal.resolveBrandTheme

@Composable
internal fun DsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    brandTheme: BrandTheme? = null,
    content: @Composable () -> Unit,
    shouldApplyStatusBar: Boolean = true
) {
    val colors = if (darkTheme) {
        DsColorSchemas.Dark
    } else {
        DsColorSchemas.Light
    }

    val brandColorScheme = if (darkTheme) {
        DsBrandColorSchemas.Dark
    } else {
        DsBrandColorSchemas.Light
    }

    val userColorScheme = if (darkTheme) {
        DsUserColorSchemas.Dark
    } else {
        DsUserColorSchemas.Light
    }

    val brandColor = brandTheme?.let { brandColorScheme.resolveBrandTheme(brandTheme) }
    val themedContent = if (brandColor != null) {
        { DsBrandTheme(brandColor, content) }
    } else {
        content
    }

    if (shouldApplyStatusBar) {
        ApplyStatusBarColor(darkTheme, colors)
    }
    MaterialTheme(
        colorScheme = DsMaterial.createColorScheme(colors, brandColor),
        shapes = DsMaterial.createShapes(),
        typography = DsMaterial.createTypography(),
    ) {
        ProvideResources(
            colorScheme = colors,
            brandColorScheme = brandColorScheme,
            userColorScheme = userColorScheme,
            isDarkTheme = darkTheme,
            content = themedContent,
        )
    }
}

private val LocalDsColor = staticCompositionLocalOf<DsColor> {
    throwMissingThemeException()
}

private val LocalDsBrandColorScheme = staticCompositionLocalOf<DsBrandColorScheme> {
    throwMissingThemeException()
}

private val LocalDsUserColorScheme = staticCompositionLocalOf<DsUserColorScheme> {
    throwMissingThemeException()
}

private val LocalDsIsDarkTheme = staticCompositionLocalOf<Boolean> {
    throwMissingThemeException()
}

@Composable
@ReadOnlyComposable
internal fun getLocalDsColor() = LocalDsColor.current

@Composable
@ReadOnlyComposable
internal fun getLocalDsBrandColorScheme() = LocalDsBrandColorScheme.current

@Composable
@ReadOnlyComposable
internal fun getLocalDsUserColorScheme() = LocalDsUserColorScheme.current

@Composable
@ReadOnlyComposable
internal fun getLocalDsIsDarkTheme() = LocalDsIsDarkTheme.current

private fun throwMissingThemeException(): Nothing {
    throw IllegalArgumentException("Colors are not set. Use Ds.Theme context to provide")
}

@Composable
private fun ProvideResources(
    colorScheme: DsColor,
    brandColorScheme: DsBrandColorScheme,
    userColorScheme: DsUserColorScheme,
    isDarkTheme: Boolean,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalDsColor provides colorScheme,
        LocalDsBrandColorScheme provides brandColorScheme,
        LocalDsUserColorScheme provides userColorScheme,
        LocalDsIsDarkTheme provides isDarkTheme,
        content = content,
    )
}
