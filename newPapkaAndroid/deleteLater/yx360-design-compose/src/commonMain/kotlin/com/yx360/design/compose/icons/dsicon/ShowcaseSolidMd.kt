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

public val DsIcon.ShowcaseSolidMd: ImageVector
    get() {
        if (_showcaseSolidMd != null) {
            return _showcaseSolidMd!!
        }
        _showcaseSolidMd = Builder(name = "ShowcaseSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.304f, 4.469f)
                curveTo(6.0f, 5.204f, 6.0f, 6.136f, 6.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.864f, 6.0f, 18.796f, 6.304f, 19.531f)
                curveTo(6.71f, 20.511f, 7.489f, 21.289f, 8.469f, 21.695f)
                curveTo(9.204f, 22.0f, 10.136f, 22.0f, 12.0f, 22.0f)
                curveTo(13.864f, 22.0f, 14.796f, 22.0f, 15.531f, 21.695f)
                curveTo(16.511f, 21.289f, 17.289f, 20.511f, 17.695f, 19.531f)
                curveTo(18.0f, 18.796f, 18.0f, 17.864f, 18.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 6.136f, 18.0f, 5.204f, 17.695f, 4.469f)
                curveTo(17.289f, 3.489f, 16.511f, 2.71f, 15.531f, 2.304f)
                curveTo(14.796f, 2.0f, 13.864f, 2.0f, 12.0f, 2.0f)
                curveTo(10.136f, 2.0f, 9.204f, 2.0f, 8.469f, 2.304f)
                curveTo(7.489f, 2.71f, 6.71f, 3.489f, 6.304f, 4.469f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.304f, 6.469f)
                curveTo(2.643f, 5.651f, 3.242f, 4.974f, 4.0f, 4.536f)
                verticalLineTo(19.464f)
                curveTo(3.242f, 19.026f, 2.643f, 18.349f, 2.304f, 17.531f)
                curveTo(2.0f, 16.796f, 2.0f, 15.864f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.136f, 2.0f, 7.204f, 2.304f, 6.469f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.695f, 17.531f)
                curveTo(21.357f, 18.349f, 20.758f, 19.026f, 20.0f, 19.464f)
                verticalLineTo(4.536f)
                curveTo(20.758f, 4.974f, 21.357f, 5.651f, 21.695f, 6.469f)
                curveTo(22.0f, 7.204f, 22.0f, 8.136f, 22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.864f, 22.0f, 16.796f, 21.695f, 17.531f)
                close()
            }
        }
        .build()
        return _showcaseSolidMd!!
    }

private var _showcaseSolidMd: ImageVector? = null
