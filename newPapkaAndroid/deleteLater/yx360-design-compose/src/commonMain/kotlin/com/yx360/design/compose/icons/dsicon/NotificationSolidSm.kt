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

public val DsIcon.NotificationSolidSm: ImageVector
    get() {
        if (_notificationSolidSm != null) {
            return _notificationSolidSm!!
        }
        _notificationSolidSm = Builder(name = "NotificationSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.037f, 0.0f)
                horizontalLineTo(6.963f)
                lineTo(6.695f, 1.188f)
                curveTo(5.025f, 1.655f, 3.739f, 3.528f, 3.416f, 5.272f)
                lineTo(2.834f, 8.406f)
                curveTo(2.659f, 9.349f, 2.04f, 10.048f, 1.164f, 10.477f)
                lineTo(1.0f, 10.557f)
                lineTo(1.0f, 12.191f)
                curveTo(1.0f, 13.029f, 4.111f, 13.714f, 8.0f, 13.714f)
                curveTo(11.889f, 13.714f, 15.0f, 13.029f, 15.0f, 12.191f)
                verticalLineTo(10.566f)
                lineTo(14.836f, 10.486f)
                curveTo(13.96f, 10.057f, 13.341f, 9.349f, 13.166f, 8.406f)
                lineTo(12.585f, 5.272f)
                curveTo(12.261f, 3.527f, 10.973f, 1.654f, 9.301f, 1.188f)
                lineTo(9.037f, 0.0f)
                close()
                moveTo(5.176f, 14.496f)
                curveTo(5.69f, 15.485f, 6.789f, 16.0f, 8.0f, 16.0f)
                curveTo(9.211f, 16.0f, 10.211f, 15.485f, 10.725f, 14.496f)
                curveTo(9.855f, 14.589f, 8.922f, 14.639f, 7.951f, 14.639f)
                curveTo(6.98f, 14.639f, 6.046f, 14.589f, 5.176f, 14.496f)
                close()
            }
        }
        .build()
        return _notificationSolidSm!!
    }

private var _notificationSolidSm: ImageVector? = null
