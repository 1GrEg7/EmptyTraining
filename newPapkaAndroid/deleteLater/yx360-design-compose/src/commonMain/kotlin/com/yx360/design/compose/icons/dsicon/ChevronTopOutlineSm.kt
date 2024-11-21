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

public val DsIcon.ChevronTopOutlineSm: ImageVector
    get() {
        if (_chevronTopOutlineSm != null) {
            return _chevronTopOutlineSm!!
        }
        _chevronTopOutlineSm = Builder(name = "ChevronTopOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.461f)
                verticalLineTo(12.0f)
                lineTo(8.0f, 6.482f)
                lineTo(1.0f, 12.0f)
                lineTo(1.0f, 9.461f)
                lineTo(8.0f, 4.0f)
                lineTo(15.0f, 9.461f)
                close()
            }
        }
        .build()
        return _chevronTopOutlineSm!!
    }

private var _chevronTopOutlineSm: ImageVector? = null
