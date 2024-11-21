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

public val DsIcon.TickOutlineXs: ImageVector
    get() {
        if (_tickOutlineXs != null) {
            return _tickOutlineXs!!
        }
        _tickOutlineXs = Builder(name = "TickOutlineXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.949f)
                lineTo(10.057f, 2.5f)
                lineTo(4.979f, 7.597f)
                lineTo(1.943f, 4.549f)
                lineTo(0.5f, 5.998f)
                lineTo(4.985f, 10.5f)
                lineTo(6.0f, 9.5f)
                lineTo(6.423f, 9.046f)
                lineTo(11.5f, 3.949f)
                close()
            }
        }
        .build()
        return _tickOutlineXs!!
    }

private var _tickOutlineXs: ImageVector? = null
