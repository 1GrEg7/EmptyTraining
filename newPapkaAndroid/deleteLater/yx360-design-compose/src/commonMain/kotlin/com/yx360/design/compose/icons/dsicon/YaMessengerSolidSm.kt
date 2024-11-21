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

public val DsIcon.YaMessengerSolidSm: ImageVector
    get() {
        if (_yaMessengerSolidSm != null) {
            return _yaMessengerSolidSm!!
        }
        _yaMessengerSolidSm = Builder(name = "YaMessengerSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.807f, 14.474f)
                    verticalLineTo(13.165f)
                    curveTo(0.508f, 13.234f, -0.472f, 11.797f, 0.239f, 10.57f)
                    lineTo(1.726f, 8.004f)
                    lineTo(0.305f, 5.459f)
                    curveTo(-0.365f, 4.258f, 0.559f, 2.878f, 1.807f, 2.886f)
                    verticalLineTo(1.526f)
                    curveTo(1.807f, 0.362f, 3.059f, -0.372f, 4.074f, 0.196f)
                    lineTo(15.013f, 6.322f)
                    curveTo(16.33f, 7.059f, 16.329f, 8.954f, 15.012f, 9.69f)
                    lineTo(4.073f, 15.804f)
                    curveTo(3.058f, 16.372f, 1.807f, 15.637f, 1.807f, 14.474f)
                    close()
                    moveTo(3.635f, 3.375f)
                    verticalLineTo(1.849f)
                    lineTo(12.786f, 6.536f)
                    verticalLineTo(6.863f)
                    lineTo(3.635f, 3.375f)
                    close()
                    moveTo(3.826f, 8.017f)
                    lineTo(3.828f, 8.021f)
                    lineTo(2.024f, 11.521f)
                    lineTo(13.059f, 8.017f)
                    horizontalLineTo(3.826f)
                    close()
                }
            }
        }
        .build()
        return _yaMessengerSolidSm!!
    }

private var _yaMessengerSolidSm: ImageVector? = null
