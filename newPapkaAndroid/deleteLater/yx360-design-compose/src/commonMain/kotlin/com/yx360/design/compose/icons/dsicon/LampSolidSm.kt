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

public val DsIcon.LampSolidSm: ImageVector
    get() {
        if (_lampSolidSm != null) {
            return _lampSolidSm!!
        }
        _lampSolidSm = Builder(name = "LampSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.016f, 0.0f)
                curveTo(4.878f, 0.0f, 2.275f, 2.567f, 2.275f, 5.609f)
                curveTo(2.275f, 7.134f, 2.926f, 8.348f, 3.488f, 9.292f)
                curveTo(3.579f, 9.445f, 3.665f, 9.586f, 3.746f, 9.72f)
                curveTo(3.846f, 9.884f, 3.939f, 10.037f, 4.026f, 10.186f)
                horizontalLineTo(11.93f)
                curveTo(12.034f, 10.007f, 12.148f, 9.824f, 12.273f, 9.623f)
                curveTo(12.339f, 9.516f, 12.408f, 9.404f, 12.481f, 9.285f)
                curveTo(13.048f, 8.358f, 13.724f, 7.154f, 13.724f, 5.609f)
                curveTo(13.724f, 2.552f, 11.159f, 0.0f, 8.016f, 0.0f)
                close()
                moveTo(6.919f, 4.21f)
                lineTo(4.922f, 5.774f)
                lineTo(6.031f, 7.191f)
                lineTo(6.907f, 6.506f)
                lineTo(7.998f, 7.378f)
                lineTo(9.092f, 6.503f)
                lineTo(9.986f, 7.194f)
                lineTo(11.087f, 5.77f)
                lineTo(9.073f, 4.213f)
                lineTo(7.998f, 5.073f)
                lineTo(6.919f, 4.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.773f, 13.952f)
                lineTo(4.621f, 11.986f)
                horizontalLineTo(11.383f)
                lineTo(11.231f, 13.952f)
                lineTo(11.225f, 13.987f)
                curveTo(11.047f, 15.185f, 10.019f, 16.073f, 8.807f, 16.073f)
                horizontalLineTo(7.197f)
                curveTo(5.985f, 16.073f, 4.956f, 15.185f, 4.778f, 13.987f)
                lineTo(4.773f, 13.952f)
                close()
            }
        }
        .build()
        return _lampSolidSm!!
    }

private var _lampSolidSm: ImageVector? = null
