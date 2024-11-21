package com.yx360.design.compose.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.yx360.design.compose.Ds
import kotlin.math.max
import kotlin.math.min

private const val MAX_WIDTH = 280
private const val LABEL_LINE_LIMIT_DEFAULT = 1

/**
 * [Figma](https://nda.ya.ru/t/-prwlcrB77Rtho)
 */
@Composable
fun DsEditMenu(
    items: List<DsEditMenu.MenuItem>,
    anchor: DsEditMenu.Anchor,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val hasStartSlots = items.any { item ->
        item is DsEditMenu.MenuItem.Item && item.startSlot !is DsEditMenu.StartSlot.None
    }
    val hasEndSlots = items.any { item ->
        item is DsEditMenu.MenuItem.Item && item.endSlot !is DsEditMenu.EndSlot.None
    }

    val dens = LocalDensity.current
    val maxWidth = remember {
        with(dens) { MAX_WIDTH.dp.toPx().toInt() }
    }
    var actualWidth by remember { mutableStateOf(-1) }
    var offset by remember {
        mutableStateOf<IntOffset?>(null)
    }
    val padding = remember {
        with(dens) { Ds.Size.M6.toPx().toInt() }
    }
    val notDataRacedOffset = offset
    Popup(
        onDismissRequest = onDismiss,
        properties = PopupProperties(focusable = true, clippingEnabled = true),
        offset = if (notDataRacedOffset == null) {
            anchor.offset
        } else {
            IntOffset(
                x = notDataRacedOffset.x + anchor.offset.x,
                y = notDataRacedOffset.y + anchor.offset.y,
            )
        }
    ) {
        SubcomposeLayout(
            modifier = modifier
                .shadow(
                    elevation = Ds.Shadow.Level03.elevation,
                    spotColor = Ds.Shadow.Level03.color,
                    ambientColor = Ds.Shadow.Level03.color,
                    shape = RoundedCornerShape(Ds.Size.M8)
                )
        ) { constraints ->
            val itemConstraints = constraints.copy(maxWidth = maxWidth)
            val placeables: List<Placeable> = subcompose(Unit, content = {
                items.forEach { item ->
                    Item(widthPx = actualWidth, item, hasStartSlots, hasEndSlots)
                }
            }).map { it.measure(itemConstraints) }
            actualWidth = placeables.maxOf { it.width }
            val actualHeight = placeables.sumOf { it.height }

            offset = menuOffset(
                constraints = constraints,
                anchor = anchor,
                menuSpecs = Triple(actualWidth, actualHeight, padding)
            )
            layout(actualWidth, actualHeight) {
                var y = 0
                placeables.forEach { placeable ->
                    placeable.place(0, y)
                    y += placeable.height
                }
            }
        }
    }
}

object DsEditMenu {

    @Stable
    sealed interface MenuItem {

        data class Item(
            val label: String,
            val onClick: () -> Unit,
            val startSlot: StartSlot,
            val endSlot: EndSlot,
            val labelLineLimit: Int = LABEL_LINE_LIMIT_DEFAULT,
            val labelColor: Color? = null,
        ) : MenuItem

        data class Divider(
            val compact: Boolean,
            val padding: DsDivider.VerticalPadding = DsDivider.VerticalPadding.NONE
        ) : MenuItem
    }

    @Stable
    class Anchor(
        val layoutCoordinates: LayoutCoordinates,
        val offset: IntOffset = IntOffset.Zero,
    )

    @Stable
    sealed interface StartSlot {

        data class Icon(
            val icon: ImageVector,
            val contentDescription: String? = null,
        ) : StartSlot

        data class Image(
            val image: Painter,
        ) : StartSlot

        data object None : StartSlot
    }

    @Stable
    sealed interface EndSlot {

        data class Checkbox(
            val state: DsCheckbox.State,
            val onStateChanged: (DsCheckbox.State) -> Unit,
            val variant: DsCheckbox.Variant,
            val enabled: Boolean = true,
        ) : EndSlot

        data class Icon(
            val icon: ImageVector,
            val contentDescription: String? = null,
        ) : EndSlot

        data class Radio(
            val selected: Boolean,
            val onClick: () -> Unit,
            val enabled: Boolean = true,
        ) : EndSlot

        data object None : EndSlot
    }
}

