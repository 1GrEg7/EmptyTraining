package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val DsIcon.SherifOutlineSm: ImageVector
    get() {
        if (_sherifOutlineSm != null) {
            return _sherifOutlineSm!!
        }
        _sherifOutlineSm = Builder(name = "SherifOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.204f, 6.318f)
                lineTo(8.0f, 4.28f)
                lineTo(6.796f, 6.318f)
                lineTo(4.412f, 6.791f)
                lineTo(6.052f, 8.524f)
                lineTo(5.783f, 10.855f)
                lineTo(8.0f, 9.888f)
                lineTo(10.217f, 10.855f)
                lineTo(9.948f, 8.524f)
                lineTo(11.588f, 6.791f)
                lineTo(9.204f, 6.318f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.065f, 1.781f)
                curveTo(12.692f, 2.064f, 11.447f, 1.899f, 10.537f, 1.501f)
                curveTo(9.608f, 1.095f, 9.136f, 0.508f, 9.033f, 0.0f)
                lineTo(6.996f, 0.0f)
                curveTo(6.893f, 0.504f, 6.419f, 1.092f, 5.479f, 1.5f)
                curveTo(4.561f, 1.899f, 3.307f, 2.064f, 1.935f, 1.781f)
                lineTo(1.0f, 3.481f)
                curveTo(1.222f, 3.686f, 1.779f, 4.515f, 1.605f, 5.486f)
                curveTo(1.591f, 5.567f, 1.552f, 5.697f, 1.501f, 5.868f)
                curveTo(1.161f, 7.005f, 0.274f, 9.973f, 2.317f, 12.54f)
                curveTo(3.713f, 14.294f, 6.16f, 15.388f, 7.65f, 15.903f)
                lineTo(8.004f, 16.025f)
                lineTo(8.358f, 15.9f)
                curveTo(9.869f, 15.365f, 12.286f, 14.295f, 13.683f, 12.54f)
                curveTo(15.726f, 9.973f, 14.839f, 7.005f, 14.499f, 5.868f)
                curveTo(14.448f, 5.697f, 14.409f, 5.567f, 14.395f, 5.486f)
                curveTo(14.221f, 4.514f, 14.778f, 3.686f, 15.0f, 3.481f)
                lineTo(14.065f, 1.781f)
                close()
                moveTo(6.332f, 3.324f)
                curveTo(6.965f, 3.049f, 7.547f, 2.673f, 8.012f, 2.209f)
                curveTo(8.473f, 2.672f, 9.05f, 3.048f, 9.681f, 3.323f)
                curveTo(10.495f, 3.679f, 11.442f, 3.89f, 12.457f, 3.919f)
                curveTo(12.293f, 4.481f, 12.224f, 5.128f, 12.349f, 5.825f)
                curveTo(12.394f, 6.077f, 12.469f, 6.358f, 12.551f, 6.662f)
                curveTo(12.899f, 7.956f, 13.358f, 9.662f, 12.036f, 11.323f)
                curveTo(11.102f, 12.496f, 9.396f, 13.361f, 7.997f, 13.892f)
                curveTo(6.627f, 13.379f, 4.896f, 12.494f, 3.964f, 11.323f)
                curveTo(2.642f, 9.662f, 3.101f, 7.956f, 3.449f, 6.662f)
                curveTo(3.53f, 6.359f, 3.606f, 6.077f, 3.651f, 5.825f)
                curveTo(3.776f, 5.128f, 3.707f, 4.481f, 3.543f, 3.919f)
                curveTo(4.561f, 3.891f, 5.513f, 3.679f, 6.332f, 3.324f)
                close()
            }
        }
        .build()
        return _sherifOutlineSm!!
    }

private var _sherifOutlineSm: ImageVector? = null
