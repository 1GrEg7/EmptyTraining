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

public val DsIcon.PinSolidMd: ImageVector
    get() {
        if (_pinSolidMd != null) {
            return _pinSolidMd!!
        }
        _pinSolidMd = Builder(name = "PinSolidMd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 1.042f)
                curveTo(8.497f, 1.042f, 5.977f, 2.042f, 5.977f, 3.042f)
                verticalLineTo(4.542f)
                lineTo(8.497f, 5.542f)
                lineTo(7.969f, 8.973f)
                curveTo(7.38f, 9.256f, 6.82f, 9.603f, 6.298f, 10.009f)
                curveTo(4.668f, 11.276f, 3.507f, 13.052f, 3.0f, 15.054f)
                curveTo(3.0f, 16.154f, 7.0f, 17.054f, 12.0f, 17.054f)
                curveTo(17.0f, 17.054f, 21.0f, 16.154f, 21.0f, 15.054f)
                curveTo(20.493f, 13.052f, 19.332f, 11.276f, 17.702f, 10.009f)
                curveTo(17.178f, 9.601f, 16.615f, 9.253f, 16.024f, 8.969f)
                lineTo(15.497f, 5.542f)
                lineTo(17.997f, 4.542f)
                verticalLineTo(3.042f)
                curveTo(17.997f, 2.042f, 15.497f, 1.042f, 11.997f, 1.042f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.054f, 23.0f)
                lineTo(10.586f, 18.016f)
                curveTo(11.047f, 18.032f, 11.519f, 18.041f, 12.0f, 18.041f)
                curveTo(12.496f, 18.041f, 12.982f, 18.032f, 13.456f, 18.015f)
                lineTo(13.054f, 23.0f)
                horizontalLineTo(11.054f)
                close()
            }
        }
        .build()
        return _pinSolidMd!!
    }

private var _pinSolidMd: ImageVector? = null
