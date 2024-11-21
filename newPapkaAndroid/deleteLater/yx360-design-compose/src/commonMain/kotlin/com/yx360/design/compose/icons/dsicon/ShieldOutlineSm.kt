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

public val DsIcon.ShieldOutlineSm: ImageVector
    get() {
        if (_shieldOutlineSm != null) {
            return _shieldOutlineSm!!
        }
        _shieldOutlineSm = Builder(name = "ShieldOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.945f)
                lineTo(2.785f, 4.739f)
                curveTo(2.929f, 6.569f, 3.168f, 8.134f, 3.62f, 9.44f)
                curveTo(4.31f, 11.434f, 5.521f, 13.003f, 8.0f, 14.138f)
                curveTo(10.472f, 13.006f, 11.689f, 11.436f, 12.38f, 9.439f)
                curveTo(12.837f, 8.118f, 13.072f, 6.571f, 13.215f, 4.739f)
                lineTo(8.0f, 1.945f)
                close()
                moveTo(15.0f, 3.75f)
                curveTo(14.864f, 6.095f, 14.627f, 8.189f, 14.0f, 10.0f)
                curveTo(13.087f, 12.637f, 11.36f, 14.672f, 8.0f, 16.0f)
                curveTo(4.631f, 14.667f, 2.911f, 12.633f, 2.0f, 10.0f)
                curveTo(1.38f, 8.207f, 1.135f, 6.083f, 1.0f, 3.75f)
                lineTo(8.0f, 0.0f)
                lineTo(15.0f, 3.75f)
                close()
            }
        }
        .build()
        return _shieldOutlineSm!!
    }

private var _shieldOutlineSm: ImageVector? = null
