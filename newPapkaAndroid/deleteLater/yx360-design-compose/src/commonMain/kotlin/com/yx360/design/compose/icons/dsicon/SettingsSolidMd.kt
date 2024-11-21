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

public val DsIcon.SettingsSolidMd: ImageVector
    get() {
        if (_settingsSolidMd != null) {
            return _settingsSolidMd!!
        }
        _settingsSolidMd = Builder(name = "SettingsSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.702f, 11.09f)
                lineTo(22.0f, 8.73f)
                lineTo(19.93f, 5.27f)
                lineTo(16.669f, 6.0f)
                curveTo(16.161f, 5.637f, 15.612f, 5.332f, 15.033f, 5.09f)
                lineTo(14.07f, 2.0f)
                horizontalLineTo(9.93f)
                lineTo(8.967f, 5.11f)
                curveTo(8.386f, 5.341f, 7.837f, 5.64f, 7.331f, 6.0f)
                lineTo(4.07f, 5.27f)
                lineTo(2.0f, 8.73f)
                lineTo(4.298f, 11.09f)
                curveTo(4.226f, 11.695f, 4.226f, 12.305f, 4.298f, 12.91f)
                lineTo(2.0f, 15.27f)
                lineTo(4.07f, 18.73f)
                lineTo(7.331f, 18.0f)
                curveTo(7.839f, 18.363f, 8.388f, 18.668f, 8.967f, 18.91f)
                lineTo(9.93f, 22.0f)
                horizontalLineTo(14.07f)
                lineTo(15.033f, 18.89f)
                curveTo(15.614f, 18.656f, 16.164f, 18.354f, 16.669f, 17.99f)
                lineTo(19.93f, 18.73f)
                lineTo(22.0f, 15.27f)
                lineTo(19.702f, 12.91f)
                curveTo(19.774f, 12.305f, 19.774f, 11.695f, 19.702f, 11.09f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(11.181f, 16.0f, 10.38f, 15.765f, 9.7f, 15.326f)
                curveTo(9.019f, 14.886f, 8.488f, 14.262f, 8.174f, 13.531f)
                curveTo(7.861f, 12.8f, 7.779f, 11.996f, 7.939f, 11.22f)
                curveTo(8.099f, 10.444f, 8.493f, 9.731f, 9.072f, 9.172f)
                curveTo(9.651f, 8.612f, 10.389f, 8.231f, 11.192f, 8.077f)
                curveTo(11.995f, 7.923f, 12.828f, 8.002f, 13.585f, 8.304f)
                curveTo(14.341f, 8.607f, 14.988f, 9.12f, 15.443f, 9.778f)
                curveTo(15.898f, 10.436f, 16.141f, 11.209f, 16.141f, 12.0f)
                curveTo(16.141f, 13.061f, 15.705f, 14.078f, 14.928f, 14.828f)
                curveTo(14.151f, 15.579f, 13.098f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _settingsSolidMd!!
    }

private var _settingsSolidMd: ImageVector? = null
