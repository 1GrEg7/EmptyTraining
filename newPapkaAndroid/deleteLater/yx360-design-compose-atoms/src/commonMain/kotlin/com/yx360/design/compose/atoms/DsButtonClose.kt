package com.yx360.design.compose.atoms

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.ChevronLeftOutlineSm
import com.yx360.design.compose.icons.dsicon.CloseOutlineSm

/**
 * [Figma](https://nda.ya.ru/t/KE7qe5ud77jcTJ)
 */
@Composable
fun DsButtonClose(
    onClick: () -> Unit,
    action: DsButtonClose.Type,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val backgroundDefaultColor = Ds.Color.SurfaceGeneric.copy(alpha = Ds.Opacity.M8)
    val backgroundPressedColor = Ds.Color.SurfaceGenericPressed
    val iconColor = Ds.Color.TextSecondary

    IconButton(
        onClick = {
            onClick()
        },
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = if (isPressed) backgroundPressedColor else backgroundDefaultColor,
            contentColor = if (isPressed) backgroundPressedColor else iconColor,
        ),
        interactionSource = interactionSource,
        modifier = modifier
            .size(Ds.Size.M20)
            .wrapContentSize(),
    ) {
        Icon(
            imageVector = when (action) {
                DsButtonClose.Type.Back -> Ds.Icon.ChevronLeftOutlineSm
                DsButtonClose.Type.Close -> Ds.Icon.CloseOutlineSm
            },
            contentDescription = contentDescription,
            tint = iconColor
        )
    }
}

object DsButtonClose {

    enum class Type {
        Back,
        Close
    }
}
