package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.LampOutlineLg: ImageVector
    get() {
        if (_lampOutlineLg != null) {
            return _lampOutlineLg!!
        }
        _lampOutlineLg = Builder(name = "LampOutlineLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.944f, 10.145f)
                lineTo(15.964f, 11.761f)
                lineTo(17.979f, 10.148f)
                lineTo(21.316f, 12.729f)
                lineTo(20.092f, 14.311f)
                lineTo(18.0f, 12.693f)
                lineTo(15.964f, 14.322f)
                lineTo(13.931f, 12.696f)
                lineTo(11.872f, 14.308f)
                lineTo(10.639f, 12.733f)
                lineTo(13.944f, 10.145f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.996f, 2.061f)
                curveTo(10.675f, 2.061f, 6.279f, 6.421f, 6.279f, 11.537f)
                curveTo(6.279f, 14.099f, 7.368f, 16.163f, 8.391f, 17.881f)
                curveTo(8.547f, 18.143f, 8.7f, 18.394f, 8.847f, 18.636f)
                curveTo(9.198f, 19.213f, 9.521f, 19.743f, 9.801f, 20.279f)
                curveTo(10.188f, 21.018f, 10.439f, 21.67f, 10.519f, 22.291f)
                lineTo(10.868f, 26.784f)
                lineTo(10.873f, 26.819f)
                curveTo(11.139f, 28.612f, 12.678f, 29.939f, 14.491f, 29.939f)
                horizontalLineTo(17.451f)
                curveTo(19.263f, 29.939f, 20.802f, 28.612f, 21.069f, 26.819f)
                lineTo(21.074f, 26.784f)
                lineTo(21.424f, 22.268f)
                curveTo(21.475f, 21.623f, 21.709f, 20.963f, 22.087f, 20.226f)
                curveTo(22.382f, 19.65f, 22.735f, 19.081f, 23.124f, 18.454f)
                curveTo(23.243f, 18.262f, 23.366f, 18.064f, 23.491f, 17.859f)
                curveTo(24.525f, 16.167f, 25.653f, 14.127f, 25.653f, 11.537f)
                curveTo(25.653f, 6.388f, 21.324f, 2.061f, 15.996f, 2.061f)
                close()
                moveTo(8.279f, 11.537f)
                curveTo(8.279f, 7.561f, 11.743f, 4.061f, 15.996f, 4.061f)
                curveTo(20.243f, 4.061f, 23.653f, 7.517f, 23.653f, 11.537f)
                curveTo(23.653f, 13.53f, 22.799f, 15.157f, 21.785f, 16.816f)
                curveTo(21.676f, 16.993f, 21.565f, 17.172f, 21.452f, 17.354f)
                curveTo(21.055f, 17.994f, 20.643f, 18.658f, 20.307f, 19.313f)
                curveTo(20.084f, 19.749f, 19.88f, 20.205f, 19.725f, 20.682f)
                horizontalLineTo(12.168f)
                curveTo(12.003f, 20.222f, 11.797f, 19.778f, 11.573f, 19.352f)
                curveTo(11.261f, 18.755f, 10.886f, 18.139f, 10.521f, 17.539f)
                curveTo(10.381f, 17.309f, 10.242f, 17.081f, 10.109f, 16.857f)
                curveTo(9.112f, 15.184f, 8.279f, 13.521f, 8.279f, 11.537f)
                close()
                moveTo(12.555f, 22.682f)
                lineTo(12.856f, 26.556f)
                curveTo(12.989f, 27.353f, 13.68f, 27.939f, 14.491f, 27.939f)
                horizontalLineTo(17.451f)
                curveTo(18.262f, 27.939f, 18.952f, 27.353f, 19.085f, 26.556f)
                lineTo(19.386f, 22.682f)
                horizontalLineTo(12.555f)
                close()
            }
        }
        .build()
        return _lampOutlineLg!!
    }

private var _lampOutlineLg: ImageVector? = null
