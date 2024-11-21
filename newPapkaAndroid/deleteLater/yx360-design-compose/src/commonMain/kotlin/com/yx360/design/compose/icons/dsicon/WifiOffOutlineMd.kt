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

public val DsIcon.WifiOffOutlineMd: ImageVector
    get() {
        if (_wifiOffOutlineMd != null) {
            return _wifiOffOutlineMd!!
        }
        _wifiOffOutlineMd = Builder(name = "WifiOffOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(9.234f, 5.905f, 11.13f, 8.704f, 13.027f, 11.502f)
                curveTo(14.924f, 14.301f, 16.821f, 17.099f, 19.555f, 21.004f)
                horizontalLineTo(17.055f)
                lineTo(14.56f, 17.372f)
                lineTo(12.005f, 20.0f)
                lineTo(9.251f, 17.168f)
                curveTo(9.955f, 16.448f, 10.925f, 16.003f, 11.995f, 16.003f)
                curveTo(12.737f, 16.003f, 13.431f, 16.217f, 14.021f, 16.587f)
                lineTo(12.248f, 14.007f)
                curveTo(12.166f, 14.004f, 12.082f, 14.002f, 11.995f, 14.002f)
                curveTo(10.387f, 14.002f, 8.932f, 14.671f, 7.876f, 15.753f)
                lineTo(6.501f, 14.339f)
                curveTo(7.669f, 13.14f, 9.207f, 12.321f, 10.922f, 12.077f)
                lineTo(9.716f, 10.321f)
                curveTo(7.942f, 10.715f, 6.403f, 11.613f, 5.126f, 12.924f)
                lineTo(3.75f, 11.51f)
                curveTo(5.108f, 10.115f, 6.687f, 9.12f, 8.518f, 8.577f)
                lineTo(7.332f, 6.851f)
                curveTo(5.448f, 7.544f, 3.78f, 8.653f, 2.375f, 10.095f)
                lineTo(1.0f, 8.681f)
                curveTo(2.493f, 7.147f, 4.2f, 5.939f, 6.154f, 5.136f)
                lineTo(4.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.898f, 6.045f)
                lineTo(9.614f, 4.186f)
                curveTo(10.39f, 4.064f, 11.186f, 4.0f, 11.995f, 4.0f)
                curveTo(16.293f, 4.0f, 20.184f, 5.792f, 23.0f, 8.69f)
                lineTo(21.625f, 10.105f)
                curveTo(19.161f, 7.569f, 15.756f, 6.0f, 11.995f, 6.0f)
                curveTo(11.626f, 6.0f, 11.26f, 6.016f, 10.898f, 6.045f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.742f, 10.162f)
                lineTo(12.251f, 8.004f)
                curveTo(15.373f, 8.073f, 18.194f, 9.403f, 20.25f, 11.519f)
                lineTo(18.874f, 12.934f)
                curveTo(17.505f, 11.524f, 15.729f, 10.533f, 13.742f, 10.162f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.993f, 14.869f)
                lineTo(15.665f, 12.947f)
                curveTo(16.343f, 13.32f, 16.96f, 13.794f, 17.499f, 14.349f)
                lineTo(16.993f, 14.869f)
                close()
            }
        }
        .build()
        return _wifiOffOutlineMd!!
    }

private var _wifiOffOutlineMd: ImageVector? = null
