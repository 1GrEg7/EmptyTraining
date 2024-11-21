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

public val DsIcon.TickOutlineSm: ImageVector
    get() {
        if (_tickOutlineSm != null) {
            return _tickOutlineSm!!
        }
        _tickOutlineSm = Builder(name = "TickOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.001f, 14.005f)
                lineTo(0.5f, 8.502f)
                lineTo(1.997f, 7.001f)
                lineTo(6.001f, 11.065f)
                lineTo(14.003f, 3.0f)
                lineTo(15.503f, 4.5f)
                lineTo(6.001f, 14.005f)
                close()
            }
        }
        .build()
        return _tickOutlineSm!!
    }

private var _tickOutlineSm: ImageVector? = null
