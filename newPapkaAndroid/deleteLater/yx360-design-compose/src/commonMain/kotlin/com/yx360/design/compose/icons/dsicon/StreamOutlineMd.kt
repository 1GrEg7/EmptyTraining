package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.StreamOutlineMd: ImageVector
    get() {
        if (_streamOutlineMd != null) {
            return _streamOutlineMd!!
        }
        _streamOutlineMd = Builder(name = "StreamOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.736f)
                curveTo(23.0f, 16.807f, 20.788f, 20.362f, 17.501f, 22.264f)
                lineTo(16.501f, 20.531f)
                curveTo(19.19f, 18.975f, 21.0f, 16.067f, 21.0f, 12.736f)
                curveTo(21.0f, 7.765f, 16.971f, 3.736f, 12.0f, 3.736f)
                curveTo(7.029f, 3.736f, 3.0f, 7.765f, 3.0f, 12.736f)
                curveTo(3.0f, 16.067f, 4.81f, 18.975f, 7.499f, 20.531f)
                lineTo(6.499f, 22.264f)
                curveTo(3.212f, 20.362f, 1.0f, 16.807f, 1.0f, 12.736f)
                curveTo(1.0f, 6.661f, 5.925f, 1.736f, 12.0f, 1.736f)
                curveTo(18.075f, 1.736f, 23.0f, 6.661f, 23.0f, 12.736f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.736f)
                curveTo(19.0f, 15.327f, 17.593f, 17.589f, 15.501f, 18.799f)
                lineTo(14.5f, 17.067f)
                curveTo(15.995f, 16.202f, 17.0f, 14.586f, 17.0f, 12.736f)
                curveTo(17.0f, 9.974f, 14.761f, 7.736f, 12.0f, 7.736f)
                curveTo(9.239f, 7.736f, 7.0f, 9.974f, 7.0f, 12.736f)
                curveTo(7.0f, 14.586f, 8.005f, 16.202f, 9.5f, 17.067f)
                lineTo(8.499f, 18.799f)
                curveTo(6.407f, 17.589f, 5.0f, 15.327f, 5.0f, 12.736f)
                curveTo(5.0f, 8.87f, 8.134f, 5.736f, 12.0f, 5.736f)
                curveTo(15.866f, 5.736f, 19.0f, 8.87f, 19.0f, 12.736f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.736f)
                curveTo(14.5f, 14.117f, 13.381f, 15.236f, 12.0f, 15.236f)
                curveTo(10.619f, 15.236f, 9.5f, 14.117f, 9.5f, 12.736f)
                curveTo(9.5f, 11.355f, 10.619f, 10.236f, 12.0f, 10.236f)
                curveTo(13.381f, 10.236f, 14.5f, 11.355f, 14.5f, 12.736f)
                close()
            }
        }
        .build()
        return _streamOutlineMd!!
    }

private var _streamOutlineMd: ImageVector? = null
