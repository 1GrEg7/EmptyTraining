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

public val DsIcon.ChevronLeftOutlineSm: ImageVector
    get() {
        if (_chevronLeftOutlineSm != null) {
            return _chevronLeftOutlineSm!!
        }
        _chevronLeftOutlineSm = Builder(name = "ChevronLeftOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.461f, 1.0f)
                lineTo(12.0f, 1.0f)
                lineTo(6.482f, 8.0f)
                lineTo(12.0f, 15.0f)
                horizontalLineTo(9.461f)
                lineTo(4.0f, 8.0f)
                lineTo(9.461f, 1.0f)
                close()
            }
        }
        .build()
        return _chevronLeftOutlineSm!!
    }

private var _chevronLeftOutlineSm: ImageVector? = null
