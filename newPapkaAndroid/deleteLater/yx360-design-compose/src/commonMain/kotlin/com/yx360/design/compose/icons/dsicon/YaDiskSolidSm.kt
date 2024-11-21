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

public val DsIcon.YaDiskSolidSm: ImageVector
    get() {
        if (_yaDiskSolidSm != null) {
            return _yaDiskSolidSm!!
        }
        _yaDiskSolidSm = Builder(name = "YaDiskSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.109f, 3.717f)
                curveTo(10.983f, 4.316f, 11.838f, 4.492f, 12.064f, 4.53f)
                curveTo(14.006f, 4.294f, 15.433f, 4.622f, 15.852f, 5.577f)
                curveTo(16.322f, 6.652f, 15.633f, 8.363f, 13.705f, 9.887f)
                curveTo(13.676f, 9.787f, 13.643f, 9.695f, 13.61f, 9.618f)
                curveTo(13.39f, 9.113f, 12.642f, 7.975f, 10.46f, 8.321f)
                curveTo(9.726f, 8.437f, 8.865f, 8.714f, 7.973f, 9.12f)
                curveTo(6.895f, 9.611f, 6.008f, 10.178f, 5.407f, 10.76f)
                curveTo(4.049f, 12.076f, 4.365f, 13.281f, 4.563f, 13.738f)
                curveTo(4.595f, 13.81f, 4.641f, 13.896f, 4.696f, 13.988f)
                curveTo(2.306f, 14.43f, 0.593f, 13.81f, 0.126f, 12.738f)
                curveTo(-0.295f, 11.773f, 0.425f, 10.457f, 1.905f, 9.135f)
                curveTo(2.052f, 8.92f, 2.531f, 8.149f, 2.678f, 7.1f)
                curveTo(2.953f, 5.141f, 3.706f, 3.735f, 5.341f, 2.99f)
                curveTo(6.975f, 2.247f, 8.502f, 2.614f, 10.109f, 3.717f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.338f, 10.197f)
                curveTo(12.139f, 9.741f, 11.524f, 9.611f, 10.686f, 9.744f)
                curveTo(10.068f, 9.842f, 9.33f, 10.081f, 8.547f, 10.439f)
                curveTo(6.698f, 11.28f, 5.487f, 12.36f, 5.835f, 13.159f)
                curveTo(6.035f, 13.618f, 6.647f, 13.747f, 7.482f, 13.615f)
                curveTo(8.1f, 13.517f, 8.84f, 13.276f, 9.627f, 12.917f)
                curveTo(11.474f, 12.076f, 12.683f, 10.989f, 12.338f, 10.197f)
                close()
            }
        }
        .build()
        return _yaDiskSolidSm!!
    }

private var _yaDiskSolidSm: ImageVector? = null
