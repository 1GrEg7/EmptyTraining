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

public val DsIcon.YaMessengerSolidLg: ImageVector
    get() {
        if (_yaMessengerSolidLg != null) {
            return _yaMessengerSolidLg!!
        }
        _yaMessengerSolidLg = Builder(name = "YaMessengerSolidLg", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.194f, 7.772f)
                curveTo(5.086f, 7.503f, 4.386f, 7.456f, 3.926f, 7.734f)
                curveTo(3.513f, 7.983f, 3.203f, 8.374f, 3.056f, 8.834f)
                curveTo(2.784f, 9.679f, 3.523f, 10.957f, 5.003f, 13.512f)
                lineTo(6.194f, 15.571f)
                lineTo(5.003f, 17.629f)
                curveTo(3.523f, 20.185f, 2.784f, 21.462f, 3.056f, 22.308f)
                curveTo(3.203f, 22.768f, 3.513f, 23.158f, 3.926f, 23.408f)
                curveTo(4.386f, 23.686f, 5.086f, 23.639f, 6.194f, 23.37f)
                verticalLineTo(23.77f)
                curveTo(6.194f, 25.871f, 6.194f, 26.921f, 6.702f, 27.49f)
                curveTo(6.981f, 27.803f, 7.352f, 28.021f, 7.762f, 28.111f)
                curveTo(8.506f, 28.276f, 9.423f, 27.763f, 11.256f, 26.736f)
                lineTo(25.897f, 18.537f)
                curveTo(27.804f, 17.469f, 28.757f, 16.935f, 29.001f, 16.196f)
                curveTo(29.135f, 15.79f, 29.135f, 15.352f, 29.001f, 14.945f)
                curveTo(28.757f, 14.206f, 27.804f, 13.672f, 25.897f, 12.604f)
                lineTo(11.256f, 4.405f)
                curveTo(9.423f, 3.379f, 8.506f, 2.865f, 7.762f, 3.03f)
                curveTo(7.352f, 3.121f, 6.981f, 3.338f, 6.702f, 3.652f)
                curveTo(6.194f, 4.221f, 6.194f, 5.271f, 6.194f, 7.372f)
                verticalLineTo(7.772f)
                close()
                moveTo(8.194f, 8.333f)
                lineTo(25.194f, 14.071f)
                lineTo(10.278f, 6.15f)
                curveTo(9.322f, 5.614f, 8.744f, 5.294f, 8.313f, 5.11f)
                curveTo(8.292f, 5.101f, 8.273f, 5.092f, 8.254f, 5.085f)
                curveTo(8.251f, 5.105f, 8.249f, 5.126f, 8.247f, 5.149f)
                curveTo(8.197f, 5.614f, 8.194f, 6.275f, 8.194f, 7.372f)
                verticalLineTo(8.333f)
                close()
                moveTo(6.734f, 18.631f)
                lineTo(8.505f, 15.571f)
                lineTo(25.694f, 15.571f)
                curveTo(25.694f, 15.571f, 22.186f, 16.5f, 20.823f, 16.911f)
                lineTo(8.284f, 20.693f)
                curveTo(6.864f, 21.121f, 5.938f, 21.397f, 5.27f, 21.527f)
                curveTo(5.225f, 21.535f, 5.183f, 21.543f, 5.144f, 21.55f)
                curveTo(5.159f, 21.513f, 5.177f, 21.474f, 5.195f, 21.432f)
                curveTo(5.479f, 20.802f, 5.971f, 19.949f, 6.734f, 18.631f)
                close()
            }
        }
        .build()
        return _yaMessengerSolidLg!!
    }

private var _yaMessengerSolidLg: ImageVector? = null
