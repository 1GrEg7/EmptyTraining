package com.yx360.design.compose.atoms.group

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ContextualFlowRow
import androidx.compose.foundation.layout.ContextualFlowRowOverflow
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsString

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun DsGroupBase(
    itemCount: Int,
    contentMode: DsGroup.ContentMode,
    modifier: Modifier = Modifier,
    moreItem: (@Composable (text: String, onClick: () -> Unit) -> Unit)? = null,
    itemContent: @Composable (index: Int) -> Unit,
) {
    val maxLines = when (contentMode) {
        DsGroup.ContentMode.Monoline -> 1
        is DsGroup.ContentMode.Multiline -> contentMode.maxLines
    }
    ContextualFlowRow(
        itemCount = itemCount,
        modifier = modifier
            .then(
                when (contentMode) {
                    DsGroup.ContentMode.Monoline -> Modifier.horizontalScroll(rememberScrollState())
                    is DsGroup.ContentMode.Multiline -> Modifier
                }
            )
            .animateContentSize(),
        horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M2),
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M2),
        maxLines = maxLines,
        overflow = ContextualFlowRowOverflow.expandIndicator {
            val isInPreviewMode = LocalInspectionMode.current // TODO remove after https://st.yandex-team.ru/MOBILEDEV-37426
            if (contentMode is DsGroup.ContentMode.Multiline && !isInPreviewMode) {
                moreItem?.invoke(
                    DsString.atomsGroupMoreTitle(totalItemCount - shownItemCount),
                    contentMode.onMoreClick,
                )
            }
        },
        content = { itemContent(it) },
    )
}

object DsGroup {

    sealed interface ContentMode {

        data object Monoline : ContentMode

        @Immutable
        open class Multiline(
            val maxLines: Int,
            val onMoreClick: () -> Unit,
        ) : ContentMode {

            companion object Max : Multiline(maxLines = Int.MAX_VALUE, onMoreClick = { })
        }
    }
}
