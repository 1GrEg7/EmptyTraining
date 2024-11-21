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

public val DsIcon.CallOutlineSm: ImageVector
    get() {
        if (_callOutlineSm != null) {
            return _callOutlineSm!!
        }
        _callOutlineSm = Builder(name = "CallOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.454f, 1.189f)
                curveTo(-0.193f, 2.682f, -0.25f, 4.837f, 0.347f, 6.768f)
                curveTo(0.946f, 8.708f, 2.26f, 10.675f, 3.792f, 12.208f)
                curveTo(5.325f, 13.74f, 7.292f, 15.054f, 9.232f, 15.653f)
                curveTo(11.163f, 16.25f, 13.318f, 16.193f, 14.811f, 14.547f)
                curveTo(15.034f, 14.301f, 15.339f, 13.854f, 15.698f, 13.289f)
                curveTo(16.27f, 12.392f, 16.006f, 11.201f, 15.108f, 10.63f)
                lineTo(15.089f, 10.617f)
                lineTo(12.855f, 9.335f)
                curveTo(12.482f, 9.121f, 12.013f, 8.998f, 11.52f, 9.091f)
                curveTo(11.055f, 9.18f, 10.661f, 9.444f, 10.38f, 9.827f)
                curveTo(10.095f, 10.08f, 9.796f, 10.13f, 9.366f, 9.994f)
                curveTo(8.829f, 9.824f, 8.158f, 9.366f, 7.415f, 8.624f)
                curveTo(6.672f, 7.881f, 6.204f, 7.2f, 6.028f, 6.652f)
                curveTo(5.883f, 6.202f, 5.938f, 5.899f, 6.192f, 5.618f)
                curveTo(6.955f, 5.023f, 7.134f, 3.963f, 6.665f, 3.145f)
                lineTo(5.383f, 0.911f)
                lineTo(5.37f, 0.892f)
                curveTo(4.799f, -0.006f, 3.608f, -0.27f, 2.711f, 0.302f)
                curveTo(2.147f, 0.661f, 1.699f, 0.966f, 1.454f, 1.189f)
                close()
                moveTo(2.291f, 6.167f)
                curveTo(2.771f, 7.719f, 3.873f, 9.411f, 5.231f, 10.769f)
                curveTo(6.589f, 12.126f, 8.281f, 13.229f, 9.833f, 13.709f)
                curveTo(11.395f, 14.191f, 12.568f, 13.99f, 13.303f, 13.179f)
                curveTo(13.386f, 13.088f, 13.583f, 12.817f, 13.919f, 12.293f)
                lineTo(11.935f, 11.154f)
                lineTo(11.875f, 11.214f)
                curveTo(10.957f, 12.127f, 9.825f, 12.274f, 8.753f, 11.935f)
                curveTo(7.759f, 11.621f, 6.81f, 10.897f, 5.976f, 10.063f)
                curveTo(5.141f, 9.228f, 4.412f, 8.274f, 4.09f, 7.276f)
                curveTo(3.745f, 6.206f, 3.874f, 5.06f, 4.796f, 4.134f)
                lineTo(4.853f, 4.077f)
                lineTo(3.707f, 2.081f)
                curveTo(3.184f, 2.417f, 2.912f, 2.614f, 2.821f, 2.697f)
                curveTo(2.01f, 3.433f, 1.809f, 4.605f, 2.291f, 6.167f)
                close()
            }
        }
        .build()
        return _callOutlineSm!!
    }

private var _callOutlineSm: ImageVector? = null
