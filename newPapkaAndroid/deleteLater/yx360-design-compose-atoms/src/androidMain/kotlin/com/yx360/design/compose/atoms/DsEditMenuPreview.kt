package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.StarOutlineMd
import com.yx360.design.compose.icons.dsicon.TickOutlineSm

@Composable
private fun DsEditMenuPreview_AllOptions(darkTheme: Boolean) {
    Ds.Theme(brandTheme = BrandTheme.Disk, darkTheme = darkTheme) {
        DsEditMenu(
            modifier = Modifier
                .padding(Ds.Size.M4),
            anchor = DsEditMenu.Anchor(layoutCoordinates = MyCoordinates(
                size = IntSize(0, 0),
                offset = Offset(0f, 0f)
            )),
            items = editMenuAllOptions(),
            onDismiss = {},
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 240, heightDp = 500)
fun DsEditMenuPreviewLight_AllOptions() {
    DsEditMenuPreview_AllOptions(darkTheme = false)
}

@Composable
@Preview(showBackground = true, widthDp = 240, heightDp = 500)
fun DsEditMenuPreviewDark_AllOptions() {
    DsEditMenuPreview_AllOptions(darkTheme = true)
}

@Suppress("LongMethod")
@Composable
private fun editMenuAllOptions(): List<DsEditMenu.MenuItem> = listOf(
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.Icon(Ds.Icon.StarOutlineMd),
        endSlot = DsEditMenu.EndSlot.None,
        label = "Icon Item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.Image(
            image = rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
        ),
        endSlot = DsEditMenu.EndSlot.None,
        label = "Image item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Divider(
        compact = true
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.None,
        label = "Compact Divider",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.Checkbox(
            state = DsCheckbox.State.Selected,
            onStateChanged = {},
            variant = DsCheckbox.Variant.Brand,
        ),
        label = "Checkbox Item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.Icon(Ds.Icon.TickOutlineSm),
        label = "Icon Item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.Radio(
            selected = false,
            onClick = {}
        ),
        label = "Radio off Item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.Radio(
            selected = true,
            onClick = {}
        ),
        label = "Radio on Item",
        onClick = {}
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.Icon(Ds.Icon.StarOutlineMd),
        endSlot = DsEditMenu.EndSlot.Icon(Ds.Icon.TickOutlineSm),
        label = "Colored Item",
        onClick = {},
        labelColor = Ds.Color.SurfaceAccent07,
    ),
    DsEditMenu.MenuItem.Divider(
        compact = false,
        padding = DsDivider.VerticalPadding.M4
    ),
    DsEditMenu.MenuItem.Item(
        startSlot = DsEditMenu.StartSlot.None,
        endSlot = DsEditMenu.EndSlot.None,
        label = "Padding divider",
        onClick = {}
    ),
)

@Composable
@Preview(showBackground = true, widthDp = 350, heightDp = 250)
fun DsEditMenuPreviewLight_LongLabels() {
    DsEditMenuPreview_LongLabels(darkTheme = false)
}

@Composable
@Preview(showBackground = true, widthDp = 350, heightDp = 250)
fun DsEditMenuPreviewDark_LongLabels() {
    DsEditMenuPreview_LongLabels(darkTheme = true)
}

@Composable
private fun DsEditMenuPreview_LongLabels(darkTheme: Boolean) {
    Ds.Theme(brandTheme = BrandTheme.Disk, darkTheme = darkTheme) {
        val longString = "Very long text that is longer than 280dp character limit"
        DsEditMenu(
            modifier = Modifier
                .padding(Ds.Size.M4),
            anchor = DsEditMenu.Anchor(layoutCoordinates = MyCoordinates(
                size = IntSize(0, 0),
                offset = Offset(0f, 0f)
            )),
            items = listOf(
                DsEditMenu.MenuItem.Item(
                    startSlot = DsEditMenu.StartSlot.Icon(Ds.Icon.StarOutlineMd),
                    endSlot = DsEditMenu.EndSlot.Icon(Ds.Icon.TickOutlineSm),
                    label = longString,
                    onClick = {},
                ),
                DsEditMenu.MenuItem.Item(
                    startSlot = DsEditMenu.StartSlot.Icon(Ds.Icon.StarOutlineMd),
                    endSlot = DsEditMenu.EndSlot.Icon(Ds.Icon.TickOutlineSm),
                    label = longString,
                    onClick = {},
                    labelLineLimit = 2,
                ),
                DsEditMenu.MenuItem.Item(
                    startSlot = DsEditMenu.StartSlot.Icon(Ds.Icon.StarOutlineMd),
                    endSlot = DsEditMenu.EndSlot.Icon(Ds.Icon.TickOutlineSm),
                    label = longString,
                    onClick = {},
                    labelLineLimit = 3,
                ),
            ),
            onDismiss = {},
        )
    }
}

@Suppress("StringLiteralDuplication")
private class MyCoordinates(
    override val size: IntSize,
    private val offset: Offset,
    private val finish: Boolean = false
) : LayoutCoordinates {
    override val isAttached: Boolean
        get() = TODO("Not yet implemented")
    override val parentCoordinates: LayoutCoordinates
        get() = TODO("Not yet implemented")
    override val parentLayoutCoordinates: LayoutCoordinates?
        get() =
            if (!finish) {
                MyCoordinates(size, offset, finish = true)
            } else {
                null
            }

    override val providedAlignmentLines: Set<AlignmentLine>
        get() = TODO("Not yet implemented")

    override fun get(alignmentLine: AlignmentLine): Int {
        TODO("Not yet implemented")
    }

    override fun localBoundingBoxOf(
        sourceCoordinates: LayoutCoordinates,
        clipBounds: Boolean
    ): Rect {
        TODO("Not yet implemented")
    }

    override fun localPositionOf(
        sourceCoordinates: LayoutCoordinates,
        relativeToSource: Offset
    ): Offset = offset

    override fun localToRoot(relativeToLocal: Offset): Offset {
        TODO("Not yet implemented")
    }

    override fun localToWindow(relativeToLocal: Offset): Offset {
        TODO("Not yet implemented")
    }

    override fun windowToLocal(relativeToWindow: Offset): Offset {
        TODO("Not yet implemented")
    }

}
