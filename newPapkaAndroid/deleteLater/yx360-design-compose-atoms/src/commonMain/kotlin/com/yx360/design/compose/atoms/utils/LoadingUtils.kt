package com.yx360.design.compose.atoms.utils

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.foundation.Canvas as CanvasFoundation

@Composable
internal fun getLoadingOffsetState(
    durationMillis: Int = 3000,
    target: Float
): State<Float> {
    val transition = rememberInfiniteTransition()
    return transition.animateFloat(
        initialValue = 0f,
        targetValue = target,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing,
            ),
            repeatMode = RepeatMode.Restart,
        )
    )
}

internal fun vectorToBitmap(painter: VectorPainter, color: Color? = null): ImageBitmap {
    val bitmap =
        ImageBitmap(painter.intrinsicSize.width.toInt(), painter.intrinsicSize.height.toInt())
    val canvas = Canvas(bitmap)

    CanvasDrawScope().draw(
        density = Density(1f),
        layoutDirection = LayoutDirection.Ltr,
        canvas = canvas,
        size = painter.intrinsicSize,
    ) {
        with(painter) {
            draw(
                size = painter.intrinsicSize,
                colorFilter = color?.let {
                    ColorFilter.tint(
                        color = it,
                    )
                }
            )
        }
    }
    return bitmap
}

@Composable
internal fun drawLoading(brush: Shader, offset: State<Float>) {
    val paint = remember { Paint().asFrameworkPaint() }
    CanvasFoundation(
        modifier = Modifier
    ) {
        with(paint) {
            isAntiAlias = true
            shader = brush
        }
        translate(offset.value) {
            drawIntoCanvas {
                it.nativeCanvas.drawPaint(paint)
            }
        }
        paint.reset()
    }
}
