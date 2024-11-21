package com.yx360.design.compose.atoms.snackbar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.DsButtonTransparent

/**
 * [Figma](https://nda.ya.ru/t/0B2D7l_077cbHi)
 */
@Composable
fun DsSnackbar(
    title: String,
    modifier: Modifier = Modifier,
    topOffset: Dp = Ds.Spacing.M8,
    icon: DsSnackbar.Icon? = null,
    button: DsSnackbar.Button? = null,
    chevron: DsSnackbar.Chevron? = null,
) {
    val density = LocalDensity.current
    val statusBarsInsets = WindowInsets.statusBars
    val yOffset = remember(topOffset) {
        with(density) {
            topOffset.toPx().toInt() + statusBarsInsets.getTop(this)
        }
    }
    val popupPositionProviderAlignment = remember(yOffset) {
        AlignmentOffsetPositionProvider(Alignment.TopCenter, yOffset)
    }
    Popup(
        properties = PopupProperties(
            focusable = false,
            dismissOnClickOutside = false,
            dismissOnBackPress = false,
        ),
        popupPositionProvider = popupPositionProviderAlignment,
    ) {
        DsSnackbarBase(
            modifier
                .padding(
                    horizontal = Ds.Spacing.M4,
                    vertical = Ds.Spacing.M2,
                )
        ) {
            if (icon != null) {
                Icon(
                    modifier = Modifier.size(Ds.Size.M12),
                    painter = icon.painter,
                    contentDescription = null,
                    tint = icon.tint ?: Color.Unspecified,
                )
            }
            Text(
                modifier = Modifier.padding(horizontal = Ds.Spacing.M4),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                text = title,
                style = Ds.Typography.BodyShortMdRegular,
                color = Ds.Color.TextPrimary,
            )
            if (button != null) {
                DsButtonTransparent(
                    modifier = modifier
                        .padding(
                            horizontal = Ds.Spacing.M4,
                        ),
                    title = button.title,
                    onClick = button.onClick,
                    variant = button.variant,
                )
            }
            if (chevron != null) {
                Icon(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(Ds.Size.M8),
                    painter = chevron.painter,
                    contentDescription = null,
                    tint = chevron.tint ?: Color.Unspecified,
                )
            }
        }
    }
}

object DsSnackbar {

    /**
     * Temporary solution until Ds.Icon becomes Painter
     * TODO Remove in MOBILEDEV-35185
     */
    @Composable
    fun Icon(
        image: ImageVector,
        tint: Color? = null,
    ): Icon {
        return Icon(
            painter = rememberVectorPainter(image),
            tint = tint,
        )
    }

    @Composable
    fun Chevron(
        image: ImageVector,
        tint: Color? = null,
    ): Chevron {
        return Chevron(
            painter = rememberVectorPainter(image),
            tint = tint,
        )
    }

    data class Icon(
        val painter: Painter,
        val tint: Color? = null,
    )

    data class Chevron(
        val painter: Painter,
        val tint: Color? = null,
    )

    data class Button(
        val title: String,
        val onClick: () -> Unit,
        val variant: DsButton.Style,
    )

}

private class AlignmentOffsetPositionProvider(
    val alignment: Alignment,
    offsetY: Int,
) : PopupPositionProvider {

    private val offset = IntOffset(0, offsetY)

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val anchorAlignmentPoint = alignment.align(
            IntSize.Zero,
            anchorBounds.size,
            layoutDirection
        )
        val popupAlignmentPoint = -alignment.align(
            IntSize.Zero,
            popupContentSize,
            layoutDirection
        )
        val resolvedUserOffset = IntOffset(
            offset.x * (if (layoutDirection == LayoutDirection.Ltr) 1 else -1),
            offset.y
        )
        return anchorAlignmentPoint + popupAlignmentPoint + resolvedUserOffset
    }
}
