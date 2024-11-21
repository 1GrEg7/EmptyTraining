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

public val DsIcon.CloudSolidMd: ImageVector
    get() {
        if (_cloudSolidMd != null) {
            return _cloudSolidMd!!
        }
        _cloudSolidMd = Builder(name = "CloudSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveTo(16.377f, 6.629f, 15.744f, 5.354f, 14.725f, 4.428f)
                curveTo(13.706f, 3.502f, 12.377f, 2.992f, 11.0f, 3.0f)
                curveTo(9.541f, 3.0f, 8.142f, 3.58f, 7.111f, 4.611f)
                curveTo(6.079f, 5.642f, 5.5f, 7.041f, 5.5f, 8.5f)
                curveTo(5.499f, 9.029f, 5.577f, 9.554f, 5.73f, 10.06f)
                curveTo(4.42f, 10.248f, 3.22f, 10.9f, 2.352f, 11.899f)
                curveTo(1.483f, 12.898f, 1.003f, 14.176f, 1.0f, 15.5f)
                curveTo(1.0f, 16.959f, 1.579f, 18.358f, 2.611f, 19.389f)
                curveTo(3.642f, 20.421f, 5.041f, 21.0f, 6.5f, 21.0f)
                horizontalLineTo(16.5f)
                curveTo(18.224f, 21.0f, 19.877f, 20.315f, 21.096f, 19.096f)
                curveTo(22.315f, 17.877f, 23.0f, 16.224f, 23.0f, 14.5f)
                curveTo(23.0f, 12.776f, 22.315f, 11.123f, 21.096f, 9.904f)
                curveTo(19.877f, 8.685f, 18.224f, 8.0f, 16.5f, 8.0f)
                close()
            }
        }
        .build()
        return _cloudSolidMd!!
    }

private var _cloudSolidMd: ImageVector? = null
