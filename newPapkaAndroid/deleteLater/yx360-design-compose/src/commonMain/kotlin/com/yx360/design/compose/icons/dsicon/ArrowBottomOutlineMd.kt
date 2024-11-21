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

public val DsIcon.ArrowBottomOutlineMd: ImageVector
    get() {
        if (_arrowBottomOutlineMd != null) {
            return _arrowBottomOutlineMd!!
        }
        _arrowBottomOutlineMd = Builder(name = "ArrowBottomOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 13.0f)
                verticalLineTo(15.5f)
                lineTo(12.0f, 22.0f)
                lineTo(20.0f, 15.5f)
                verticalLineTo(13.0f)
                lineTo(13.0f, 18.688f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.688f)
                lineTo(4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _arrowBottomOutlineMd!!
    }

private var _arrowBottomOutlineMd: ImageVector? = null
