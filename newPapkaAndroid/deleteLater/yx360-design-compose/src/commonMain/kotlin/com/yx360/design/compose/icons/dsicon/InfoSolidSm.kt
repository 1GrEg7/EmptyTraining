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

public val DsIcon.InfoSolidSm: ImageVector
    get() {
        if (_infoSolidSm != null) {
            return _infoSolidSm!!
        }
        _infoSolidSm = Builder(name = "InfoSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 16.0f)
                curveTo(3.582f, 16.0f, 0.0f, 12.418f, 0.0f, 8.0f)
                curveTo(0.0f, 3.582f, 3.582f, 0.0f, 8.0f, 0.0f)
                curveTo(12.418f, 0.0f, 16.0f, 3.582f, 16.0f, 8.0f)
                curveTo(16.0f, 12.418f, 12.418f, 16.0f, 8.0f, 16.0f)
                close()
                moveTo(7.57f, 12.586f)
                curveTo(6.545f, 12.586f, 6.209f, 11.958f, 6.209f, 11.377f)
                curveTo(6.209f, 11.132f, 6.285f, 10.765f, 6.346f, 10.551f)
                lineTo(6.95f, 8.061f)
                horizontalLineTo(6.161f)
                curveTo(6.0f, 8.061f, 5.88f, 7.911f, 5.917f, 7.755f)
                lineTo(5.994f, 7.424f)
                curveTo(6.025f, 7.29f, 6.132f, 7.187f, 6.266f, 7.16f)
                lineTo(8.624f, 6.687f)
                curveTo(8.983f, 6.615f, 9.296f, 6.942f, 9.207f, 7.298f)
                lineTo(8.252f, 11.13f)
                curveTo(8.229f, 11.22f, 8.275f, 11.313f, 8.359f, 11.35f)
                curveTo(8.436f, 11.384f, 8.526f, 11.364f, 8.581f, 11.301f)
                lineTo(9.45f, 10.298f)
                curveTo(9.556f, 10.175f, 9.736f, 10.15f, 9.872f, 10.238f)
                curveTo(10.026f, 10.338f, 10.067f, 10.546f, 9.961f, 10.697f)
                lineTo(9.559f, 11.27f)
                curveTo(8.825f, 12.341f, 8.152f, 12.586f, 7.57f, 12.586f)
                close()
                moveTo(7.224f, 5.158f)
                curveTo(7.224f, 5.663f, 7.621f, 6.091f, 8.325f, 6.091f)
                curveTo(9.014f, 6.091f, 9.519f, 5.709f, 9.672f, 5.097f)
                curveTo(9.702f, 4.974f, 9.718f, 4.837f, 9.718f, 4.729f)
                curveTo(9.718f, 4.225f, 9.32f, 3.796f, 8.616f, 3.796f)
                curveTo(7.943f, 3.796f, 7.423f, 4.179f, 7.27f, 4.791f)
                curveTo(7.239f, 4.913f, 7.224f, 5.051f, 7.224f, 5.158f)
                close()
            }
        }
        .build()
        return _infoSolidSm!!
    }

private var _infoSolidSm: ImageVector? = null
