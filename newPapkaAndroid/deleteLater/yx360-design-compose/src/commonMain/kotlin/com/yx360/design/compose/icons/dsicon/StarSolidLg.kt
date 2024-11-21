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

public val DsIcon.StarSolidLg: ImageVector
    get() {
        if (_starSolidLg != null) {
            return _starSolidLg!!
        }
        _starSolidLg = Builder(name = "StarSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.76f, 18.934f)
                lineTo(29.0f, 12.771f)
                lineTo(28.823f, 12.197f)
                lineTo(20.195f, 10.931f)
                lineTo(16.307f, 3.0f)
                horizontalLineTo(15.716f)
                lineTo(11.852f, 10.919f)
                lineTo(3.189f, 12.197f)
                lineTo(3.0f, 12.771f)
                lineTo(9.252f, 18.934f)
                lineTo(7.786f, 27.654f)
                lineTo(8.271f, 28.0f)
                lineTo(16.0f, 23.903f)
                lineTo(23.729f, 28.0f)
                lineTo(24.214f, 27.654f)
                lineTo(22.736f, 18.958f)
                lineTo(22.76f, 18.934f)
                close()
            }
        }
        .build()
        return _starSolidLg!!
    }

private var _starSolidLg: ImageVector? = null
