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

public val DsIcon.BoxSolidMd: ImageVector
    get() {
        if (_boxSolidMd != null) {
            return _boxSolidMd!!
        }
        _boxSolidMd = Builder(name = "BoxSolidMd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 3.002f)
                curveTo(17.224f, 3.012f, 17.941f, 3.06f, 18.531f, 3.304f)
                curveTo(19.511f, 3.71f, 20.289f, 4.489f, 20.695f, 5.469f)
                curveTo(21.0f, 6.204f, 21.0f, 7.136f, 21.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.864f, 21.0f, 17.796f, 20.695f, 18.531f)
                curveTo(20.289f, 19.511f, 19.511f, 20.289f, 18.531f, 20.695f)
                curveTo(17.796f, 21.0f, 16.864f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 21.0f, 6.204f, 21.0f, 5.469f, 20.695f)
                curveTo(4.489f, 20.289f, 3.71f, 19.511f, 3.304f, 18.531f)
                curveTo(3.0f, 17.796f, 3.0f, 16.864f, 3.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 7.136f, 3.0f, 6.204f, 3.304f, 5.469f)
                curveTo(3.71f, 4.489f, 4.489f, 3.71f, 5.469f, 3.304f)
                curveTo(6.204f, 3.0f, 7.136f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.002f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _boxSolidMd!!
    }

private var _boxSolidMd: ImageVector? = null
