package com.yx360.design.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.yx360.design.compose.internal.DsDrawables

object DsDrawable {
    @Composable
    fun atomsProgressBarShadow(): Painter {
        return DsDrawables.atomsProgressBarShadow()
    }
}
