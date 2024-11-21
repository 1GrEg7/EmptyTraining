package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import com.yx360.design.compose.DsColor

@Composable
internal actual fun ApplyStatusBarColor(darkTheme: Boolean, colors: DsColor) {
    ApplyAndroidSystemBarColors(darkTheme, colors.ElevationBase)
}
