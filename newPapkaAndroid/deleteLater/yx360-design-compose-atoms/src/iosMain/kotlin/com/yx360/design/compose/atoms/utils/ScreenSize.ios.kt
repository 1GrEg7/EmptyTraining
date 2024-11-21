package com.yx360.design.compose.atoms.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.useContents
import platform.UIKit.UIScreen

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun getScreenSize(): ScreenSize {
    val screenSize = UIScreen.mainScreen.bounds.useContents {
        DpSize(size.width.dp, size.height.dp)
    }
    return ScreenSize(height = screenSize.height, width = screenSize.width)
}
