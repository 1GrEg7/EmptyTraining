package com.yx360.design.compose.atoms.topbar

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsAvatar
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.DsButtonIcon
import com.yx360.design.compose.atoms.DsButtonIconTransparent
import com.yx360.design.compose.atoms.DsButtonTransparent
import com.yx360.design.compose.atoms.DsSearch
import com.yx360.design.compose.atoms.topbar.DsTopBar.ScrollBehavior
import com.yx360.design.compose.atoms.topbar.DsTopBar.ScrollBehavior.State.LastScrollDirection
import com.yx360.design.compose.atoms.topbar.DsTopBarCenteredHorizontalPaddingType.End
import com.yx360.design.compose.atoms.topbar.DsTopBarCenteredHorizontalPaddingType.Start
import kotlin.math.abs

@Composable
internal fun DsTopBarBase(
    middleBlock: DsTopBar.MiddleBlock,
    scrollBehavior: ScrollBehavior?,
    isCentered: Boolean,
    windowInsets: WindowInsets,
    modifier: Modifier = Modifier,
    containerColor: Color = Ds.Color.ElevationBase,
    firstStartSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    firstEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    secondEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    thirdEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    fourthEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
) {
    val density = LocalDensity.current
    val scrolledContainerColor = Ds.Color.ElevationBase
    val targetContainerColor by remember(containerColor, scrollBehavior) {
        derivedStateOf {
            when (scrollBehavior?.state?.lastScrollDirection) {
                LastScrollDirection.Down -> scrolledContainerColor
                LastScrollDirection.Up, LastScrollDirection.None, null -> containerColor
            }
        }
    }
    val appBarContainerColor by animateColorAsState(
        targetValue = targetContainerColor,
        animationSpec = spring(stiffness = Spring.StiffnessMediumLow)
    )

    val startContentWidth = remember { mutableStateOf(0) }
    val endContentWidth = remember { mutableStateOf(0) }
    val centeredHorizontalPadding by remember {
        derivedStateOf {
            val diff = abs(startContentWidth.value - endContentWidth.value)
            val comparison = startContentWidth.value.compareTo(endContentWidth.value)
            when {
                comparison == 0 -> DsTopBarCenteredHorizontalPadding(
                    padding = 0,
                    type = DsTopBarCenteredHorizontalPaddingType.None,
                )

                comparison > 0 -> DsTopBarCenteredHorizontalPadding(
                    padding = diff,
                    type = End,
                )

                else -> DsTopBarCenteredHorizontalPadding(
                    padding = diff,
                    type = Start,
                )
            }
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = when {
            isCentered -> Arrangement.SpaceBetween
            middleBlock is DsTopBar.MiddleBlock.Title.None &&
                firstStartSlot == DsTopBar.Slot.None -> Arrangement.End

            middleBlock is DsTopBar.MiddleBlock.Title.None &&
                firstStartSlot != DsTopBar.Slot.None -> Arrangement.SpaceBetween

            else -> Arrangement.Start
        },
        modifier = modifier
            .background(
                color = appBarContainerColor,
            )
            .windowInsetsPadding(windowInsets)
            .padding(
                start = Ds.Spacing.M8,
                end = Ds.Spacing.M4,
            )
            .height(DsTopBar.height)
            .fillMaxWidth(),
    ) {
        if (firstStartSlot != DsTopBar.Slot.None) {
            DsTopBarSlot(
                slot = firstStartSlot,
                size = Ds.Size.M12,
                paddingValues = PaddingValues(end = Ds.Spacing.M8),
                slotWidthState = startContentWidth,
            )
        }

        when (middleBlock) {
            is DsTopBar.MiddleBlock.Title.Value -> DsTopBarTitle(
                title = middleBlock,
                isCentered = isCentered,
                density = density,
                horizontalPadding = centeredHorizontalPadding,
            )

            is DsTopBar.MiddleBlock.Avatar -> DsTopBarAvatar(
                avatar = middleBlock,
            )

            is DsTopBar.MiddleBlock.Search -> DsTopBarSearchBar(
                search = middleBlock,
            )

            DsTopBar.MiddleBlock.Title.None -> Unit
        }

        if (firstEndSlot != DsTopBar.Slot.None || secondEndSlot != DsTopBar.Slot.None ||
            thirdEndSlot != DsTopBar.Slot.None || fourthEndSlot != DsTopBar.Slot.None
        ) {
            DsTopBarEndSlots(
                firstEndSlot = firstEndSlot,
                secondEndSlot = secondEndSlot,
                thirdEndSlot = thirdEndSlot,
                fourthEndSlot = fourthEndSlot,
                endContentWidthState = endContentWidth
            )
        }
    }
}

@Composable
private fun RowScope.DsTopBarTitle(
    title: DsTopBar.MiddleBlock.Title.Value,
    isCentered: Boolean,
    density: Density,
    horizontalPadding: DsTopBarCenteredHorizontalPadding,
) {
    Row(
        horizontalArrangement = if (isCentered) {
            Arrangement.Center
        } else {
            Arrangement.Start
        },
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .weight(1f)
            .padding(
                start = if (isCentered && horizontalPadding.type == Start) {
                    with(density) { horizontalPadding.padding.toDp() }
                } else {
                    0.dp
                },
                end = Ds.Spacing.M4 + if (isCentered && horizontalPadding.type == End) {
                    with(density) { horizontalPadding.padding.toDp() }
                } else {
                    0.dp
                }
            )
    ) {
        Text(
            modifier = Modifier
                .weight(1f, fill = false),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            text = title.title,
            style = Ds.Typography.HeadingXs,
            color = Ds.Color.TextPrimary,
        )

        DsTopBarSlot(
            slot = title.middleSlot,
            paddingValues = PaddingValues(start = Ds.Spacing.M2),
            size = Ds.Size.M8,
        )
    }
}

@Composable
private fun RowScope.DsTopBarAvatar(
    avatar: DsTopBar.MiddleBlock.Avatar,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .weight(1f)
            .padding(
                end = Ds.Spacing.M4
            ),
    ) {
        DsAvatar(
            avatar = avatar.avatar,
            style = if (avatar.style == DsAvatar.Style.Indicator.YaPlus) {
                DsAvatar.Style.Default
            } else {
                avatar.style
            },
            size = DsAvatar.Size.M16,
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = Ds.Spacing.M4),
        ) {
            Text(
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                text = avatar.title,
                style = Ds.Typography.HeadingXs,
                color = Ds.Color.TextPrimary,
            )
            if (!avatar.subtitle.isNullOrEmpty()) {
                Text(
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = avatar.subtitle,
                    style = Ds.Typography.BodyShortMdRegular,
                    color = Ds.Color.TextSecondary,
                )
            }
        }
    }
}

