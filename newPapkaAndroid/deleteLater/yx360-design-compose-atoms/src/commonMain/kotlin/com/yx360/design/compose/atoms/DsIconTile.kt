package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsSize

/**
 * [Figma](https://nda.ya.ru/t/9na0Iaxf7792dt)
 */
@Composable
fun DsIconTile(
    icon: Painter,
    iconTint: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    Box(
        modifier = modifier.size(DsSize.M24)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(Ds.Rounding.M8),
            )
    ) {
        Icon(
            painter = icon,
            contentDescription = contentDescription,
            tint = iconTint,
            modifier = Modifier.size(DsSize.M12)
                .align(Alignment.Center)
        )
    }
}
