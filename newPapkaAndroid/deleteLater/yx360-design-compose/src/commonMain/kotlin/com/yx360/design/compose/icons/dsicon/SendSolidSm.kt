package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.SendSolidSm: ImageVector
    get() {
        if (_sendSolidSm != null) {
            return _sendSolidSm!!
        }
        _sendSolidSm = Builder(name = "SendSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.328f)
                verticalLineTo(7.312f)
                lineTo(5.316f, 9.211f)
                lineTo(9.228f, 5.837f)
                lineTo(10.088f, 6.705f)
                lineTo(6.747f, 10.591f)
                lineTo(8.671f, 15.0f)
                horizontalLineTo(9.67f)
                lineTo(14.002f, 2.659f)
                lineTo(13.342f, 2.0f)
                lineTo(1.0f, 6.328f)
                close()
            }
        }
        .build()
        return _sendSolidSm!!
    }

private var _sendSolidSm: ImageVector? = null
