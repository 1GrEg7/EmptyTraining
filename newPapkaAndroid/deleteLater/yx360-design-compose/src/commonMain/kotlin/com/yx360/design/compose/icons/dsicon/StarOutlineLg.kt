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

public val DsIcon.StarOutlineLg: ImageVector
    get() {
        if (_starOutlineLg != null) {
            return _starOutlineLg!!
        }
        _starOutlineLg = Builder(name = "StarOutlineLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.346f, 17.519f)
                lineTo(25.223f, 13.69f)
                lineTo(18.863f, 12.757f)
                lineTo(16.015f, 6.948f)
                lineTo(13.187f, 12.744f)
                lineTo(6.78f, 13.689f)
                lineTo(11.396f, 18.24f)
                lineTo(10.319f, 24.651f)
                lineTo(16.0f, 21.639f)
                lineTo(21.674f, 24.647f)
                lineTo(20.593f, 18.281f)
                lineTo(21.346f, 17.519f)
                close()
                moveTo(24.214f, 27.654f)
                lineTo(23.729f, 28.0f)
                lineTo(16.0f, 23.903f)
                lineTo(8.271f, 28.0f)
                lineTo(7.786f, 27.654f)
                lineTo(9.252f, 18.934f)
                lineTo(3.0f, 12.771f)
                lineTo(3.189f, 12.197f)
                lineTo(11.852f, 10.919f)
                lineTo(15.716f, 3.0f)
                horizontalLineTo(16.307f)
                lineTo(20.195f, 10.931f)
                lineTo(28.823f, 12.197f)
                lineTo(29.0f, 12.771f)
                lineTo(22.76f, 18.934f)
                lineTo(22.736f, 18.958f)
                lineTo(24.214f, 27.654f)
                close()
            }
        }
        .build()
        return _starOutlineLg!!
    }

private var _starOutlineLg: ImageVector? = null
