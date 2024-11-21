package com.yx360.design.compose.atoms.modal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.atoms.utils.getScreenSize
import androidx.compose.material3.TopAppBarDefaults.windowInsets as TopBarInsets

/**
 * [Figma](https://nda.ya.ru/t/0wjjKAXk77PiWN)
 */
@ExperimentalOrbitaDsAtom
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DsModal(
    fullScreen: Boolean,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    title: String? = null,
    subtitle: String? = null,
    topBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    close: DsModal.Close? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val density = LocalDensity.current
    val sheetState = remember {
        SheetState(
            skipPartiallyExpanded = true,
            initialValue = SheetValue.Hidden,
            density = density
        )
    }
    val topPaddingDs = Ds.Spacing.M10
    var statusBarsInsets by remember { mutableStateOf(0.dp) }
    val topPadding by remember(statusBarsInsets) {
        derivedStateOf {
            topPaddingDs + statusBarsInsets
        }
    }
    val scope = remember {
        DsModalScopeInstance(sheetState)
    }
    var minRequiredModalHeight by remember { mutableStateOf(0.dp) }

    scope.MeasureWrapContentHeight(
        topBar = {
            TopBar(
                isTablet = false,
                title,
                subtitle,
                topBarActions,
                close
            )
        },
        bottomBar = {
            BottomBar(
                isTablet = false,
                showDivider = false,
                bottomBarActions
            )
        },
        content = content,
        density = density,
        onContentHeight = { minRequiredModalHeight = it }
    )
    if (fullScreen || minRequiredModalHeight >= (getScreenSize().height - topPadding)) {
        ModalBottomSheet(
            modifier = modifier
                .padding(
                    top = topPadding,
                )
                .fillMaxSize(),
            onDismissRequest = onDismiss,
            containerColor = Ds.Color.ElevationBase,
            scrimColor = Ds.Color.ElevationOverlayModal,
            sheetState = sheetState,
            dragHandle = null,
            content = {
                statusBarsInsets = TopBarInsets.only(
                    WindowInsetsSides.Top
                ).asPaddingValues().calculateTopPadding()
                scope.ScrollableContent(
                    topBar = {
                        TopBar(
                            isTablet = false,
                            title,
                            subtitle,
                            topBarActions,
                            close
                        )
                    },
                    bottomBar = {
                        BottomBar(
                            isTablet = false,
                            showDivider = false,
                            bottomBarActions
                        )
                    },
                    content = content
                )
            }
        )
    } else {
        ModalBottomSheet(
            modifier = modifier
                .padding(
                    top = topPadding,
                )
                .wrapContentSize(),
            onDismissRequest = onDismiss,
            containerColor = Ds.Color.ElevationBase,
            scrimColor = Ds.Color.ElevationOverlayModal,
            sheetState = sheetState,
            dragHandle = null,
            content = {
                Box(
                    modifier = Modifier
                        .height(minRequiredModalHeight)
                        .fillMaxWidth(),
                ) {
                    scope.WrapHeightContent(
                        topBar = {
                            TopBar(
                                isTablet = false,
                                title,
                                subtitle,
                                topBarActions,
                                close
                            )
                        },
                        bottomBar = {
                            BottomBar(
                                isTablet = false,
                                showDivider = false,
                                bottomBarActions
                            )
                        },
                        content = content,
                        density = density,
                    )
                }
            }
        )
    }
}
