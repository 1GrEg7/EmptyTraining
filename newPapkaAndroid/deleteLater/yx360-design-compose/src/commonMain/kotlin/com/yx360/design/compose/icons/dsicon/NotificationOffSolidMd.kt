package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.NotificationOffSolidMd: ImageVector
    get() {
        if (_notificationOffSolidMd != null) {
            return _notificationOffSolidMd!!
        }
        _notificationOffSolidMd = Builder(name = "NotificationOffSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.667f, 2.0f)
                horizontalLineTo(13.333f)
                lineTo(13.643f, 4.229f)
                curveTo(15.792f, 4.841f, 17.478f, 6.629f, 17.895f, 8.919f)
                lineTo(18.642f, 13.032f)
                curveTo(18.868f, 14.271f, 19.663f, 15.831f, 20.789f, 16.394f)
                lineTo(21.0f, 16.5f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.435f, 20.376f, 18.838f, 19.312f, 19.167f)
                lineTo(9.186f, 4.702f)
                curveTo(9.555f, 4.505f, 9.946f, 4.346f, 10.354f, 4.23f)
                lineTo(10.667f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.802f, 7.011f)
                curveTo(6.47f, 7.589f, 6.231f, 8.232f, 6.106f, 8.919f)
                lineTo(5.358f, 13.032f)
                curveTo(5.133f, 14.271f, 4.337f, 15.937f, 3.211f, 16.5f)
                lineTo(3.0f, 16.606f)
                lineTo(3.0f, 18.0f)
                curveTo(3.0f, 19.1f, 7.0f, 20.0f, 12.0f, 20.0f)
                curveTo(13.348f, 20.0f, 14.623f, 19.935f, 15.767f, 19.817f)
                lineTo(18.0f, 23.008f)
                horizontalLineTo(20.5f)
                lineTo(6.5f, 3.008f)
                horizontalLineTo(4.0f)
                lineTo(6.802f, 7.011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.433f, 20.812f)
                curveTo(9.094f, 22.11f, 10.443f, 23.0f, 12.0f, 23.0f)
                curveTo(13.557f, 23.0f, 14.906f, 22.11f, 15.567f, 20.812f)
                curveTo(14.448f, 20.934f, 13.248f, 21.0f, 12.0f, 21.0f)
                curveTo(10.751f, 21.0f, 9.551f, 20.934f, 8.433f, 20.812f)
                close()
            }
        }
        .build()
        return _notificationOffSolidMd!!
    }

private var _notificationOffSolidMd: ImageVector? = null
