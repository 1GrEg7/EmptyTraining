package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
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

public val DsIcon.ReplyAllSolidMd: ImageVector
    get() {
        if (_replyAllSolidMd != null) {
            return _replyAllSolidMd!!
        }
        _replyAllSolidMd = Builder(name = "ReplyAllSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.012f)
                lineTo(9.012f, 3.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(4.25f)
                lineTo(2.75f, 12.012f)
                lineTo(10.5f, 19.75f)
                verticalLineTo(21.0f)
                lineTo(9.012f, 21.023f)
                lineTo(0.0f, 12.012f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 16.001f)
                curveTo(15.717f, 16.001f, 16.377f, 16.058f, 17.0f, 16.186f)
                curveTo(18.805f, 16.556f, 20.302f, 17.519f, 21.99f, 19.408f)
                curveTo(22.158f, 19.596f, 22.328f, 19.793f, 22.5f, 20.0f)
                horizontalLineTo(24.0f)
                curveTo(24.0f, 19.582f, 23.987f, 19.176f, 23.962f, 18.782f)
                curveTo(23.958f, 18.727f, 23.955f, 18.672f, 23.95f, 18.617f)
                curveTo(23.935f, 18.408f, 23.916f, 18.202f, 23.894f, 18.0f)
                curveTo(23.216f, 11.836f, 19.38f, 8.733f, 15.0f, 8.027f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                lineTo(4.5f, 12.0f)
                lineTo(13.5f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.001f)
                close()
            }
        }
        .build()
        return _replyAllSolidMd!!
    }

private var _replyAllSolidMd: ImageVector? = null
