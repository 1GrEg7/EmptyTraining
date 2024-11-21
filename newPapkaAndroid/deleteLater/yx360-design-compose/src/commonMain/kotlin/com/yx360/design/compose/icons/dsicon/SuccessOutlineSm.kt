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

public val DsIcon.SuccessOutlineSm: ImageVector
    get() {
        if (_successOutlineSm != null) {
            return _successOutlineSm!!
        }
        _successOutlineSm = Builder(name = "SuccessOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.5f, 11.121f)
                    lineTo(12.207f, 6.414f)
                    lineTo(10.793f, 5.0f)
                    lineTo(7.5f, 8.293f)
                    lineTo(5.707f, 6.5f)
                    lineTo(4.293f, 7.914f)
                    lineTo(7.5f, 11.121f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 8.0f)
                    curveTo(16.0f, 12.418f, 12.418f, 16.0f, 8.0f, 16.0f)
                    curveTo(3.582f, 16.0f, 0.0f, 12.418f, 0.0f, 8.0f)
                    curveTo(0.0f, 3.582f, 3.582f, 0.0f, 8.0f, 0.0f)
                    curveTo(12.418f, 0.0f, 16.0f, 3.582f, 16.0f, 8.0f)
                    close()
                    moveTo(14.0f, 8.0f)
                    curveTo(14.0f, 11.314f, 11.314f, 14.0f, 8.0f, 14.0f)
                    curveTo(4.686f, 14.0f, 2.0f, 11.314f, 2.0f, 8.0f)
                    curveTo(2.0f, 4.686f, 4.686f, 2.0f, 8.0f, 2.0f)
                    curveTo(11.314f, 2.0f, 14.0f, 4.686f, 14.0f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _successOutlineSm!!
    }

private var _successOutlineSm: ImageVector? = null
