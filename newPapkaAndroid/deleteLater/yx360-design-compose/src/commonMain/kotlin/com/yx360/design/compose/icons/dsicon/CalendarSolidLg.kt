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

public val DsIcon.CalendarSolidLg: ImageVector
    get() {
        if (_calendarSolidLg != null) {
            return _calendarSolidLg!!
        }
        _calendarSolidLg = Builder(name = "CalendarSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.003f)
                curveTo(12.459f, 5.0f, 12.957f, 5.0f, 13.5f, 5.0f)
                horizontalLineTo(18.5f)
                curveTo(19.043f, 5.0f, 19.541f, 5.0f, 20.0f, 5.003f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.065f)
                curveTo(23.142f, 5.146f, 23.944f, 5.327f, 24.612f, 5.737f)
                curveTo(25.285f, 6.149f, 25.851f, 6.715f, 26.263f, 7.388f)
                curveTo(27.0f, 8.59f, 27.0f, 10.227f, 27.0f, 13.5f)
                verticalLineTo(18.5f)
                curveTo(27.0f, 21.773f, 27.0f, 23.41f, 26.263f, 24.612f)
                curveTo(25.851f, 25.285f, 25.285f, 25.851f, 24.612f, 26.263f)
                curveTo(23.41f, 27.0f, 21.773f, 27.0f, 18.5f, 27.0f)
                horizontalLineTo(13.5f)
                curveTo(10.227f, 27.0f, 8.59f, 27.0f, 7.388f, 26.263f)
                curveTo(6.715f, 25.851f, 6.149f, 25.285f, 5.737f, 24.612f)
                curveTo(5.0f, 23.41f, 5.0f, 21.773f, 5.0f, 18.5f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 10.227f, 5.0f, 8.59f, 5.737f, 7.388f)
                curveTo(6.149f, 6.715f, 6.715f, 6.149f, 7.388f, 5.737f)
                curveTo(8.056f, 5.327f, 8.858f, 5.146f, 10.0f, 5.065f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(20.0f, 7.004f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.07f)
                curveTo(22.049f, 7.074f, 22.097f, 7.079f, 22.144f, 7.083f)
                curveTo(22.966f, 7.161f, 23.333f, 7.299f, 23.567f, 7.442f)
                curveTo(23.971f, 7.689f, 24.311f, 8.029f, 24.558f, 8.432f)
                curveTo(24.701f, 8.667f, 24.839f, 9.034f, 24.917f, 9.856f)
                curveTo(24.971f, 10.424f, 24.99f, 11.11f, 24.997f, 12.0f)
                horizontalLineTo(7.004f)
                curveTo(7.01f, 11.11f, 7.029f, 10.424f, 7.083f, 9.856f)
                curveTo(7.161f, 9.034f, 7.299f, 8.667f, 7.442f, 8.432f)
                curveTo(7.689f, 8.029f, 8.029f, 7.689f, 8.432f, 7.442f)
                curveTo(8.667f, 7.299f, 9.034f, 7.161f, 9.856f, 7.083f)
                curveTo(9.903f, 7.079f, 9.951f, 7.074f, 10.0f, 7.07f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.004f)
                curveTo(12.445f, 7.0f, 12.941f, 7.0f, 13.5f, 7.0f)
                horizontalLineTo(18.5f)
                curveTo(19.059f, 7.0f, 19.555f, 7.0f, 20.0f, 7.004f)
                close()
            }
        }
        .build()
        return _calendarSolidLg!!
    }

private var _calendarSolidLg: ImageVector? = null
