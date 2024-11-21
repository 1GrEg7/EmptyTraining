package com.yx360.design.compose.atoms.modal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButtonClose

object DsModal {

    @Stable
    class Close(
        val closeType: DsButtonClose.Type,
        val onClose: DsModalScope.() -> Unit,
    )
}

interface DsModalScope {
    suspend fun hide()
}

internal class DsModalScopeInstance @OptIn(ExperimentalMaterial3Api::class) constructor(
    private val sheetState: SheetState? = null
) : DsModalScope {
    @OptIn(ExperimentalMaterial3Api::class)
    override suspend fun hide() {
        sheetState?.hide()
    }
}

@Composable
internal fun DsModalScope.ScrollableContent(
    modifier: Modifier = Modifier,
    topBar: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBar: (@Composable DsModalScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    Scaffold(
        modifier = modifier
            .fillMaxWidth(),
        containerColor = Ds.Color.ElevationBase,
        topBar = { topBar?.invoke(this) },
        bottomBar = { bottomBar?.invoke(this) },
        content = { pv ->
            Column(
                modifier = Modifier
                    .padding(pv)
                    .verticalScroll(rememberScrollState()),
                content = content
            )
        }
    )
}

@Composable
internal fun DsModalScope.WrapHeightContent(
    density: Density,
    onContentHeight: ((Dp) -> Unit)? = null,
    topBar: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBar: (@Composable DsModalScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    SubcomposeLayout { constraints ->
        val placeables: List<Placeable> = subcompose(Unit, content = {
            topBar?.invoke(this@WrapHeightContent)
            Column(content = content)
            bottomBar?.invoke(this@WrapHeightContent)
        }).map {
            it.measure(constraints)
        }
        onContentHeight?.invoke(
            with(density) { placeables.sumOf { it.height }.toDp() }
        )
        layout(constraints.maxWidth, constraints.maxHeight) {
            var y = 0
            placeables.forEach {
                it.place(0, y)
                y += it.height
            }
        }
    }
}

@Composable
internal fun DsModalScope.MeasureWrapContentHeight(
    density: Density,
    onContentHeight: (Dp) -> Unit,
    topBar: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBar: (@Composable DsModalScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Box(Modifier.wrapContentHeight()) {
        SubcomposeLayout { constraints ->
            val placeables: List<Placeable> = subcompose(Unit, content = {
                topBar?.invoke(this@MeasureWrapContentHeight)
                Column(content = content)
                bottomBar?.invoke(this@MeasureWrapContentHeight)
            }).map {
                it.measure(constraints)
            }
            onContentHeight(
                with(density) { placeables.sumOf { it.height }.toDp() }
            )
            layout(0, 0) { }
        }
    }
}

@OptIn(DsModalInternalApiUsage::class)
@Composable
internal fun DsModalScope.TopBar(
    isTablet: Boolean,
    title: String?,
    subtitle: String?,
    topBarActions: (@Composable DsModalScope.() -> Unit)?,
    close: DsModal.Close?
) {
    DsModalNavigationBar(
        showGrabber = !isTablet,
        title = title,
        subtitle = subtitle,
        close = if (close != null) {
            DsModalNavigationBar.Close(
                onClose = {
                    close.onClose.invoke(this)
                },
                closeType = close.closeType
            )
        } else {
            null
        },
        actions = if (topBarActions != null) {
            { topBarActions.invoke(this) }
        } else {
            null
        },
    )
}

@Composable
internal fun DsModalScope.BottomBar(
    isTablet: Boolean,
    showDivider: Boolean,
    bottomBarActions: (@Composable DsModalScope.() -> Unit)? = null
) {
    if (bottomBarActions != null) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (showDivider) {
                HorizontalDivider(
                    thickness = Ds.Line.M05,
                    color = Ds.Color.LineGeneric
                )
            }
            Box(
                modifier = Modifier
                    .then(
                        if (isTablet) {
                            Modifier.padding(all = Ds.Spacing.M8)
                        } else {
                            Modifier.padding(
                                vertical = Ds.Spacing.M4,
                                horizontal = Ds.Spacing.M8
                            )
                        }
                    )
                    .background(color = Ds.Color.ElevationBase),
                contentAlignment = Alignment.Center
            ) {
                bottomBarActions.invoke(this@BottomBar)
            }
        }
    } else if (isTablet) {
        Spacer(Modifier.height(Ds.Spacing.M8))
    }
}
