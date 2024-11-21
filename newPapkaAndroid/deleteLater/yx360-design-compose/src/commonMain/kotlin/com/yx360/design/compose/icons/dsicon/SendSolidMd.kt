package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.SendSolidMd: ImageVector
    get() {
        if (_sendSolidMd != null) {
            return _sendSolidMd!!
        }
        _sendSolidMd = Builder(name = "SendSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.325f)
                verticalLineTo(10.764f)
                lineTo(8.307f, 13.539f)
                lineTo(14.024f, 8.608f)
                lineTo(15.281f, 9.876f)
                lineTo(10.399f, 15.557f)
                lineTo(13.21f, 22.0f)
                horizontalLineTo(14.67f)
                lineTo(21.0f, 3.964f)
                lineTo(20.036f, 3.0f)
                lineTo(2.0f, 9.325f)
                close()
            }
        }
        .build()
        return _sendSolidMd!!
    }

private var _sendSolidMd: ImageVector? = null
