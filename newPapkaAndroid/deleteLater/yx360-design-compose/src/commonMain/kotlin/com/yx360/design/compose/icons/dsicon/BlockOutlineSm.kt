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

public val DsIcon.BlockOutlineSm: ImageVector
    get() {
        if (_blockOutlineSm != null) {
            return _blockOutlineSm!!
        }
        _blockOutlineSm = Builder(name = "BlockOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
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
                    curveTo(6.606f, 14.0f, 5.323f, 13.524f, 4.304f, 12.727f)
                    lineTo(13.089f, 4.82f)
                    curveTo(13.666f, 5.742f, 14.0f, 6.832f, 14.0f, 8.0f)
                    close()
                    moveTo(2.955f, 11.25f)
                    lineTo(11.761f, 3.325f)
                    curveTo(10.732f, 2.496f, 9.424f, 2.0f, 8.0f, 2.0f)
                    curveTo(4.686f, 2.0f, 2.0f, 4.686f, 2.0f, 8.0f)
                    curveTo(2.0f, 9.198f, 2.351f, 10.313f, 2.955f, 11.25f)
                    close()
                }
            }
        }
        .build()
        return _blockOutlineSm!!
    }

private var _blockOutlineSm: ImageVector? = null
