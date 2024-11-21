package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.SettingsSolidSm: ImageVector
    get() {
        if (_settingsSolidSm != null) {
            return _settingsSolidSm!!
        }
        _settingsSolidSm = Builder(name = "SettingsSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.965f, 7.272f)
                    lineTo(15.746f, 5.384f)
                    lineTo(14.142f, 2.616f)
                    lineTo(11.614f, 3.2f)
                    curveTo(11.221f, 2.91f, 10.796f, 2.666f, 10.347f, 2.472f)
                    lineTo(9.601f, 0.0f)
                    horizontalLineTo(6.392f)
                    lineTo(5.645f, 2.488f)
                    curveTo(5.195f, 2.673f, 4.77f, 2.912f, 4.378f, 3.2f)
                    lineTo(1.851f, 2.616f)
                    lineTo(0.246f, 5.384f)
                    lineTo(2.027f, 7.272f)
                    curveTo(1.971f, 7.756f, 1.971f, 8.244f, 2.027f, 8.728f)
                    lineTo(0.246f, 10.616f)
                    lineTo(1.851f, 13.384f)
                    lineTo(4.378f, 12.8f)
                    curveTo(4.771f, 13.09f, 5.196f, 13.334f, 5.645f, 13.528f)
                    lineTo(6.392f, 16.0f)
                    horizontalLineTo(9.601f)
                    lineTo(10.347f, 13.512f)
                    curveTo(10.797f, 13.325f, 11.223f, 13.083f, 11.614f, 12.792f)
                    lineTo(14.142f, 13.384f)
                    lineTo(15.746f, 10.616f)
                    lineTo(13.965f, 8.728f)
                    curveTo(14.021f, 8.244f, 14.021f, 7.756f, 13.965f, 7.272f)
                    close()
                    moveTo(7.996f, 11.2f)
                    curveTo(7.361f, 11.2f, 6.741f, 11.012f, 6.213f, 10.661f)
                    curveTo(5.685f, 10.309f, 5.274f, 9.809f, 5.031f, 9.224f)
                    curveTo(4.788f, 8.64f, 4.725f, 7.996f, 4.849f, 7.376f)
                    curveTo(4.972f, 6.755f, 5.278f, 6.185f, 5.727f, 5.737f)
                    curveTo(6.176f, 5.29f, 6.748f, 4.985f, 7.37f, 4.861f)
                    curveTo(7.993f, 4.738f, 8.638f, 4.801f, 9.224f, 5.044f)
                    curveTo(9.811f, 5.286f, 10.312f, 5.696f, 10.664f, 6.222f)
                    curveTo(11.017f, 6.748f, 11.205f, 7.367f, 11.205f, 8.0f)
                    curveTo(11.205f, 8.849f, 10.867f, 9.663f, 10.265f, 10.263f)
                    curveTo(9.663f, 10.863f, 8.847f, 11.2f, 7.996f, 11.2f)
                    close()
                }
            }
        }
        .build()
        return _settingsSolidSm!!
    }

private var _settingsSolidSm: ImageVector? = null
