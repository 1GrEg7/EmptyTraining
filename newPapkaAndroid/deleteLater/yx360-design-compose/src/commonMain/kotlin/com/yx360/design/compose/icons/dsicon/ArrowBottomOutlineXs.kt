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

public val DsIcon.ArrowBottomOutlineXs: ImageVector
    get() {
        if (_arrowBottomOutlineXs != null) {
            return _arrowBottomOutlineXs!!
        }
        _arrowBottomOutlineXs = Builder(name = "ArrowBottomOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 5.5f)
                verticalLineTo(8.0f)
                lineTo(6.0f, 11.0f)
                lineTo(10.0f, 8.0f)
                verticalLineTo(5.5f)
                lineTo(7.0f, 7.75f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.75f)
                lineTo(2.0f, 5.5f)
                close()
            }
        }
        .build()
        return _arrowBottomOutlineXs!!
    }

private var _arrowBottomOutlineXs: ImageVector? = null
