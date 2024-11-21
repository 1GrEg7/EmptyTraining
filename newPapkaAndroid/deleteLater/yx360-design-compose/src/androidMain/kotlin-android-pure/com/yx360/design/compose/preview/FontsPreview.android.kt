package com.yx360.design.compose.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

internal object FontsPreview {
    val display: FontFamily
        @Composable get() = AndroidFontsPreview.display
    val regular: FontFamily
        @Composable get() = AndroidFontsPreview.regular
    val medium: FontFamily
        @Composable get() = AndroidFontsPreview.medium
    val bold: FontFamily
        @Composable get() = AndroidFontsPreview.bold
}
