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

public val DsIcon.FolderSolidMd: ImageVector
    get() {
        if (_folderSolidMd != null) {
            return _folderSolidMd!!
        }
        _folderSolidMd = Builder(name = "FolderSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 7.136f, 2.0f, 6.204f, 2.304f, 5.469f)
                curveTo(2.71f, 4.489f, 3.489f, 3.71f, 4.469f, 3.304f)
                curveTo(5.204f, 3.0f, 6.136f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 5.0f, 18.796f, 5.0f, 19.531f, 5.304f)
                curveTo(20.511f, 5.71f, 21.289f, 6.489f, 21.695f, 7.469f)
                curveTo(22.0f, 8.204f, 22.0f, 9.136f, 22.0f, 11.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.864f, 22.0f, 16.796f, 21.695f, 17.531f)
                curveTo(21.289f, 18.511f, 20.511f, 19.289f, 19.531f, 19.695f)
                curveTo(18.796f, 20.0f, 17.864f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 20.0f, 5.204f, 20.0f, 4.469f, 19.695f)
                curveTo(3.489f, 19.289f, 2.71f, 18.511f, 2.304f, 17.531f)
                curveTo(2.0f, 16.796f, 2.0f, 15.864f, 2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _folderSolidMd!!
    }

private var _folderSolidMd: ImageVector? = null
