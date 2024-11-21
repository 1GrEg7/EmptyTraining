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

public val DsIcon.RepeatOffOutlineSm: ImageVector
    get() {
        if (_repeatOffOutlineSm != null) {
            return _repeatOffOutlineSm!!
        }
        _repeatOffOutlineSm = Builder(name = "RepeatOffOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                horizontalLineTo(1.5f)
                lineTo(12.5f, 16.0f)
                horizontalLineTo(15.0f)
                lineTo(12.922f, 12.977f)
                curveTo(13.273f, 12.63f, 13.588f, 12.245f, 13.86f, 11.828f)
                curveTo(14.229f, 11.263f, 14.513f, 10.651f, 14.705f, 10.011f)
                curveTo(14.898f, 9.366f, 14.999f, 8.693f, 15.0f, 8.012f)
                lineTo(13.0f, 8.008f)
                lineTo(12.999f, 8.009f)
                curveTo(12.997f, 8.977f, 12.714f, 9.924f, 12.185f, 10.734f)
                curveTo(12.057f, 10.93f, 11.916f, 11.116f, 11.763f, 11.291f)
                lineTo(6.274f, 3.308f)
                curveTo(7.08f, 3.012f, 7.951f, 2.927f, 8.802f, 3.066f)
                curveTo(9.45f, 3.171f, 10.067f, 3.402f, 10.621f, 3.743f)
                lineTo(9.345f, 5.019f)
                lineTo(14.364f, 6.364f)
                lineTo(13.205f, 1.091f)
                lineTo(12.064f, 2.3f)
                curveTo(11.739f, 2.069f, 11.396f, 1.866f, 11.038f, 1.694f)
                curveTo(10.435f, 1.403f, 9.79f, 1.199f, 9.123f, 1.091f)
                curveTo(7.783f, 0.873f, 6.409f, 1.049f, 5.168f, 1.598f)
                curveTo(5.15f, 1.606f, 5.133f, 1.614f, 5.115f, 1.622f)
                lineTo(4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.132f, 4.183f)
                curveTo(2.251f, 4.0f, 2.378f, 3.824f, 2.512f, 3.654f)
                lineTo(3.722f, 5.414f)
                curveTo(3.25f, 6.194f, 3.0f, 7.09f, 3.001f, 8.003f)
                lineTo(3.0f, 8.004f)
                lineTo(1.0f, 8.006f)
                curveTo(0.999f, 7.325f, 1.098f, 6.652f, 1.29f, 6.006f)
                curveTo(1.481f, 5.364f, 1.763f, 4.75f, 2.132f, 4.183f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.195f, 12.934f)
                curveTo(7.757f, 13.025f, 8.328f, 13.02f, 8.883f, 12.92f)
                lineTo(10.092f, 14.68f)
                curveTo(9.055f, 15.005f, 7.953f, 15.085f, 6.873f, 14.909f)
                curveTo(6.207f, 14.8f, 5.564f, 14.596f, 4.962f, 14.306f)
                curveTo(4.604f, 14.134f, 4.261f, 13.931f, 3.936f, 13.7f)
                lineTo(2.77f, 14.819f)
                lineTo(1.636f, 9.636f)
                lineTo(6.655f, 10.981f)
                lineTo(5.379f, 12.257f)
                curveTo(5.932f, 12.597f, 6.548f, 12.828f, 7.195f, 12.934f)
                close()
            }
        }
        .build()
        return _repeatOffOutlineSm!!
    }

private var _repeatOffOutlineSm: ImageVector? = null
