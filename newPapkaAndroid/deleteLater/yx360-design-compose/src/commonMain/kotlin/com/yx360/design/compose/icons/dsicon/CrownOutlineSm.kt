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

public val DsIcon.CrownOutlineSm: ImageVector
    get() {
        if (_crownOutlineSm != null) {
            return _crownOutlineSm!!
        }
        _crownOutlineSm = Builder(name = "CrownOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.986f, 3.905f)
                curveTo(9.242f, 3.651f, 9.401f, 3.3f, 9.401f, 2.911f)
                curveTo(9.401f, 2.138f, 8.774f, 1.511f, 8.001f, 1.511f)
                curveTo(7.227f, 1.511f, 6.601f, 2.138f, 6.601f, 2.911f)
                curveTo(6.601f, 3.284f, 6.746f, 3.622f, 6.984f, 3.873f)
                curveTo(6.978f, 4.517f, 6.945f, 5.13f, 6.772f, 5.641f)
                curveTo(6.599f, 6.152f, 6.312f, 6.505f, 5.703f, 6.664f)
                curveTo(4.64f, 6.94f, 3.55f, 6.263f, 2.953f, 5.298f)
                curveTo(3.056f, 5.103f, 3.114f, 4.881f, 3.114f, 4.645f)
                curveTo(3.114f, 3.872f, 2.488f, 3.245f, 1.714f, 3.245f)
                curveTo(0.941f, 3.245f, 0.314f, 3.872f, 0.314f, 4.645f)
                curveTo(0.314f, 5.118f, 0.549f, 5.536f, 0.907f, 5.789f)
                lineTo(1.774f, 13.031f)
                lineTo(2.767f, 13.912f)
                horizontalLineTo(7.985f)
                horizontalLineTo(13.187f)
                lineTo(14.18f, 13.031f)
                lineTo(15.049f, 5.767f)
                curveTo(15.391f, 5.511f, 15.611f, 5.104f, 15.611f, 4.645f)
                curveTo(15.611f, 3.872f, 14.985f, 3.245f, 14.212f, 3.245f)
                curveTo(13.438f, 3.245f, 12.811f, 3.872f, 12.811f, 4.645f)
                curveTo(12.811f, 4.891f, 12.875f, 5.121f, 12.986f, 5.322f)
                curveTo(12.386f, 6.275f, 11.305f, 6.938f, 10.252f, 6.664f)
                curveTo(9.644f, 6.506f, 9.361f, 6.155f, 9.191f, 5.646f)
                curveTo(9.023f, 5.142f, 8.992f, 4.541f, 8.986f, 3.905f)
                close()
                moveTo(6.206f, 8.599f)
                curveTo(6.992f, 8.395f, 7.566f, 8.005f, 7.979f, 7.521f)
                curveTo(8.389f, 8.005f, 8.962f, 8.395f, 9.748f, 8.599f)
                curveTo(10.869f, 8.891f, 11.89f, 8.68f, 12.742f, 8.215f)
                lineTo(12.3f, 11.912f)
                horizontalLineTo(7.985f)
                horizontalLineTo(3.654f)
                lineTo(3.212f, 8.215f)
                curveTo(4.064f, 8.68f, 5.085f, 8.891f, 6.206f, 8.599f)
                close()
            }
        }
        .build()
        return _crownOutlineSm!!
    }

private var _crownOutlineSm: ImageVector? = null
