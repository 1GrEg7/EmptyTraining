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

public val DsIcon.CloseCircleOutlineSm: ImageVector
    get() {
        if (_closeCircleOutlineSm != null) {
            return _closeCircleOutlineSm!!
        }
        _closeCircleOutlineSm = Builder(name = "CloseCircleOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.707f, 11.707f)
                    lineTo(8.0f, 9.414f)
                    lineTo(10.293f, 11.707f)
                    lineTo(11.707f, 10.293f)
                    lineTo(9.414f, 8.0f)
                    lineTo(11.707f, 5.707f)
                    lineTo(10.293f, 4.293f)
                    lineTo(8.0f, 6.586f)
                    lineTo(5.707f, 4.293f)
                    lineTo(4.293f, 5.707f)
                    lineTo(6.586f, 8.0f)
                    lineTo(4.293f, 10.293f)
                    lineTo(5.707f, 11.707f)
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
        return _closeCircleOutlineSm!!
    }

private var _closeCircleOutlineSm: ImageVector? = null
