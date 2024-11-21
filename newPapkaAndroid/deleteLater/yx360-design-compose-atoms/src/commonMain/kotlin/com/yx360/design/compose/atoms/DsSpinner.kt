package com.yx360.design.compose.atoms

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.yx360.design.compose.Ds

private const val STROKE_WIDTH_FACTOR = (1f / 12f)

/**
 * [Figma](https://nda.ya.ru/t/5JvrR6b977jcmm)
 */
@Composable
fun DsSpinner(
    modifier: Modifier = Modifier,
    color: Color = Ds.Color.TextPrimary,
    size: Dp = Ds.Spacing.M12,
) {
    val infiniteTransition = rememberInfiniteTransition()
    val rotateAnim by infiniteTransition.animateFloat(
        initialValue = SPINNER_START,
        targetValue = SPINNER_END,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis = SPIN_DURATION,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "Loading rotation"
    )

    CircularProgressIndicator(
        modifier = modifier
            .size(size)
            .rotate(rotateAnim),
        strokeWidth = size * STROKE_WIDTH_FACTOR,
        progress = { SPINNER_PROGRESS },
        color = color,
        trackColor = Color.Transparent,
        strokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap,
    )
}

private const val SPINNER_PROGRESS = 0.75f
private const val SPINNER_START = 0f
private const val SPINNER_END = 360f
private const val SPIN_DURATION = 1000
