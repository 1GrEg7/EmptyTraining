package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CalendarListOutlineSm: ImageVector
    get() {
        if (_calendarListOutlineSm != null) {
            return _calendarListOutlineSm!!
        }
        _calendarListOutlineSm = Builder(name = "CalendarListOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 7.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 7.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 10.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(1.0f)
                curveTo(2.343f, 1.0f, 1.0f, 2.343f, 1.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 13.657f, 2.343f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 2.343f, 13.657f, 1.0f, 12.0f, 1.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(4.0f, 3.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(4.5f)
                lineTo(13.0f, 4.5f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(3.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _calendarListOutlineSm!!
    }

private var _calendarListOutlineSm: ImageVector? = null
