package com.yx360.design.compose.atoms.topbar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.icons.dsicon.ChevronLeftOutlineMd

/**
 * [Figma](https://nda.ya.ru/t/4mXPbt7478kazV)
 */
@ExperimentalOrbitaDsAtom
@Composable
fun DsTopBar(
    middleBlock: DsTopBar.MiddleBlock.Title,
    scrollBehavior: DsTopBar.ScrollBehavior?,
    modifier: Modifier = Modifier,
    containerColor: Color = Ds.Color.ElevationBase,
    back: (() -> Unit)? = null,
    firstEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    secondEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    thirdEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    fourthEndSlot: DsTopBar.Slot = DsTopBar.Slot.None,
    windowInsets: WindowInsets = topBarInsets,
) {
    DsTopBarBase(
        modifier = modifier,
        containerColor = containerColor,
        isCentered = false,
        windowInsets = windowInsets,
        firstStartSlot = if (back != null) {
            DsTopBar.Slot.Icon(
                painter = rememberVectorPainter(Ds.Icon.ChevronLeftOutlineMd),
                onClick = back,
            )
        } else {
            DsTopBar.Slot.None
        },
        firstEndSlot = firstEndSlot,
        secondEndSlot = secondEndSlot,
        thirdEndSlot = thirdEndSlot,
        fourthEndSlot = fourthEndSlot,
        middleBlock = middleBlock,
        scrollBehavior = scrollBehavior,
    )
}
