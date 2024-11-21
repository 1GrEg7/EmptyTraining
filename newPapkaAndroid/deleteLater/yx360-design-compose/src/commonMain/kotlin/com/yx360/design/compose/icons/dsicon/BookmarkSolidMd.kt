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

public val DsIcon.BookmarkSolidMd: ImageVector
    get() {
        if (_bookmarkSolidMd != null) {
            return _bookmarkSolidMd!!
        }
        _bookmarkSolidMd = Builder(name = "BookmarkSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveTo(20.0f, 6.136f, 20.0f, 5.205f, 19.695f, 4.47f)
                curveTo(19.289f, 3.489f, 18.511f, 2.711f, 17.531f, 2.305f)
                curveTo(16.796f, 2.0f, 15.864f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(8.136f, 2.0f, 7.204f, 2.0f, 6.469f, 2.305f)
                curveTo(5.489f, 2.711f, 4.71f, 3.489f, 4.304f, 4.47f)
                curveTo(4.0f, 5.205f, 4.0f, 6.136f, 4.0f, 8.0f)
                lineTo(4.0f, 21.985f)
                horizontalLineTo(5.5f)
                lineTo(12.0f, 17.985f)
                lineTo(18.5f, 21.985f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bookmarkSolidMd!!
    }

private var _bookmarkSolidMd: ImageVector? = null
