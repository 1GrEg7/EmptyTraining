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

public val DsIcon.ArrowLeftOutlineSm: ImageVector
    get() {
        if (_arrowLeftOutlineSm != null) {
            return _arrowLeftOutlineSm!!
        }
        _arrowLeftOutlineSm = Builder(name = "ArrowLeftOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 2.0f)
                lineTo(6.056f, 2.0f)
                lineTo(1.0f, 8.0f)
                lineTo(6.0f, 14.0f)
                lineTo(8.5f, 14.0f)
                lineTo(4.318f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.308f)
                lineTo(8.5f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowLeftOutlineSm!!
    }

private var _arrowLeftOutlineSm: ImageVector? = null
