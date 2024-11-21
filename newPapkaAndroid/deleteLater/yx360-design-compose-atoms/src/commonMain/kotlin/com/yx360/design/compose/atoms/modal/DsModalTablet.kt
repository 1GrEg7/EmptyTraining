package com.yx360.design.compose.atoms.modal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import kotlin.math.max

/**
 * [Figma](https://nda.ya.ru/t/gdHLTtgV77XWfT)
 */
@ExperimentalOrbitaDsAtom
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DsModalTablet(
    fullScreen: Boolean,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    size: DsModalTablet.Size = DsModalTablet.Size.Md,
    title: String? = null,
    subtitle: String? = null,
    topBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    close: DsModal.Close? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val density = LocalDensity.current
    val scope = remember {
        DsModalScopeInstance(sheetState = null)
    }
    val widthFraction = when (size) {
        DsModalTablet.Size.Sm -> 0.5f
        DsModalTablet.Size.Md -> 0.68f
    }
    var maxWidth by remember {
        mutableStateOf(Dp.Unspecified)
    }
    var maxHeight by remember {
        mutableStateOf(Dp.Unspecified)
    }
    var minRequiredModalHeight by remember { mutableStateOf(Dp.Unspecified) }
    val offset = remember(
        maxWidth,
        maxHeight,
        minRequiredModalHeight
    ) {
        modalOffset(
            maxWidth = with(density) { maxWidth.toPx() },
            maxHeight = with(density) { maxHeight.toPx() },
            widthFraction = widthFraction,
            modalHeight = with(density) { minRequiredModalHeight.toPx() },
            padding = with(density) { Ds.Size.M12.toPx() }
        )
    }
    val show = minRequiredModalHeight != Dp.Unspecified && (offset.x >= 0 && offset.y >= 0)
    scope.MeasureWrapContentHeight(
        topBar = {
            TopBar(
                isTablet = true,
                title,
                subtitle,
                topBarActions,
                close
            )
        },
        bottomBar = {
            BottomBar(
                isTablet = true,
                showDivider = true,
                bottomBarActions
            )
        },
        content = content,
        density = density,
        onContentHeight = { minRequiredModalHeight = it }
    )
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(if (show) Ds.Color.ElevationOverlayModal else Color.Transparent)
            .then(modifier)
            .systemBarsPadding()
            .clickable(
                onClick = onDismiss,
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            )
    ) {
        maxWidth = this.maxWidth
        maxHeight = this.maxHeight
        if (!show) return@BoxWithConstraints
        if (fullScreen || minRequiredModalHeight >= maxHeight) {
            Box(
                modifier = Modifier
                    .padding(vertical = Ds.Size.M16)
                    .offset(x = with(density) { offset.x.toDp() })
                    .fillMaxHeight()
                    .fillMaxWidth(fraction = widthFraction)
                    .clip(RoundedCornerShape(Ds.Size.M12))
                    .background(Ds.Color.ElevationBase)
                    .clickable(
                        enabled = false,
                        onClick = { }
                    )
            ) {
                scope.ScrollableContent(
                    topBar = {
                        TopBar(
                            isTablet = true,
                            title,
                            subtitle,
                            topBarActions,
                            close
                        )
                    },
                    bottomBar = {
                        BottomBar(
                            isTablet = true,
                            showDivider = true,
                            bottomBarActions
                        )
                    },
                    content = content
                )
            }
        } else {
            Box(
                modifier = Modifier
                    .offset(
                        x = with(density) { offset.x.toDp() },
                        y = with(density) { offset.y.toDp() }
                    )
                    .height(minRequiredModalHeight)
                    .fillMaxWidth(fraction = widthFraction)
                    .clip(RoundedCornerShape(Ds.Size.M12))
                    .background(Ds.Color.ElevationBase)
            ) {
                scope.WrapHeightContent(
                    topBar = {
                        TopBar(
                            isTablet = true,
                            title,
                            subtitle,
                            topBarActions,
                            close
                        )
                    },
                    bottomBar = {
                        BottomBar(
                            isTablet = true,
                            showDivider = true,
                            bottomBarActions
                        )
                    },
                    content = content,
                    density = density
                )
            }
        }
    }
}

object DsModalTablet {
    enum class Size {
        Sm, Md
    }
}

private fun modalOffset(
    maxWidth: Float,
    maxHeight: Float,
    widthFraction: Float,
    modalHeight: Float,
    padding: Float
): IntOffset {
    val modalTopY = ((maxHeight - modalHeight) / 2).toInt()
    return IntOffset(
        x = ((maxWidth * (1 - widthFraction)) / 2).toInt(),
        y = max(padding.toInt(), modalTopY)
    )
}
