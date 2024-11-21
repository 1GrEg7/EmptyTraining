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

public val DsIcon.ArrowBottomOutlineSm: ImageVector
    get() {
        if (_arrowBottomOutlineSm != null) {
            return _arrowBottomOutlineSm!!
        }
        _arrowBottomOutlineSm = Builder(name = "ArrowBottomOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 7.056f)
                lineTo(2.5f, 9.5f)
                lineTo(8.0f, 14.0f)
                lineTo(13.5f, 9.5f)
                lineTo(13.5f, 7.0f)
                lineTo(9.0f, 10.682f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.692f)
                lineTo(2.5f, 7.056f)
                close()
            }
        }
        .build()
        return _arrowBottomOutlineSm!!
    }

private var _arrowBottomOutlineSm: ImageVector? = null
