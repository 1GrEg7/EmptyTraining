package com.yx360.design.compose.atoms

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.group.DsGroupBase

/**
 * [Figma](https://nda.ya.ru/t/h5wwukOW77jccZ)
 */
@Composable
fun DsChipsGroup(
    chips: List<DsChipsGroup.Item>,
    size: DsChips.Size,
    variant: DsChips.Variant,
    modifier: Modifier = Modifier,
    contentMode: DsGroup.ContentMode = DsGroup.ContentMode.Monoline,
) {
    DsGroupBase(
        itemCount = chips.size,
        modifier = modifier,
        contentMode = contentMode,
        moreItem = { label, onClick ->
            DsChips(
                label = label,
                variant = variant,
                size = size,
                onClick = { onClick.invoke() },
            )
        }
    ) { index ->
        chips.getOrNull(index)?.let { item ->
            DsChips(
                label = item.label,
                leftIcon = item.leftIcon,
                iconTint = item.iconColor,
                selected = item.selected,
                variant = item.variant ?: variant,
                size = size,
                onClick = item.onClick,
                onClose = item.onClose,
            )
        }
    }
}

object DsChipsGroup {

    @Immutable
    class Item(
        val label: String,
        val variant: DsChips.Variant? = null,
        val leftIcon: Painter? = null,
        val iconColor: Color = Color.Unspecified,
        val selected: Boolean = false,
        val onClick: ((Boolean) -> Unit)? = null,
        val onClose: (() -> Unit)? = null,
    )
}
