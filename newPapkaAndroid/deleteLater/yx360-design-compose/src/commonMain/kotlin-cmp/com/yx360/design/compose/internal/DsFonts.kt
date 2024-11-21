package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.font.FontFamily
import com.yx360.design.compose.preview.FontsPreview
import org.jetbrains.compose.resources.Font

internal object DsFonts {
    val display @Composable get() = fontFamily(FontType.Display)
    val regular @Composable get() = fontFamily(FontType.Regular)
    val medium @Composable get() = fontFamily(FontType.Medium)
    val bold @Composable get() = fontFamily(FontType.Bold)

    private enum class FontType {
        Display,
        Regular,
        Medium,
        Bold,
        ;
    }

    @Composable
    private fun fontFamily(type: FontType): FontFamily {
        val isPreview = LocalInspectionMode.current

        return if (isPreview) {
            when (type) {
                FontType.Display -> FontsPreview.display
                FontType.Regular -> FontsPreview.regular
                FontType.Medium -> FontsPreview.medium
                FontType.Bold -> FontsPreview.bold
            }
        } else {
            val font = when (type) {
                FontType.Display -> DsFontsR.display
                FontType.Regular -> DsFontsR.regular
                FontType.Medium -> DsFontsR.medium
                FontType.Bold -> DsFontsR.bold
            }.let { Font(it) }
            FontFamily(font)
        }
    }
}
