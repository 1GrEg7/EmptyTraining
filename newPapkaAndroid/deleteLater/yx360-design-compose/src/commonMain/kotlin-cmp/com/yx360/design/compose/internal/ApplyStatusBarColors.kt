package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import com.yx360.design.compose.DsColor

@Composable
internal expect fun ApplyStatusBarColor(darkTheme: Boolean, colors: DsColor)
