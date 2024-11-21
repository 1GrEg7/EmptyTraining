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

public val DsIcon.NotificationAltOutlineMd: ImageVector
    get() {
        if (_notificationAltOutlineMd != null) {
            return _notificationAltOutlineMd!!
        }
        _notificationAltOutlineMd = Builder(name = "NotificationAltOutlineMd", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                lineTo(13.348f, 4.085f)
                curveTo(12.841f, 4.627f, 12.454f, 5.281f, 12.227f, 6.006f)
                curveTo(12.152f, 6.002f, 12.076f, 6.0f, 12.0f, 6.0f)
                curveTo(10.071f, 6.0f, 8.418f, 7.379f, 8.073f, 9.277f)
                lineTo(7.326f, 13.39f)
                curveTo(7.051f, 14.9f, 6.212f, 16.234f, 5.0f, 17.133f)
                verticalLineTo(17.163f)
                curveTo(5.254f, 17.255f, 5.604f, 17.359f, 6.06f, 17.461f)
                curveTo(7.504f, 17.782f, 9.601f, 18.0f, 12.0f, 18.0f)
                curveTo(14.399f, 18.0f, 16.496f, 17.782f, 17.94f, 17.461f)
                curveTo(18.396f, 17.359f, 18.746f, 17.255f, 19.0f, 17.163f)
                verticalLineTo(17.133f)
                curveTo(17.788f, 16.234f, 16.949f, 14.9f, 16.674f, 13.39f)
                lineTo(16.508f, 12.476f)
                curveTo(16.67f, 12.492f, 16.834f, 12.5f, 17.0f, 12.5f)
                curveTo(17.524f, 12.5f, 18.029f, 12.419f, 18.504f, 12.27f)
                lineTo(18.642f, 13.032f)
                curveTo(18.868f, 14.271f, 19.663f, 15.331f, 20.789f, 15.894f)
                lineTo(21.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.79f, 18.935f, 19.477f, 15.919f, 19.802f)
                curveTo(15.763f, 20.564f, 15.387f, 21.27f, 14.828f, 21.828f)
                curveTo(14.078f, 22.579f, 13.061f, 23.0f, 12.0f, 23.0f)
                curveTo(10.939f, 23.0f, 9.922f, 22.579f, 9.172f, 21.828f)
                curveTo(8.613f, 21.27f, 8.237f, 20.564f, 8.081f, 19.802f)
                curveTo(5.064f, 19.477f, 3.0f, 18.79f, 3.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(3.211f, 15.894f)
                curveTo(4.337f, 15.331f, 5.133f, 14.271f, 5.358f, 13.032f)
                lineTo(6.106f, 8.919f)
                curveTo(6.54f, 6.529f, 8.357f, 4.687f, 10.641f, 4.155f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(12.601f, 20.0f, 13.187f, 19.987f, 13.753f, 19.962f)
                curveTo(13.663f, 20.127f, 13.549f, 20.279f, 13.414f, 20.414f)
                curveTo(13.039f, 20.789f, 12.53f, 21.0f, 12.0f, 21.0f)
                curveTo(11.47f, 21.0f, 10.961f, 20.789f, 10.586f, 20.414f)
                curveTo(10.451f, 20.279f, 10.337f, 20.127f, 10.247f, 19.962f)
                curveTo(10.813f, 19.987f, 11.399f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.5f)
                curveTo(20.0f, 9.157f, 18.657f, 10.5f, 17.0f, 10.5f)
                curveTo(15.343f, 10.5f, 14.0f, 9.157f, 14.0f, 7.5f)
                curveTo(14.0f, 5.843f, 15.343f, 4.5f, 17.0f, 4.5f)
                curveTo(18.657f, 4.5f, 20.0f, 5.843f, 20.0f, 7.5f)
                close()
            }
        }
        .build()
        return _notificationAltOutlineMd!!
    }

private var _notificationAltOutlineMd: ImageVector? = null
