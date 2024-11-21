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

public val DsIcon.SuperellipseOutlineSm: ImageVector
    get() {
        if (_superellipseOutlineSm != null) {
            return _superellipseOutlineSm!!
        }
        _superellipseOutlineSm = Builder(name = "SuperellipseOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.879f, 13.939f)
                    curveTo(5.612f, 13.998f, 6.567f, 14.0f, 8.0f, 14.0f)
                    curveTo(9.433f, 14.0f, 10.388f, 13.998f, 11.121f, 13.939f)
                    curveTo(11.831f, 13.88f, 12.156f, 13.778f, 12.362f, 13.673f)
                    curveTo(12.927f, 13.385f, 13.385f, 12.927f, 13.673f, 12.362f)
                    curveTo(13.778f, 12.156f, 13.88f, 11.831f, 13.939f, 11.121f)
                    curveTo(13.998f, 10.388f, 14.0f, 9.433f, 14.0f, 8.0f)
                    curveTo(14.0f, 6.567f, 13.998f, 5.612f, 13.939f, 4.879f)
                    curveTo(13.88f, 4.169f, 13.778f, 3.844f, 13.673f, 3.638f)
                    curveTo(13.385f, 3.074f, 12.927f, 2.615f, 12.362f, 2.327f)
                    curveTo(12.156f, 2.222f, 11.831f, 2.119f, 11.121f, 2.061f)
                    curveTo(10.388f, 2.002f, 9.433f, 2.0f, 8.0f, 2.0f)
                    curveTo(6.567f, 2.0f, 5.612f, 2.002f, 4.879f, 2.061f)
                    curveTo(4.169f, 2.119f, 3.844f, 2.222f, 3.638f, 2.327f)
                    curveTo(3.074f, 2.615f, 2.615f, 3.074f, 2.327f, 3.638f)
                    curveTo(2.222f, 3.844f, 2.119f, 4.169f, 2.061f, 4.879f)
                    curveTo(2.002f, 5.612f, 2.0f, 6.567f, 2.0f, 8.0f)
                    curveTo(2.0f, 9.433f, 2.002f, 10.388f, 2.061f, 11.121f)
                    curveTo(2.119f, 11.831f, 2.222f, 12.156f, 2.327f, 12.362f)
                    curveTo(2.615f, 12.927f, 3.074f, 13.385f, 3.638f, 13.673f)
                    curveTo(3.844f, 13.778f, 4.169f, 13.88f, 4.879f, 13.939f)
                    close()
                    moveTo(0.545f, 2.73f)
                    curveTo(0.0f, 3.8f, 0.0f, 5.2f, 0.0f, 8.0f)
                    curveTo(0.0f, 10.8f, 0.0f, 12.2f, 0.545f, 13.27f)
                    curveTo(1.024f, 14.211f, 1.789f, 14.976f, 2.73f, 15.455f)
                    curveTo(3.8f, 16.0f, 5.2f, 16.0f, 8.0f, 16.0f)
                    curveTo(10.8f, 16.0f, 12.2f, 16.0f, 13.27f, 15.455f)
                    curveTo(14.211f, 14.976f, 14.976f, 14.211f, 15.455f, 13.27f)
                    curveTo(16.0f, 12.2f, 16.0f, 10.8f, 16.0f, 8.0f)
                    curveTo(16.0f, 5.2f, 16.0f, 3.8f, 15.455f, 2.73f)
                    curveTo(14.976f, 1.789f, 14.211f, 1.024f, 13.27f, 0.545f)
                    curveTo(12.2f, 0.0f, 10.8f, 0.0f, 8.0f, 0.0f)
                    curveTo(5.2f, 0.0f, 3.8f, 0.0f, 2.73f, 0.545f)
                    curveTo(1.789f, 1.024f, 1.024f, 1.789f, 0.545f, 2.73f)
                    close()
                }
            }
        }
        .build()
        return _superellipseOutlineSm!!
    }

private var _superellipseOutlineSm: ImageVector? = null
