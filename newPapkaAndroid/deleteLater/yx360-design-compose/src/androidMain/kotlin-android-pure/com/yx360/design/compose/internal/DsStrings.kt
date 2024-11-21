package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.yx360.design.compose.R

internal object DsStrings {
    @Composable
    fun atomsGroupMoreTitle(count: Int): String {
        return stringResource(id = R.string.atoms_group_more_title, count)
    }
}
