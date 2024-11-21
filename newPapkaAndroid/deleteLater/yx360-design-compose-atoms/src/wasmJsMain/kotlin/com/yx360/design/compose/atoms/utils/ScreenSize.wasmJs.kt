package com.yx360.design.compose.atoms.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import kotlinx.browser.window

@Composable
actual fun getScreenSize(): ScreenSize {
    val dpSize = DpSize(height = window.innerHeight.dp, width = window.innerWidth.dp)
    return ScreenSize(height = dpSize.height, width = dpSize.width)
}
