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

public val DsIcon.NotificationOutlineSm: ImageVector
    get() {
        if (_notificationOutlineSm != null) {
            return _notificationOutlineSm!!
        }
        _notificationOutlineSm = Builder(name = "NotificationOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 0.0f)
                horizontalLineTo(7.0f)
                lineTo(6.706f, 1.177f)
                curveTo(4.924f, 1.686f, 3.744f, 3.237f, 3.415f, 5.045f)
                lineTo(2.834f, 8.244f)
                curveTo(2.659f, 9.207f, 2.0f, 10.0f, 1.0f, 10.552f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 12.625f, 2.601f, 13.137f, 5.022f, 13.368f)
                curveTo(5.085f, 13.88f, 5.276f, 14.351f, 5.563f, 14.75f)
                curveTo(6.108f, 15.507f, 6.996f, 16.0f, 8.0f, 16.0f)
                curveTo(9.004f, 16.0f, 9.892f, 15.507f, 10.437f, 14.75f)
                curveTo(10.724f, 14.351f, 10.915f, 13.88f, 10.978f, 13.368f)
                curveTo(13.399f, 13.137f, 15.0f, 12.625f, 15.0f, 12.0f)
                verticalLineTo(10.552f)
                curveTo(14.0f, 10.0f, 13.341f, 9.207f, 13.166f, 8.244f)
                lineTo(12.585f, 5.045f)
                curveTo(12.256f, 3.237f, 11.076f, 1.686f, 9.294f, 1.177f)
                lineTo(9.0f, 0.0f)
                close()
                moveTo(3.499f, 11.132f)
                curveTo(4.143f, 10.453f, 4.619f, 9.608f, 4.802f, 8.602f)
                lineTo(5.383f, 5.403f)
                curveTo(5.65f, 3.934f, 6.66f, 3.0f, 8.0f, 3.0f)
                curveTo(9.34f, 3.0f, 10.35f, 3.934f, 10.617f, 5.403f)
                lineTo(11.198f, 8.602f)
                curveTo(11.382f, 9.608f, 11.857f, 10.453f, 12.501f, 11.132f)
                curveTo(11.434f, 11.352f, 9.866f, 11.5f, 8.0f, 11.5f)
                curveTo(6.134f, 11.5f, 4.566f, 11.352f, 3.499f, 11.132f)
                close()
            }
        }
        .build()
        return _notificationOutlineSm!!
    }

private var _notificationOutlineSm: ImageVector? = null
