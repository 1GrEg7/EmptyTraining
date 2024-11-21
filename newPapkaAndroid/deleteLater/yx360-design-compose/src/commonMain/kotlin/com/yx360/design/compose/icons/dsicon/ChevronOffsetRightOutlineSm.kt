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

public val DsIcon.ChevronOffsetRightOutlineSm: ImageVector
    get() {
        if (_chevronOffsetRightOutlineSm != null) {
            return _chevronOffsetRightOutlineSm!!
        }
        _chevronOffsetRightOutlineSm = Builder(name = "ChevronOffsetRightOutlineSm", defaultWidth =
                16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
                16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.539f, 15.0f)
                horizontalLineTo(7.0f)
                lineTo(12.518f, 8.0f)
                lineTo(7.0f, 1.0f)
                lineTo(9.539f, 1.0f)
                lineTo(15.0f, 8.0f)
                lineTo(9.539f, 15.0f)
                close()
            }
        }
        .build()
        return _chevronOffsetRightOutlineSm!!
    }

private var _chevronOffsetRightOutlineSm: ImageVector? = null
