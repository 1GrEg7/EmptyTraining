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

public val DsIcon.NeurostarOutlineSm: ImageVector
    get() {
        if (_neurostarOutlineSm != null) {
            return _neurostarOutlineSm!!
        }
        _neurostarOutlineSm = Builder(name = "NeurostarOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.491f, 9.509f)
                    lineTo(8.0f, 12.528f)
                    lineTo(9.509f, 9.509f)
                    lineTo(12.528f, 8.0f)
                    lineTo(9.509f, 6.491f)
                    lineTo(8.0f, 3.472f)
                    lineTo(6.491f, 6.491f)
                    lineTo(3.472f, 8.0f)
                    lineTo(6.491f, 9.509f)
                    close()
                    moveTo(5.0f, 11.0f)
                    lineTo(7.5f, 16.0f)
                    horizontalLineTo(8.5f)
                    lineTo(11.0f, 11.0f)
                    lineTo(16.0f, 8.5f)
                    verticalLineTo(7.5f)
                    lineTo(11.0f, 5.0f)
                    lineTo(8.5f, 0.0f)
                    horizontalLineTo(7.5f)
                    lineTo(5.0f, 5.0f)
                    lineTo(0.0f, 7.5f)
                    verticalLineTo(8.5f)
                    lineTo(5.0f, 11.0f)
                    close()
                }
            }
        }
        .build()
        return _neurostarOutlineSm!!
    }

private var _neurostarOutlineSm: ImageVector? = null
