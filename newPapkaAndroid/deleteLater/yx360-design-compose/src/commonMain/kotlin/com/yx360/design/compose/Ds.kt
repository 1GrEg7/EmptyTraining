package com.yx360.design.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.yx360.design.BrandTheme
import com.yx360.design.UserTheme
import com.yx360.design.compose.icons.DsIcon

object Ds {
    val Color: DsColor
        @Composable
        @ReadOnlyComposable
        get() = getLocalDsColor()

    val BrandColor: DsBrandColor
        @Composable
        @ReadOnlyComposable
        get() = getLocalBrandColor()

    val UserColor: DsUserColor
        @Composable
        @ReadOnlyComposable
        get() = getLocalUserColor()

    val IsDarkTheme: Boolean
        @Composable
        @ReadOnlyComposable
        get() = getLocalDsIsDarkTheme()

    val Palette = DsPalette
    val Typography = DsTypography
    val Icon = DsIcon
    val Illustartions = DsIllustrations
    val Size = DsSize
    val Spacing = DsSpacing
    val Rounding = DsRounding
    val Line = DsLine
    val Opacity = DsOpacity
    val Shadow = DsShadow
    val Gradient = DsGradient

    @Composable
    fun Theme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        brandTheme: BrandTheme? = null,
        shouldApplyDefaultStatusBar: Boolean = true,
        content: @Composable () -> Unit,
    ) { // ApplyStatusBarColor will be removed from DS in future, use carefully
        DsTheme(
            darkTheme = darkTheme,
            brandTheme = brandTheme,
            content = content,
            shouldApplyStatusBar = shouldApplyDefaultStatusBar
        )
    }

    @Composable
    fun BrandTheme(
        brandTheme: BrandTheme,
        content: @Composable () -> Unit
    ) {
        DsBrandTheme(
            brandTheme = brandTheme,
            content = content,
        )
    }

    @Composable
    fun UserTheme(
        userTheme: UserTheme,
        content: @Composable () -> Unit
    ) {
        DsUserTheme(
            userTheme = userTheme,
            content = content,
        )
    }
}
