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

public val DsIcon.StarOutlineXxs: ImageVector
    get() {
        if (_starOutlineXxs != null) {
            return _starOutlineXxs!!
        }
        _starOutlineXxs = Builder(name = "StarOutlineXxs", defaultWidth = 8.0.dp, defaultHeight =
                8.0.dp, viewportWidth = 8.0f, viewportHeight = 8.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.3211f, -0.0134f)
                    horizontalLineTo(3.6845f)
                    lineTo(2.6121f, 2.1771f)
                    lineTo(0.2105f, 2.5303f)
                    lineTo(0.0098f, 3.1369f)
                    lineTo(1.7461f, 4.843f)
                    lineTo(1.3389f, 7.2578f)
                    lineTo(1.8577f, 7.6274f)
                    lineTo(3.9998f, 6.4957f)
                    lineTo(6.142f, 7.6274f)
                    lineTo(6.6612f, 7.2575f)
                    lineTo(6.2506f, 4.8488f)
                    lineTo(7.9863f, 3.1401f)
                    lineTo(7.7973f, 2.5308f)
                    lineTo(5.4f, 2.1801f)
                    lineTo(4.3211f, -0.0134f)
                    close()
                    moveTo(3.5494f, 3.4702f)
                    lineTo(4.005f, 2.5397f)
                    lineTo(4.4646f, 3.4741f)
                    lineTo(5.4823f, 3.623f)
                    lineTo(5.1258f, 3.9739f)
                    lineTo(4.7384f, 4.3643f)
                    lineTo(4.911f, 5.3774f)
                    lineTo(3.9998f, 4.896f)
                    lineTo(3.0849f, 5.3794f)
                    lineTo(3.2586f, 4.3489f)
                    lineTo(2.5187f, 3.6218f)
                    lineTo(3.5494f, 3.4702f)
                    close()
                }
            }
        }
        .build()
        return _starOutlineXxs!!
    }

private var _starOutlineXxs: ImageVector? = null
