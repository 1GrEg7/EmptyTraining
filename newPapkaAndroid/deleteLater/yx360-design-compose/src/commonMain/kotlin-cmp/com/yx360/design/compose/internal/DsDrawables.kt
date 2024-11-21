package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.yx360.design.compose.resources.Res
import com.yx360.design.compose.resources.progress_bar_shadow
import org.jetbrains.compose.resources.painterResource

internal object DsDrawables {
    @Composable
    fun atomsProgressBarShadow(): Painter {
        return painterResource(resource = Res.drawable.progress_bar_shadow)
    }
}
