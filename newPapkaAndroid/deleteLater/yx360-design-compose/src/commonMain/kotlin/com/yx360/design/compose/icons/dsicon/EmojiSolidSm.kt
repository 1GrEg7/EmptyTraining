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

public val DsIcon.EmojiSolidSm: ImageVector
    get() {
        if (_emojiSolidSm != null) {
            return _emojiSolidSm!!
        }
        _emojiSolidSm = Builder(name = "EmojiSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 16.0f)
                curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                curveTo(16.0f, 3.582f, 12.418f, 0.0f, 8.0f, 0.0f)
                curveTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f)
                curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f)
                close()
                moveTo(5.5f, 7.5f)
                curveTo(6.19f, 7.5f, 6.75f, 6.94f, 6.75f, 6.25f)
                curveTo(6.75f, 5.56f, 6.19f, 5.0f, 5.5f, 5.0f)
                curveTo(4.81f, 5.0f, 4.25f, 5.56f, 4.25f, 6.25f)
                curveTo(4.25f, 6.94f, 4.81f, 7.5f, 5.5f, 7.5f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(11.191f, 7.5f, 11.75f, 6.94f, 11.75f, 6.25f)
                curveTo(11.75f, 5.56f, 11.191f, 5.0f, 10.5f, 5.0f)
                curveTo(9.81f, 5.0f, 9.25f, 5.56f, 9.25f, 6.25f)
                curveTo(9.25f, 6.94f, 9.81f, 7.5f, 10.5f, 7.5f)
                close()
                moveTo(11.771f, 9.598f)
                curveTo(11.492f, 10.374f, 10.98f, 11.045f, 10.305f, 11.52f)
                curveTo(9.63f, 11.995f, 8.825f, 12.249f, 8.0f, 12.249f)
                curveTo(7.175f, 12.249f, 6.37f, 11.995f, 5.695f, 11.52f)
                curveTo(5.02f, 11.045f, 4.508f, 10.374f, 4.229f, 9.597f)
                lineTo(5.772f, 9.043f)
                curveTo(5.937f, 9.502f, 6.24f, 9.898f, 6.638f, 10.179f)
                curveTo(7.037f, 10.459f, 7.513f, 10.61f, 8.0f, 10.61f)
                curveTo(8.487f, 10.61f, 8.963f, 10.459f, 9.362f, 10.179f)
                curveTo(9.76f, 9.898f, 10.063f, 9.502f, 10.228f, 9.043f)
                lineTo(11.771f, 9.598f)
                close()
            }
        }
        .build()
        return _emojiSolidSm!!
    }

private var _emojiSolidSm: ImageVector? = null
