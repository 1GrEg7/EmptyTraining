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

public val DsIcon.LikeOutlineSm: ImageVector
    get() {
        if (_likeOutlineSm != null) {
            return _likeOutlineSm!!
        }
        _likeOutlineSm = Builder(name = "LikeOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 0.002f)
                horizontalLineTo(7.0f)
                curveTo(6.668f, 2.0f, 5.758f, 5.424f, 4.929f, 6.999f)
                lineTo(1.5f, 6.999f)
                curveTo(0.672f, 6.999f, 0.0f, 8.79f, 0.0f, 10.999f)
                curveTo(0.0f, 13.208f, 0.672f, 14.999f, 1.5f, 14.999f)
                lineTo(6.0f, 14.999f)
                lineTo(6.449f, 14.551f)
                curveTo(6.922f, 14.8f, 7.467f, 14.996f, 8.015f, 14.996f)
                curveTo(8.015f, 14.996f, 8.0f, 15.0f, 9.0f, 15.0f)
                curveTo(10.0f, 15.0f, 10.726f, 15.007f, 11.644f, 14.672f)
                curveTo(12.608f, 14.321f, 13.578f, 13.608f, 14.0f, 12.274f)
                curveTo(15.03f, 11.399f, 15.148f, 10.564f, 15.0f, 9.3f)
                curveTo(15.466f, 8.705f, 16.0f, 7.999f, 16.0f, 6.999f)
                curveTo(16.0f, 6.721f, 16.0f, 6.581f, 15.984f, 6.464f)
                curveTo(15.879f, 5.712f, 15.287f, 5.121f, 14.535f, 5.016f)
                curveTo(14.418f, 4.999f, 14.279f, 4.999f, 14.0f, 4.999f)
                lineTo(11.352f, 4.999f)
                curveTo(11.429f, 4.434f, 11.5f, 3.716f, 11.5f, 2.99f)
                curveTo(11.5f, 2.019f, 11.02f, 1.166f, 10.242f, 0.617f)
                curveTo(9.543f, 0.123f, 8.636f, 0.002f, 7.75f, 0.002f)
                close()
                moveTo(6.044f, 11.967f)
                curveTo(6.615f, 12.407f, 7.557f, 12.999f, 8.5f, 12.999f)
                curveTo(8.869f, 12.999f, 9.146f, 13.006f, 9.366f, 13.011f)
                curveTo(10.002f, 13.011f, 10.307f, 13.031f, 10.96f, 12.793f)
                curveTo(11.762f, 12.501f, 12.226f, 11.967f, 12.226f, 11.115f)
                curveTo(13.119f, 10.593f, 13.328f, 9.726f, 12.999f, 8.739f)
                curveTo(13.568f, 8.323f, 14.0f, 7.608f, 14.0f, 6.999f)
                lineTo(10.587f, 6.999f)
                curveTo(9.987f, 6.999f, 9.687f, 6.999f, 9.495f, 6.867f)
                curveTo(9.384f, 6.79f, 9.304f, 6.697f, 9.245f, 6.575f)
                curveTo(9.144f, 6.365f, 9.192f, 6.056f, 9.287f, 5.439f)
                curveTo(9.31f, 5.296f, 9.332f, 5.15f, 9.354f, 4.999f)
                curveTo(9.366f, 4.918f, 9.381f, 4.824f, 9.399f, 4.721f)
                curveTo(9.56f, 3.76f, 9.855f, 2.0f, 8.5f, 2.0f)
                curveTo(8.077f, 4.367f, 6.317f, 8.544f, 6.317f, 8.544f)
                curveTo(6.275f, 8.688f, 6.235f, 8.84f, 6.201f, 8.999f)
                curveTo(6.073f, 9.588f, 6.0f, 10.271f, 6.0f, 10.999f)
                curveTo(6.0f, 11.333f, 6.015f, 11.657f, 6.044f, 11.967f)
                close()
                moveTo(4.0f, 10.999f)
                curveTo(4.0f, 11.686f, 4.055f, 12.364f, 4.164f, 12.999f)
                lineTo(2.268f, 12.999f)
                curveTo(2.12f, 12.544f, 2.0f, 11.845f, 2.0f, 10.999f)
                curveTo(2.0f, 10.153f, 2.12f, 9.455f, 2.268f, 8.999f)
                lineTo(4.164f, 8.999f)
                curveTo(4.055f, 9.635f, 4.0f, 10.312f, 4.0f, 10.999f)
                close()
            }
        }
        .build()
        return _likeOutlineSm!!
    }

private var _likeOutlineSm: ImageVector? = null
