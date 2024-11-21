package com.yx360.design.compose

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

@Stable
fun Modifier.dsShadow(
    shadow: DsShadowData,
    shape: Shape = RectangleShape,
) = then(
    shadow(
        elevation = shadow.elevation,
        shape = shape,
        ambientColor = shadow.color,
        spotColor = shadow.color,
    )
)

@Immutable
class DsShadowData(val elevation: Dp, val color: Color)
