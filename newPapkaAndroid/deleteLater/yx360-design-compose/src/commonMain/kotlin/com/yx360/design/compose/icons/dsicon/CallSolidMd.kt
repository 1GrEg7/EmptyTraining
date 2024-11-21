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

public val DsIcon.CallSolidMd: ImageVector
    get() {
        if (_callSolidMd != null) {
            return _callSolidMd!!
        }
        _callSolidMd = Builder(name = "CallSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.481f, 18.132f)
                curveTo(21.481f, 16.651f, 18.981f, 15.151f, 16.79f, 14.646f)
                lineTo(14.5f, 16.692f)
                curveTo(12.862f, 16.118f, 11.379f, 15.173f, 10.168f, 13.93f)
                curveTo(8.929f, 12.729f, 7.984f, 11.258f, 7.406f, 9.632f)
                lineTo(9.452f, 7.341f)
                curveTo(8.981f, 5.151f, 7.481f, 2.651f, 6.0f, 1.651f)
                curveTo(5.026f, 2.15f, 3.867f, 3.035f, 2.926f, 3.911f)
                curveTo(2.311f, 4.483f, 2.032f, 5.328f, 2.186f, 6.154f)
                curveTo(2.89f, 9.94f, 4.972f, 13.554f, 7.75f, 16.382f)
                curveTo(10.532f, 19.214f, 14.193f, 21.303f, 17.994f, 21.964f)
                curveTo(18.811f, 22.106f, 19.641f, 21.825f, 20.206f, 21.218f)
                curveTo(21.085f, 20.273f, 21.977f, 19.109f, 22.481f, 18.132f)
                close()
            }
        }
        .build()
        return _callSolidMd!!
    }

private var _callSolidMd: ImageVector? = null
