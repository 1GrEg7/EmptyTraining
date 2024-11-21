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

public val DsIcon.YaMessengerOutlineSm: ImageVector
    get() {
        if (_yaMessengerOutlineSm != null) {
            return _yaMessengerOutlineSm!!
        }
        _yaMessengerOutlineSm = Builder(name = "YaMessengerOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.635f, 2.045f)
                    verticalLineTo(3.375f)
                    lineTo(12.543f, 6.754f)
                    verticalLineTo(6.428f)
                    lineTo(3.635f, 2.045f)
                    close()
                    moveTo(13.08f, 8.01f)
                    lineTo(2.024f, 4.789f)
                    lineTo(3.828f, 8.021f)
                    lineTo(1.95f, 11.262f)
                    lineTo(13.08f, 8.01f)
                    close()
                    moveTo(12.543f, 9.116f)
                    verticalLineTo(9.418f)
                    lineTo(3.635f, 13.955f)
                    verticalLineTo(12.652f)
                    lineTo(12.543f, 9.116f)
                    close()
                    moveTo(1.807f, 13.165f)
                    verticalLineTo(14.474f)
                    curveTo(1.807f, 15.637f, 3.058f, 16.372f, 4.073f, 15.804f)
                    lineTo(15.012f, 9.69f)
                    curveTo(16.329f, 8.954f, 16.33f, 7.059f, 15.013f, 6.322f)
                    lineTo(4.074f, 0.196f)
                    curveTo(3.059f, -0.372f, 1.807f, 0.362f, 1.807f, 1.526f)
                    verticalLineTo(2.886f)
                    curveTo(0.559f, 2.878f, -0.365f, 4.258f, 0.305f, 5.459f)
                    lineTo(1.726f, 8.004f)
                    lineTo(0.239f, 10.57f)
                    curveTo(-0.472f, 11.797f, 0.508f, 13.234f, 1.807f, 13.165f)
                    close()
                }
            }
        }
        .build()
        return _yaMessengerOutlineSm!!
    }

private var _yaMessengerOutlineSm: ImageVector? = null
