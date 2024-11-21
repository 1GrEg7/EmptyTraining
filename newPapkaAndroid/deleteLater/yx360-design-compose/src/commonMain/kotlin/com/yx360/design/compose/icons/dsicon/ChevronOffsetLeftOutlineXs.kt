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

public val DsIcon.ChevronOffsetLeftOutlineXs: ImageVector
    get() {
        if (_chevronOffsetLeftOutlineXs != null) {
            return _chevronOffsetLeftOutlineXs!!
        }
        _chevronOffsetLeftOutlineXs = Builder(name = "ChevronOffsetLeftOutlineXs", defaultWidth =
                12.0.dp, defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight =
                12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.461f, 1.0f)
                lineTo(7.0f, 1.0f)
                lineTo(3.482f, 6.0f)
                lineTo(7.0f, 11.0f)
                horizontalLineTo(4.5f)
                lineTo(1.0f, 6.0f)
                lineTo(4.461f, 1.0f)
                close()
            }
        }
        .build()
        return _chevronOffsetLeftOutlineXs!!
    }

private var _chevronOffsetLeftOutlineXs: ImageVector? = null
