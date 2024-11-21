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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.WarningOutlineSm: ImageVector
    get() {
        if (_warningOutlineSm != null) {
            return _warningOutlineSm!!
        }
        _warningOutlineSm = Builder(name = "WarningOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.8f, 3.0f)
                    lineTo(7.0f, 9.0f)
                    horizontalLineTo(9.0f)
                    lineTo(9.2f, 3.0f)
                    horizontalLineTo(6.8f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.5f, 11.5f)
                    curveTo(9.5f, 12.328f, 8.828f, 13.0f, 8.0f, 13.0f)
                    curveTo(7.172f, 13.0f, 6.5f, 12.328f, 6.5f, 11.5f)
                    curveTo(6.5f, 10.672f, 7.172f, 10.0f, 8.0f, 10.0f)
                    curveTo(8.828f, 10.0f, 9.5f, 10.672f, 9.5f, 11.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 16.0f)
                    curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                    curveTo(16.0f, 3.582f, 12.418f, 0.0f, 8.0f, 0.0f)
                    curveTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f)
                    curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f)
                    close()
                    moveTo(8.0f, 14.0f)
                    curveTo(11.314f, 14.0f, 14.0f, 11.314f, 14.0f, 8.0f)
                    curveTo(14.0f, 4.686f, 11.314f, 2.0f, 8.0f, 2.0f)
                    curveTo(4.686f, 2.0f, 2.0f, 4.686f, 2.0f, 8.0f)
                    curveTo(2.0f, 11.314f, 4.686f, 14.0f, 8.0f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _warningOutlineSm!!
    }

private var _warningOutlineSm: ImageVector? = null
