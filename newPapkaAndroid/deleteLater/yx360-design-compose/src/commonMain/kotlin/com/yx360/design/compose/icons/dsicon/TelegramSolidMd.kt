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

public val DsIcon.TelegramSolidMd: ImageVector
    get() {
        if (_telegramSolidMd != null) {
            return _telegramSolidMd!!
        }
        _telegramSolidMd = Builder(name = "TelegramSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.956f, 12.909f)
                lineTo(5.316f, 11.979f)
                lineTo(16.879f, 7.374f)
                lineTo(15.08f, 17.36f)
                lineTo(12.025f, 14.843f)
                lineTo(14.657f, 10.461f)
                lineTo(9.112f, 16.357f)
                lineTo(8.956f, 12.909f)
                close()
            }
        }
        .build()
        return _telegramSolidMd!!
    }

private var _telegramSolidMd: ImageVector? = null
