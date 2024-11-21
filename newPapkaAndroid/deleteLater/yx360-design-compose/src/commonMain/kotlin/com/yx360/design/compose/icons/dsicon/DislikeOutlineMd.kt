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

public val DsIcon.DislikeOutlineMd: ImageVector
    get() {
        if (_dislikeOutlineMd != null) {
            return _dislikeOutlineMd!!
        }
        _dislikeOutlineMd = Builder(name = "DislikeOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.09f, 16.003f)
                horizontalLineTo(8.75f)
                curveTo(8.578f, 16.994f, 8.491f, 17.997f, 8.49f, 19.002f)
                curveTo(8.49f, 21.471f, 9.64f, 23.0f, 11.49f, 23.0f)
                horizontalLineTo(13.49f)
                lineTo(13.63f, 22.19f)
                curveTo(14.187f, 19.354f, 15.112f, 16.602f, 16.38f, 14.005f)
                horizontalLineTo(20.5f)
                curveTo(21.61f, 14.005f, 22.5f, 11.506f, 22.5f, 8.497f)
                curveTo(22.5f, 5.489f, 21.61f, 3.0f, 20.5f, 3.0f)
                horizontalLineTo(15.5f)
                curveTo(15.27f, 3.0f, 15.04f, 3.26f, 14.83f, 3.65f)
                curveTo(13.771f, 3.224f, 12.641f, 3.004f, 11.5f, 3.0f)
                horizontalLineTo(9.5f)
                curveTo(6.82f, 3.0f, 4.79f, 4.409f, 4.21f, 6.628f)
                curveTo(3.615f, 7.13f, 3.177f, 7.793f, 2.948f, 8.538f)
                curveTo(2.719f, 9.282f, 2.709f, 10.076f, 2.92f, 10.826f)
                curveTo(2.334f, 11.582f, 2.011f, 12.509f, 2.0f, 13.465f)
                curveTo(2.0f, 15.144f, 2.94f, 16.003f, 4.09f, 16.003f)
                close()
                moveTo(19.91f, 5.009f)
                curveTo(20.34f, 6.124f, 20.54f, 7.313f, 20.5f, 8.507f)
                curveTo(20.539f, 9.701f, 20.339f, 10.891f, 19.91f, 12.005f)
                horizontalLineTo(16.91f)
                curveTo(17.337f, 10.89f, 17.538f, 9.701f, 17.5f, 8.507f)
                curveTo(17.537f, 7.313f, 17.333f, 6.123f, 16.9f, 5.009f)
                horizontalLineTo(19.91f)
                close()
                moveTo(4.75f, 11.686f)
                lineTo(5.17f, 11.176f)
                lineTo(4.9f, 10.556f)
                curveTo(4.723f, 10.099f, 4.711f, 9.594f, 4.866f, 9.129f)
                curveTo(5.022f, 8.664f, 5.334f, 8.267f, 5.75f, 8.007f)
                lineTo(6.07f, 7.768f)
                lineTo(6.14f, 7.378f)
                curveTo(6.45f, 5.639f, 8.14f, 5.019f, 9.54f, 5.019f)
                horizontalLineTo(11.54f)
                curveTo(12.869f, 4.987f, 14.173f, 5.383f, 15.26f, 6.148f)
                curveTo(15.453f, 6.923f, 15.547f, 7.719f, 15.54f, 8.517f)
                curveTo(15.587f, 10.091f, 15.28f, 11.656f, 14.64f, 13.095f)
                curveTo(13.401f, 15.612f, 12.462f, 18.266f, 11.84f, 21.001f)
                horizontalLineTo(11.5f)
                curveTo(10.68f, 21.001f, 10.5f, 19.912f, 10.5f, 19.002f)
                curveTo(10.497f, 17.736f, 10.648f, 16.474f, 10.95f, 15.244f)
                curveTo(11.13f, 14.554f, 11.04f, 14.005f, 9.95f, 14.005f)
                horizontalLineTo(4.04f)
                curveTo(3.946f, 13.59f, 3.962f, 13.157f, 4.086f, 12.751f)
                curveTo(4.211f, 12.344f, 4.44f, 11.977f, 4.75f, 11.686f)
                close()
            }
        }
        .build()
        return _dislikeOutlineMd!!
    }

private var _dislikeOutlineMd: ImageVector? = null
