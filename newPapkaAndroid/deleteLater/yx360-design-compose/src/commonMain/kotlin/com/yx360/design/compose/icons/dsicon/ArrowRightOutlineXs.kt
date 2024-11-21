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

public val DsIcon.ArrowRightOutlineXs: ImageVector
    get() {
        if (_arrowRightOutlineXs != null) {
            return _arrowRightOutlineXs!!
        }
        _arrowRightOutlineXs = Builder(name = "ArrowRightOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.5f, 10.0f)
                horizontalLineTo(8.0f)
                lineTo(11.0f, 6.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineTo(5.5f)
                lineTo(7.75f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.75f)
                lineTo(5.5f, 10.0f)
                close()
            }
        }
        .build()
        return _arrowRightOutlineXs!!
    }

private var _arrowRightOutlineXs: ImageVector? = null
