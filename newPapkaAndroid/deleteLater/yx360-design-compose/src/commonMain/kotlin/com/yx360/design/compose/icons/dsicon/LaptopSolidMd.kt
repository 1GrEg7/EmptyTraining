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

public val DsIcon.LaptopSolidMd: ImageVector
    get() {
        if (_laptopSolidMd != null) {
            return _laptopSolidMd!!
        }
        _laptopSolidMd = Builder(name = "LaptopSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 6.102f, 3.0f, 5.403f, 3.228f, 4.852f)
                curveTo(3.533f, 4.117f, 4.117f, 3.533f, 4.852f, 3.228f)
                curveTo(5.403f, 3.0f, 6.102f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(17.898f, 3.0f, 18.597f, 3.0f, 19.148f, 3.228f)
                curveTo(19.883f, 3.533f, 20.467f, 4.117f, 20.772f, 4.852f)
                curveTo(21.0f, 5.403f, 21.0f, 6.102f, 21.0f, 7.5f)
                verticalLineTo(15.0f)
                lineTo(22.372f, 17.744f)
                curveTo(22.85f, 18.7f, 23.089f, 19.178f, 23.072f, 19.567f)
                curveTo(23.048f, 20.087f, 22.757f, 20.557f, 22.303f, 20.81f)
                curveTo(21.963f, 21.0f, 21.428f, 21.0f, 20.36f, 21.0f)
                horizontalLineTo(3.641f)
                curveTo(2.572f, 21.0f, 2.037f, 21.0f, 1.697f, 20.81f)
                curveTo(1.243f, 20.557f, 0.952f, 20.087f, 0.929f, 19.567f)
                curveTo(0.911f, 19.178f, 1.15f, 18.7f, 1.628f, 17.744f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(6.5f, 16.0f)
                horizontalLineTo(17.5f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _laptopSolidMd!!
    }

private var _laptopSolidMd: ImageVector? = null
