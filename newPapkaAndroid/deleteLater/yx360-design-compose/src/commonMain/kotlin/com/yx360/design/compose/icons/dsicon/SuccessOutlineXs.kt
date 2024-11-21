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

public val DsIcon.SuccessOutlineXs: ImageVector
    get() {
        if (_successOutlineXs != null) {
            return _successOutlineXs!!
        }
        _successOutlineXs = Builder(name = "SuccessOutlineXs", defaultWidth = 12.0.dp, defaultHeight
                = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.701f, 3.734f)
                    lineTo(9.116f, 5.178f)
                    lineTo(5.56f, 8.808f)
                    lineTo(2.884f, 6.076f)
                    lineTo(4.299f, 4.632f)
                    lineTo(5.56f, 5.92f)
                    lineTo(7.701f, 3.734f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 12.0f)
                    curveTo(9.314f, 12.0f, 12.0f, 9.314f, 12.0f, 6.0f)
                    curveTo(12.0f, 2.686f, 9.314f, 0.0f, 6.0f, 0.0f)
                    curveTo(2.686f, 0.0f, 0.0f, 2.686f, 0.0f, 6.0f)
                    curveTo(0.0f, 9.314f, 2.686f, 12.0f, 6.0f, 12.0f)
                    close()
                    moveTo(6.0f, 10.25f)
                    curveTo(8.347f, 10.25f, 10.25f, 8.347f, 10.25f, 6.0f)
                    curveTo(10.25f, 3.653f, 8.347f, 1.75f, 6.0f, 1.75f)
                    curveTo(3.653f, 1.75f, 1.75f, 3.653f, 1.75f, 6.0f)
                    curveTo(1.75f, 8.347f, 3.653f, 10.25f, 6.0f, 10.25f)
                    close()
                }
            }
        }
        .build()
        return _successOutlineXs!!
    }

private var _successOutlineXs: ImageVector? = null
