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

public val DsIcon.StarOutlineSm: ImageVector
    get() {
        if (_starOutlineSm != null) {
            return _starOutlineSm!!
        }
        _starOutlineSm = Builder(name = "StarOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.314f, 1.0f)
                horizontalLineTo(7.7f)
                lineTo(5.693f, 5.069f)
                lineTo(1.195f, 5.726f)
                lineTo(1.0f, 6.312f)
                lineTo(4.248f, 9.48f)
                lineTo(3.487f, 13.963f)
                lineTo(3.989f, 14.318f)
                lineTo(8.001f, 12.214f)
                lineTo(12.013f, 14.318f)
                lineTo(12.516f, 13.963f)
                lineTo(11.748f, 9.492f)
                lineTo(15.0f, 6.314f)
                lineTo(14.816f, 5.726f)
                lineTo(10.333f, 5.075f)
                lineTo(8.314f, 1.0f)
                close()
                moveTo(6.835f, 6.639f)
                lineTo(8.01f, 4.257f)
                lineTo(9.194f, 6.646f)
                lineTo(11.812f, 7.027f)
                lineTo(10.461f, 8.347f)
                lineTo(9.904f, 8.904f)
                lineTo(10.351f, 11.506f)
                lineTo(8.001f, 10.274f)
                lineTo(5.647f, 11.508f)
                lineTo(6.093f, 8.879f)
                lineTo(4.192f, 7.025f)
                lineTo(6.835f, 6.639f)
                close()
            }
        }
        .build()
        return _starOutlineSm!!
    }

private var _starOutlineSm: ImageVector? = null
