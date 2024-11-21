package com.yx360.design.compose

import androidx.compose.runtime.Composable
import com.yx360.design.compose.internal.DsStrings

object DsString {
    @Composable
    fun atomsGroupMoreTitle(count: Int): String {
        return DsStrings.atomsGroupMoreTitle(count)
    }
}
