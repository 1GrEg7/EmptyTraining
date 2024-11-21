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

public val DsIcon.ShieldSolidSm: ImageVector
    get() {
        if (_shieldSolidSm != null) {
            return _shieldSolidSm!!
        }
        _shieldSolidSm = Builder(name = "ShieldSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 16.0f)
                curveTo(11.36f, 14.672f, 13.087f, 12.637f, 14.0f, 10.0f)
                curveTo(14.627f, 8.189f, 14.864f, 6.095f, 15.0f, 3.75f)
                lineTo(8.0f, 0.0f)
                lineTo(1.0f, 3.75f)
                curveTo(1.135f, 6.083f, 1.38f, 8.207f, 2.0f, 10.0f)
                curveTo(2.911f, 12.633f, 4.631f, 14.667f, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _shieldSolidSm!!
    }

private var _shieldSolidSm: ImageVector? = null
