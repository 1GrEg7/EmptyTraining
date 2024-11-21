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

public val DsIcon.KeyboardSolidMd: ImageVector
    get() {
        if (_keyboardSolidMd != null) {
            return _keyboardSolidMd!!
        }
        _keyboardSolidMd = Builder(name = "KeyboardSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.304f, 6.469f)
                curveTo(2.0f, 7.204f, 2.0f, 8.136f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.864f, 2.0f, 16.796f, 2.304f, 17.531f)
                curveTo(2.71f, 18.511f, 3.489f, 19.289f, 4.469f, 19.695f)
                curveTo(5.204f, 20.0f, 6.136f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 20.0f, 18.796f, 20.0f, 19.531f, 19.695f)
                curveTo(20.511f, 19.289f, 21.289f, 18.511f, 21.695f, 17.531f)
                curveTo(22.0f, 16.796f, 22.0f, 15.864f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.136f, 22.0f, 7.204f, 21.695f, 6.469f)
                curveTo(21.289f, 5.489f, 20.511f, 4.71f, 19.531f, 4.304f)
                curveTo(18.796f, 4.0f, 17.864f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 4.0f, 5.204f, 4.0f, 4.469f, 4.304f)
                curveTo(3.489f, 4.71f, 2.71f, 5.489f, 2.304f, 6.469f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(15.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _keyboardSolidMd!!
    }

private var _keyboardSolidMd: ImageVector? = null
