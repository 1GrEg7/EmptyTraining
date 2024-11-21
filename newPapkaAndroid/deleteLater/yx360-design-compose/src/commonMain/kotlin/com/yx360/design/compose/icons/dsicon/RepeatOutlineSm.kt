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

public val DsIcon.RepeatOutlineSm: ImageVector
    get() {
        if (_repeatOutlineSm != null) {
            return _repeatOutlineSm!!
        }
        _repeatOutlineSm = Builder(name = "RepeatOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.621f, 3.743f)
                curveTo(10.067f, 3.402f, 9.45f, 3.171f, 8.802f, 3.066f)
                curveTo(7.845f, 2.91f, 6.864f, 3.036f, 5.978f, 3.428f)
                curveTo(5.091f, 3.82f, 4.338f, 4.462f, 3.81f, 5.274f)
                curveTo(3.281f, 6.086f, 3.0f, 7.035f, 3.001f, 8.003f)
                lineTo(3.0f, 8.004f)
                lineTo(1.001f, 8.006f)
                lineTo(1.0f, 8.006f)
                curveTo(0.999f, 7.325f, 1.098f, 6.652f, 1.29f, 6.006f)
                curveTo(1.481f, 5.364f, 1.763f, 4.75f, 2.132f, 4.183f)
                curveTo(2.872f, 3.045f, 3.927f, 2.147f, 5.168f, 1.598f)
                curveTo(6.409f, 1.049f, 7.783f, 0.873f, 9.123f, 1.091f)
                curveTo(9.79f, 1.199f, 10.435f, 1.403f, 11.038f, 1.694f)
                curveTo(11.396f, 1.866f, 11.739f, 2.069f, 12.064f, 2.3f)
                lineTo(13.205f, 1.091f)
                lineTo(14.364f, 6.364f)
                lineTo(9.345f, 5.019f)
                lineTo(10.621f, 3.743f)
                close()
                moveTo(5.379f, 12.257f)
                curveTo(5.932f, 12.597f, 6.548f, 12.828f, 7.195f, 12.934f)
                curveTo(8.15f, 13.09f, 9.131f, 12.965f, 10.017f, 12.574f)
                curveTo(10.902f, 12.184f, 11.656f, 11.544f, 12.185f, 10.734f)
                curveTo(12.714f, 9.924f, 12.997f, 8.977f, 12.999f, 8.009f)
                lineTo(13.0f, 8.008f)
                lineTo(14.999f, 8.012f)
                lineTo(15.0f, 8.012f)
                curveTo(14.999f, 8.693f, 14.898f, 9.366f, 14.705f, 10.011f)
                curveTo(14.513f, 10.651f, 14.229f, 11.263f, 13.86f, 11.828f)
                curveTo(13.119f, 12.963f, 12.064f, 13.858f, 10.824f, 14.405f)
                curveTo(9.583f, 14.952f, 8.211f, 15.127f, 6.873f, 14.909f)
                curveTo(6.207f, 14.8f, 5.564f, 14.596f, 4.962f, 14.306f)
                curveTo(4.604f, 14.134f, 4.261f, 13.931f, 3.936f, 13.7f)
                lineTo(2.77f, 14.819f)
                lineTo(1.636f, 9.636f)
                lineTo(6.655f, 10.981f)
                lineTo(5.379f, 12.257f)
                close()
            }
        }
        .build()
        return _repeatOutlineSm!!
    }

private var _repeatOutlineSm: ImageVector? = null
