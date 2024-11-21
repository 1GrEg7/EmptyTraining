package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.yx360.design.compose.R

internal object DsDrawables {
    @Composable
    fun atomsProgressBarShadow(): Painter {
        return painterResource(id = R.drawable.progress_bar_shadow)
    }
}
