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

public val DsIcon.SwapOutlineSm: ImageVector
    get() {
        if (_swapOutlineSm != null) {
            return _swapOutlineSm!!
        }
        _swapOutlineSm = Builder(name = "SwapOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.707f, 3.83f)
                lineTo(4.536f, 1.002f)
                lineTo(5.95f, 2.416f)
                lineTo(4.846f, 3.52f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.52f)
                horizontalLineTo(4.811f)
                lineTo(5.882f, 6.591f)
                lineTo(4.468f, 8.005f)
                lineTo(1.707f, 5.245f)
                lineTo(1.0f, 4.537f)
                lineTo(1.707f, 3.83f)
                close()
                moveTo(14.293f, 12.175f)
                lineTo(11.465f, 15.003f)
                lineTo(10.05f, 13.589f)
                lineTo(11.154f, 12.485f)
                lineTo(1.5f, 12.485f)
                lineTo(1.5f, 10.485f)
                horizontalLineTo(11.189f)
                lineTo(10.118f, 9.414f)
                lineTo(11.533f, 8.0f)
                lineTo(14.293f, 10.76f)
                lineTo(15.0f, 11.467f)
                lineTo(14.293f, 12.175f)
                close()
            }
        }
        .build()
        return _swapOutlineSm!!
    }

private var _swapOutlineSm: ImageVector? = null
