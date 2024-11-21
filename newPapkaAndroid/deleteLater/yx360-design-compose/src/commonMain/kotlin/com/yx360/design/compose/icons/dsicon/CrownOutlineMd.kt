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

public val DsIcon.CrownOutlineMd: ImageVector
    get() {
        if (_crownOutlineMd != null) {
            return _crownOutlineMd!!
        }
        _crownOutlineMd = Builder(name = "CrownOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.005f, 5.966f)
                curveTo(13.485f, 5.643f, 13.8f, 5.095f, 13.8f, 4.473f)
                curveTo(13.8f, 3.479f, 12.995f, 2.674f, 12.002f, 2.674f)
                curveTo(11.008f, 2.674f, 10.203f, 3.479f, 10.203f, 4.473f)
                curveTo(10.203f, 5.095f, 10.518f, 5.643f, 10.998f, 5.966f)
                curveTo(10.984f, 6.788f, 10.925f, 7.606f, 10.687f, 8.31f)
                curveTo(10.414f, 9.115f, 9.932f, 9.717f, 8.937f, 9.976f)
                curveTo(7.264f, 10.412f, 5.635f, 9.369f, 4.741f, 7.973f)
                curveTo(4.982f, 7.668f, 5.125f, 7.282f, 5.125f, 6.863f)
                curveTo(5.125f, 5.869f, 4.32f, 5.064f, 3.326f, 5.064f)
                curveTo(2.333f, 5.064f, 1.527f, 5.869f, 1.527f, 6.863f)
                curveTo(1.527f, 7.598f, 1.968f, 8.23f, 2.599f, 8.509f)
                lineTo(3.78f, 18.378f)
                lineTo(4.773f, 19.26f)
                horizontalLineTo(19.209f)
                lineTo(20.202f, 18.378f)
                lineTo(21.389f, 8.453f)
                curveTo(21.959f, 8.151f, 22.347f, 7.552f, 22.347f, 6.863f)
                curveTo(22.347f, 5.869f, 21.541f, 5.064f, 20.548f, 5.064f)
                curveTo(19.554f, 5.064f, 18.749f, 5.869f, 18.749f, 6.863f)
                curveTo(18.749f, 7.316f, 18.917f, 7.73f, 19.193f, 8.046f)
                curveTo(18.29f, 9.405f, 16.688f, 10.404f, 15.045f, 9.976f)
                curveTo(14.052f, 9.718f, 13.575f, 9.118f, 13.308f, 8.315f)
                curveTo(13.073f, 7.609f, 13.018f, 6.791f, 13.005f, 5.966f)
                close()
                moveTo(9.441f, 11.912f)
                curveTo(10.645f, 11.598f, 11.458f, 10.948f, 11.994f, 10.155f)
                curveTo(12.526f, 10.948f, 13.336f, 11.598f, 14.541f, 11.912f)
                curveTo(16.279f, 12.364f, 17.844f, 11.875f, 19.07f, 10.997f)
                lineTo(18.321f, 17.26f)
                horizontalLineTo(5.661f)
                lineTo(4.911f, 10.997f)
                curveTo(6.138f, 11.875f, 7.703f, 12.364f, 9.441f, 11.912f)
                close()
            }
        }
        .build()
        return _crownOutlineMd!!
    }

private var _crownOutlineMd: ImageVector? = null
