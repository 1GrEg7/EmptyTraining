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

public val DsIcon.WarningOutlineXs: ImageVector
    get() {
        if (_warningOutlineXs != null) {
            return _warningOutlineXs!!
        }
        _warningOutlineXs = Builder(name = "WarningOutlineXs", defaultWidth = 12.0.dp, defaultHeight
                = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.882f, 2.75f)
                    lineTo(5.106f, 5.999f)
                    horizontalLineTo(6.914f)
                    lineTo(7.118f, 2.75f)
                    horizontalLineTo(4.882f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 9.013f)
                    curveTo(6.611f, 9.013f, 7.107f, 8.517f, 7.107f, 7.906f)
                    curveTo(7.107f, 7.294f, 6.611f, 6.799f, 6.0f, 6.799f)
                    curveTo(5.389f, 6.799f, 4.893f, 7.294f, 4.893f, 7.906f)
                    curveTo(4.893f, 8.517f, 5.389f, 9.013f, 6.0f, 9.013f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 6.0f)
                    curveTo(12.0f, 9.314f, 9.314f, 12.0f, 6.0f, 12.0f)
                    curveTo(2.686f, 12.0f, 0.0f, 9.314f, 0.0f, 6.0f)
                    curveTo(0.0f, 2.686f, 2.686f, 0.0f, 6.0f, 0.0f)
                    curveTo(9.314f, 0.0f, 12.0f, 2.686f, 12.0f, 6.0f)
                    close()
                    moveTo(1.812f, 6.0f)
                    curveTo(1.812f, 8.313f, 3.687f, 10.188f, 6.0f, 10.188f)
                    curveTo(8.313f, 10.188f, 10.188f, 8.313f, 10.188f, 6.0f)
                    curveTo(10.188f, 3.687f, 8.313f, 1.812f, 6.0f, 1.812f)
                    curveTo(3.687f, 1.812f, 1.812f, 3.687f, 1.812f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _warningOutlineXs!!
    }

private var _warningOutlineXs: ImageVector? = null
