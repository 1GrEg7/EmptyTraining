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

public val DsIcon.SendOutlineSm: ImageVector
    get() {
        if (_sendOutlineSm != null) {
            return _sendOutlineSm!!
        }
        _sendOutlineSm = Builder(name = "SendOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 1.0f)
                lineTo(1.0f, 5.5f)
                verticalLineTo(7.0f)
                lineTo(6.5f, 9.5f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(10.5f)
                lineTo(15.0f, 2.0f)
                lineTo(14.0f, 1.0f)
                close()
                moveTo(8.449f, 8.956f)
                lineTo(9.6f, 11.486f)
                lineTo(12.292f, 3.707f)
                lineTo(4.514f, 6.4f)
                lineTo(7.039f, 7.548f)
                lineTo(9.498f, 5.499f)
                lineTo(10.496f, 6.499f)
                lineTo(8.449f, 8.956f)
                close()
            }
        }
        .build()
        return _sendOutlineSm!!
    }

private var _sendOutlineSm: ImageVector? = null
