package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.FilterOutlineSm: ImageVector
    get() {
        if (_filterOutlineSm != null) {
            return _filterOutlineSm!!
        }
        _filterOutlineSm = Builder(name = "FilterOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 0.0f)
                    horizontalLineTo(10.0f)
                    curveTo(8.343f, 0.0f, 7.0f, 1.343f, 7.0f, 3.0f)
                    lineTo(0.0f, 3.0f)
                    verticalLineTo(5.0f)
                    lineTo(7.0f, 5.0f)
                    curveTo(7.0f, 6.657f, 8.343f, 8.0f, 10.0f, 8.0f)
                    horizontalLineTo(12.0f)
                    curveTo(13.657f, 8.0f, 15.0f, 6.657f, 15.0f, 5.0f)
                    lineTo(16.0f, 5.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.0f, 1.343f, 13.657f, 0.0f, 12.0f, 0.0f)
                    close()
                    moveTo(9.0f, 5.0f)
                    verticalLineTo(3.0f)
                    lineTo(9.0f, 2.994f)
                    curveTo(9.003f, 2.444f, 9.45f, 2.0f, 10.0f, 2.0f)
                    lineTo(12.0f, 2.0f)
                    curveTo(12.069f, 2.0f, 12.136f, 2.007f, 12.201f, 2.02f)
                    curveTo(12.657f, 2.114f, 13.0f, 2.517f, 13.0f, 3.0f)
                    verticalLineTo(5.0f)
                    curveTo(13.0f, 5.552f, 12.552f, 6.0f, 12.0f, 6.0f)
                    lineTo(10.0f, 6.0f)
                    curveTo(9.448f, 6.0f, 9.0f, 5.552f, 9.0f, 5.0f)
                    close()
                    moveTo(4.0f, 16.0f)
                    horizontalLineTo(6.0f)
                    curveTo(7.657f, 16.0f, 9.0f, 14.657f, 9.0f, 13.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.0f)
                    lineTo(9.0f, 11.0f)
                    curveTo(9.0f, 9.343f, 7.657f, 8.0f, 6.0f, 8.0f)
                    horizontalLineTo(4.0f)
                    curveTo(2.343f, 8.0f, 1.0f, 9.343f, 1.0f, 11.0f)
                    lineTo(0.0f, 11.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(1.0f)
                    curveTo(1.0f, 14.657f, 2.343f, 16.0f, 4.0f, 16.0f)
                    close()
                    moveTo(7.0f, 11.0f)
                    verticalLineTo(13.0f)
                    lineTo(7.0f, 13.007f)
                    curveTo(6.997f, 13.556f, 6.55f, 14.0f, 6.0f, 14.0f)
                    horizontalLineTo(4.0f)
                    curveTo(3.931f, 14.0f, 3.864f, 13.993f, 3.798f, 13.98f)
                    curveTo(3.343f, 13.886f, 3.0f, 13.483f, 3.0f, 13.0f)
                    lineTo(3.0f, 11.0f)
                    curveTo(3.0f, 10.448f, 3.448f, 10.0f, 4.0f, 10.0f)
                    horizontalLineTo(6.0f)
                    curveTo(6.552f, 10.0f, 7.0f, 10.448f, 7.0f, 11.0f)
                    close()
                }
            }
        }
        .build()
        return _filterOutlineSm!!
    }

private var _filterOutlineSm: ImageVector? = null
