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

public val DsIcon.CrownSolidSm: ImageVector
    get() {
        if (_crownSolidSm != null) {
            return _crownSolidSm!!
        }
        _crownSolidSm = Builder(name = "CrownSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.036f, 5.872f)
                curveTo(15.469f, 5.634f, 15.761f, 5.173f, 15.761f, 4.645f)
                curveTo(15.761f, 3.872f, 15.135f, 3.245f, 14.361f, 3.245f)
                curveTo(13.588f, 3.245f, 12.961f, 3.872f, 12.961f, 4.645f)
                curveTo(12.961f, 4.835f, 13.0f, 5.017f, 13.068f, 5.183f)
                curveTo(12.49f, 6.209f, 11.355f, 6.951f, 10.251f, 6.664f)
                curveTo(9.643f, 6.506f, 9.361f, 6.155f, 9.191f, 5.646f)
                curveTo(9.023f, 5.142f, 8.991f, 4.541f, 8.986f, 3.905f)
                curveTo(9.242f, 3.651f, 9.4f, 3.3f, 9.4f, 2.911f)
                curveTo(9.4f, 2.138f, 8.773f, 1.511f, 8.0f, 1.511f)
                curveTo(7.227f, 1.511f, 6.6f, 2.138f, 6.6f, 2.911f)
                curveTo(6.6f, 3.284f, 6.746f, 3.622f, 6.983f, 3.873f)
                curveTo(6.978f, 4.517f, 6.945f, 5.13f, 6.772f, 5.641f)
                curveTo(6.599f, 6.152f, 6.312f, 6.505f, 5.702f, 6.664f)
                curveTo(4.605f, 6.949f, 3.478f, 6.218f, 2.896f, 5.202f)
                curveTo(2.97f, 5.031f, 3.011f, 4.843f, 3.011f, 4.645f)
                curveTo(3.011f, 3.872f, 2.384f, 3.245f, 1.611f, 3.245f)
                curveTo(0.838f, 3.245f, 0.211f, 3.872f, 0.211f, 4.645f)
                curveTo(0.211f, 5.165f, 0.495f, 5.619f, 0.915f, 5.86f)
                lineTo(1.774f, 13.031f)
                lineTo(2.766f, 13.912f)
                horizontalLineTo(13.186f)
                lineTo(14.179f, 13.031f)
                lineTo(15.036f, 5.872f)
                close()
            }
        }
        .build()
        return _crownSolidSm!!
    }

private var _crownSolidSm: ImageVector? = null
