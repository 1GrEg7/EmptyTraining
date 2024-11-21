package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.AliceOutlineSm: ImageVector
    get() {
        if (_aliceOutlineSm != null) {
            return _aliceOutlineSm!!
        }
        _aliceOutlineSm = Builder(name = "AliceOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.337f, 10.618f)
                curveTo(2.91f, 9.198f, 6.378f, 3.758f, 8.002f, 3.75f)
                curveTo(9.622f, 3.758f, 13.09f, 9.198f, 11.663f, 10.618f)
                curveTo(11.089f, 11.189f, 9.559f, 11.532f, 8.0f, 11.538f)
                curveTo(6.441f, 11.532f, 4.911f, 11.189f, 4.337f, 10.618f)
                close()
                moveTo(9.952f, 9.306f)
                curveTo(9.548f, 9.408f, 8.794f, 9.535f, 7.992f, 9.538f)
                curveTo(7.202f, 9.535f, 6.451f, 9.409f, 6.048f, 9.306f)
                curveTo(6.152f, 8.858f, 6.403f, 8.265f, 6.756f, 7.657f)
                curveTo(7.121f, 7.027f, 7.56f, 6.441f, 7.961f, 6.038f)
                curveTo(7.974f, 6.025f, 7.988f, 6.011f, 8.001f, 5.999f)
                curveTo(8.014f, 6.011f, 8.027f, 6.024f, 8.04f, 6.038f)
                curveTo(8.441f, 6.44f, 8.879f, 7.027f, 9.244f, 7.657f)
                curveTo(9.597f, 8.265f, 9.848f, 8.857f, 9.952f, 9.306f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f)
                curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                curveTo(16.0f, 3.582f, 12.418f, 0.0f, 8.0f, 0.0f)
                curveTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveTo(14.0f, 11.314f, 11.314f, 14.0f, 8.0f, 14.0f)
                curveTo(4.686f, 14.0f, 2.0f, 11.314f, 2.0f, 8.0f)
                curveTo(2.0f, 4.686f, 4.686f, 2.0f, 8.0f, 2.0f)
                curveTo(11.314f, 2.0f, 14.0f, 4.686f, 14.0f, 8.0f)
                close()
            }
        }
        .build()
        return _aliceOutlineSm!!
    }

private var _aliceOutlineSm: ImageVector? = null
