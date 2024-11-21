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

public val DsIcon.ChevronLeftOutlineMd: ImageVector
    get() {
        if (_chevronLeftOutlineMd != null) {
            return _chevronLeftOutlineMd!!
        }
        _chevronLeftOutlineMd = Builder(name = "ChevronLeftOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 3.0f)
                lineTo(17.0f, 3.0f)
                lineTo(9.75f, 12.0f)
                lineTo(17.0f, 21.0f)
                horizontalLineTo(14.25f)
                lineTo(7.0f, 12.0f)
                lineTo(14.25f, 3.0f)
                close()
            }
        }
        .build()
        return _chevronLeftOutlineMd!!
    }

private var _chevronLeftOutlineMd: ImageVector? = null
