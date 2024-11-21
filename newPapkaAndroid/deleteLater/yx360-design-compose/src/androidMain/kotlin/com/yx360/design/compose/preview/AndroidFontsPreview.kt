package com.yx360.design.compose.preview

import androidx.annotation.FontRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import com.yx360.design.compose.R

internal object AndroidFontsPreview {
    val display: FontFamily @Composable get() = resolveFontFamily(R.font.ys_display_360)
    val regular: FontFamily @Composable get() = resolveFontFamily(R.font.ys_text_regular)
    val medium: FontFamily @Composable get() = resolveFontFamily(R.font.ys_text_medium)
    val bold: FontFamily @Composable get() = resolveFontFamily(R.font.ys_text_bold)

    /**
     * Due to screenshots library bug we can't use direct font loading with res id
     * So, manually load if from context
     */
    @Composable
    private fun resolveFontFamily(@FontRes resId: Int): FontFamily {
        return FontFamily(LocalContext.current.resources.getFont(resId))
    }
}
