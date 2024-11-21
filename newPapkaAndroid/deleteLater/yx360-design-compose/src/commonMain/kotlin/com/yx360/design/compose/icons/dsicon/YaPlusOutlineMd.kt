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

public val DsIcon.YaPlusOutlineMd: ImageVector
    get() {
        if (_yaPlusOutlineMd != null) {
            return _yaPlusOutlineMd!!
        }
        _yaPlusOutlineMd = Builder(name = "YaPlusOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.99f, 22.0f, 11.98f, 22.0f, 11.969f)
                curveTo(22.0f, 11.937f, 22.0f, 11.903f, 21.999f, 11.871f)
                curveTo(21.997f, 11.656f, 21.987f, 11.444f, 21.971f, 11.233f)
                curveTo(21.939f, 10.814f, 21.882f, 10.403f, 21.8f, 10.0f)
                curveTo(21.163f, 6.863f, 19.059f, 4.26f, 16.234f, 2.938f)
                curveTo(15.578f, 2.631f, 14.884f, 2.393f, 14.16f, 2.234f)
                curveTo(13.464f, 2.081f, 12.741f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.743f, 4.19f)
                curveTo(13.182f, 4.066f, 12.598f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 12.0f, 20.0f, 12.0f, 20.0f, 12.0f)
                lineTo(14.301f, 12.0f)
                lineTo(13.227f, 17.036f)
                horizontalLineTo(11.003f)
                lineTo(12.077f, 12.0f)
                lineTo(7.077f, 12.0f)
                lineTo(7.5f, 10.0f)
                horizontalLineTo(12.503f)
                lineTo(13.743f, 4.19f)
                close()
                moveTo(15.803f, 4.96f)
                lineTo(14.728f, 10.0f)
                horizontalLineTo(19.748f)
                curveTo(19.188f, 7.824f, 17.735f, 6.006f, 15.803f, 4.96f)
                close()
            }
        }
        .build()
        return _yaPlusOutlineMd!!
    }

private var _yaPlusOutlineMd: ImageVector? = null
