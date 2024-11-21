package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.EmojiOutlineMd: ImageVector
    get() {
        if (_emojiOutlineMd != null) {
            return _emojiOutlineMd!!
        }
        _emojiOutlineMd = Builder(name = "EmojiOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 9.25f)
                curveTo(16.75f, 10.078f, 16.078f, 10.75f, 15.25f, 10.75f)
                curveTo(14.422f, 10.75f, 13.75f, 10.078f, 13.75f, 9.25f)
                curveTo(13.75f, 8.422f, 14.422f, 7.75f, 15.25f, 7.75f)
                curveTo(16.078f, 7.75f, 16.75f, 8.422f, 16.75f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 10.75f)
                curveTo(9.578f, 10.75f, 10.25f, 10.078f, 10.25f, 9.25f)
                curveTo(10.25f, 8.422f, 9.578f, 7.75f, 8.75f, 7.75f)
                curveTo(7.922f, 7.75f, 7.25f, 8.422f, 7.25f, 9.25f)
                curveTo(7.25f, 10.078f, 7.922f, 10.75f, 8.75f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.305f, 16.442f)
                curveTo(16.255f, 15.715f, 16.938f, 14.694f, 17.248f, 13.538f)
                lineTo(15.283f, 13.01f)
                curveTo(15.089f, 13.733f, 14.661f, 14.372f, 14.067f, 14.827f)
                curveTo(13.473f, 15.282f, 12.745f, 15.528f, 11.997f, 15.527f)
                curveTo(11.248f, 15.527f, 10.521f, 15.279f, 9.928f, 14.823f)
                curveTo(9.334f, 14.366f, 8.908f, 13.727f, 8.716f, 13.004f)
                lineTo(6.749f, 13.528f)
                curveTo(7.057f, 14.684f, 7.739f, 15.707f, 8.687f, 16.436f)
                curveTo(9.636f, 17.165f, 10.798f, 17.561f, 11.995f, 17.563f)
                curveTo(13.191f, 17.564f, 14.355f, 17.17f, 15.305f, 16.442f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _emojiOutlineMd!!
    }

private var _emojiOutlineMd: ImageVector? = null
