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

public val DsIcon.ArrowRightOutlineSm: ImageVector
    get() {
        if (_arrowRightOutlineSm != null) {
            return _arrowRightOutlineSm!!
        }
        _arrowRightOutlineSm = Builder(name = "ArrowRightOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.556f, 14.0f)
                horizontalLineTo(10.0f)
                lineTo(15.0f, 8.0f)
                lineTo(10.0f, 2.0f)
                lineTo(7.5f, 2.0f)
                lineTo(11.682f, 7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.692f)
                lineTo(7.556f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowRightOutlineSm!!
    }

private var _arrowRightOutlineSm: ImageVector? = null
