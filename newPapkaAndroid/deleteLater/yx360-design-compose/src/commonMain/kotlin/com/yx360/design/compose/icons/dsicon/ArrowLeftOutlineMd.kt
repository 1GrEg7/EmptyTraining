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

public val DsIcon.ArrowLeftOutlineMd: ImageVector
    get() {
        if (_arrowLeftOutlineMd != null) {
            return _arrowLeftOutlineMd!!
        }
        _arrowLeftOutlineMd = Builder(name = "ArrowLeftOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 4.0f)
                horizontalLineTo(8.5f)
                lineTo(2.0f, 12.0f)
                lineTo(8.5f, 20.0f)
                horizontalLineTo(11.0f)
                lineTo(5.313f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.313f)
                lineTo(11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowLeftOutlineMd!!
    }

private var _arrowLeftOutlineMd: ImageVector? = null
