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

public val DsIcon.NeurostarOutlineLg: ImageVector
    get() {
        if (_neurostarOutlineLg != null) {
            return _neurostarOutlineLg!!
        }
        _neurostarOutlineLg = Builder(name = "NeurostarOutlineLg", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.997f, 18.997f)
                lineTo(25.365f, 16.0f)
                lineTo(18.997f, 13.003f)
                lineTo(16.0f, 6.635f)
                lineTo(13.003f, 13.003f)
                lineTo(6.635f, 16.0f)
                lineTo(13.003f, 18.997f)
                lineTo(16.0f, 25.365f)
                lineTo(18.997f, 18.997f)
                close()
                moveTo(16.5f, 29.0f)
                lineTo(15.5f, 29.0f)
                lineTo(11.5f, 20.5f)
                lineTo(3.0f, 16.5f)
                verticalLineTo(15.5f)
                lineTo(11.5f, 11.5f)
                lineTo(15.5f, 3.0f)
                horizontalLineTo(16.5f)
                lineTo(20.5f, 11.5f)
                lineTo(29.0f, 15.5f)
                lineTo(29.0f, 16.5f)
                lineTo(20.5f, 20.5f)
                lineTo(16.5f, 29.0f)
                close()
            }
        }
        .build()
        return _neurostarOutlineLg!!
    }

private var _neurostarOutlineLg: ImageVector? = null
