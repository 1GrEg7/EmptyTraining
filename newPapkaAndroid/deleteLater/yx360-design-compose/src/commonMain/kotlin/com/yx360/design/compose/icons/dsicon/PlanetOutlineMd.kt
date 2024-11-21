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

public val DsIcon.PlanetOutlineMd: ImageVector
    get() {
        if (_planetOutlineMd != null) {
            return _planetOutlineMd!!
        }
        _planetOutlineMd = Builder(name = "PlanetOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 11.998f)
                curveTo(22.0f, 17.521f, 17.523f, 21.998f, 12.0f, 21.998f)
                curveTo(6.477f, 21.998f, 2.0f, 17.521f, 2.0f, 11.998f)
                curveTo(2.0f, 6.475f, 6.477f, 1.998f, 12.0f, 1.998f)
                curveTo(17.523f, 1.998f, 22.0f, 6.475f, 22.0f, 11.998f)
                close()
                moveTo(19.98f, 12.572f)
                curveTo(19.685f, 16.723f, 16.225f, 19.998f, 12.0f, 19.998f)
                curveTo(10.543f, 19.998f, 9.177f, 19.608f, 8.0f, 18.928f)
                verticalLineTo(18.349f)
                curveTo(8.0f, 18.122f, 7.923f, 17.901f, 7.781f, 17.724f)
                lineTo(6.0f, 15.498f)
                verticalLineTo(13.719f)
                curveTo(6.0f, 13.288f, 5.725f, 12.906f, 5.316f, 12.77f)
                lineTo(4.007f, 12.334f)
                curveTo(4.002f, 12.222f, 4.0f, 12.111f, 4.0f, 11.998f)
                curveTo(4.0f, 11.307f, 4.088f, 10.637f, 4.252f, 9.998f)
                horizontalLineTo(5.586f)
                curveTo(5.851f, 9.998f, 6.105f, 9.893f, 6.293f, 9.705f)
                lineTo(8.367f, 7.631f)
                curveTo(8.727f, 7.271f, 8.759f, 6.697f, 8.441f, 6.299f)
                lineTo(7.635f, 5.292f)
                curveTo(8.891f, 4.474f, 10.39f, 3.998f, 12.0f, 3.998f)
                curveTo(13.932f, 3.998f, 15.705f, 4.683f, 17.087f, 5.824f)
                lineTo(16.5f, 6.998f)
                horizontalLineTo(13.79f)
                curveTo(13.601f, 6.998f, 13.416f, 7.054f, 13.259f, 7.159f)
                curveTo(12.674f, 7.549f, 12.695f, 8.415f, 13.297f, 8.776f)
                lineTo(14.5f, 9.498f)
                lineTo(13.0f, 10.498f)
                lineTo(12.37f, 10.183f)
                curveTo(12.133f, 10.065f, 11.859f, 10.045f, 11.607f, 10.129f)
                lineTo(10.567f, 10.476f)
                curveTo(10.523f, 10.491f, 10.479f, 10.509f, 10.436f, 10.53f)
                lineTo(9.053f, 11.222f)
                curveTo(8.714f, 11.391f, 8.5f, 11.737f, 8.5f, 12.116f)
                verticalLineTo(13.217f)
                curveTo(8.5f, 13.676f, 8.812f, 14.076f, 9.257f, 14.187f)
                lineTo(10.5f, 14.498f)
                lineTo(11.665f, 17.215f)
                curveTo(11.858f, 17.666f, 12.35f, 17.91f, 12.826f, 17.791f)
                lineTo(13.44f, 17.638f)
                curveTo(13.786f, 17.551f, 14.061f, 17.286f, 14.159f, 16.943f)
                lineTo(14.962f, 14.133f)
                curveTo(14.987f, 14.043f, 15.0f, 13.951f, 15.0f, 13.858f)
                verticalLineTo(11.998f)
                lineTo(16.0f, 11.498f)
                lineTo(16.65f, 12.474f)
                curveTo(16.864f, 12.794f, 17.243f, 12.963f, 17.624f, 12.909f)
                lineTo(19.98f, 12.572f)
                close()
            }
        }
        .build()
        return _planetOutlineMd!!
    }

private var _planetOutlineMd: ImageVector? = null
