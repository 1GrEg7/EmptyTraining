package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ArrowTopOutlineXs: ImageVector
    get() {
        if (_arrowTopOutlineXs != null) {
            return _arrowTopOutlineXs!!
        }
        _arrowTopOutlineXs = Builder(name = "ArrowTopOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 6.5f)
                verticalLineTo(4.0f)
                lineTo(6.0f, 1.0f)
                lineTo(2.0f, 4.0f)
                verticalLineTo(6.5f)
                lineTo(5.0f, 4.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.25f)
                lineTo(10.0f, 6.5f)
                close()
            }
        }
        .build()
        return _arrowTopOutlineXs!!
    }

private var _arrowTopOutlineXs: ImageVector? = null
