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

public val DsIcon.ChevronOffsetLeftOutlineSm: ImageVector
    get() {
        if (_chevronOffsetLeftOutlineSm != null) {
            return _chevronOffsetLeftOutlineSm!!
        }
        _chevronOffsetLeftOutlineSm = Builder(name = "ChevronOffsetLeftOutlineSm", defaultWidth =
                16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
                16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.461f, 1.0f)
                lineTo(9.0f, 1.0f)
                lineTo(3.482f, 8.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(6.461f)
                lineTo(1.0f, 8.0f)
                lineTo(6.461f, 1.0f)
                close()
            }
        }
        .build()
        return _chevronOffsetLeftOutlineSm!!
    }

private var _chevronOffsetLeftOutlineSm: ImageVector? = null
