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

public val DsIcon.StreamBlockedOutlineMd: ImageVector
    get() {
        if (_streamBlockedOutlineMd != null) {
            return _streamBlockedOutlineMd!!
        }
        _streamBlockedOutlineMd = Builder(name = "StreamBlockedOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                curveTo(23.0f, 17.071f, 20.788f, 20.626f, 17.501f, 22.528f)
                lineTo(16.501f, 20.795f)
                curveTo(19.19f, 19.239f, 21.0f, 16.331f, 21.0f, 13.0f)
                curveTo(21.0f, 8.029f, 16.971f, 4.0f, 12.0f, 4.0f)
                curveTo(7.029f, 4.0f, 3.0f, 8.029f, 3.0f, 13.0f)
                curveTo(3.0f, 16.331f, 4.81f, 19.239f, 7.499f, 20.795f)
                lineTo(6.499f, 22.528f)
                curveTo(3.212f, 20.626f, 1.0f, 17.071f, 1.0f, 13.0f)
                curveTo(1.0f, 6.925f, 5.925f, 2.0f, 12.0f, 2.0f)
                curveTo(18.075f, 2.0f, 23.0f, 6.925f, 23.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(19.0f, 15.591f, 17.593f, 17.853f, 15.501f, 19.063f)
                lineTo(14.5f, 17.331f)
                curveTo(15.995f, 16.466f, 17.0f, 14.851f, 17.0f, 13.0f)
                curveTo(17.0f, 10.239f, 14.761f, 8.0f, 12.0f, 8.0f)
                curveTo(9.239f, 8.0f, 7.0f, 10.239f, 7.0f, 13.0f)
                curveTo(7.0f, 14.851f, 8.005f, 16.466f, 9.5f, 17.331f)
                lineTo(8.499f, 19.063f)
                curveTo(6.407f, 17.853f, 5.0f, 15.591f, 5.0f, 13.0f)
                curveTo(5.0f, 9.134f, 8.134f, 6.0f, 12.0f, 6.0f)
                curveTo(15.866f, 6.0f, 19.0f, 9.134f, 19.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.001f, 12.402f)
                verticalLineTo(11.289f)
                curveTo(10.001f, 10.186f, 10.896f, 9.292f, 11.999f, 9.292f)
                curveTo(13.102f, 9.292f, 13.996f, 10.186f, 13.996f, 11.289f)
                verticalLineTo(12.401f)
                curveTo(14.541f, 12.41f, 14.98f, 12.854f, 14.98f, 13.401f)
                verticalLineTo(14.968f)
                curveTo(14.98f, 15.52f, 14.533f, 15.968f, 13.98f, 15.968f)
                horizontalLineTo(10.039f)
                curveTo(9.486f, 15.968f, 9.039f, 15.52f, 9.039f, 14.968f)
                verticalLineTo(13.401f)
                curveTo(9.039f, 12.862f, 9.466f, 12.422f, 10.001f, 12.402f)
                close()
                moveTo(12.496f, 12.401f)
                horizontalLineTo(11.501f)
                verticalLineTo(11.289f)
                curveTo(11.501f, 11.014f, 11.724f, 10.792f, 11.999f, 10.792f)
                curveTo(12.274f, 10.792f, 12.496f, 11.014f, 12.496f, 11.289f)
                verticalLineTo(12.401f)
                close()
            }
        }
        .build()
        return _streamBlockedOutlineMd!!
    }

private var _streamBlockedOutlineMd: ImageVector? = null
