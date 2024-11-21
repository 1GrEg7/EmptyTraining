package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import com.yx360.design.compose.Ds
import kotlin.math.min

/**
 * [Figma](https://nda.ya.ru/t/RLOr1Eol77zsx4)
 */
@Composable
fun DsSegmentedControl(
    items: List<DsSegmentedControl.Item>,
    selectedItemIndex: Int,
    onSelect: (Int) -> Unit,
    container: DsSegmentedControl.Container,
    modifier: Modifier = Modifier,
) {
    require(selectedItemIndex in items.indices) {
        "selectedItemIndex must be in range [0, ${items.size - 1}]"
    }
    require(items.size > 1) {
        "count of items must be at least 2"
    }
    Row(
        modifier
            .clip(RoundedCornerShape(Ds.Rounding.Full))
            .background(Ds.Color.SurfaceGenericMedium)
            .padding(Ds.Spacing.M)
            .then(
                when (container) {
                    DsSegmentedControl.Container.Hug -> Modifier.horizontalScroll(
                        rememberScrollState()
                    )

                    DsSegmentedControl.Container.Fixed -> Modifier
                }
            )
    ) {
        items.forEachIndexed { index, model ->
            SegmentControlButton(
                modifier = when (container) {
                    DsSegmentedControl.Container.Hug -> Modifier.wrapContentSize()
                    DsSegmentedControl.Container.Fixed -> Modifier.weight(1f)
                },
                enabled = model.enabled,
                selected = index == selectedItemIndex,
                onClick = { onSelect.invoke(index) },
                label = model.label,
                startIcon = model.startIcon,
                endSlot = model.endSlot,
                container = container
            )
        }
    }
}

@Suppress("LongMethod", "MagicNumber")
@Composable
private fun SegmentControlButton(
    enabled: Boolean,
    selected: Boolean,
    onClick: () -> Unit,
    container: DsSegmentedControl.Container,
    modifier: Modifier = Modifier,
    label: String? = null,
    startIcon: Painter? = null,
    endSlot: (@Composable BoxScope.() -> Unit)? = null
) {
    val background = when {
        enabled && selected -> Ds.Color.SurfaceGenericAlt
        enabled && !selected -> Color.Transparent
        else -> Color.Transparent
    }
    val contentColor = when {
        enabled && selected -> Ds.Color.TextPrimary
        enabled && !selected -> Ds.Color.TextSecondary
        else -> Ds.Color.TextDisabled
    }
    val verticalPadding = with(LocalDensity.current) { Ds.Size.M4.roundToPx() }
    val horizontalPadding = with(LocalDensity.current) { Ds.Size.M6.roundToPx() }
    val spacedBy = with(LocalDensity.current) { Ds.Size.M2.roundToPx() }
    val minButtonHeight = with(LocalDensity.current) { Ds.Size.M18.roundToPx() }
    Layout(
        modifier = modifier
            .heightIn(min = Ds.Size.M18)
            .clip(RoundedCornerShape(Ds.Rounding.Full))
            .background(background)
            .clickable(
                enabled = enabled,
                indication = null,
                interactionSource = remember { MutableInteractionSource() },
                onClick = onClick
            )
            .then(if (!enabled) Modifier.alpha(Ds.Opacity.M24) else Modifier),
        content = {
            startIcon?.let { painter ->
                Icon(
                    modifier = Modifier
                        .size(Ds.Size.M8)
                        .layoutId(LayoutId.StartIcon),
                    painter = painter,
                    tint = contentColor,
                    contentDescription = "Left icon"
                )
            }
            label?.let {
                Text(
                    modifier = Modifier
                        .wrapContentSize()
                        .layoutId(LayoutId.Text),
                    text = it,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = Ds.Typography.BodyShortMdMedium,
                    color = contentColor
                )
            }
            endSlot?.let {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .layoutId(LayoutId.EndSlot),
                    content = endSlot
                )
            }
        }
    ) { measurables, constraints ->
        val constraints = constraints.copy(minWidth = 0)
        val startIcon =
            measurables.firstOrNull { it.layoutId == LayoutId.StartIcon }?.measure(constraints)
        val endSlot =
            measurables.firstOrNull { it.layoutId == LayoutId.EndSlot }?.measure(constraints)
        val textMeasurable = measurables.firstOrNull { it.layoutId == LayoutId.Text }

        val leftInnerSpace =
            if (startIcon != null && (textMeasurable != null || endSlot != null)) {
                spacedBy
            } else {
                0
            }

        val rightInnerSpace =
            if (endSlot != null && (textMeasurable != null || startIcon != null)) {
                spacedBy
            } else {
                0
            }

        val startIconWidth = startIcon?.let { it.width + leftInnerSpace } ?: 0
        val endSlotWidth = endSlot?.let { it.width + rightInnerSpace } ?: 0

        val maxTextWidth = when (container) {
            DsSegmentedControl.Container.Hug -> {
                Constraints.Infinity
            }

            DsSegmentedControl.Container.Fixed -> {
                constraints.maxWidth - (2 * horizontalPadding) - startIconWidth - endSlotWidth
            }
        }

        val text = textMeasurable?.measure(
            constraints = constraints.copy(
                maxWidth = maxTextWidth
            )
        )

        val contentWidth = (startIcon?.let { it.width + leftInnerSpace } ?: 0) + (text?.width
            ?: 0) + (endSlot?.let { it.width + rightInnerSpace } ?: 0)

        val width = when (container) {
            DsSegmentedControl.Container.Hug -> 2 * horizontalPadding + contentWidth
            DsSegmentedControl.Container.Fixed -> constraints.maxWidth
        }

        val maxItemHeight = maxOf(
            startIcon?.height ?: 0,
            endSlot?.height ?: 0,
            text?.height ?: 0
        )

        val minItemsHeight = maxItemHeight + 2 * verticalPadding
        val height = min(minButtonHeight, minItemsHeight)
        var x = (width - contentWidth) / 2
        layout(width, height) {
            startIcon?.place(x, (height - startIcon.height) / 2)
            x += startIcon?.let { it.width + spacedBy } ?: 0
            text?.place(x, (height - text.height) / 2)
            x += text?.let { it.width + spacedBy } ?: 0
            endSlot?.place(x, (height - endSlot.height) / 2)
        }
    }
}

object DsSegmentedControl {

    @Immutable
    class Item(
        val enabled: Boolean,
        val label: String? = null,
        val startIcon: Painter? = null,
        val endSlot: (@Composable BoxScope.() -> Unit)? = null,
    )

    enum class Container {
        Hug, Fixed
    }
}

private enum class LayoutId {
    StartIcon, Text, EndSlot
}
