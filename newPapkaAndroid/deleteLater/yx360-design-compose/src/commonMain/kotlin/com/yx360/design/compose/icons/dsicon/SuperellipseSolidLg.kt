package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.SuperellipseSolidLg: ImageVector
    get() {
        if (_superellipseSolidLg != null) {
            return _superellipseSolidLg!!
        }
        _superellipseSolidLg = Builder(name = "SuperellipseSolidLg", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                curveTo(5.0f, 10.2f, 5.0f, 8.8f, 5.545f, 7.73f)
                curveTo(6.024f, 6.789f, 6.789f, 6.024f, 7.73f, 5.545f)
                curveTo(8.8f, 5.0f, 10.2f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(21.8f, 5.0f, 23.2f, 5.0f, 24.27f, 5.545f)
                curveTo(25.211f, 6.024f, 25.976f, 6.789f, 26.455f, 7.73f)
                curveTo(27.0f, 8.8f, 27.0f, 10.2f, 27.0f, 13.0f)
                verticalLineTo(19.0f)
                curveTo(27.0f, 21.8f, 27.0f, 23.2f, 26.455f, 24.27f)
                curveTo(25.976f, 25.211f, 25.211f, 25.976f, 24.27f, 26.455f)
                curveTo(23.2f, 27.0f, 21.8f, 27.0f, 19.0f, 27.0f)
                horizontalLineTo(13.0f)
                curveTo(10.2f, 27.0f, 8.8f, 27.0f, 7.73f, 26.455f)
                curveTo(6.789f, 25.976f, 6.024f, 25.211f, 5.545f, 24.27f)
                curveTo(5.0f, 23.2f, 5.0f, 21.8f, 5.0f, 19.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _superellipseSolidLg!!
    }

private var _superellipseSolidLg: ImageVector? = null
