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

public val DsIcon.LaptopOutlineMd: ImageVector
    get() {
        if (_laptopOutlineMd != null) {
            return _laptopOutlineMd!!
        }
        _laptopOutlineMd = Builder(name = "LaptopOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.999f, 18.0f)
                horizontalLineTo(5.999f)
                lineTo(6.499f, 16.0f)
                horizontalLineTo(17.499f)
                lineTo(17.999f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.999f, 7.5f)
                verticalLineTo(13.0f)
                lineTo(1.519f, 16.947f)
                curveTo(1.066f, 18.154f, 0.84f, 18.758f, 0.9f, 19.247f)
                curveTo(0.981f, 19.898f, 1.376f, 20.468f, 1.957f, 20.772f)
                curveTo(2.393f, 21.0f, 3.038f, 21.0f, 4.328f, 21.0f)
                horizontalLineTo(19.67f)
                curveTo(20.96f, 21.0f, 21.605f, 21.0f, 22.041f, 20.772f)
                curveTo(22.622f, 20.468f, 23.017f, 19.898f, 23.098f, 19.247f)
                curveTo(23.158f, 18.758f, 22.932f, 18.154f, 22.479f, 16.947f)
                lineTo(20.999f, 13.0f)
                verticalLineTo(7.5f)
                curveTo(20.999f, 6.102f, 20.999f, 5.403f, 20.771f, 4.852f)
                curveTo(20.466f, 4.117f, 19.882f, 3.533f, 19.147f, 3.228f)
                curveTo(18.596f, 3.0f, 17.897f, 3.0f, 16.499f, 3.0f)
                horizontalLineTo(7.499f)
                curveTo(6.101f, 3.0f, 5.402f, 3.0f, 4.851f, 3.228f)
                curveTo(4.116f, 3.533f, 3.532f, 4.117f, 3.227f, 4.852f)
                curveTo(2.999f, 5.403f, 2.999f, 6.102f, 2.999f, 7.5f)
                close()
                moveTo(16.499f, 5.0f)
                horizontalLineTo(7.499f)
                curveTo(6.773f, 5.0f, 6.328f, 5.001f, 5.994f, 5.024f)
                curveTo(5.71f, 5.043f, 5.625f, 5.073f, 5.616f, 5.076f)
                curveTo(5.615f, 5.076f, 5.615f, 5.076f, 5.616f, 5.076f)
                curveTo(5.371f, 5.178f, 5.177f, 5.372f, 5.075f, 5.617f)
                curveTo(5.076f, 5.616f, 5.076f, 5.616f, 5.075f, 5.617f)
                curveTo(5.072f, 5.626f, 5.042f, 5.711f, 5.023f, 5.995f)
                curveTo(5.0f, 6.329f, 4.999f, 6.774f, 4.999f, 7.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.999f)
                verticalLineTo(7.5f)
                curveTo(18.999f, 6.774f, 18.998f, 6.329f, 18.975f, 5.995f)
                curveTo(18.956f, 5.711f, 18.926f, 5.626f, 18.923f, 5.617f)
                curveTo(18.923f, 5.616f, 18.923f, 5.616f, 18.923f, 5.617f)
                curveTo(18.822f, 5.372f, 18.627f, 5.178f, 18.382f, 5.076f)
                curveTo(18.383f, 5.076f, 18.383f, 5.076f, 18.382f, 5.076f)
                curveTo(18.374f, 5.073f, 18.288f, 5.043f, 18.004f, 5.024f)
                curveTo(17.67f, 5.001f, 17.225f, 5.0f, 16.499f, 5.0f)
                close()
                moveTo(19.613f, 15.0f)
                lineTo(20.606f, 17.649f)
                curveTo(20.844f, 18.282f, 20.981f, 18.652f, 21.061f, 18.925f)
                lineTo(21.068f, 18.951f)
                lineTo(21.074f, 18.973f)
                curveTo(21.059f, 18.974f, 21.043f, 18.976f, 21.025f, 18.977f)
                curveTo(20.741f, 18.999f, 20.347f, 19.0f, 19.67f, 19.0f)
                horizontalLineTo(4.328f)
                curveTo(3.652f, 19.0f, 3.257f, 18.999f, 2.973f, 18.977f)
                curveTo(2.955f, 18.976f, 2.939f, 18.975f, 2.924f, 18.973f)
                curveTo(2.928f, 18.958f, 2.932f, 18.942f, 2.937f, 18.925f)
                curveTo(3.017f, 18.652f, 3.154f, 18.282f, 3.392f, 17.649f)
                lineTo(4.385f, 15.0f)
                horizontalLineTo(19.613f)
                close()
            }
        }
        .build()
        return _laptopOutlineMd!!
    }

private var _laptopOutlineMd: ImageVector? = null
