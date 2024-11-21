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

public val DsIcon.AlarmOutlineSm: ImageVector
    get() {
        if (_alarmOutlineSm != null) {
            return _alarmOutlineSm!!
        }
        _alarmOutlineSm = Builder(name = "AlarmOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.586f)
                lineTo(0.086f, 4.0f)
                lineTo(1.5f, 5.414f)
                lineTo(4.914f, 2.0f)
                lineTo(3.5f, 0.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                lineTo(8.75f, 6.0f)
                horizontalLineTo(7.25f)
                lineTo(7.0f, 10.0f)
                lineTo(9.25f, 11.75f)
                lineTo(10.156f, 10.882f)
                lineTo(9.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 12.314f, 11.314f, 15.0f, 8.0f, 15.0f)
                curveTo(4.687f, 15.0f, 2.0f, 12.314f, 2.0f, 9.0f)
                curveTo(2.0f, 5.686f, 4.687f, 3.0f, 8.0f, 3.0f)
                curveTo(11.314f, 3.0f, 14.0f, 5.686f, 14.0f, 9.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.0f, 11.209f, 10.209f, 13.0f, 8.0f, 13.0f)
                curveTo(5.791f, 13.0f, 4.0f, 11.209f, 4.0f, 9.0f)
                curveTo(4.0f, 6.791f, 5.791f, 5.0f, 8.0f, 5.0f)
                curveTo(10.209f, 5.0f, 12.0f, 6.791f, 12.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.915f, 4.0f)
                lineTo(12.5f, 0.586f)
                lineTo(11.086f, 2.0f)
                lineTo(14.5f, 5.414f)
                lineTo(15.915f, 4.0f)
                close()
            }
        }
        .build()
        return _alarmOutlineSm!!
    }

private var _alarmOutlineSm: ImageVector? = null
