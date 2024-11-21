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

public val DsIcon.ChevronTopOutlineXs: ImageVector
    get() {
        if (_chevronTopOutlineXs != null) {
            return _chevronTopOutlineXs!!
        }
        _chevronTopOutlineXs = Builder(name = "ChevronTopOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.461f)
                verticalLineTo(9.0f)
                lineTo(6.0f, 5.482f)
                lineTo(1.0f, 9.0f)
                lineTo(1.0f, 6.5f)
                lineTo(6.0f, 3.0f)
                lineTo(11.0f, 6.461f)
                close()
            }
        }
        .build()
        return _chevronTopOutlineXs!!
    }

private var _chevronTopOutlineXs: ImageVector? = null
