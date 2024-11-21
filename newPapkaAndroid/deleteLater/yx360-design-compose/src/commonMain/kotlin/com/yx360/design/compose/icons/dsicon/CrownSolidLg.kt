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

public val DsIcon.CrownSolidLg: ImageVector
    get() {
        if (_crownSolidLg != null) {
            return _crownSolidLg!!
        }
        _crownSolidLg = Builder(name = "CrownSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.223f, 11.884f)
                curveTo(28.055f, 11.628f, 28.66f, 10.854f, 28.66f, 9.939f)
                curveTo(28.66f, 8.815f, 27.749f, 7.904f, 26.625f, 7.904f)
                curveTo(25.501f, 7.904f, 24.59f, 8.815f, 24.59f, 9.939f)
                curveTo(24.59f, 10.474f, 24.796f, 10.96f, 25.134f, 11.324f)
                curveTo(24.054f, 13.178f, 21.911f, 14.664f, 19.662f, 14.079f)
                curveTo(18.372f, 13.743f, 17.745f, 12.95f, 17.402f, 11.92f)
                curveTo(17.087f, 10.973f, 17.031f, 9.873f, 17.021f, 8.799f)
                curveTo(17.631f, 8.448f, 18.041f, 7.789f, 18.041f, 7.035f)
                curveTo(18.041f, 5.911f, 17.13f, 5.0f, 16.006f, 5.0f)
                curveTo(14.882f, 5.0f, 13.971f, 5.911f, 13.971f, 7.035f)
                curveTo(13.971f, 7.8f, 14.393f, 8.466f, 15.017f, 8.814f)
                curveTo(15.006f, 9.88f, 14.944f, 10.974f, 14.625f, 11.916f)
                curveTo(14.276f, 12.947f, 13.642f, 13.742f, 12.35f, 14.079f)
                curveTo(10.086f, 14.668f, 7.929f, 13.157f, 6.856f, 11.285f)
                curveTo(7.173f, 10.926f, 7.365f, 10.455f, 7.365f, 9.939f)
                curveTo(7.365f, 8.815f, 6.454f, 7.904f, 5.33f, 7.904f)
                curveTo(4.206f, 7.904f, 3.295f, 8.815f, 3.295f, 9.939f)
                curveTo(3.295f, 10.876f, 3.929f, 11.665f, 4.791f, 11.901f)
                lineTo(6.245f, 24.052f)
                lineTo(7.238f, 24.934f)
                horizontalLineTo(24.774f)
                lineTo(25.767f, 24.052f)
                lineTo(27.223f, 11.884f)
                close()
            }
        }
        .build()
        return _crownSolidLg!!
    }

private var _crownSolidLg: ImageVector? = null
