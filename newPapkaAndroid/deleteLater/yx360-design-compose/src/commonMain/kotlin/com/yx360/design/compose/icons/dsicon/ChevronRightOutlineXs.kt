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

public val DsIcon.ChevronRightOutlineXs: ImageVector
    get() {
        if (_chevronRightOutlineXs != null) {
            return _chevronRightOutlineXs!!
        }
        _chevronRightOutlineXs = Builder(name = "ChevronRightOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.539f, 11.0f)
                horizontalLineTo(3.0f)
                lineTo(6.518f, 6.0f)
                lineTo(3.0f, 1.0f)
                lineTo(5.5f, 1.0f)
                lineTo(9.0f, 6.0f)
                lineTo(5.539f, 11.0f)
                close()
            }
        }
        .build()
        return _chevronRightOutlineXs!!
    }

private var _chevronRightOutlineXs: ImageVector? = null
