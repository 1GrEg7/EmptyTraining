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

public val DsIcon.LampSolidMd: ImageVector
    get() {
        if (_lampSolidMd != null) {
            return _lampSolidMd!!
        }
        _lampSolidMd = Builder(name = "LampSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.023f, 1.562f)
                curveTo(7.964f, 1.562f, 4.607f, 4.886f, 4.607f, 8.797f)
                curveTo(4.607f, 10.756f, 5.441f, 12.33f, 6.207f, 13.617f)
                curveTo(6.326f, 13.816f, 6.441f, 14.005f, 6.552f, 14.187f)
                curveTo(6.813f, 14.617f, 7.05f, 15.007f, 7.257f, 15.403f)
                curveTo(7.385f, 15.647f, 7.491f, 15.875f, 7.575f, 16.093f)
                horizontalLineTo(16.393f)
                curveTo(16.472f, 15.861f, 16.579f, 15.619f, 16.711f, 15.361f)
                curveTo(16.929f, 14.937f, 17.188f, 14.519f, 17.478f, 14.052f)
                curveTo(17.568f, 13.907f, 17.66f, 13.758f, 17.755f, 13.602f)
                curveTo(18.53f, 12.335f, 19.394f, 10.779f, 19.394f, 8.797f)
                curveTo(19.394f, 4.863f, 16.087f, 1.562f, 12.023f, 1.562f)
                close()
                moveTo(10.49f, 7.563f)
                lineTo(7.925f, 9.571f)
                lineTo(9.035f, 10.988f)
                lineTo(10.478f, 9.858f)
                lineTo(11.999f, 11.075f)
                lineTo(13.523f, 9.856f)
                lineTo(14.991f, 10.992f)
                lineTo(16.093f, 9.568f)
                lineTo(13.504f, 7.565f)
                lineTo(11.999f, 8.769f)
                lineTo(10.49f, 7.563f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.15f, 17.893f)
                horizontalLineTo(7.858f)
                lineTo(8.038f, 20.211f)
                lineTo(8.043f, 20.242f)
                curveTo(8.253f, 21.657f, 9.467f, 22.705f, 10.898f, 22.705f)
                horizontalLineTo(13.11f)
                curveTo(14.541f, 22.705f, 15.755f, 21.657f, 15.965f, 20.242f)
                lineTo(15.97f, 20.211f)
                lineTo(16.15f, 17.893f)
                close()
            }
        }
        .build()
        return _lampSolidMd!!
    }

private var _lampSolidMd: ImageVector? = null
