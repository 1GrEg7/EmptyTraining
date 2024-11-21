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

public val DsIcon.GlobeOutlineSm: ImageVector
    get() {
        if (_globeOutlineSm != null) {
            return _globeOutlineSm!!
        }
        _globeOutlineSm = Builder(name = "GlobeOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 8.0f)
                curveTo(16.0f, 12.418f, 12.418f, 16.0f, 8.0f, 16.0f)
                curveTo(3.582f, 16.0f, 0.0f, 12.418f, 0.0f, 8.0f)
                curveTo(0.0f, 3.582f, 3.582f, 0.0f, 8.0f, 0.0f)
                curveTo(12.418f, 0.0f, 16.0f, 3.582f, 16.0f, 8.0f)
                close()
                moveTo(4.103f, 9.725f)
                curveTo(4.262f, 11.04f, 4.595f, 12.234f, 5.039f, 13.219f)
                curveTo(3.593f, 12.397f, 2.522f, 10.991f, 2.146f, 9.322f)
                curveTo(2.713f, 9.479f, 3.372f, 9.616f, 4.103f, 9.725f)
                close()
                moveTo(6.152f, 9.941f)
                curveTo(6.33f, 11.048f, 6.648f, 12.007f, 7.026f, 12.737f)
                curveTo(7.319f, 13.303f, 7.613f, 13.663f, 7.838f, 13.858f)
                curveTo(7.909f, 13.919f, 7.963f, 13.955f, 8.0f, 13.977f)
                curveTo(8.037f, 13.955f, 8.091f, 13.919f, 8.162f, 13.858f)
                curveTo(8.387f, 13.663f, 8.681f, 13.303f, 8.974f, 12.737f)
                curveTo(9.352f, 12.007f, 9.67f, 11.048f, 9.848f, 9.941f)
                curveTo(9.254f, 9.979f, 8.636f, 10.0f, 8.0f, 10.0f)
                curveTo(7.364f, 10.0f, 6.746f, 9.979f, 6.152f, 9.941f)
                close()
                moveTo(10.0f, 7.925f)
                curveTo(9.37f, 7.973f, 8.699f, 8.0f, 8.0f, 8.0f)
                curveTo(7.301f, 8.0f, 6.63f, 7.973f, 6.0f, 7.925f)
                curveTo(6.011f, 6.027f, 6.448f, 4.378f, 7.026f, 3.263f)
                curveTo(7.319f, 2.697f, 7.613f, 2.337f, 7.838f, 2.142f)
                curveTo(7.909f, 2.081f, 7.963f, 2.045f, 8.0f, 2.023f)
                curveTo(8.037f, 2.045f, 8.091f, 2.081f, 8.162f, 2.142f)
                curveTo(8.387f, 2.337f, 8.681f, 2.697f, 8.974f, 3.263f)
                curveTo(9.552f, 4.378f, 9.989f, 6.027f, 10.0f, 7.925f)
                close()
                moveTo(11.897f, 9.725f)
                curveTo(11.738f, 11.04f, 11.405f, 12.234f, 10.961f, 13.219f)
                curveTo(12.407f, 12.397f, 13.478f, 10.991f, 13.854f, 9.322f)
                curveTo(13.287f, 9.479f, 12.627f, 9.616f, 11.897f, 9.725f)
                close()
                moveTo(13.946f, 7.194f)
                curveTo(13.744f, 7.27f, 13.482f, 7.354f, 13.155f, 7.439f)
                curveTo(12.811f, 7.528f, 12.422f, 7.611f, 11.997f, 7.684f)
                curveTo(11.956f, 5.813f, 11.559f, 4.107f, 10.961f, 2.781f)
                curveTo(12.554f, 3.686f, 13.692f, 5.3f, 13.946f, 7.194f)
                close()
                moveTo(2.054f, 7.194f)
                curveTo(2.308f, 5.3f, 3.446f, 3.686f, 5.039f, 2.781f)
                curveTo(4.441f, 4.107f, 4.044f, 5.813f, 4.003f, 7.684f)
                curveTo(3.578f, 7.611f, 3.19f, 7.528f, 2.845f, 7.439f)
                curveTo(2.518f, 7.354f, 2.256f, 7.27f, 2.054f, 7.194f)
                close()
            }
        }
        .build()
        return _globeOutlineSm!!
    }

private var _globeOutlineSm: ImageVector? = null
