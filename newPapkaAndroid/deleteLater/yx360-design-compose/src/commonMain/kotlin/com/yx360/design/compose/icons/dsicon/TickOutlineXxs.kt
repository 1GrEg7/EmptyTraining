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

public val DsIcon.TickOutlineXxs: ImageVector
    get() {
        if (_tickOutlineXxs != null) {
            return _tickOutlineXxs!!
        }
        _tickOutlineXxs = Builder(name = "TickOutlineXxs", defaultWidth = 8.0.dp, defaultHeight =
                8.0.dp, viewportWidth = 8.0f, viewportHeight = 8.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.35f, 2.6786f)
                lineTo(5.9358f, 1.2644f)
                lineTo(3.2931f, 3.9071f)
                lineTo(2.0626f, 2.6766f)
                lineTo(0.6484f, 4.0908f)
                lineTo(3.2931f, 6.7354f)
                lineTo(7.35f, 2.6786f)
                close()
            }
        }
        .build()
        return _tickOutlineXxs!!
    }

private var _tickOutlineXxs: ImageVector? = null
