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

public val DsIcon.ZoomInOutlineSm: ImageVector
    get() {
        if (_zoomInOutlineSm != null) {
            return _zoomInOutlineSm!!
        }
        _zoomInOutlineSm = Builder(name = "ZoomInOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 10.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 7.5f)
                curveTo(1.0f, 3.91f, 3.91f, 1.0f, 7.5f, 1.0f)
                curveTo(11.09f, 1.0f, 14.0f, 3.91f, 14.0f, 7.5f)
                curveTo(14.0f, 8.934f, 13.536f, 10.26f, 12.749f, 11.335f)
                lineTo(15.707f, 14.293f)
                lineTo(14.293f, 15.707f)
                lineTo(11.335f, 12.749f)
                curveTo(10.26f, 13.536f, 8.934f, 14.0f, 7.5f, 14.0f)
                curveTo(3.91f, 14.0f, 1.0f, 11.09f, 1.0f, 7.5f)
                close()
                moveTo(7.5f, 3.0f)
                curveTo(5.015f, 3.0f, 3.0f, 5.015f, 3.0f, 7.5f)
                curveTo(3.0f, 9.985f, 5.015f, 12.0f, 7.5f, 12.0f)
                curveTo(9.985f, 12.0f, 12.0f, 9.985f, 12.0f, 7.5f)
                curveTo(12.0f, 5.015f, 9.985f, 3.0f, 7.5f, 3.0f)
                close()
            }
        }
        .build()
        return _zoomInOutlineSm!!
    }

private var _zoomInOutlineSm: ImageVector? = null
