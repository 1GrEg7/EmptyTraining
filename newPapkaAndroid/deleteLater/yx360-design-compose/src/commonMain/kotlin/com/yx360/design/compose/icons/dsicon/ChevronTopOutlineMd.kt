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

public val DsIcon.ChevronTopOutlineMd: ImageVector
    get() {
        if (_chevronTopOutlineMd != null) {
            return _chevronTopOutlineMd!!
        }
        _chevronTopOutlineMd = Builder(name = "ChevronTopOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.25f)
                verticalLineTo(17.0f)
                lineTo(12.0f, 9.75f)
                lineTo(3.0f, 17.0f)
                verticalLineTo(14.25f)
                lineTo(12.0f, 7.0f)
                lineTo(21.0f, 14.25f)
                close()
            }
        }
        .build()
        return _chevronTopOutlineMd!!
    }

private var _chevronTopOutlineMd: ImageVector? = null
