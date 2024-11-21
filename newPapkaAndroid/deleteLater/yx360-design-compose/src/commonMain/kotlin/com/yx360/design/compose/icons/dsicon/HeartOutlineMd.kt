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

public val DsIcon.HeartOutlineMd: ImageVector
    get() {
        if (_heartOutlineMd != null) {
            return _heartOutlineMd!!
        }
        _heartOutlineMd = Builder(name = "HeartOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.605f, 4.48f)
                curveTo(4.649f, 3.437f, 6.053f, 3.0f, 7.5f, 3.0f)
                curveTo(9.603f, 3.0f, 11.083f, 4.123f, 12.0f, 5.667f)
                curveTo(12.912f, 4.125f, 14.381f, 3.0f, 16.5f, 3.0f)
                curveTo(17.947f, 3.0f, 19.351f, 3.437f, 20.395f, 4.48f)
                curveTo(21.442f, 5.527f, 22.0f, 7.059f, 22.0f, 9.0f)
                curveTo(22.0f, 11.774f, 20.322f, 14.354f, 18.409f, 16.363f)
                curveTo(16.472f, 18.398f, 14.131f, 20.133f, 12.461f, 21.0f)
                horizontalLineTo(11.539f)
                curveTo(9.869f, 20.133f, 7.528f, 18.398f, 5.591f, 16.363f)
                curveTo(3.678f, 14.354f, 2.0f, 11.774f, 2.0f, 9.0f)
                curveTo(2.0f, 7.059f, 2.558f, 5.527f, 3.605f, 4.48f)
                close()
                moveTo(5.02f, 5.895f)
                curveTo(4.442f, 6.473f, 4.0f, 7.441f, 4.0f, 9.0f)
                curveTo(4.0f, 10.996f, 5.242f, 13.096f, 7.039f, 14.984f)
                curveTo(8.637f, 16.663f, 10.548f, 18.178f, 12.0f, 19.0f)
                curveTo(13.452f, 18.178f, 15.363f, 16.663f, 16.961f, 14.984f)
                curveTo(18.758f, 13.096f, 20.0f, 10.996f, 20.0f, 9.0f)
                curveTo(20.0f, 7.441f, 19.558f, 6.473f, 18.98f, 5.895f)
                curveTo(18.399f, 5.313f, 17.553f, 5.0f, 16.5f, 5.0f)
                curveTo(14.677f, 5.0f, 13.5f, 6.5f, 13.0f, 8.5f)
                lineTo(11.038f, 8.496f)
                curveTo(10.5f, 6.5f, 9.307f, 5.0f, 7.5f, 5.0f)
                curveTo(6.447f, 5.0f, 5.601f, 5.313f, 5.02f, 5.895f)
                close()
            }
        }
        .build()
        return _heartOutlineMd!!
    }

private var _heartOutlineMd: ImageVector? = null
