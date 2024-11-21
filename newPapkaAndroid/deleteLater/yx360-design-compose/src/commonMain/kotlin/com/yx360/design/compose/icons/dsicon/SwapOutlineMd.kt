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

public val DsIcon.SwapOutlineMd: ImageVector
    get() {
        if (_swapOutlineMd != null) {
            return _swapOutlineMd!!
        }
        _swapOutlineMd = Builder(name = "SwapOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.368f, 10.298f)
                lineTo(16.783f, 11.713f)
                lineTo(21.492f, 7.005f)
                lineTo(16.783f, 2.298f)
                lineTo(15.368f, 3.713f)
                lineTo(17.662f, 6.005f)
                lineTo(2.982f, 6.005f)
                lineTo(2.982f, 8.005f)
                lineTo(17.662f, 8.005f)
                lineTo(15.368f, 10.298f)
                close()
                moveTo(8.617f, 20.299f)
                lineTo(7.202f, 21.713f)
                lineTo(2.492f, 17.006f)
                lineTo(7.202f, 12.299f)
                lineTo(8.617f, 13.713f)
                lineTo(6.323f, 16.006f)
                horizontalLineTo(21.003f)
                verticalLineTo(18.006f)
                horizontalLineTo(6.323f)
                lineTo(8.617f, 20.299f)
                close()
            }
        }
        .build()
        return _swapOutlineMd!!
    }

private var _swapOutlineMd: ImageVector? = null
