package com.yx360.design.compose.atoms.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import java.awt.Toolkit

@Composable
actual fun getScreenSize(): ScreenSize {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    val dpSize = DpSize(height = screenSize.height.dp, width = screenSize.width.dp)
    return ScreenSize(dpSize.width, dpSize.height)
}
