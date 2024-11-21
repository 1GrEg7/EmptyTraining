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

public val DsIcon.PizzaOutlineLg: ImageVector
    get() {
        if (_pizzaOutlineLg != null) {
            return _pizzaOutlineLg!!
        }
        _pizzaOutlineLg = Builder(name = "PizzaOutlineLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.156f, 23.497f)
                lineTo(12.405f, 26.389f)
                lineTo(12.323f, 26.471f)
                curveTo(12.306f, 26.454f, 12.29f, 26.436f, 12.273f, 26.419f)
                lineTo(5.296f, 28.002f)
                lineTo(4.098f, 26.814f)
                lineTo(8.389f, 7.107f)
                curveTo(8.828f, 5.089f, 10.822f, 3.591f, 12.979f, 4.212f)
                curveTo(20.102f, 6.263f, 25.753f, 11.778f, 27.993f, 18.818f)
                curveTo(28.683f, 20.986f, 27.193f, 23.035f, 25.156f, 23.497f)
                close()
                moveTo(12.426f, 6.134f)
                curveTo(18.904f, 7.999f, 24.049f, 13.02f, 26.087f, 19.424f)
                curveTo(26.367f, 20.302f, 25.794f, 21.301f, 24.713f, 21.546f)
                lineTo(24.286f, 21.643f)
                curveTo(22.744f, 14.74f, 17.216f, 9.343f, 10.242f, 7.994f)
                lineTo(10.343f, 7.532f)
                curveTo(10.575f, 6.465f, 11.549f, 5.882f, 12.426f, 6.134f)
                close()
                moveTo(9.817f, 9.948f)
                lineTo(9.387f, 11.922f)
                curveTo(10.262f, 12.036f, 11.108f, 12.429f, 11.781f, 13.102f)
                curveTo(13.401f, 14.722f, 13.401f, 17.35f, 11.781f, 18.97f)
                curveTo(10.657f, 20.094f, 9.048f, 20.438f, 7.628f, 20.003f)
                lineTo(6.386f, 25.704f)
                lineTo(11.246f, 24.601f)
                curveTo(10.881f, 23.219f, 11.24f, 21.686f, 12.323f, 20.603f)
                curveTo(13.944f, 18.982f, 16.571f, 18.982f, 18.191f, 20.603f)
                curveTo(18.805f, 21.216f, 19.186f, 21.974f, 19.335f, 22.767f)
                lineTo(22.335f, 22.086f)
                curveTo(20.965f, 15.939f, 16.032f, 11.132f, 9.817f, 9.948f)
                close()
                moveTo(16.777f, 22.017f)
                curveTo(17.113f, 22.353f, 17.315f, 22.772f, 17.382f, 23.209f)
                lineTo(13.2f, 24.158f)
                curveTo(12.979f, 23.425f, 13.158f, 22.597f, 13.738f, 22.017f)
                curveTo(14.577f, 21.178f, 15.938f, 21.178f, 16.777f, 22.017f)
                close()
                moveTo(8.959f, 13.89f)
                lineTo(8.056f, 18.035f)
                curveTo(8.828f, 18.34f, 9.742f, 18.18f, 10.366f, 17.556f)
                curveTo(11.206f, 16.716f, 11.206f, 15.356f, 10.366f, 14.516f)
                curveTo(9.976f, 14.126f, 9.471f, 13.916f, 8.959f, 13.89f)
                close()
            }
        }
        .build()
        return _pizzaOutlineLg!!
    }

private var _pizzaOutlineLg: ImageVector? = null
