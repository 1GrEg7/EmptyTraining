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

public val DsIcon.StarOutlineMd: ImageVector
    get() {
        if (_starOutlineMd != null) {
            return _starOutlineMd!!
        }
        _starOutlineMd = Builder(name = "StarOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.314f, 12.417f)
                lineTo(19.116f, 9.678f)
                lineTo(14.224f, 8.967f)
                lineTo(12.014f, 4.506f)
                lineTo(9.819f, 8.956f)
                lineTo(4.887f, 9.676f)
                lineTo(8.437f, 13.139f)
                lineTo(7.604f, 18.046f)
                lineTo(12.0f, 15.74f)
                lineTo(16.389f, 18.042f)
                lineTo(15.554f, 13.177f)
                lineTo(16.314f, 12.417f)
                close()
                moveTo(18.95f, 21.139f)
                lineTo(18.54f, 21.429f)
                lineTo(12.0f, 17.999f)
                lineTo(5.46f, 21.429f)
                lineTo(5.05f, 21.139f)
                lineTo(6.29f, 13.839f)
                lineTo(1.0f, 8.679f)
                lineTo(1.16f, 8.199f)
                lineTo(8.49f, 7.129f)
                lineTo(11.76f, 0.499f)
                horizontalLineTo(12.26f)
                lineTo(15.55f, 7.139f)
                lineTo(22.85f, 8.199f)
                lineTo(23.0f, 8.679f)
                lineTo(17.72f, 13.839f)
                lineTo(17.7f, 13.859f)
                lineTo(18.95f, 21.139f)
                close()
            }
        }
        .build()
        return _starOutlineMd!!
    }

private var _starOutlineMd: ImageVector? = null
