package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.PizzaOutlineSm: ImageVector
    get() {
        if (_pizzaOutlineSm != null) {
            return _pizzaOutlineSm!!
        }
        _pizzaOutlineSm = Builder(name = "PizzaOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.878f, 9.932f)
                    curveTo(14.469f, 5.124f, 10.617f, 1.363f, 5.756f, 0.081f)
                    curveTo(4.335f, -0.294f, 3.051f, 0.685f, 2.77f, 1.977f)
                    lineTo(0.0f, 14.697f)
                    lineTo(1.198f, 15.885f)
                    lineTo(14.02f, 12.976f)
                    curveTo(15.324f, 12.681f, 16.298f, 11.361f, 15.878f, 9.932f)
                    close()
                    moveTo(5.246f, 2.015f)
                    curveTo(9.428f, 3.118f, 12.746f, 6.358f, 13.959f, 10.495f)
                    curveTo(14.012f, 10.674f, 13.908f, 10.951f, 13.577f, 11.026f)
                    lineTo(12.992f, 11.159f)
                    curveTo(11.882f, 7.141f, 8.658f, 4.002f, 4.591f, 3.015f)
                    lineTo(4.724f, 2.403f)
                    curveTo(4.795f, 2.076f, 5.066f, 1.967f, 5.246f, 2.015f)
                    close()
                    moveTo(4.207f, 4.774f)
                    lineTo(3.924f, 6.074f)
                    curveTo(4.23f, 6.165f, 4.519f, 6.331f, 4.761f, 6.573f)
                    curveTo(5.536f, 7.349f, 5.536f, 8.606f, 4.761f, 9.382f)
                    curveTo(4.303f, 9.84f, 3.677f, 10.028f, 3.082f, 9.945f)
                    lineTo(2.289f, 13.587f)
                    lineTo(5.421f, 12.876f)
                    curveTo(5.373f, 12.313f, 5.565f, 11.734f, 5.995f, 11.304f)
                    curveTo(6.771f, 10.528f, 8.028f, 10.528f, 8.804f, 11.304f)
                    curveTo(9.01f, 11.51f, 9.161f, 11.75f, 9.258f, 12.006f)
                    lineTo(11.234f, 11.557f)
                    curveTo(10.281f, 8.22f, 7.592f, 5.612f, 4.207f, 4.774f)
                    close()
                }
            }
        }
        .build()
        return _pizzaOutlineSm!!
    }

private var _pizzaOutlineSm: ImageVector? = null
