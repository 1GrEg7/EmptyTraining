package com.yx360.design.compose.atoms.fab

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.onGloballyPositioned
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
internal fun DsButtonFabIcon(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    loadingIndicator: Boolean = false,
) {
    var fabWidth by remember { mutableStateOf(0) }
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier
            .size(Ds.Size.M24)
            .dsShadow(
                shadow = Ds.Shadow.SurfaceBrand,
                shape = CircleShape,
            )
            .onGloballyPositioned {
                fabWidth = it.size.width
            },
        shape = CircleShape,
        containerColor = Ds.BrandColor.SurfaceBrand,
        contentColor = Ds.BrandColor.TextBrandStatic,
        content = {
            Box {
                Icon(
                    tint = Ds.BrandColor.TextBrandStatic,
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(Ds.Size.M12)
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
    )
}
