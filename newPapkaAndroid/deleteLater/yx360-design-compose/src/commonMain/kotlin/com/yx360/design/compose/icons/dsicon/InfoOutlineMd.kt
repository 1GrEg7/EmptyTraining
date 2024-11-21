package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.InfoOutlineMd: ImageVector
    get() {
        if (_infoOutlineMd != null) {
            return _infoOutlineMd!!
        }
        _infoOutlineMd = Builder(name = "InfoOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.462f, 17.504f)
                curveTo(10.437f, 17.504f, 10.1f, 16.876f, 10.1f, 16.295f)
                curveTo(10.1f, 16.05f, 10.177f, 15.683f, 10.238f, 15.469f)
                lineTo(11.309f, 10.857f)
                horizontalLineTo(10.055f)
                curveTo(9.894f, 10.857f, 9.775f, 10.707f, 9.812f, 10.55f)
                lineTo(9.888f, 10.225f)
                curveTo(9.919f, 10.089f, 10.03f, 9.984f, 10.168f, 9.96f)
                lineTo(13.005f, 9.459f)
                curveTo(13.36f, 9.397f, 13.663f, 9.718f, 13.579f, 10.068f)
                lineTo(12.141f, 16.05f)
                curveTo(12.12f, 16.139f, 12.165f, 16.23f, 12.248f, 16.267f)
                curveTo(12.326f, 16.302f, 12.417f, 16.28f, 12.471f, 16.214f)
                lineTo(13.636f, 14.789f)
                curveTo(13.74f, 14.662f, 13.922f, 14.633f, 14.06f, 14.722f)
                curveTo(14.212f, 14.821f, 14.253f, 15.026f, 14.15f, 15.175f)
                lineTo(13.451f, 16.188f)
                curveTo(12.716f, 17.259f, 12.043f, 17.504f, 11.462f, 17.504f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8f, 7.642f)
                curveTo(11.8f, 8.147f, 12.198f, 8.575f, 12.901f, 8.575f)
                curveTo(13.59f, 8.575f, 14.095f, 8.193f, 14.248f, 7.581f)
                curveTo(14.278f, 7.458f, 14.294f, 7.32f, 14.294f, 7.213f)
                curveTo(14.294f, 6.708f, 13.896f, 6.28f, 13.192f, 6.28f)
                curveTo(12.519f, 6.28f, 11.999f, 6.662f, 11.846f, 7.274f)
                curveTo(11.815f, 7.397f, 11.8f, 7.535f, 11.8f, 7.642f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _infoOutlineMd!!
    }

private var _infoOutlineMd: ImageVector? = null
