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

public val DsIcon.Ya360SolidLg: ImageVector
    get() {
        if (_ya360SolidLg != null) {
            return _ya360SolidLg!!
        }
        _ya360SolidLg = Builder(name = "Ya360SolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.0f, 16.0f)
                curveTo(29.0f, 23.18f, 23.18f, 29.0f, 16.0f, 29.0f)
                curveTo(8.82f, 29.0f, 3.0f, 23.18f, 3.0f, 16.0f)
                curveTo(3.0f, 8.82f, 8.82f, 3.0f, 16.0f, 3.0f)
                curveTo(23.18f, 3.0f, 29.0f, 8.82f, 29.0f, 16.0f)
                close()
                moveTo(16.0f, 23.54f)
                curveTo(18.441f, 23.54f, 20.42f, 20.164f, 20.42f, 16.0f)
                curveTo(20.42f, 11.836f, 18.441f, 8.46f, 16.0f, 8.46f)
                curveTo(13.559f, 8.46f, 11.58f, 11.836f, 11.58f, 16.0f)
                curveTo(11.58f, 20.164f, 13.559f, 23.54f, 16.0f, 23.54f)
                close()
                moveTo(7.713f, 10.02f)
                curveTo(6.401f, 9.952f, 4.82f, 12.698f, 4.82f, 15.999f)
                curveTo(4.82f, 19.3f, 6.401f, 22.045f, 7.713f, 21.978f)
                curveTo(9.014f, 21.91f, 9.76f, 19.3f, 9.76f, 15.999f)
                curveTo(9.76f, 12.698f, 9.014f, 10.088f, 7.713f, 10.02f)
                close()
                moveTo(24.287f, 21.978f)
                curveTo(25.599f, 22.045f, 27.18f, 19.3f, 27.18f, 15.999f)
                curveTo(27.18f, 12.698f, 25.599f, 9.952f, 24.287f, 10.02f)
                curveTo(22.986f, 10.088f, 22.24f, 12.698f, 22.24f, 15.999f)
                curveTo(22.24f, 19.3f, 22.986f, 21.91f, 24.287f, 21.978f)
                close()
            }
        }
        .build()
        return _ya360SolidLg!!
    }

private var _ya360SolidLg: ImageVector? = null