@Composable
private fun RowScope.DsTopBarSearchBar(
    search: DsTopBar.MiddleBlock.Search,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .weight(1f)
            .padding(
                end = Ds.Spacing.M4
            )
    ) {
        DsSearch(
            value = search.value,
            placeholder = search.placeholder,
            size = DsSearch.Size.Md,
            onValueChanged = search.onValueChanged,
            enabled = search.enabled,
            onClear = search.onClear,
            sidePaddings = false,
        )
    }
}

@Composable
private fun DsTopBarEndSlots(
    firstEndSlot: DsTopBar.Slot,
    secondEndSlot: DsTopBar.Slot,
    thirdEndSlot: DsTopBar.Slot,
    fourthEndSlot: DsTopBar.Slot,
    endContentWidthState: MutableState<Int>?,
) {
    Row(
        modifier = Modifier
            .onGloballyPositioned { coordinates ->
                endContentWidthState?.value = coordinates.size.width
            }
            .padding(horizontal = Ds.Spacing.M4),
        horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M8),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DsTopBarSlot(
            slot = fourthEndSlot,
            size = Ds.Size.M12,
        )
        DsTopBarSlot(
            slot = thirdEndSlot,
            size = Ds.Size.M12,
        )
        DsTopBarSlot(
            slot = secondEndSlot,
            size = Ds.Size.M12,
        )
        DsTopBarSlot(
            slot = firstEndSlot,
            size = Ds.Size.M12,
        )
    }
}

@Composable
private fun DsTopBarSlot(
    slot: DsTopBar.Slot,
    size: Dp,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(),
    slotWidthState: MutableState<Int>? = null,
) {
    when (slot) {
        is DsTopBar.Slot.Button -> if (slot.isTransparent) {
            DsButtonTransparent(
                title = slot.title,
                onClick = slot.onClick,
                variant = slot.variant,
                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        slotWidthState?.value = coordinates.size.width
                    }
                    .padding(paddingValues),
                sideMargins = slot.sideMargins,
                size = DsButton.Size.Md,
                leftIcon = slot.leftIcon,
                rightIcon = slot.rightIcon,
                description = slot.description,
                loadingIndicator = slot.loadingIndicator,
                contentDescription = slot.contentDescription,
            )
        } else {
            DsButton(
                title = slot.title,
                onClick = slot.onClick,
                variant = slot.variant,
                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        slotWidthState?.value = coordinates.size.width
                    }
                    .padding(paddingValues),
                size = DsButton.Size.Md,
                leftIcon = slot.leftIcon,
                rightIcon = slot.rightIcon,
                description = slot.description,
                loadingIndicator = slot.loadingIndicator,
                contentDescription = slot.contentDescription,
            )
        }

        is DsTopBar.Slot.ButtonIcon -> if (slot.isTransparent) {
            DsButtonIconTransparent(
                onClick = slot.onClick,
                variant = slot.variant,
                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        slotWidthState?.value = coordinates.size.width
                    }
                    .padding(paddingValues),
                size = DsButton.Size.Md,
                loadingIndicator = slot.loadingIndicator,
                icon = slot.icon,
                enabled = slot.enabled,
            )
        } else {
            DsButtonIcon(
                onClick = slot.onClick,
                variant = slot.variant,
                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        slotWidthState?.value = coordinates.size.width
                    }
                    .padding(paddingValues),
                size = DsButton.Size.Md,
                loadingIndicator = slot.loadingIndicator,
                icon = slot.icon,
                enabled = slot.enabled,
                contentDescription = slot.contentDescription,
            )
        }

        is DsTopBar.Slot.Icon -> Icon(
            painter = slot.painter,
            contentDescription = null,
            tint = slot.tint ?: Ds.Color.TextPrimary,
            modifier = modifier
                .onGloballyPositioned { coordinates ->
                    slotWidthState?.value = coordinates.size.width
                }
                .padding(paddingValues)
                .then(
                    if (slot.onClick != null) {
                        Modifier.clickable(
                            onClick = slot.onClick,
                            interactionSource = remember { MutableInteractionSource() },
                            indication = ripple(bounded = false, radius = size / 2),
                        )
                    } else {
                        Modifier
                    }
                )
                .size(size),
        )

        is DsTopBar.Slot.Image -> Image(
            painter = slot.painter,
            contentDescription = null,
            modifier = Modifier
                .onGloballyPositioned { coordinates ->
                    slotWidthState?.value = coordinates.size.width
                }
                .padding(paddingValues)
                .then(
                    if (slot.onClick != null) {
                        Modifier.clickable(
                            onClick = slot.onClick,
                            interactionSource = remember { MutableInteractionSource() },
                            indication = ripple(bounded = false, radius = size / 2),
                        )
                    } else {
                        Modifier
                    }
                )
                .size(size),
        )

        DsTopBar.Slot.None -> Unit
    }
}

