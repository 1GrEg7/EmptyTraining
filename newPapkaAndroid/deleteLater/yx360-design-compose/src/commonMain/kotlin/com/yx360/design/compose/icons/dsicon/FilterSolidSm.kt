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

public val DsIcon.FilterSolidSm: ImageVector
    get() {
        if (_filterSolidSm != null) {
            return _filterSolidSm!!
        }
        _filterSolidSm = Builder(name = "FilterSolidSm", defaultWidth = 16.0.dp, defaultHeight =
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
                }
            }
        }
        .build()
        return _filterSolidSm!!
    }

private var _filterSolidSm: ImageVector? = null
