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

public val DsIcon.NotificationSolidMd: ImageVector
    get() {
        if (_notificationSolidMd != null) {
            return _notificationSolidMd!!
        }
        _notificationSolidMd = Builder(name = "NotificationSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.333f, 2.0f)
                horizontalLineTo(10.667f)
                lineTo(10.354f, 4.23f)
                curveTo(8.206f, 4.843f, 6.522f, 6.63f, 6.106f, 8.919f)
                lineTo(5.358f, 13.032f)
                curveTo(5.133f, 14.271f, 4.337f, 15.937f, 3.211f, 16.5f)
                lineTo(3.0f, 16.606f)
                lineTo(3.0f, 18.0f)
                curveTo(3.0f, 19.1f, 7.0f, 20.0f, 12.0f, 20.0f)
                curveTo(17.0f, 20.0f, 21.0f, 19.1f, 21.0f, 18.0f)
                verticalLineTo(16.5f)
                lineTo(20.789f, 16.394f)
                curveTo(19.663f, 15.831f, 18.868f, 14.271f, 18.642f, 13.032f)
                lineTo(17.895f, 8.919f)
                curveTo(17.478f, 6.629f, 15.792f, 4.841f, 13.643f, 4.229f)
                lineTo(13.333f, 2.0f)
                close()
                moveTo(8.433f, 20.812f)
                curveTo(9.094f, 22.11f, 10.443f, 23.0f, 12.0f, 23.0f)
                curveTo(13.557f, 23.0f, 14.906f, 22.11f, 15.567f, 20.812f)
                curveTo(14.448f, 20.934f, 13.248f, 21.0f, 12.0f, 21.0f)
                curveTo(10.751f, 21.0f, 9.551f, 20.934f, 8.433f, 20.812f)
                close()
            }
        }
        .build()
        return _notificationSolidMd!!
    }

private var _notificationSolidMd: ImageVector? = null
