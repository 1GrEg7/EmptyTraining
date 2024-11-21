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

public val DsIcon.FeedSolidMd: ImageVector
    get() {
        if (_feedSolidMd != null) {
            return _feedSolidMd!!
        }
        _feedSolidMd = Builder(name = "FeedSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.567f, 2.304f)
                curveTo(17.385f, 2.643f, 18.062f, 3.242f, 18.5f, 4.0f)
                lineTo(5.536f, 4.0f)
                curveTo(5.974f, 3.242f, 6.651f, 2.643f, 7.469f, 2.304f)
                curveTo(8.204f, 2.0f, 9.136f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.036f)
                curveTo(14.9f, 2.0f, 15.832f, 2.0f, 16.567f, 2.304f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.567f, 21.695f)
                curveTo(17.385f, 21.357f, 18.062f, 20.758f, 18.5f, 20.0f)
                horizontalLineTo(5.536f)
                curveTo(5.974f, 20.758f, 6.651f, 21.357f, 7.469f, 21.695f)
                curveTo(8.204f, 22.0f, 9.136f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.036f)
                curveTo(14.9f, 22.0f, 15.832f, 22.0f, 16.567f, 21.695f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.531f, 6.304f)
                curveTo(17.796f, 6.0f, 16.864f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 6.0f, 6.204f, 6.0f, 5.469f, 6.304f)
                curveTo(4.489f, 6.71f, 3.71f, 7.489f, 3.304f, 8.469f)
                curveTo(3.0f, 9.204f, 3.0f, 10.136f, 3.0f, 12.0f)
                curveTo(3.0f, 13.864f, 3.0f, 14.796f, 3.304f, 15.531f)
                curveTo(3.71f, 16.511f, 4.489f, 17.289f, 5.469f, 17.695f)
                curveTo(6.204f, 18.0f, 7.136f, 18.0f, 9.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                curveTo(16.864f, 18.0f, 17.796f, 18.0f, 18.531f, 17.695f)
                curveTo(19.511f, 17.289f, 20.289f, 16.511f, 20.695f, 15.531f)
                curveTo(21.0f, 14.796f, 21.0f, 13.864f, 21.0f, 12.0f)
                curveTo(21.0f, 10.136f, 21.0f, 9.204f, 20.695f, 8.469f)
                curveTo(20.289f, 7.489f, 19.511f, 6.71f, 18.531f, 6.304f)
                close()
            }
        }
        .build()
        return _feedSolidMd!!
    }

private var _feedSolidMd: ImageVector? = null
