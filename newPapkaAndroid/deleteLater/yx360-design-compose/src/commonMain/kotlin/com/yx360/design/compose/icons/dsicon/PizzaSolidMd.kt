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

public val DsIcon.PizzaSolidMd: ImageVector
    get() {
        if (_pizzaSolidMd != null) {
            return _pizzaSolidMd!!
        }
        _pizzaSolidMd = Builder(name = "PizzaSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.981f, 2.093f)
                curveTo(15.066f, 3.698f, 19.889f, 8.407f, 21.653f, 14.426f)
                curveTo(22.137f, 16.073f, 21.017f, 17.608f, 19.491f, 17.955f)
                lineTo(18.727f, 18.128f)
                curveTo(18.106f, 11.098f, 12.428f, 5.521f, 5.354f, 5.059f)
                lineTo(5.519f, 4.299f)
                curveTo(5.849f, 2.787f, 7.343f, 1.661f, 8.981f, 2.093f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.966f, 6.84f)
                curveTo(11.361f, 7.122f, 16.515f, 12.178f, 16.953f, 18.53f)
                lineTo(14.224f, 19.149f)
                curveTo(14.073f, 17.69f, 12.839f, 16.551f, 11.34f, 16.551f)
                curveTo(9.738f, 16.551f, 8.439f, 17.85f, 8.439f, 19.451f)
                curveTo(8.439f, 19.792f, 8.498f, 20.12f, 8.606f, 20.424f)
                lineTo(3.198f, 21.65f)
                lineTo(2.0f, 20.462f)
                lineTo(3.31f, 14.444f)
                curveTo(3.688f, 14.624f, 4.111f, 14.725f, 4.557f, 14.725f)
                curveTo(6.159f, 14.725f, 7.457f, 13.427f, 7.457f, 11.825f)
                curveTo(7.457f, 10.223f, 6.159f, 8.925f, 4.557f, 8.925f)
                curveTo(4.542f, 8.925f, 4.527f, 8.925f, 4.512f, 8.925f)
                lineTo(4.966f, 6.84f)
                close()
            }
        }
        .build()
        return _pizzaSolidMd!!
    }

private var _pizzaSolidMd: ImageVector? = null
