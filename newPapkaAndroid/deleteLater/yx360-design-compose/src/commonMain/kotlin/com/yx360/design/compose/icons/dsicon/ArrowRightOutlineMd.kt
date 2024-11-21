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

public val DsIcon.ArrowRightOutlineMd: ImageVector
    get() {
        if (_arrowRightOutlineMd != null) {
            return _arrowRightOutlineMd!!
        }
        _arrowRightOutlineMd = Builder(name = "ArrowRightOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 20.0f)
                horizontalLineTo(15.5f)
                lineTo(22.0f, 12.0f)
                lineTo(15.5f, 4.0f)
                horizontalLineTo(13.0f)
                lineTo(18.688f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.688f)
                lineTo(13.0f, 20.0f)
                close()
            }
        }
        .build()
        return _arrowRightOutlineMd!!
    }

private var _arrowRightOutlineMd: ImageVector? = null
