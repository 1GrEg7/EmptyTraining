package com.yx360.design.compose.atoms.utils

import androidx.compose.runtime.Composable

@Composable
actual fun getScreenSize(): ScreenSize {
    return getAndroidScreenSize()
}
