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

public val DsIcon.ArchiveSolidMd: ImageVector
    get() {
        if (_archiveSolidMd != null) {
            return _archiveSolidMd!!
        }
        _archiveSolidMd = Builder(name = "ArchiveSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 15.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 7.136f, 1.0f, 6.204f, 1.304f, 5.469f)
                curveTo(1.71f, 4.489f, 2.489f, 3.71f, 3.469f, 3.304f)
                curveTo(4.204f, 3.0f, 5.136f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.864f, 3.0f, 19.796f, 3.0f, 20.531f, 3.304f)
                curveTo(21.511f, 3.71f, 22.289f, 4.489f, 22.695f, 5.469f)
                curveTo(23.0f, 6.204f, 23.0f, 7.136f, 23.0f, 9.0f)
                verticalLineTo(10.0f)
                lineTo(21.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.864f, 21.0f, 17.796f, 20.695f, 18.531f)
                curveTo(20.289f, 19.511f, 19.511f, 20.289f, 18.531f, 20.695f)
                curveTo(17.796f, 21.0f, 16.864f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 21.0f, 6.204f, 21.0f, 5.469f, 20.695f)
                curveTo(4.489f, 20.289f, 3.71f, 19.511f, 3.304f, 18.531f)
                curveTo(3.0f, 17.796f, 3.0f, 16.864f, 3.0f, 15.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _archiveSolidMd!!
    }

private var _archiveSolidMd: ImageVector? = null
