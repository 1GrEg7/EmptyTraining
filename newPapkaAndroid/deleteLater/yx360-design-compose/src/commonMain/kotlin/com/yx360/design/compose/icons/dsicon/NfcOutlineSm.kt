package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.NfcOutlineSm: ImageVector
    get() {
        if (_nfcOutlineSm != null) {
            return _nfcOutlineSm!!
        }
        _nfcOutlineSm = Builder(name = "NfcOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.124f, 16.0f)
                    lineTo(8.955f, 15.0f)
                    curveTo(11.051f, 13.208f, 12.347f, 10.732f, 12.347f, 7.997f)
                    curveTo(12.347f, 5.265f, 11.054f, 2.792f, 8.963f, 1.0f)
                    lineTo(10.132f, 0.0f)
                    curveTo(12.522f, 2.047f, 14.0f, 4.874f, 14.0f, 7.997f)
                    curveTo(14.0f, 11.122f, 12.519f, 13.952f, 10.124f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.786f, 14.0f)
                    curveTo(9.582f, 12.464f, 10.694f, 10.341f, 10.694f, 7.997f)
                    curveTo(10.694f, 5.655f, 9.586f, 3.536f, 7.794f, 2.0f)
                    lineTo(6.625f, 3.001f)
                    curveTo(8.118f, 4.28f, 9.04f, 6.046f, 9.04f, 7.997f)
                    curveTo(9.04f, 9.951f, 8.114f, 11.719f, 6.617f, 13.0f)
                    lineTo(7.786f, 14.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.387f, 7.997f)
                    curveTo(7.387f, 9.56f, 6.646f, 10.975f, 5.448f, 11.999f)
                    lineTo(4.279f, 10.999f)
                    curveTo(5.178f, 10.231f, 5.734f, 9.169f, 5.734f, 7.997f)
                    curveTo(5.734f, 6.827f, 5.181f, 5.768f, 4.287f, 5.001f)
                    lineTo(5.456f, 4.001f)
                    curveTo(6.649f, 5.024f, 7.387f, 6.437f, 7.387f, 7.997f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.061f, 8.09f)
                    curveTo(4.064f, 8.82f, 3.768f, 9.529f, 3.226f, 10.093f)
                    lineTo(2.059f, 9.176f)
                    curveTo(2.369f, 8.855f, 2.487f, 8.511f, 2.485f, 8.094f)
                    curveTo(2.484f, 7.678f, 2.312f, 7.275f, 2.0f, 6.955f)
                    lineTo(3.11f, 6.016f)
                    curveTo(3.658f, 6.577f, 4.058f, 7.359f, 4.061f, 8.09f)
                    close()
                }
            }
        }
        .build()
        return _nfcOutlineSm!!
    }

private var _nfcOutlineSm: ImageVector? = null
