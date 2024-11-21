package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ReturnOutlineSm: ImageVector
    get() {
        if (_returnOutlineSm != null) {
            return _returnOutlineSm!!
        }
        _returnOutlineSm = Builder(name = "ReturnOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.899f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                lineTo(9.352f, 1.0f)
                lineTo(9.352f, 6.728f)
                lineTo(11.352f, 6.728f)
                lineTo(11.352f, 4.291f)
                curveTo(11.911f, 4.796f, 12.352f, 5.424f, 12.637f, 6.132f)
                curveTo(13.069f, 7.205f, 13.116f, 8.394f, 12.769f, 9.497f)
                curveTo(12.423f, 10.601f, 11.705f, 11.55f, 10.737f, 12.183f)
                curveTo(9.769f, 12.816f, 8.611f, 13.094f, 7.462f, 12.97f)
                curveTo(6.312f, 12.845f, 5.241f, 12.326f, 4.431f, 11.5f)
                curveTo(3.621f, 10.674f, 3.123f, 9.593f, 3.021f, 8.441f)
                curveTo(2.918f, 7.289f, 3.219f, 6.137f, 3.871f, 5.182f)
                curveTo(4.523f, 4.227f, 5.486f, 3.527f, 6.595f, 3.202f)
                lineTo(6.033f, 1.282f)
                curveTo(5.379f, 1.473f, 4.76f, 1.758f, 4.196f, 2.124f)
                curveTo(3.42f, 2.626f, 2.746f, 3.28f, 2.218f, 4.054f)
                curveTo(1.305f, 5.392f, 0.884f, 7.005f, 1.027f, 8.618f)
                curveTo(1.17f, 10.231f, 1.868f, 11.745f, 3.002f, 12.901f)
                curveTo(4.136f, 14.057f, 5.636f, 14.785f, 7.246f, 14.959f)
                curveTo(8.856f, 15.133f, 10.477f, 14.744f, 11.832f, 13.858f)
                curveTo(13.187f, 12.971f, 14.193f, 11.642f, 14.679f, 10.097f)
                curveTo(15.164f, 8.552f, 15.098f, 6.886f, 14.493f, 5.384f)
                curveTo(14.143f, 4.515f, 13.624f, 3.731f, 12.974f, 3.075f)
                curveTo(12.949f, 3.049f, 12.924f, 3.025f, 12.899f, 3.0f)
                close()
            }
        }
        .build()
        return _returnOutlineSm!!
    }

private var _returnOutlineSm: ImageVector? = null
