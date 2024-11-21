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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CloudOffOutlineSm: ImageVector
    get() {
        if (_cloudOffOutlineSm != null) {
            return _cloudOffOutlineSm!!
        }
        _cloudOffOutlineSm = Builder(name = "CloudOffOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.124f, 14.0f)
                    lineTo(12.5f, 16.0f)
                    horizontalLineTo(14.75f)
                    lineTo(3.75f, 0.008f)
                    horizontalLineTo(1.5f)
                    lineTo(3.661f, 3.15f)
                    curveTo(3.242f, 3.834f, 3.0f, 4.639f, 3.0f, 5.5f)
                    curveTo(3.0f, 5.709f, 3.014f, 5.914f, 3.042f, 6.115f)
                    curveTo(1.295f, 6.545f, 0.0f, 8.121f, 0.0f, 10.0f)
                    curveTo(0.0f, 12.209f, 1.791f, 14.0f, 4.0f, 14.0f)
                    horizontalLineTo(11.124f)
                    close()
                    moveTo(9.749f, 12.0f)
                    lineTo(5.026f, 5.135f)
                    curveTo(5.009f, 5.254f, 5.0f, 5.376f, 5.0f, 5.5f)
                    curveTo(5.0f, 6.215f, 5.094f, 6.838f, 5.5f, 7.5f)
                    lineTo(5.0f, 8.132f)
                    curveTo(5.0f, 8.132f, 4.723f, 8.0f, 4.0f, 8.0f)
                    curveTo(2.935f, 8.0f, 2.0f, 8.895f, 2.0f, 10.0f)
                    curveTo(2.0f, 11.105f, 2.895f, 12.0f, 4.0f, 12.0f)
                    horizontalLineTo(9.749f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 9.5f)
                    curveTo(16.0f, 10.956f, 15.309f, 12.25f, 14.236f, 13.073f)
                    lineTo(13.1f, 11.421f)
                    curveTo(13.65f, 10.962f, 14.0f, 10.272f, 14.0f, 9.5f)
                    curveTo(14.0f, 8.119f, 12.881f, 7.0f, 11.5f, 7.0f)
                    curveTo(11.105f, 7.0f, 10.649f, 7.136f, 10.266f, 7.266f)
                    lineTo(9.791f, 6.571f)
                    curveTo(9.93f, 6.159f, 10.0f, 5.857f, 10.0f, 5.5f)
                    curveTo(10.0f, 4.119f, 8.881f, 3.0f, 7.5f, 3.0f)
                    curveTo(7.437f, 3.0f, 7.375f, 3.002f, 7.313f, 3.007f)
                    lineTo(6.088f, 1.226f)
                    curveTo(6.532f, 1.079f, 7.007f, 1.0f, 7.5f, 1.0f)
                    curveTo(9.825f, 1.0f, 11.738f, 2.763f, 11.975f, 5.025f)
                    curveTo(14.237f, 5.262f, 16.0f, 7.175f, 16.0f, 9.5f)
                    close()
                }
            }
        }
        .build()
        return _cloudOffOutlineSm!!
    }

private var _cloudOffOutlineSm: ImageVector? = null
