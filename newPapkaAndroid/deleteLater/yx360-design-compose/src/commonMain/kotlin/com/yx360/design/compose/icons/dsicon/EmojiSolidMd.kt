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

public val DsIcon.EmojiSolidMd: ImageVector
    get() {
        if (_emojiSolidMd != null) {
            return _emojiSolidMd!!
        }
        _emojiSolidMd = Builder(name = "EmojiSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                close()
                moveTo(8.75f, 10.75f)
                curveTo(9.578f, 10.75f, 10.25f, 10.078f, 10.25f, 9.25f)
                curveTo(10.25f, 8.422f, 9.578f, 7.75f, 8.75f, 7.75f)
                curveTo(7.922f, 7.75f, 7.25f, 8.422f, 7.25f, 9.25f)
                curveTo(7.25f, 10.078f, 7.922f, 10.75f, 8.75f, 10.75f)
                close()
                moveTo(16.75f, 9.25f)
                curveTo(16.75f, 10.078f, 16.078f, 10.75f, 15.25f, 10.75f)
                curveTo(14.422f, 10.75f, 13.75f, 10.078f, 13.75f, 9.25f)
                curveTo(13.75f, 8.422f, 14.422f, 7.75f, 15.25f, 7.75f)
                curveTo(16.078f, 7.75f, 16.75f, 8.422f, 16.75f, 9.25f)
                close()
                moveTo(17.25f, 14.018f)
                curveTo(16.939f, 15.174f, 16.256f, 16.194f, 15.306f, 16.922f)
                curveTo(14.356f, 17.65f, 13.193f, 18.043f, 11.996f, 18.042f)
                curveTo(10.8f, 18.041f, 9.637f, 17.645f, 8.688f, 16.916f)
                curveTo(7.74f, 16.186f, 7.059f, 15.164f, 6.75f, 14.008f)
                lineTo(8.717f, 13.484f)
                curveTo(8.91f, 14.207f, 9.336f, 14.846f, 9.929f, 15.302f)
                curveTo(10.522f, 15.759f, 11.25f, 16.006f, 11.998f, 16.007f)
                curveTo(12.747f, 16.008f, 13.474f, 15.762f, 14.068f, 15.306f)
                curveTo(14.663f, 14.851f, 15.09f, 14.213f, 15.284f, 13.49f)
                lineTo(17.25f, 14.018f)
                close()
            }
        }
        .build()
        return _emojiSolidMd!!
    }

private var _emojiSolidMd: ImageVector? = null
