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

public val DsIcon.EditOutlineMd: ImageVector
    get() {
        if (_editOutlineMd != null) {
            return _editOutlineMd!!
        }
        _editOutlineMd = Builder(name = "EditOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.999f, 9.002f)
                lineTo(9.0f, 20.001f)
                lineTo(4.0f, 21.0f)
                lineTo(3.0f, 20.0f)
                lineTo(4.0f, 15.001f)
                lineTo(15.011f, 4.009f)
                curveTo(15.357f, 3.663f, 15.531f, 3.49f, 15.696f, 3.365f)
                curveTo(16.764f, 2.559f, 18.237f, 2.558f, 19.306f, 3.363f)
                curveTo(19.472f, 3.487f, 19.646f, 3.66f, 19.993f, 4.006f)
                curveTo(20.342f, 4.353f, 20.516f, 4.526f, 20.642f, 4.692f)
                curveTo(21.454f, 5.762f, 21.456f, 7.242f, 20.646f, 8.314f)
                curveTo(20.521f, 8.48f, 20.347f, 8.654f, 19.999f, 9.002f)
                close()
                moveTo(15.879f, 10.293f)
                lineTo(8.014f, 18.158f)
                lineTo(5.3f, 18.701f)
                lineTo(5.842f, 15.988f)
                lineTo(13.715f, 8.129f)
                lineTo(15.879f, 10.293f)
                close()
                moveTo(17.293f, 8.879f)
                lineTo(18.585f, 7.588f)
                curveTo(18.765f, 7.407f, 18.876f, 7.296f, 18.958f, 7.21f)
                curveTo(19.037f, 7.127f, 19.053f, 7.105f, 19.05f, 7.108f)
                curveTo(19.32f, 6.751f, 19.32f, 6.258f, 19.049f, 5.901f)
                curveTo(19.052f, 5.905f, 19.035f, 5.882f, 18.956f, 5.8f)
                curveTo(18.874f, 5.714f, 18.763f, 5.603f, 18.582f, 5.423f)
                curveTo(18.402f, 5.244f, 18.292f, 5.134f, 18.205f, 5.052f)
                curveTo(18.123f, 4.975f, 18.101f, 4.958f, 18.104f, 4.961f)
                curveTo(17.748f, 4.693f, 17.257f, 4.693f, 16.901f, 4.962f)
                curveTo(16.904f, 4.959f, 16.882f, 4.975f, 16.8f, 5.053f)
                curveTo(16.714f, 5.135f, 16.604f, 5.245f, 16.424f, 5.425f)
                lineTo(15.13f, 6.716f)
                lineTo(17.293f, 8.879f)
                close()
            }
        }
        .build()
        return _editOutlineMd!!
    }

private var _editOutlineMd: ImageVector? = null