object DsTopBar {

    sealed interface MiddleBlock {
        sealed interface Title : MiddleBlock {
            data class Value(val title: String, val middleSlot: Slot = Slot.None) : Title
            data object None : Title
        }

        data class Avatar(
            val avatar: DsAvatar.Avatar,
            val style: DsAvatar.Style,
            val title: String,
            val subtitle: String?,
        ) : MiddleBlock

        data class Search(
            val value: String,
            val placeholder: String,
            val onValueChanged: (String) -> Unit,
            val enabled: Boolean = true,
            val onClear: (() -> Unit)? = null,
        ) : MiddleBlock
    }

    sealed interface Slot {
        data class Button(
            val isTransparent: Boolean,
            val title: String,
            val onClick: () -> Unit,
            val variant: DsButton.Style,
            val enabled: Boolean = true,
            val leftIcon: Painter? = null,
            val rightIcon: Painter? = null,
            val description: String? = null,
            val loadingIndicator: Boolean = false,
            val contentDescription: String? = null,
            val sideMargins: Boolean = false,
        ) : Slot

        data class ButtonIcon(
            val isTransparent: Boolean,
            val icon: Painter,
            val onClick: () -> Unit,
            val enabled: Boolean = true,
            val variant: DsButton.Style,
            val loadingIndicator: Boolean = false,
            val contentDescription: String? = null,
        ) : Slot

        data class Icon(
            val painter: Painter,
            val tint: Color? = null,
            val onClick: (() -> Unit)? = null
        ) : Slot

        data class Image(
            val painter: Painter,
            val onClick: (() -> Unit)? = null
        ) : Slot

        data object None : Slot
    }

    /* If there's no need to animate topBar color while content scrolling -> set null,
    Get via DsTopBar.scrollBehavior(), then pass its nestedScrollConnection into your containers'
    Modifier.nestedScroll() */
    class ScrollBehavior(
        val state: State,
    ) {
        var nestedScrollConnection =
            object : NestedScrollConnection {
                override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                    val previous = state.lastScrollDirection
                    val new = when {
                        available.y > 0 -> {
                            LastScrollDirection.Up
                        }

                        available.y < 0 -> {
                            LastScrollDirection.Down
                        }

                        else -> previous
                    }
                    if (previous != new) {
                        state.lastScrollDirection = new
                    }
                    return Offset.Zero
                }
            }

        class State {
            var lastScrollDirection by mutableStateOf(LastScrollDirection.None)

            enum class LastScrollDirection {
                Up,
                Down,
                None
            }

            companion object {

                val Saver: Saver<State, *> = listSaver(
                    save = { listOf(it.lastScrollDirection) },
                    restore = { State() }
                )
            }
        }
    }

    @Composable
    fun scrollBehavior(): ScrollBehavior {
        return ScrollBehavior(
            state = rememberDsTopBarState(),
        )
    }

    val height = 44.dp
}

private data class DsTopBarCenteredHorizontalPadding(
    val padding: Int,
    val type: DsTopBarCenteredHorizontalPaddingType,
)

private enum class DsTopBarCenteredHorizontalPaddingType {
    Start,
    End,
    None,
}

@Composable
private fun rememberDsTopBarState(): ScrollBehavior.State {
    return rememberSaveable(saver = ScrollBehavior.State.Saver) {
        ScrollBehavior.State()
    }
}

internal val topBarInsets
    @Composable
    get() = WindowInsets.systemBars
        .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)
