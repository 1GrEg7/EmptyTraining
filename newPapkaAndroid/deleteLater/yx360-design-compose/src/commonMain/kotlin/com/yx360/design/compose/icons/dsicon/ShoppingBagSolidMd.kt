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

public val DsIcon.ShoppingBagSolidMd: ImageVector
    get() {
        if (_shoppingBagSolidMd != null) {
            return _shoppingBagSolidMd!!
        }
        _shoppingBagSolidMd = Builder(name = "ShoppingBagSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 2.791f, 9.791f, 1.0f, 12.0f, 1.0f)
                curveTo(14.209f, 1.0f, 16.0f, 2.791f, 16.0f, 5.0f)
                horizontalLineTo(20.001f)
                lineTo(20.319f, 15.824f)
                curveTo(20.376f, 17.736f, 20.404f, 18.693f, 20.11f, 19.449f)
                curveTo(19.718f, 20.457f, 18.935f, 21.263f, 17.94f, 21.684f)
                curveTo(17.192f, 22.0f, 16.236f, 22.0f, 14.322f, 22.0f)
                horizontalLineTo(9.68f)
                curveTo(7.766f, 22.0f, 6.809f, 22.0f, 6.062f, 21.684f)
                curveTo(5.067f, 21.263f, 4.284f, 20.457f, 3.892f, 19.449f)
                curveTo(3.598f, 18.693f, 3.626f, 17.736f, 3.683f, 15.824f)
                lineTo(4.001f, 5.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveTo(10.0f, 3.895f, 10.895f, 3.0f, 12.0f, 3.0f)
                curveTo(13.105f, 3.0f, 14.0f, 3.895f, 14.0f, 5.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(14.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _shoppingBagSolidMd!!
    }

private var _shoppingBagSolidMd: ImageVector? = null
