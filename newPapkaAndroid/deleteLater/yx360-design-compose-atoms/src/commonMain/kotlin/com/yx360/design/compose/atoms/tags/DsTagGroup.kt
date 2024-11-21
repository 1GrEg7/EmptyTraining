package com.yx360.design.compose.atoms.tags

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.group.DsGroupBase

/**
 * [Figma](https://nda.ya.ru/t/O0LBIPuw77Cdm3)
 */
@Composable
fun DsTagGroup(
    items: List<DsTagGroup.Item>,
    modifier: Modifier = Modifier,
    contentMode: DsGroup.ContentMode = DsGroup.ContentMode.Monoline,
    variant: DsTag.Variant = DsTag.Variant.Neutral,
) {
    DsGroupBase(
        itemCount = items.size,
        modifier = modifier,
        contentMode = contentMode,
        moreItem = { label, onClick ->
            DsTag(
                label = label,
                variant = variant,
                onClick = onClick,
                startSlot = DsTag.StartSlot.None,
            )
        }
    ) { index ->
        items.getOrNull(index)?.let { item ->
            DsTag(
                label = item.label,
                variant = item.variant ?: variant,
                onClick = item.onClick,
                onClose = item.onClose,
                startSlot = item.startSlot,
            )
        }
    }
}

object DsTagGroup {

    data class Item(
        val label: String,
        val startSlot: DsTag.StartSlot,
        val variant: DsTag.Variant? = null,
        val onClick: (() -> Unit)? = null,
        val onClose: (() -> Unit)? = null,
    )
}
