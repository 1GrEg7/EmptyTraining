package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.StreamPlayOutlineMd: ImageVector
    get() {
        if (_streamPlayOutlineMd != null) {
            return _streamPlayOutlineMd!!
        }
        _streamPlayOutlineMd = Builder(name = "StreamPlayOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.501f, 22.528f)
                curveTo(20.788f, 20.626f, 23.0f, 17.071f, 23.0f, 13.0f)
                curveTo(23.0f, 6.925f, 18.075f, 2.0f, 12.0f, 2.0f)
                curveTo(5.925f, 2.0f, 1.0f, 6.925f, 1.0f, 13.0f)
                curveTo(1.0f, 17.071f, 3.212f, 20.626f, 6.499f, 22.528f)
                lineTo(7.499f, 20.795f)
                curveTo(4.81f, 19.239f, 3.0f, 16.331f, 3.0f, 13.0f)
                curveTo(3.0f, 8.029f, 7.029f, 4.0f, 12.0f, 4.0f)
                curveTo(16.971f, 4.0f, 21.0f, 8.029f, 21.0f, 13.0f)
                curveTo(21.0f, 16.331f, 19.19f, 19.239f, 16.501f, 20.795f)
                lineTo(17.501f, 22.528f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.501f, 19.063f)
                curveTo(17.593f, 17.853f, 19.0f, 15.591f, 19.0f, 13.0f)
                curveTo(19.0f, 9.134f, 15.866f, 6.0f, 12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 9.134f, 5.0f, 13.0f)
                curveTo(5.0f, 15.591f, 6.407f, 17.853f, 8.499f, 19.063f)
                lineTo(9.5f, 17.331f)
                curveTo(8.005f, 16.466f, 7.0f, 14.851f, 7.0f, 13.0f)
                curveTo(7.0f, 10.239f, 9.239f, 8.0f, 12.0f, 8.0f)
                curveTo(14.761f, 8.0f, 17.0f, 10.239f, 17.0f, 13.0f)
                curveTo(17.0f, 14.851f, 15.995f, 16.466f, 14.5f, 17.331f)
                lineTo(15.501f, 19.063f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.304f, 15.872f)
                lineTo(14.565f, 13.821f)
                curveTo(15.145f, 13.456f, 15.145f, 12.544f, 14.565f, 12.179f)
                lineTo(11.304f, 10.128f)
                curveTo(10.725f, 9.764f, 10.0f, 10.219f, 10.0f, 10.949f)
                verticalLineTo(15.051f)
                curveTo(10.0f, 15.781f, 10.725f, 16.236f, 11.304f, 15.872f)
                close()
            }
        }
        .build()
        return _streamPlayOutlineMd!!
    }

private var _streamPlayOutlineMd: ImageVector? = null
