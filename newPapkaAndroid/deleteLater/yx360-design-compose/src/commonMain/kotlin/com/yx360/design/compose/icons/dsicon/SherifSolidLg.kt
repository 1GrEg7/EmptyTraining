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

public val DsIcon.SherifSolidLg: ImageVector
    get() {
        if (_sherifSolidLg != null) {
            return _sherifSolidLg!!
        }
        _sherifSolidLg = Builder(name = "SherifSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.163f, 6.065f)
                curveTo(13.854f, 5.315f, 14.865f, 4.163f, 15.098f, 3.0f)
                horizontalLineTo(16.949f)
                curveTo(17.183f, 4.167f, 18.187f, 5.318f, 19.863f, 6.065f)
                curveTo(21.521f, 6.805f, 23.74f, 7.094f, 26.15f, 6.586f)
                lineTo(27.0f, 8.164f)
                curveTo(26.504f, 8.631f, 25.438f, 10.263f, 25.778f, 12.207f)
                curveTo(25.81f, 12.396f, 25.889f, 12.67f, 25.986f, 13.016f)
                curveTo(26.563f, 15.046f, 27.837f, 19.526f, 24.753f, 23.483f)
                curveTo(22.594f, 26.252f, 18.793f, 27.992f, 16.325f, 28.884f)
                lineTo(16.004f, 29.0f)
                lineTo(15.682f, 28.886f)
                curveTo(13.256f, 28.031f, 9.406f, 26.252f, 7.247f, 23.483f)
                curveTo(4.163f, 19.527f, 5.436f, 15.046f, 6.013f, 13.016f)
                curveTo(6.111f, 12.671f, 6.189f, 12.396f, 6.222f, 12.208f)
                curveTo(6.562f, 10.263f, 5.496f, 8.632f, 5.0f, 8.164f)
                lineTo(5.85f, 6.586f)
                curveTo(8.26f, 7.094f, 10.491f, 6.805f, 12.163f, 6.065f)
                close()
                moveTo(18.028f, 13.419f)
                lineTo(16.0f, 9.915f)
                lineTo(13.973f, 13.419f)
                lineTo(9.959f, 14.233f)
                lineTo(12.72f, 17.212f)
                lineTo(12.266f, 21.219f)
                lineTo(16.0f, 19.557f)
                lineTo(19.734f, 21.219f)
                lineTo(19.281f, 17.212f)
                lineTo(22.042f, 14.233f)
                lineTo(18.028f, 13.419f)
                close()
            }
        }
        .build()
        return _sherifSolidLg!!
    }

private var _sherifSolidLg: ImageVector? = null
