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

public val DsIcon.ArrowLeftOutlineXs: ImageVector
    get() {
        if (_arrowLeftOutlineXs != null) {
            return _arrowLeftOutlineXs!!
        }
        _arrowLeftOutlineXs = Builder(name = "ArrowLeftOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 2.0f)
                horizontalLineTo(4.0f)
                lineTo(1.0f, 6.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineTo(6.5f)
                lineTo(4.25f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.25f)
                lineTo(6.5f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowLeftOutlineXs!!
    }

private var _arrowLeftOutlineXs: ImageVector? = null
