package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.ShoppingBagOutlineMd: ImageVector
    get() {
        if (_shoppingBagOutlineMd != null) {
            return _shoppingBagOutlineMd!!
        }
        _shoppingBagOutlineMd = Builder(name = "ShoppingBagOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(9.791f, 1.0f, 8.0f, 2.791f, 8.0f, 5.0f)
                horizontalLineTo(4.001f)
                lineTo(3.683f, 15.824f)
                curveTo(3.626f, 17.736f, 3.598f, 18.693f, 3.892f, 19.449f)
                curveTo(4.284f, 20.457f, 5.067f, 21.263f, 6.062f, 21.684f)
                curveTo(6.809f, 22.0f, 7.766f, 22.0f, 9.68f, 22.0f)
                horizontalLineTo(14.322f)
                curveTo(16.236f, 22.0f, 17.192f, 22.0f, 17.94f, 21.684f)
                curveTo(18.935f, 21.263f, 19.718f, 20.457f, 20.11f, 19.449f)
                curveTo(20.404f, 18.693f, 20.376f, 17.736f, 20.319f, 15.824f)
                lineTo(20.001f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 2.791f, 14.209f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(10.895f, 3.0f, 10.0f, 3.895f, 10.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 3.895f, 13.105f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(5.943f, 7.0f)
                lineTo(5.682f, 15.882f)
                curveTo(5.653f, 16.867f, 5.635f, 17.503f, 5.654f, 17.991f)
                curveTo(5.673f, 18.461f, 5.723f, 18.64f, 5.756f, 18.724f)
                curveTo(5.952f, 19.228f, 6.343f, 19.632f, 6.841f, 19.842f)
                curveTo(6.925f, 19.877f, 7.102f, 19.933f, 7.571f, 19.965f)
                curveTo(8.058f, 19.999f, 8.695f, 20.0f, 9.68f, 20.0f)
                horizontalLineTo(14.322f)
                curveTo(15.307f, 20.0f, 15.944f, 19.999f, 16.431f, 19.965f)
                curveTo(16.9f, 19.933f, 17.077f, 19.877f, 17.16f, 19.842f)
                curveTo(17.659f, 19.632f, 18.05f, 19.228f, 18.246f, 18.724f)
                curveTo(18.279f, 18.64f, 18.329f, 18.461f, 18.347f, 17.991f)
                curveTo(18.367f, 17.503f, 18.349f, 16.867f, 18.32f, 15.882f)
                lineTo(18.059f, 7.0f)
                horizontalLineTo(5.943f)
                close()
            }
        }
        .build()
        return _shoppingBagOutlineMd!!
    }

private var _shoppingBagOutlineMd: ImageVector? = null
