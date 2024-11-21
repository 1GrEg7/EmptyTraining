package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import com.yx360.design.compose.preview.FontsPreview

internal object DsFonts {
    val display @Composable get() = FontsPreview.display
    val regular @Composable get() = FontsPreview.regular
    val medium @Composable get() = FontsPreview.medium
    val bold @Composable get() = FontsPreview.bold
}
