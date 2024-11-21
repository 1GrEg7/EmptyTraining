package com.yx360.design.compose.atoms.modal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.LayoutDirection
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButtonClose
import kotlin.math.max

/**
 * [Figma](https://nda.ya.ru/t/x3yo9cpj77FuEa)
 */
@DsModalInternalApiUsage
@Composable
fun DsModalNavigationBar(
    showGrabber: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    subtitle: String? = null,
    close: DsModalNavigationBar.Close? = null,
    actions: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = Ds.Color.ElevationBase,
                shape = RoundedCornerShape(topStart = Ds.Rounding.M12, topEnd = Ds.Rounding.M12),
            )
            .padding(horizontal = Ds.Spacing.M8, vertical = Ds.Spacing.M4),
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M4),
    ) {
        if (showGrabber) {
            Grabber(modifier = Modifier.align(Alignment.CenterHorizontally))
        } else {
            Spacer(Modifier)
        }
        if (title != null || subtitle != null || close != null || actions != null) {
            Content(
                title,
                subtitle,
                close,
                actions
            )
        }
    }
}

@Suppress("LongMethod", "MagicNumber")
object DsModalNavigationBar {

    @Stable
    class Close(
        val closeType: DsButtonClose.Type,
        val onClose: () -> Unit,
    )
}

private const val TITLE_MAX_LINES = 1
private const val TITLE_EXTENDED_MAX_LINES = 2
private const val SUBTITLE_MAX_LINES = 1

@Suppress("LongMethod")
@Composable
private fun Content(
    title: String? = null,
    subtitle: String? = null,
    close: DsModalNavigationBar.Close? = null,
    actions: (@Composable () -> Unit)? = null,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
        SubcomposeLayout(
            modifier = Modifier
        ) { constraints ->
            val measurables = subcompose(Unit, content = {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    if (close != null) {
                        CloseButton(
                            modifier = Modifier
                                .wrapContentSize(),
                            closeAction = close.closeType,
                            onCloseClick = close.onClose,
                        )
                    } else {
                        Spacer(modifier = Modifier.size(Ds.Size.M20))
                    }
                }
                if (!title.isNullOrEmpty() || !subtitle.isNullOrEmpty()) {
                    TitleSubtitle(
                        modifier = Modifier
                            .wrapContentSize(),
                        title = title,
                        subtitle = subtitle,
                    )
                } else {
                    Spacer(modifier = Modifier)
                }
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    if (actions != null) {
                        actions.invoke()
                    } else {
                        Spacer(modifier = Modifier.size(Ds.Size.M20))
                    }
                }
            })
            val placeables = ArrayList<Placeable>()
            val closeButtonMeasurable = measurables[0]
            val titleMeasurable = measurables[1]
            val rightActionsMeasurable = measurables[2]

            placeables.add(closeButtonMeasurable.measure(constraints))
            placeables.add(rightActionsMeasurable.measure(constraints))

            placeables.add(
                index = 1,
                element = titleMeasurable.measure(
                    constraints.copy(
                        maxWidth = titleMaxWidth(
                            isRtl = isRtl,
                            closeButtonWidth = placeables[0].width,
                            rightActionsWidth = placeables[1].width,
                            constraints = constraints,
                            innerPadding = Ds.Size.M8.toPx().toInt()
                        )
                    )
                )
            )
            val height = placeables.maxOf { it.height }
            layout(constraints.maxWidth, height) {
                val closeButtonPlaceable = placeables[0]
                val titlePlaceable = placeables[1]
                val rightActionsPlaceable = placeables[2]
                if (isRtl) {
                    rightActionsPlaceable.place(
                        0,
                        (height - rightActionsPlaceable.height) / 2
                    )
                } else {
                    closeButtonPlaceable.place(
                        0,
                        (height - closeButtonPlaceable.height) / 2
                    )
                }
                titlePlaceable.place(
                    (constraints.maxWidth - titlePlaceable.width) / 2,
                    (height - titlePlaceable.height) / 2
                )
                if (isRtl) {
                    closeButtonPlaceable.place(
                        constraints.maxWidth - closeButtonPlaceable.width,
                        (height - closeButtonPlaceable.height) / 2
                    )
                } else {
                    rightActionsPlaceable.place(
                        constraints.maxWidth - rightActionsPlaceable.width,
                        (height - rightActionsPlaceable.height) / 2
                    )
                }
            }
        }
    }
}

private fun titleMaxWidth(
    isRtl: Boolean,
    closeButtonWidth: Int,
    rightActionsWidth: Int,
    constraints: Constraints,
    innerPadding: Int
): Int {
    val endItemWidth = if (isRtl) closeButtonWidth else rightActionsWidth
    val endItemStartX = constraints.maxWidth - endItemWidth
    var titleWidth = (constraints.maxWidth - (closeButtonWidth + rightActionsWidth))
    var titleStartX = (constraints.maxWidth - titleWidth) / 2
    var overflow = max(titleStartX + titleWidth - endItemStartX, 0)
    while (titleWidth > 0 && overflow > 0) {
        titleWidth -= overflow
        titleStartX = (constraints.maxWidth - titleWidth) / 2
        overflow = max(titleStartX + titleWidth - endItemStartX, 0)
    }

    val startItemEndX = if (isRtl) rightActionsWidth else closeButtonWidth
    overflow = max(startItemEndX - titleStartX, 0)
    while (titleWidth > 0 && overflow > 0) {
        titleWidth -= overflow
        titleStartX = (constraints.maxWidth - titleWidth) / 2
        overflow = max(startItemEndX - titleStartX, 0)
    }
    return max(titleWidth - innerPadding, 0)
}

@Composable
private fun CloseButton(
    modifier: Modifier = Modifier,
    closeAction: DsButtonClose.Type,
    onCloseClick: () -> Unit,
) {
    DsButtonClose(
        modifier = modifier,
        onClick = onCloseClick,
        action = closeAction,
    )
}

@Composable
private fun TitleSubtitle(
    title: String?,
    subtitle: String?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (!title.isNullOrEmpty()) {
            val maxLines = TITLE_EXTENDED_MAX_LINES
                .takeIf { subtitle.isNullOrEmpty() }
                ?: TITLE_MAX_LINES
            Text(
                text = title,
                maxLines = maxLines,
                style = Ds.Typography.HeadingXs,
                color = Ds.Color.TextPrimary,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
            )
        }
        if (!subtitle.isNullOrEmpty()) {
            Text(
                text = subtitle,
                maxLines = SUBTITLE_MAX_LINES,
                style = Ds.Typography.BodyMdRegular,
                color = Ds.Color.TextSecondary,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun Grabber(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(
                width = Ds.Size.M16,
                height = Ds.Size.M2,
            )
            .background(
                color = Ds.Color.TextDisabled,
                shape = RoundedCornerShape(Ds.Rounding.Full),
            ),
    )
}
