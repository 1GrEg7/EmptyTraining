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

public val DsIcon.PizzaOutlineMd: ImageVector
    get() {
        if (_pizzaOutlineMd != null) {
            return _pizzaOutlineMd!!
        }
        _pizzaOutlineMd = Builder(name = "PizzaOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.545f, 8.775f)
                lineTo(2.0f, 20.462f)
                lineTo(3.198f, 21.65f)
                lineTo(19.491f, 17.955f)
                curveTo(21.017f, 17.608f, 22.137f, 16.073f, 21.653f, 14.426f)
                curveTo(19.889f, 8.407f, 15.066f, 3.698f, 8.981f, 2.093f)
                curveTo(7.343f, 1.661f, 5.849f, 2.787f, 5.519f, 4.299f)
                lineTo(4.573f, 8.644f)
                curveTo(4.548f, 8.655f, 4.524f, 8.666f, 4.499f, 8.678f)
                lineTo(4.545f, 8.775f)
                close()
                moveTo(8.471f, 4.027f)
                curveTo(13.877f, 5.453f, 18.166f, 9.641f, 19.734f, 14.988f)
                curveTo(19.851f, 15.386f, 19.601f, 15.879f, 19.049f, 16.004f)
                lineTo(18.523f, 16.124f)
                curveTo(17.226f, 10.673f, 12.863f, 6.413f, 7.356f, 5.266f)
                lineTo(7.474f, 4.724f)
                curveTo(7.592f, 4.179f, 8.074f, 3.922f, 8.471f, 4.027f)
                close()
                moveTo(6.93f, 7.221f)
                lineTo(6.672f, 8.408f)
                curveTo(7.338f, 8.536f, 7.975f, 8.859f, 8.492f, 9.375f)
                curveTo(9.868f, 10.752f, 9.868f, 12.983f, 8.492f, 14.359f)
                curveTo(7.591f, 15.259f, 6.326f, 15.57f, 5.172f, 15.293f)
                lineTo(4.289f, 19.352f)
                lineTo(7.685f, 18.582f)
                curveTo(7.458f, 17.463f, 7.778f, 16.254f, 8.646f, 15.386f)
                curveTo(10.022f, 14.01f, 12.254f, 14.01f, 13.63f, 15.386f)
                curveTo(14.099f, 15.855f, 14.408f, 16.424f, 14.557f, 17.023f)
                lineTo(16.572f, 16.566f)
                curveTo(15.447f, 11.871f, 11.679f, 8.202f, 6.93f, 7.221f)
                close()
                moveTo(12.606f, 17.466f)
                curveTo(12.537f, 17.222f, 12.407f, 16.992f, 12.216f, 16.801f)
                curveTo(11.62f, 16.205f, 10.656f, 16.205f, 10.06f, 16.801f)
                curveTo(9.696f, 17.165f, 9.555f, 17.667f, 9.636f, 18.139f)
                lineTo(12.606f, 17.466f)
                close()
                moveTo(5.598f, 13.337f)
                curveTo(6.108f, 13.476f, 6.677f, 13.345f, 7.077f, 12.945f)
                curveTo(7.672f, 12.35f, 7.672f, 11.385f, 7.077f, 10.79f)
                curveTo(6.843f, 10.555f, 6.551f, 10.413f, 6.246f, 10.363f)
                lineTo(5.598f, 13.337f)
                close()
            }
        }
        .build()
        return _pizzaOutlineMd!!
    }

private var _pizzaOutlineMd: ImageVector? = null
