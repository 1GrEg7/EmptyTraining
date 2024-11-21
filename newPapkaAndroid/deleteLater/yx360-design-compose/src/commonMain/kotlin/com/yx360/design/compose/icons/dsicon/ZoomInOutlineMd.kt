package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
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

public val DsIcon.ZoomInOutlineMd: ImageVector
    get() {
        if (_zoomInOutlineMd != null) {
            return _zoomInOutlineMd!!
        }
        _zoomInOutlineMd = Builder(name = "ZoomInOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.563f, 14.5f)
                verticalLineTo(11.461f)
                horizontalLineTo(6.5f)
                verticalLineTo(9.461f)
                lineTo(9.563f, 9.461f)
                verticalLineTo(6.5f)
                horizontalLineTo(11.563f)
                verticalLineTo(9.461f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.461f)
                horizontalLineTo(11.563f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.563f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 19.0f)
                curveTo(12.487f, 19.0f, 14.315f, 18.318f, 15.762f, 17.176f)
                lineTo(20.589f, 22.003f)
                lineTo(22.003f, 20.589f)
                lineTo(17.176f, 15.762f)
                curveTo(18.318f, 14.314f, 19.0f, 12.487f, 19.0f, 10.5f)
                curveTo(19.0f, 5.806f, 15.194f, 2.0f, 10.5f, 2.0f)
                curveTo(5.806f, 2.0f, 2.0f, 5.806f, 2.0f, 10.5f)
                curveTo(2.0f, 15.194f, 5.806f, 19.0f, 10.5f, 19.0f)
                close()
                moveTo(10.5f, 17.0f)
                curveTo(14.09f, 17.0f, 17.0f, 14.09f, 17.0f, 10.5f)
                curveTo(17.0f, 6.91f, 14.09f, 4.0f, 10.5f, 4.0f)
                curveTo(6.91f, 4.0f, 4.0f, 6.91f, 4.0f, 10.5f)
                curveTo(4.0f, 14.09f, 6.91f, 17.0f, 10.5f, 17.0f)
                close()
            }
        }
        .build()
        return _zoomInOutlineMd!!
    }

private var _zoomInOutlineMd: ImageVector? = null
