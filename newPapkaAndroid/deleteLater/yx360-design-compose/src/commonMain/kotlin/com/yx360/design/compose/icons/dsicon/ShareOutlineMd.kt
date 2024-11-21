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

public val DsIcon.ShareOutlineMd: ImageVector
    get() {
        if (_shareOutlineMd != null) {
            return _shareOutlineMd!!
        }
        _shareOutlineMd = Builder(name = "ShareOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 16.162f)
                curveTo(11.662f, 16.056f, 12.331f, 16.001f, 13.0f, 16.001f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                lineTo(23.5f, 12.0f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.027f)
                curveTo(8.17f, 8.805f, 3.859f, 12.095f, 2.348f, 17.751f)
                curveTo(2.327f, 17.83f, 2.307f, 17.913f, 2.288f, 18.0f)
                curveTo(2.254f, 18.151f, 2.224f, 18.311f, 2.195f, 18.477f)
                curveTo(2.185f, 18.539f, 2.175f, 18.602f, 2.165f, 18.665f)
                curveTo(2.097f, 19.101f, 2.044f, 19.568f, 2.0f, 20.0f)
                horizontalLineTo(3.5f)
                curveTo(3.686f, 19.814f, 3.877f, 19.634f, 4.073f, 19.46f)
                curveTo(6.015f, 17.735f, 8.456f, 16.569f, 11.0f, 16.162f)
                close()
                moveTo(4.977f, 16.311f)
                curveTo(7.381f, 14.837f, 10.179f, 14.001f, 13.0f, 14.001f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.672f)
                lineTo(20.672f, 12.0f)
                lineTo(15.0f, 6.328f)
                verticalLineTo(9.731f)
                lineTo(13.318f, 10.002f)
                curveTo(9.797f, 10.569f, 6.627f, 12.679f, 4.977f, 16.311f)
                close()
            }
        }
        .build()
        return _shareOutlineMd!!
    }

private var _shareOutlineMd: ImageVector? = null
