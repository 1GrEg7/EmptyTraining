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

public val DsIcon.NotificationAltSolidMd: ImageVector
    get() {
        if (_notificationAltSolidMd != null) {
            return _notificationAltSolidMd!!
        }
        _notificationAltSolidMd = Builder(name = "NotificationAltSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.667f, 2.0f)
                horizontalLineTo(13.333f)
                lineTo(13.589f, 3.844f)
                curveTo(12.611f, 4.757f, 12.0f, 6.057f, 12.0f, 7.5f)
                curveTo(12.0f, 10.261f, 14.239f, 12.5f, 17.0f, 12.5f)
                curveTo(17.524f, 12.5f, 18.029f, 12.419f, 18.504f, 12.27f)
                lineTo(18.642f, 13.032f)
                curveTo(18.868f, 14.271f, 19.663f, 15.831f, 20.789f, 16.394f)
                lineTo(21.0f, 16.5f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.1f, 17.0f, 20.0f, 12.0f, 20.0f)
                curveTo(7.0f, 20.0f, 3.0f, 19.1f, 3.0f, 18.0f)
                lineTo(3.0f, 16.606f)
                lineTo(3.211f, 16.5f)
                curveTo(4.337f, 15.937f, 5.133f, 14.271f, 5.358f, 13.032f)
                lineTo(6.106f, 8.919f)
                curveTo(6.522f, 6.63f, 8.206f, 4.843f, 10.354f, 4.23f)
                lineTo(10.667f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(10.443f, 23.0f, 9.094f, 22.11f, 8.433f, 20.812f)
                curveTo(9.551f, 20.934f, 10.751f, 21.0f, 12.0f, 21.0f)
                curveTo(13.248f, 21.0f, 14.448f, 20.934f, 15.567f, 20.812f)
                curveTo(14.906f, 22.11f, 13.557f, 23.0f, 12.0f, 23.0f)
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
        return _notificationAltSolidMd!!
    }

private var _notificationAltSolidMd: ImageVector? = null
