package com.yx360.design.compose.atoms.fab

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.drawLoading
import com.yx360.design.compose.atoms.utils.getLoadingOffsetState
import com.yx360.design.compose.atoms.utils.vectorToBitmap
import com.yx360.design.compose.dsShadow
import com.yx360.design.compose.icons.dsicon.LoadingPattern

/**
 * [Figma](https://nda.ya.ru/t/Ve8FqlEz77PQPP)
 */
@Composable
internal fun DsButtonFabText(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    loadingIndicator: Boolean = false,
) {
    val shape = remember { RoundedCornerShape(percent = 100) }

    FloatingActionButton(
        onClick = onClick,
        modifier = modifier
            .border(
                width = Ds.Line.M05,
                color = Ds.Color.MiscLineDarkmode,
                shape = shape,
            )
            .dsShadow(
                shadow = Ds.Shadow.Level03,
                shape = shape,
            )
            .height(Ds.Size.M20),
        shape = shape,
        containerColor = Ds.Color.ElevationOverlay,
        contentColor = Ds.Color.TextPrimary
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = text,
                overflow = TextOverflow.Ellipsis,
                style = Ds.Typography.BodyMdMedium.copy(color = Ds.Color.TextPrimary),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = Ds.Spacing.M8),
                maxLines = 1,
            )
            if (loadingIndicator) {
                val loadingIcon = rememberVectorPainter(Ds.Icon.LoadingPattern)
                val bitmap = remember { vectorToBitmap(loadingIcon) }
                val brush = remember {
                    ImageShader(
                        bitmap,
                        TileMode.Repeated,
                        TileMode.Repeated
                    )
                }
                Box(modifier.matchParentSize()) {
                    drawLoading(
                        brush = brush,
                        offset = getLoadingOffsetState(target = bitmap.width.toFloat())
                    )
                }
            }
        }
    }
}
