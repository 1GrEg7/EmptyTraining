package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import com.yx360.design.compose.resources.Res
import com.yx360.design.compose.resources.atoms_group_more_title
import org.jetbrains.compose.resources.stringResource

internal object DsStrings {
    @Composable
    fun atomsGroupMoreTitle(count: Int): String {
        return stringResource(Res.string.atoms_group_more_title, count)
    }
}
