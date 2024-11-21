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

public val DsIcon.SuperellipseSolidMd: ImageVector
    get() {
        if (_superellipseSolidMd != null) {
            return _superellipseSolidMd!!
        }
        _superellipseSolidMd = Builder(name = "SuperellipseSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.262f, 2.0f, 6.392f, 2.804f, 5.0f)
                curveTo(3.33f, 4.088f, 4.088f, 3.33f, 5.0f, 2.804f)
                curveTo(6.392f, 2.0f, 8.262f, 2.0f, 12.0f, 2.0f)
                curveTo(15.738f, 2.0f, 17.608f, 2.0f, 19.0f, 2.804f)
                curveTo(19.912f, 3.33f, 20.67f, 4.088f, 21.196f, 5.0f)
                curveTo(22.0f, 6.392f, 22.0f, 8.262f, 22.0f, 12.0f)
                curveTo(22.0f, 15.738f, 22.0f, 17.608f, 21.196f, 19.0f)
                curveTo(20.67f, 19.912f, 19.912f, 20.67f, 19.0f, 21.196f)
                curveTo(17.608f, 22.0f, 15.738f, 22.0f, 12.0f, 22.0f)
                curveTo(8.262f, 22.0f, 6.392f, 22.0f, 5.0f, 21.196f)
                curveTo(4.088f, 20.67f, 3.33f, 19.912f, 2.804f, 19.0f)
                curveTo(2.0f, 17.608f, 2.0f, 15.738f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _superellipseSolidMd!!
    }

private var _superellipseSolidMd: ImageVector? = null
