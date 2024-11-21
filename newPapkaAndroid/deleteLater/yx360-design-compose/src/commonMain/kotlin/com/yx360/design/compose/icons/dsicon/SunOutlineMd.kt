package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.SunOutlineMd: ImageVector
    get() {
        if (_sunOutlineMd != null) {
            return _sunOutlineMd!!
        }
        _sunOutlineMd = Builder(name = "SunOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.247f, 5.0f)
                lineTo(12.997f, 1.0f)
                horizontalLineTo(10.997f)
                lineTo(10.747f, 5.0f)
                horizontalLineTo(13.247f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.307f, 6.655f)
                lineTo(4.025f, 4.355f)
                lineTo(2.778f, 5.918f)
                lineTo(5.748f, 8.609f)
                lineTo(7.307f, 6.655f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.047f, 13.462f)
                lineTo(4.892f, 12.332f)
                lineTo(5.446f, 14.77f)
                lineTo(1.49f, 15.412f)
                lineTo(1.047f, 13.462f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.818f, 17.759f)
                lineTo(6.303f, 21.469f)
                lineTo(8.103f, 22.339f)
                lineTo(10.069f, 18.847f)
                lineTo(7.818f, 17.759f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.851f, 22.351f)
                lineTo(13.898f, 18.852f)
                lineTo(16.152f, 17.772f)
                lineTo(17.655f, 21.487f)
                lineTo(15.851f, 22.351f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.535f, 14.791f)
                lineTo(22.488f, 15.447f)
                lineTo(22.938f, 13.498f)
                lineTo(19.097f, 12.355f)
                lineTo(18.535f, 14.791f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.242f, 5.944f)
                lineTo(18.263f, 8.625f)
                lineTo(16.71f, 6.666f)
                lineTo(20.0f, 4.377f)
                lineTo(21.242f, 5.944f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 15.314f, 15.314f, 18.0f, 12.0f, 18.0f)
                curveTo(8.686f, 18.0f, 6.0f, 15.314f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                curveTo(9.791f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sunOutlineMd!!
    }

private var _sunOutlineMd: ImageVector? = null
