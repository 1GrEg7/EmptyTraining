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

public val DsIcon.NotificationOutlineMd: ImageVector
    get() {
        if (_notificationOutlineMd != null) {
            return _notificationOutlineMd!!
        }
        _notificationOutlineMd = Builder(name = "NotificationOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                lineTo(10.641f, 4.155f)
                curveTo(8.357f, 4.687f, 6.54f, 6.529f, 6.106f, 8.919f)
                lineTo(5.358f, 13.032f)
                curveTo(5.133f, 14.271f, 4.337f, 15.331f, 3.211f, 15.894f)
                lineTo(3.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 18.79f, 5.064f, 19.477f, 8.081f, 19.802f)
                curveTo(8.237f, 20.564f, 8.613f, 21.27f, 9.172f, 21.828f)
                curveTo(9.922f, 22.579f, 10.939f, 23.0f, 12.0f, 23.0f)
                curveTo(13.061f, 23.0f, 14.078f, 22.579f, 14.828f, 21.828f)
                curveTo(15.387f, 21.27f, 15.763f, 20.564f, 15.919f, 19.802f)
                curveTo(18.935f, 19.477f, 21.0f, 18.79f, 21.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(20.789f, 15.894f)
                curveTo(19.663f, 15.331f, 18.868f, 14.271f, 18.642f, 13.032f)
                lineTo(17.894f, 8.919f)
                curveTo(17.46f, 6.529f, 15.643f, 4.687f, 13.359f, 4.155f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(13.753f, 19.962f)
                curveTo(13.187f, 19.987f, 12.601f, 20.0f, 12.0f, 20.0f)
                curveTo(11.399f, 20.0f, 10.813f, 19.987f, 10.247f, 19.962f)
                curveTo(10.337f, 20.127f, 10.451f, 20.279f, 10.586f, 20.414f)
                curveTo(10.961f, 20.789f, 11.47f, 21.0f, 12.0f, 21.0f)
                curveTo(12.53f, 21.0f, 13.039f, 20.789f, 13.414f, 20.414f)
                curveTo(13.549f, 20.279f, 13.663f, 20.127f, 13.753f, 19.962f)
                close()
                moveTo(7.326f, 13.39f)
                lineTo(8.073f, 9.277f)
                curveTo(8.418f, 7.379f, 10.071f, 6.0f, 12.0f, 6.0f)
                curveTo(13.929f, 6.0f, 15.582f, 7.379f, 15.927f, 9.277f)
                lineTo(16.674f, 13.39f)
                curveTo(16.949f, 14.9f, 17.788f, 16.234f, 19.0f, 17.133f)
                verticalLineTo(17.163f)
                curveTo(18.746f, 17.255f, 18.396f, 17.359f, 17.94f, 17.461f)
                curveTo(16.496f, 17.782f, 14.399f, 18.0f, 12.0f, 18.0f)
                curveTo(9.601f, 18.0f, 7.504f, 17.782f, 6.06f, 17.461f)
                curveTo(5.604f, 17.359f, 5.254f, 17.255f, 5.0f, 17.163f)
                verticalLineTo(17.133f)
                curveTo(6.212f, 16.234f, 7.051f, 14.9f, 7.326f, 13.39f)
                close()
            }
        }
        .build()
        return _notificationOutlineMd!!
    }

private var _notificationOutlineMd: ImageVector? = null
