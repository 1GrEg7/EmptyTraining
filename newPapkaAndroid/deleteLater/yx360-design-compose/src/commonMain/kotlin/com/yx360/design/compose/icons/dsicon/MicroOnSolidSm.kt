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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.MicroOnSolidSm: ImageVector
    get() {
        if (_microOnSolidSm != null) {
            return _microOnSolidSm!!
        }
        _microOnSolidSm = Builder(name = "MicroOnSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 0.0f)
                    curveTo(5.791f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                    verticalLineTo(7.0f)
                    curveTo(4.0f, 9.209f, 5.791f, 11.0f, 8.0f, 11.0f)
                    curveTo(10.209f, 11.0f, 12.0f, 9.209f, 12.0f, 7.0f)
                    verticalLineTo(4.0f)
                    curveTo(12.0f, 1.791f, 10.209f, 0.0f, 8.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 7.0f)
                    curveTo(3.0f, 9.761f, 5.239f, 12.0f, 8.0f, 12.0f)
                    curveTo(10.761f, 12.0f, 13.0f, 9.761f, 13.0f, 7.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.0f, 10.421f, 12.546f, 13.268f, 9.303f, 13.879f)
                    lineTo(9.0f, 16.0f)
                    horizontalLineTo(7.0f)
                    lineTo(6.697f, 13.879f)
                    curveTo(3.454f, 13.268f, 1.0f, 10.421f, 1.0f, 7.0f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _microOnSolidSm!!
    }

private var _microOnSolidSm: ImageVector? = null
