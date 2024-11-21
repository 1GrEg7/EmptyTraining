package com.yx360.design.compose.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

internal actual object FontsPreview {
    actual val display: FontFamily
        @Composable get() = AndroidFontsPreview.display
    actual val regular: FontFamily
        @Composable get() = AndroidFontsPreview.regular
    actual val medium: FontFamily
        @Composable get() = AndroidFontsPreview.medium
    actual val bold: FontFamily
        @Composable get() = AndroidFontsPreview.bold
}
