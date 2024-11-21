package com.yx360.design.compose.atoms.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun getAndroidScreenSize(): ScreenSize {
    return with(LocalConfiguration.current) {
        ScreenSize(
            height = screenHeightDp.dp,
            width = screenWidthDp.dp,
        )
    }
}
