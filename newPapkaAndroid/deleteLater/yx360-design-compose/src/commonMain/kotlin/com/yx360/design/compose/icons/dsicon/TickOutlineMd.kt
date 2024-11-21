package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.TickOutlineMd: ImageVector
    get() {
        if (_tickOutlineMd != null) {
            return _tickOutlineMd!!
        }
        _tickOutlineMd = Builder(name = "TickOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.002f, 19.0f)
                lineTo(2.504f, 11.5f)
                lineTo(4.001f, 9.999f)
                lineTo(10.002f, 16.06f)
                lineTo(19.503f, 6.496f)
                lineTo(21.003f, 7.996f)
                lineTo(10.002f, 19.0f)
                close()
            }
        }
        .build()
        return _tickOutlineMd!!
    }

private var _tickOutlineMd: ImageVector? = null