private fun menuOffset(
    constraints: Constraints,
    anchor: DsEditMenu.Anchor,
    menuSpecs: Triple<Int, Int, Int>
): IntOffset {
    val (elementSize, elementX, elementY) = Triple(
        anchor.layoutCoordinates.size,
        anchor.layoutCoordinates.positionInParent().x.toInt(),
        anchor.layoutCoordinates.positionInParent().y.toInt()
    )
    val (menuWidth, menuHeight, padding) = menuSpecs
    val canPlaceStart = (elementX + elementSize.width) - (menuWidth + padding) >= 0
    val xOffset = if (canPlaceStart) {
        min(
            elementX + elementSize.width - menuWidth,
            constraints.maxWidth - padding - menuWidth
        )
    } else {
        padding
    }
    val canPlaceBottom =
        (menuHeight + padding) + (elementY + elementSize.height) <= constraints.maxHeight
    val yOffset = if (canPlaceBottom) {
        elementY + elementSize.height + padding
    } else {
        max(elementY - padding - menuHeight, padding)
    }
    return IntOffset(
        x = xOffset,
        y = yOffset
    )
}

@Composable
private fun Item(
    widthPx: Int,
    item: DsEditMenu.MenuItem,
    hasStartSlots: Boolean,
    hasEndSlots: Boolean,
) {
    when (item) {
        is DsEditMenu.MenuItem.Item -> {
            Row(
                modifier = if (widthPx >= 0) {
                    Modifier.width(with(LocalDensity.current) { widthPx.toDp() })
                } else {
                    Modifier
                }
                    .defaultMinSize(minHeight = Ds.Size.M24)
                    .background(Ds.Color.ElevationBase)
                    .clickable(onClick = item.onClick)
                    .padding(horizontal = Ds.Size.M8, vertical = Ds.Size.M4),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f, fill = false)
                ) {
                    StartSlot(item.startSlot, item.labelColor, hasStartSlots)
                    Text(
                        text = item.label,
                        style = Ds.Typography.BodyShortLgRegular,
                        color = item.labelColor ?: Ds.Color.TextPrimary,
                        maxLines = item.labelLineLimit,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                EndSlot(item.endSlot, item.labelColor, hasEndSlots)
            }
        }
        is DsEditMenu.MenuItem.Divider -> {
            DsDivider(
                modifier = if (widthPx >= 0) {
                    Modifier.width(with(LocalDensity.current) { widthPx.toDp() })
                } else {
                    Modifier.width(1.dp)
                }
                    .background(Ds.Color.ElevationBase),
                compact = item.compact,
                verticalPadding = item.padding,
            )
        }
    }
}

@Composable
private fun RowScope.StartSlot(startSlot: DsEditMenu.StartSlot, tint: Color?, hasStartSlots: Boolean) {
    when (startSlot) {
        is DsEditMenu.StartSlot.Icon -> {
            SlotIcon(startSlot.icon, tint)
            Spacer(modifier = Modifier.width(Ds.Size.M6))
        }
        is DsEditMenu.StartSlot.Image -> {
            Box(
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = startSlot.image,
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    modifier = Modifier.size(Ds.Size.M12),
                )
            }
            Spacer(modifier = Modifier.width(Ds.Size.M6))
        }
        DsEditMenu.StartSlot.None -> {
            if (hasStartSlots) {
                Spacer(modifier = Modifier.width(Ds.Size.M12))
                Spacer(modifier = Modifier.width(Ds.Size.M6))
            }
        }
    }
}

@Composable
private fun RowScope.EndSlot(endSlot: DsEditMenu.EndSlot, tint: Color?, hasEndSlots: Boolean) {
    when (endSlot) {
        is DsEditMenu.EndSlot.Checkbox -> {
            Spacer(modifier = Modifier.width(Ds.Size.M6))
            DsCheckbox(
                state = endSlot.state,
                enabled = endSlot.enabled,
                onStateChanged = endSlot.onStateChanged,
                variant = endSlot.variant,
            )
        }

        is DsEditMenu.EndSlot.Icon -> {
            Spacer(modifier = Modifier.width(Ds.Size.M6))
            SlotIcon(endSlot.icon, tint)
        }

        is DsEditMenu.EndSlot.Radio -> {
            Spacer(modifier = Modifier.width(Ds.Size.M6))
            DsRadio(
                selected = endSlot.selected,
                onClick = endSlot.onClick,
                enabled = endSlot.enabled,
            )
        }

        is DsEditMenu.EndSlot.None -> {
            if (hasEndSlots) {
                Spacer(modifier = Modifier.width(Ds.Size.M6))
                Spacer(modifier = Modifier.width(Ds.Size.M12))
            }
        }
    }
}

@Composable
private fun RowScope.SlotIcon(image: ImageVector, tint: Color?) {
    Icon(
        modifier = Modifier.align(Alignment.CenterVertically),
        painter = rememberVectorPainter(image = image),
        contentDescription = null,
        tint = tint ?: Ds.Color.TextPrimary,
    )
}
