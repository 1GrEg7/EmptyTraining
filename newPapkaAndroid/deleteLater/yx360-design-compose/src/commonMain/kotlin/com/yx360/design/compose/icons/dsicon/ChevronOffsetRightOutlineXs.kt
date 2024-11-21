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

public val DsIcon.ChevronOffsetRightOutlineXs: ImageVector
    get() {
        if (_chevronOffsetRightOutlineXs != null) {
            return _chevronOffsetRightOutlineXs!!
        }
        _chevronOffsetRightOutlineXs = Builder(name = "ChevronOffsetRightOutlineXs", defaultWidth =
                12.0.dp, defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight =
                12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.539f, 11.0f)
                horizontalLineTo(5.0f)
                lineTo(8.518f, 6.0f)
                lineTo(5.0f, 1.0f)
                lineTo(7.5f, 1.0f)
                lineTo(11.0f, 6.0f)
                lineTo(7.539f, 11.0f)
                close()
            }
        }
        .build()
        return _chevronOffsetRightOutlineXs!!
    }

private var _chevronOffsetRightOutlineXs: ImageVector? = null
