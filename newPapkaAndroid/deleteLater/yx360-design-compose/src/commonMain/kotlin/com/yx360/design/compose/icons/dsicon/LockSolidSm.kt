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

public val DsIcon.LockSolidSm: ImageVector
    get() {
        if (_lockSolidSm != null) {
            return _lockSolidSm!!
        }
        _lockSolidSm = Builder(name = "LockSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 7.174f)
                curveTo(3.949f, 7.19f, 3.9f, 7.208f, 3.852f, 7.228f)
                curveTo(3.117f, 7.533f, 2.533f, 8.117f, 2.228f, 8.852f)
                curveTo(2.0f, 9.403f, 2.0f, 10.102f, 2.0f, 11.5f)
                curveTo(2.0f, 12.898f, 2.0f, 13.597f, 2.228f, 14.148f)
                curveTo(2.533f, 14.883f, 3.117f, 15.467f, 3.852f, 15.772f)
                curveTo(4.403f, 16.0f, 5.102f, 16.0f, 6.5f, 16.0f)
                horizontalLineTo(9.5f)
                curveTo(10.898f, 16.0f, 11.597f, 16.0f, 12.148f, 15.772f)
                curveTo(12.883f, 15.467f, 13.467f, 14.883f, 13.772f, 14.148f)
                curveTo(14.0f, 13.597f, 14.0f, 12.898f, 14.0f, 11.5f)
                curveTo(14.0f, 10.102f, 14.0f, 9.403f, 13.772f, 8.852f)
                curveTo(13.467f, 8.117f, 12.883f, 7.533f, 12.148f, 7.228f)
                curveTo(12.1f, 7.208f, 12.051f, 7.19f, 12.0f, 7.174f)
                verticalLineTo(4.0f)
                curveTo(12.0f, 1.791f, 10.209f, 0.0f, 8.0f, 0.0f)
                curveTo(5.791f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineTo(7.174f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(6.156f, 7.0f, 6.322f, 7.0f, 6.5f, 7.0f)
                horizontalLineTo(9.5f)
                curveTo(9.678f, 7.0f, 9.844f, 7.0f, 10.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(10.0f, 2.895f, 9.105f, 2.0f, 8.0f, 2.0f)
                curveTo(6.895f, 2.0f, 6.0f, 2.895f, 6.0f, 4.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _lockSolidSm!!
    }

private var _lockSolidSm: ImageVector? = null
