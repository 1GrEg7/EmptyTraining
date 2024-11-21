package com.yx360.design.compose.atoms

import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.unit.IntSize
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsRounding

private const val ANIMATION_DURATION = 1200

private const val ANIMATION_START_SHIFT = 2f

private const val ANIMATION_INITIAL = 0f
private const val ANIMATION_TARGET = 1f
private const val ANIMATION_MOVE_COEFFICIENT = 2

private const val SHIMMER_GRADIENT_START = 0.2f
private const val SHIMMER_COLOR = 0.5f
private const val SHIMMER_GRADIENT_END = 0.8f

/**
 * [Figma](https://nda.ya.ru/t/WnG9LwY077CNzy)
 */
@Composable
fun DsSkeleton(content: @Composable DsSkeletonBuilder.() -> Unit) {
    var size by remember { mutableStateOf(IntSize.Zero) }
    var rootOffset by remember { mutableStateOf(Offset.Zero) }
    Box(
        modifier = Modifier
            .onGloballyPositioned { coordinates ->
                size = coordinates.size
                rootOffset = coordinates.positionInRoot()
            }
    ) {
        val info = Animation(size)
        val colors = CreateShimmerColor()
        val skeletonBuilder = DsSkeletonBuilderImpl(info, colors, size, rootOffset)
        skeletonBuilder.content()
    }
}

object DsSkeleton {

    enum class Figure {
        Rectangle,
        Superellipse,
    }
}

interface DsSkeletonBuilder {
    val animate: Float
    val colorStops: Array<Pair<Float, Color>>
    val size: IntSize
    val rootOffset: Offset

    @Composable
    fun Shimmer(figure: DsSkeleton.Figure, modifier: Modifier)
}

private class DsSkeletonBuilderImpl(
    override val animate: Float,
    override val colorStops: Array<Pair<Float, Color>>,
    override val size: IntSize,
    override val rootOffset: Offset
) : DsSkeletonBuilder {

    @Composable
    override fun Shimmer(figure: DsSkeleton.Figure, modifier: Modifier) {
        DsSkeletonShimmeringBox(animate, colorStops, size, rootOffset, figure, modifier)
    }
}

@Composable
private fun DsSkeletonShimmeringBox(
    animate: Float,
    colorStops: Array<Pair<Float, Color>>,
    size: IntSize,
    rootOffset: Offset,
    figure: DsSkeleton.Figure,
    modifier: Modifier = Modifier,
) {
    var positionInSkeleton by remember { mutableStateOf(Offset.Zero) }

    val initialX = -positionInSkeleton.x + animate - (size.width * ANIMATION_START_SHIFT)
    val initialY = -positionInSkeleton.y + animate

    val end = if (size.height > size.width) size.height else size.width

    val endX = end + initialX
    val endY = end + initialY

    val brush = Brush.linearGradient(
        colorStops = colorStops,
        start = Offset(initialX, initialY),
        end = Offset(endX, endY),
    )

    Box(
        modifier = modifier
            .clip(
                when (figure) {
                    DsSkeleton.Figure.Rectangle -> RoundedCornerShape(DsRounding.M8)
                    DsSkeleton.Figure.Superellipse -> CircleShape
                }
            )
            .blur(
                Ds.Size.M8,
                Ds.Size.M8,
                edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(DsRounding.M8))
            )
            .background(brush)
            .onGloballyPositioned {
                positionInSkeleton = it.positionInRoot() - rootOffset
            }
    )
}

@Composable
private fun Animation(size: IntSize): Float {
    val transition = rememberInfiniteTransition(label = "")
    val translateAnim by transition.animateFloat(
        initialValue = ANIMATION_INITIAL,
        targetValue = ANIMATION_TARGET,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis = ANIMATION_DURATION,
                easing = EaseOut
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "Loading shimmer"
    )
    return size.width * translateAnim * ANIMATION_MOVE_COEFFICIENT
}

@Composable
private fun CreateShimmerColor(): Array<Pair<Float, Color>> {
    val color1 = Ds.Color.SurfaceGeneric
    val color2 = Ds.Color.MiscSkeletonShimmer
    return arrayOf(
        SHIMMER_GRADIENT_START to color1,
        SHIMMER_COLOR to color2,
        SHIMMER_GRADIENT_END to color1,
    )
}
