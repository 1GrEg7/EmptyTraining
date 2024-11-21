package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.NeurostarOutlineMd: ImageVector
    get() {
        if (_neurostarOutlineMd != null) {
            return _neurostarOutlineMd!!
        }
        _neurostarOutlineMd = Builder(name = "NeurostarOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 16.0f)
                lineTo(23.0f, 12.5f)
                verticalLineTo(11.5f)
                lineTo(16.0f, 8.0f)
                lineTo(12.5f, 1.0f)
                horizontalLineTo(11.5f)
                lineTo(8.0f, 8.0f)
                lineTo(1.0f, 11.5f)
                verticalLineTo(12.5f)
                lineTo(8.0f, 16.0f)
                lineTo(11.5f, 23.0f)
                horizontalLineTo(12.5f)
                lineTo(16.0f, 16.0f)
                close()
                moveTo(12.0f, 19.528f)
                lineTo(14.509f, 14.509f)
                lineTo(19.528f, 12.0f)
                lineTo(14.509f, 9.491f)
                lineTo(12.0f, 4.472f)
                lineTo(9.491f, 9.491f)
                lineTo(4.472f, 12.0f)
                lineTo(9.491f, 14.509f)
                lineTo(12.0f, 19.528f)
                close()
            }
        }
        .build()
        return _neurostarOutlineMd!!
    }

private var _neurostarOutlineMd: ImageVector? = null
