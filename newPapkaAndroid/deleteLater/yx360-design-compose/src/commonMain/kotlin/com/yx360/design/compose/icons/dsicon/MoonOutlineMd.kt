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

public val DsIcon.MoonOutlineMd: ImageVector
    get() {
        if (_moonOutlineMd != null) {
            return _moonOutlineMd!!
        }
        _moonOutlineMd = Builder(name = "MoonOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.092f, 15.113f)
                curveTo(20.42f, 15.321f, 19.721f, 15.426f, 19.018f, 15.424f)
                curveTo(17.799f, 15.429f, 16.599f, 15.114f, 15.538f, 14.509f)
                curveTo(14.478f, 13.904f, 13.594f, 13.03f, 12.974f, 11.975f)
                curveTo(12.203f, 10.585f, 11.918f, 8.974f, 12.166f, 7.402f)
                curveTo(12.413f, 5.83f, 13.179f, 4.386f, 14.34f, 3.304f)
                curveTo(14.131f, 2.682f, 14.111f, 2.612f, 13.901f, 2.001f)
                curveTo(13.582f, 2.001f, 13.273f, 2.001f, 12.954f, 2.001f)
                curveTo(11.214f, 1.983f, 9.5f, 2.429f, 7.987f, 3.294f)
                curveTo(6.08f, 4.4f, 4.591f, 6.109f, 3.753f, 8.155f)
                curveTo(2.914f, 10.201f, 2.772f, 12.468f, 3.349f, 14.604f)
                curveTo(3.926f, 16.739f, 5.19f, 18.622f, 6.944f, 19.96f)
                curveTo(8.697f, 21.298f, 10.842f, 22.015f, 13.044f, 22.0f)
                curveTo(14.735f, 22.003f, 16.399f, 21.565f, 17.871f, 20.727f)
                curveTo(19.688f, 19.683f, 21.133f, 18.09f, 22.0f, 16.175f)
                lineTo(21.092f, 15.113f)
                close()
                moveTo(16.883f, 18.992f)
                curveTo(15.711f, 19.655f, 14.388f, 20.0f, 13.044f, 19.995f)
                curveTo(11.831f, 19.998f, 10.633f, 19.724f, 9.542f, 19.193f)
                curveTo(8.45f, 18.661f, 7.493f, 17.887f, 6.744f, 16.928f)
                curveTo(5.995f, 15.969f, 5.474f, 14.852f, 5.219f, 13.66f)
                curveTo(4.964f, 12.468f, 4.983f, 11.234f, 5.274f, 10.05f)
                curveTo(5.522f, 9.005f, 5.979f, 8.02f, 6.617f, 7.157f)
                curveTo(7.255f, 6.294f, 8.06f, 5.569f, 8.984f, 5.028f)
                curveTo(9.67f, 4.625f, 10.414f, 4.331f, 11.188f, 4.156f)
                curveTo(10.445f, 5.506f, 10.056f, 7.024f, 10.056f, 8.567f)
                curveTo(10.056f, 10.11f, 10.445f, 11.627f, 11.188f, 12.977f)
                curveTo(11.964f, 14.304f, 13.063f, 15.409f, 14.383f, 16.188f)
                curveTo(15.703f, 16.967f, 17.198f, 17.394f, 18.729f, 17.428f)
                curveTo(18.199f, 18.044f, 17.576f, 18.572f, 16.883f, 18.992f)
                close()
            }
        }
        .build()
        return _moonOutlineMd!!
    }

private var _moonOutlineMd: ImageVector? = null
