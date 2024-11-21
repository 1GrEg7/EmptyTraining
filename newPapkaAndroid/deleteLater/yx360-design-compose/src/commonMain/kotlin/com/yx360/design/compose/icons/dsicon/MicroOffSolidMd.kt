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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.MicroOffSolidMd: ImageVector
    get() {
        if (_microOffSolidMd != null) {
            return _microOffSolidMd!!
        }
        _microOffSolidMd = Builder(name = "MicroOffSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.784f, 2.0f, 9.67f, 2.434f, 8.803f, 3.155f)
                lineTo(16.197f, 13.718f)
                curveTo(16.705f, 12.936f, 17.0f, 12.002f, 17.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 4.239f, 14.761f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.042f, 6.353f)
                curveTo(7.014f, 6.565f, 7.0f, 6.781f, 7.0f, 7.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 13.761f, 9.239f, 16.0f, 12.0f, 16.0f)
                curveTo(12.563f, 16.0f, 13.104f, 15.907f, 13.609f, 15.735f)
                lineTo(14.79f, 17.422f)
                curveTo(13.935f, 17.794f, 12.992f, 18.0f, 12.0f, 18.0f)
                curveTo(8.134f, 18.0f, 5.0f, 14.866f, 5.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 15.498f, 6.3f, 19.226f, 10.612f, 19.894f)
                lineTo(11.0f, 23.0f)
                horizontalLineTo(13.0f)
                lineTo(13.388f, 19.894f)
                curveTo(14.296f, 19.753f, 15.159f, 19.477f, 15.955f, 19.087f)
                lineTo(18.0f, 22.008f)
                horizontalLineTo(20.5f)
                lineTo(6.5f, 2.008f)
                horizontalLineTo(4.0f)
                lineTo(7.042f, 6.353f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 13.37f, 20.084f, 15.525f, 18.587f, 17.132f)
                lineTo(17.407f, 15.446f)
                curveTo(18.402f, 14.237f, 19.0f, 12.688f, 19.0f, 11.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _microOffSolidMd!!
    }

private var _microOffSolidMd: ImageVector? = null
