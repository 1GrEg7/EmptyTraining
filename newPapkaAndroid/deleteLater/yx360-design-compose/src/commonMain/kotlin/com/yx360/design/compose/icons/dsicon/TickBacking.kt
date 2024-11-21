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

@Suppress("MagicNumber")
public val DsIcon.TickBacking: ImageVector
    get() {
        if (_tickBacking != null) {
            return _tickBacking!!
        }
        _tickBacking = Builder(
            name = "TickBacking", defaultWidth = 28.0.dp, defaultHeight =
            28.0.dp, viewportWidth = 28.0f, viewportHeight = 28.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB5B7C0)), stroke = null, fillAlpha = 0.3f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(5.0851f, 14.5019f)
                lineTo(11.9995f, 21.418f)
                lineTo(22.9149f, 10.4987f)
                lineTo(19.9981f, 7.5818f)
                lineTo(12.0019f, 15.6412f)
                lineTo(8.0f, 11.5793f)
                lineTo(5.0851f, 14.5019f)
                close()
            }
        }
            .build()
        return _tickBacking!!
    }

private var _tickBacking: ImageVector? = null
