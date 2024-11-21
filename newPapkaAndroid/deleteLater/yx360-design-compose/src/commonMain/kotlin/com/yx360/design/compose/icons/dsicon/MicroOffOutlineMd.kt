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

public val DsIcon.MicroOffOutlineMd: ImageVector
    get() {
        if (_microOffOutlineMd != null) {
            return _microOffOutlineMd!!
        }
        _microOffOutlineMd = Builder(name = "MicroOffOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 5.343f, 13.657f, 4.0f, 12.0f, 4.0f)
                curveTo(11.224f, 4.0f, 10.517f, 4.294f, 9.985f, 4.778f)
                lineTo(8.832f, 3.131f)
                curveTo(9.695f, 2.424f, 10.798f, 2.0f, 12.0f, 2.0f)
                curveTo(14.761f, 2.0f, 17.0f, 4.239f, 17.0f, 7.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 11.988f, 16.713f, 12.909f, 16.219f, 13.684f)
                lineTo(14.894f, 11.792f)
                curveTo(14.963f, 11.54f, 15.0f, 11.274f, 15.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.609f, 15.735f)
                curveTo(13.104f, 15.907f, 12.563f, 16.0f, 12.0f, 16.0f)
                curveTo(9.239f, 16.0f, 7.0f, 13.761f, 7.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 6.781f, 7.014f, 6.565f, 7.042f, 6.353f)
                lineTo(4.0f, 2.008f)
                horizontalLineTo(6.5f)
                lineTo(20.5f, 22.0f)
                lineTo(18.0f, 22.008f)
                lineTo(15.955f, 19.087f)
                curveTo(15.159f, 19.477f, 14.296f, 19.753f, 13.388f, 19.894f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                lineTo(10.612f, 19.894f)
                curveTo(6.3f, 19.226f, 3.0f, 15.498f, 3.0f, 11.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 14.866f, 8.134f, 18.0f, 12.0f, 18.0f)
                curveTo(12.992f, 18.0f, 13.935f, 17.794f, 14.79f, 17.422f)
                lineTo(13.609f, 15.735f)
                close()
                moveTo(12.378f, 13.976f)
                lineTo(9.0f, 9.151f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 12.657f, 10.343f, 14.0f, 12.0f, 14.0f)
                curveTo(12.128f, 14.0f, 12.254f, 13.992f, 12.378f, 13.976f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 13.356f, 20.095f, 15.5f, 18.613f, 17.104f)
                lineTo(17.431f, 15.416f)
                curveTo(18.412f, 14.212f, 19.0f, 12.674f, 19.0f, 11.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _microOffOutlineMd!!
    }

private var _microOffOutlineMd: ImageVector? = null
