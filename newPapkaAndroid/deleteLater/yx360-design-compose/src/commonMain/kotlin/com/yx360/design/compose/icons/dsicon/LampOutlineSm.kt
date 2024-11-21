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

public val DsIcon.LampOutlineSm: ImageVector
    get() {
        if (_lampOutlineSm != null) {
            return _lampOutlineSm!!
        }
        _lampOutlineSm = Builder(name = "LampOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.919f, 4.21f)
                lineTo(7.998f, 5.073f)
                lineTo(9.073f, 4.213f)
                lineTo(11.087f, 5.77f)
                lineTo(9.986f, 7.194f)
                lineTo(9.092f, 6.503f)
                lineTo(7.998f, 7.378f)
                lineTo(6.907f, 6.506f)
                lineTo(6.031f, 7.191f)
                lineTo(4.922f, 5.774f)
                lineTo(6.919f, 4.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.016f, 0.0f)
                curveTo(4.878f, 0.0f, 2.275f, 2.567f, 2.275f, 5.609f)
                curveTo(2.275f, 7.134f, 2.926f, 8.348f, 3.488f, 9.292f)
                curveTo(3.579f, 9.445f, 3.665f, 9.586f, 3.746f, 9.72f)
                curveTo(3.933f, 10.028f, 4.097f, 10.297f, 4.243f, 10.575f)
                curveTo(4.439f, 10.951f, 4.548f, 11.247f, 4.583f, 11.505f)
                lineTo(4.773f, 13.952f)
                lineTo(4.778f, 13.987f)
                curveTo(4.956f, 15.185f, 5.985f, 16.073f, 7.197f, 16.073f)
                horizontalLineTo(8.807f)
                curveTo(10.019f, 16.073f, 11.047f, 15.185f, 11.225f, 13.987f)
                lineTo(11.231f, 13.952f)
                lineTo(11.422f, 11.481f)
                curveTo(11.443f, 11.215f, 11.542f, 10.917f, 11.734f, 10.542f)
                curveTo(11.885f, 10.247f, 12.064f, 9.959f, 12.273f, 9.622f)
                curveTo(12.339f, 9.515f, 12.408f, 9.404f, 12.481f, 9.285f)
                curveTo(13.048f, 8.358f, 13.724f, 7.154f, 13.724f, 5.609f)
                curveTo(13.724f, 2.552f, 11.159f, 0.0f, 8.016f, 0.0f)
                close()
                moveTo(4.275f, 5.609f)
                curveTo(4.275f, 3.707f, 5.946f, 2.0f, 8.016f, 2.0f)
                curveTo(10.079f, 2.0f, 11.724f, 3.681f, 11.724f, 5.609f)
                curveTo(11.724f, 6.557f, 11.321f, 7.348f, 10.774f, 8.242f)
                curveTo(10.719f, 8.332f, 10.661f, 8.426f, 10.602f, 8.521f)
                curveTo(10.384f, 8.872f, 10.146f, 9.255f, 9.954f, 9.63f)
                curveTo(9.901f, 9.734f, 9.848f, 9.842f, 9.799f, 9.954f)
                horizontalLineTo(6.167f)
                curveTo(6.118f, 9.849f, 6.067f, 9.747f, 6.015f, 9.648f)
                curveTo(5.837f, 9.309f, 5.621f, 8.954f, 5.42f, 8.623f)
                curveTo(5.346f, 8.501f, 5.274f, 8.382f, 5.206f, 8.269f)
                curveTo(4.67f, 7.369f, 4.275f, 6.556f, 4.275f, 5.609f)
                close()
                moveTo(6.609f, 11.753f)
                lineTo(6.761f, 13.718f)
                curveTo(6.803f, 13.923f, 6.985f, 14.073f, 7.197f, 14.073f)
                horizontalLineTo(8.807f)
                curveTo(9.019f, 14.073f, 9.2f, 13.923f, 9.243f, 13.718f)
                lineTo(9.395f, 11.753f)
                horizontalLineTo(6.609f)
                close()
            }
        }
        .build()
        return _lampOutlineSm!!
    }

private var _lampOutlineSm: ImageVector? = null
