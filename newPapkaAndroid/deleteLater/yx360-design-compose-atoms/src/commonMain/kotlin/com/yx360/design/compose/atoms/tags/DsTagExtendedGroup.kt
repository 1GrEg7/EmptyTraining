package com.yx360.design.compose.atoms.tags

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.group.DsGroupBase

/**
 * [Figma](https://nda.ya.ru/t/4wBTOVWL78Bqv5)
 */
@Composable
fun DsTagExtendedGroup(
    items: List<DsTagExtendedGroup.Item>,
    modifier: Modifier = Modifier,
    contentMode: DsGroup.ContentMode = DsGroup.ContentMode.Monoline,
    variant: DsTag.Variant = DsTag.Variant.Neutral,
) {
    DsGroupBase(
        itemCount = items.size,
        modifier = modifier,
        contentMode = contentMode,
        moreItem = { label, onClick ->
            DsTagExtended(
                label = label,
                description = "",
                variant = variant,
                onClick = onClick,
            )
        }
    ) { index ->
        items.getOrNull(index)?.let { item ->
            DsTagExtended(
                label = item.label,
                description = item.description,
                variant = item.variant ?: variant,
                startSlot = item.startSlot,
                onClick = item.onClick,
                onClose = item.onClose,
            )
        }
    }
}

object DsTagExtendedGroup {

    data class Item(
        val label: String,
        val description: String,
        val startSlot: DsTagExtended.StartSlot,
        val variant: DsTag.Variant? = null,
        val onClick: (() -> Unit)? = null,
        val onClose: (() -> Unit)? = null,
    )
}
