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

public val DsIcon.SendOutlineMd: ImageVector
    get() {
        if (_sendOutlineMd != null) {
            return _sendOutlineMd!!
        }
        _sendOutlineMd = Builder(name = "SendOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 3.974f)
                lineTo(20.026f, 3.0f)
                lineTo(2.0f, 9.333f)
                verticalLineTo(10.795f)
                lineTo(9.795f, 14.205f)
                lineTo(13.205f, 22.0f)
                horizontalLineTo(14.667f)
                lineTo(21.0f, 3.974f)
                close()
                moveTo(11.839f, 13.888f)
                lineTo(13.812f, 18.398f)
                lineTo(18.26f, 5.74f)
                lineTo(5.602f, 10.188f)
                lineTo(9.979f, 12.102f)
                lineTo(14.016f, 8.64f)
                lineTo(15.264f, 9.89f)
                lineTo(11.839f, 13.888f)
                close()
            }
        }
        .build()
        return _sendOutlineMd!!
    }

private var _sendOutlineMd: ImageVector? = null
