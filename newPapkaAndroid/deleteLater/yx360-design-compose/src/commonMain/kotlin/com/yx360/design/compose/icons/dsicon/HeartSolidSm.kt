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

public val DsIcon.HeartSolidSm: ImageVector
    get() {
        if (_heartSolidSm != null) {
            return _heartSolidSm!!
        }
        _heartSolidSm = Builder(name = "HeartSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 3.358f)
                curveTo(8.5f, 2.365f, 9.716f, 1.0f, 11.5f, 1.0f)
                curveTo(12.477f, 1.0f, 13.582f, 1.3f, 14.451f, 2.101f)
                curveTo(15.336f, 2.917f, 15.875f, 4.159f, 15.875f, 5.839f)
                curveTo(15.875f, 8.204f, 14.262f, 10.284f, 12.662f, 11.777f)
                curveTo(11.029f, 13.3f, 9.206f, 14.401f, 8.391f, 14.806f)
                lineTo(8.0f, 15.0f)
                lineTo(7.609f, 14.806f)
                curveTo(6.832f, 14.42f, 5.001f, 13.449f, 3.352f, 11.976f)
                curveTo(1.72f, 10.518f, 0.125f, 8.439f, 0.125f, 5.839f)
                curveTo(0.125f, 4.142f, 0.703f, 2.903f, 1.599f, 2.094f)
                curveTo(2.474f, 1.305f, 3.571f, 1.0f, 4.5f, 1.0f)
                curveTo(6.284f, 1.0f, 7.5f, 2.365f, 8.0f, 3.358f)
                close()
            }
        }
        .build()
        return _heartSolidSm!!
    }

private var _heartSolidSm: ImageVector? = null
