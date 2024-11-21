package com.yx360.design.compose.preview

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontFamily
import com.yx360.design.compose.resources.Res
import com.yx360.design.compose.resources.ys_display_360
import com.yx360.design.compose.resources.ys_text_bold
import com.yx360.design.compose.resources.ys_text_medium
import com.yx360.design.compose.resources.ys_text_regular
import org.jetbrains.compose.resources.FontResource

internal actual object FontsPreview {
    actual val display: FontFamily
        @Composable get() = getComposeFont(Res.font.ys_display_360)
    actual val regular: FontFamily
        @Composable get() = getComposeFont(Res.font.ys_text_regular)
    actual val medium: FontFamily
        @Composable get() = getComposeFont(Res.font.ys_text_medium)
    actual val bold: FontFamily
        @Composable get() = getComposeFont(Res.font.ys_text_bold)

    @Composable
    private fun getComposeFont(res: FontResource): FontFamily {
        return FontFamily(Font(res))
    }
}
