package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
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

public val DsIcon.NotificationOffOutlineMd: ImageVector
    get() {
        if (_notificationOffOutlineMd != null) {
            return _notificationOffOutlineMd!!
        }
        _notificationOffOutlineMd = Builder(name = "NotificationOffOutlineMd", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                lineTo(10.641f, 4.155f)
                curveTo(10.129f, 4.275f, 9.64f, 4.459f, 9.186f, 4.702f)
                lineTo(10.346f, 6.359f)
                curveTo(10.852f, 6.128f, 11.413f, 6.0f, 12.0f, 6.0f)
                curveTo(13.929f, 6.0f, 15.582f, 7.379f, 15.927f, 9.277f)
                lineTo(16.674f, 13.39f)
                curveTo(16.949f, 14.9f, 17.788f, 16.234f, 19.0f, 17.133f)
                verticalLineTo(17.163f)
                curveTo(18.775f, 17.245f, 18.475f, 17.335f, 18.092f, 17.425f)
                lineTo(19.312f, 19.167f)
                curveTo(20.375f, 18.838f, 21.0f, 18.435f, 21.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(20.789f, 15.894f)
                curveTo(19.663f, 15.331f, 18.868f, 14.271f, 18.642f, 13.032f)
                lineTo(17.894f, 8.919f)
                curveTo(17.46f, 6.529f, 15.643f, 4.687f, 13.359f, 4.155f)
                lineTo(13.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.802f, 7.011f)
                lineTo(4.0f, 3.008f)
                horizontalLineTo(6.5f)
                lineTo(20.5f, 23.008f)
                horizontalLineTo(18.0f)
                lineTo(15.879f, 19.978f)
                curveTo(15.704f, 20.672f, 15.344f, 21.313f, 14.828f, 21.828f)
                curveTo(14.078f, 22.579f, 13.061f, 23.0f, 12.0f, 23.0f)
                curveTo(10.939f, 23.0f, 9.922f, 22.579f, 9.172f, 21.828f)
                curveTo(8.613f, 21.27f, 8.237f, 20.564f, 8.081f, 19.802f)
                curveTo(5.064f, 19.477f, 3.0f, 18.79f, 3.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(3.211f, 15.894f)
                curveTo(4.337f, 15.331f, 5.133f, 14.271f, 5.358f, 13.032f)
                lineTo(6.106f, 8.919f)
                curveTo(6.231f, 8.232f, 6.47f, 7.589f, 6.802f, 7.011f)
                close()
                moveTo(14.44f, 17.922f)
                curveTo(13.676f, 17.972f, 12.857f, 18.0f, 12.0f, 18.0f)
                curveTo(9.601f, 18.0f, 7.504f, 17.782f, 6.06f, 17.461f)
                curveTo(5.604f, 17.359f, 5.254f, 17.255f, 5.0f, 17.163f)
                verticalLineTo(17.133f)
                curveTo(6.212f, 16.234f, 7.051f, 14.9f, 7.326f, 13.39f)
                lineTo(8.073f, 9.277f)
                curveTo(8.094f, 9.162f, 8.12f, 9.048f, 8.15f, 8.937f)
                lineTo(14.44f, 17.922f)
                close()
                moveTo(13.753f, 19.962f)
                curveTo(13.187f, 19.987f, 12.601f, 20.0f, 12.0f, 20.0f)
                curveTo(11.399f, 20.0f, 10.813f, 19.987f, 10.247f, 19.962f)
                curveTo(10.337f, 20.127f, 10.451f, 20.279f, 10.586f, 20.414f)
                curveTo(10.961f, 20.789f, 11.47f, 21.0f, 12.0f, 21.0f)
                curveTo(12.53f, 21.0f, 13.039f, 20.789f, 13.414f, 20.414f)
                curveTo(13.549f, 20.279f, 13.663f, 20.127f, 13.753f, 19.962f)
                close()
            }
        }
        .build()
        return _notificationOffOutlineMd!!
    }

private var _notificationOffOutlineMd: ImageVector? = null
