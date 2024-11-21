package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.MinusBacking
import com.yx360.design.compose.icons.dsicon.MinusOutlineSm
import com.yx360.design.compose.icons.dsicon.TickBacking
import com.yx360.design.compose.icons.dsicon.TickOutlineSm

/**
 * [Figma](https://nda.ya.ru/t/CzmIVJDE77jcXW)
 */
@Composable
fun DsCheckbox(
    state: DsCheckbox.State,
    enabled: Boolean,
    onStateChanged: (DsCheckbox.State) -> Unit,
    modifier: Modifier = Modifier,
    variant: DsCheckbox.Variant = DsCheckbox.Variant.Brand,
) {

    val selectedDefault: Color
    val selectedPressed: Color
    val selectedDisabled: Color
    val unselectedDefault: Color
    val unselectedPressed: Color
    val unselectedDisabled: Color
    val indeterminateDefault: Color
    val indeterminatePressed: Color
    val indeterminateDisabled: Color
    val iconColor: Color

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val userState by remember(enabled) {
        derivedStateOf {
            when {
                !enabled -> UserState.Disabled
                isPressed -> UserState.Pressed
                else -> UserState.Default
            }
        }
    }

    when (variant) {
        DsCheckbox.Variant.Brand -> {
            selectedDefault = Ds.BrandColor.SurfaceBrand
            selectedPressed = Ds.BrandColor.SurfaceBrandPressed
            selectedDisabled = Ds.BrandColor.SurfaceBrand.copy(alpha = Ds.Opacity.M16)
            indeterminateDefault = Ds.BrandColor.SurfaceBrand
            indeterminatePressed = Ds.BrandColor.SurfaceBrandPressed
            indeterminateDisabled = Ds.BrandColor.SurfaceBrand.copy(alpha = Ds.Opacity.M16)
            unselectedDefault = Ds.Color.SurfaceGenericMedium
            unselectedPressed = Ds.Color.SurfaceGenericMediumPressed
            unselectedDisabled = Ds.Color.SurfaceGenericMedium.copy(
                alpha = Ds.Color.SurfaceGenericMedium.alpha * Ds.Opacity.M24
            )
            iconColor = Ds.BrandColor.TextBrandStatic
        }

        DsCheckbox.Variant.User -> {
            selectedDefault = Ds.UserColor.SurfaceUser
            selectedPressed = Ds.UserColor.SurfaceUserPressed
            selectedDisabled = Ds.UserColor.SurfaceUser.copy(alpha = Ds.Opacity.M16)
            indeterminateDefault = Ds.UserColor.SurfaceUser
            indeterminatePressed = Ds.UserColor.SurfaceUserPressed
            indeterminateDisabled = Ds.UserColor.SurfaceUser.copy(alpha = Ds.Opacity.M16)
            unselectedDefault = Ds.UserColor.SurfaceUserLight
            unselectedPressed = Ds.UserColor.SurfaceUserLightPressed
            unselectedDisabled = Ds.UserColor.SurfaceUserLight.copy(
                alpha = Ds.UserColor.SurfaceUserLight.alpha * Ds.Opacity.M24
            )
            iconColor = Ds.Color.TextStaticLight
        }
    }

    Box(
        modifier = modifier
            .size(Ds.Size.M14)
            .background(
                color = when (state) {
                    DsCheckbox.State.Selected -> when (userState) {
                        UserState.Default -> selectedDefault
                        UserState.Pressed -> selectedPressed
                        UserState.Disabled -> selectedDisabled
                    }

                    DsCheckbox.State.Indeterminate -> when (userState) {
                        UserState.Default -> indeterminateDefault
                        UserState.Pressed -> indeterminatePressed
                        UserState.Disabled -> indeterminateDisabled
                    }

                    DsCheckbox.State.Unselected -> when (userState) {
                        UserState.Default -> unselectedDefault
                        UserState.Pressed -> unselectedPressed
                        UserState.Disabled -> unselectedDisabled
                    }
                },
                shape = CircleShape,
            )
            .clip(CircleShape)
            .clickable(
                enabled = enabled,
                interactionSource = interactionSource,
                indication = null,
                onClick = {
                    if (enabled) {
                        when (state) {
                            DsCheckbox.State.Indeterminate,
                            DsCheckbox.State.Unselected -> onStateChanged(DsCheckbox.State.Selected)

                            DsCheckbox.State.Selected -> onStateChanged(DsCheckbox.State.Unselected)
                        }
                    }
                },
            ),
    ) {
        if (variant == DsCheckbox.Variant.User) {
            when (state) {
                DsCheckbox.State.Indeterminate -> Icon(
                    painter = rememberVectorPainter(Ds.Icon.MinusBacking),
                    contentDescription = null,
                    modifier = Modifier
                        .size(Ds.Size.M14)
                        .align(Alignment.Center)
                )

                DsCheckbox.State.Selected -> Icon(
                    painter = rememberVectorPainter(Ds.Icon.TickBacking),
                    contentDescription = null,
                    modifier = Modifier
                        .size(Ds.Size.M14)
                        .align(Alignment.Center)
                )

                else -> Unit
            }
        }

        when (state) {
            DsCheckbox.State.Indeterminate -> {
                Icon(
                    painter = rememberVectorPainter(Ds.Icon.MinusOutlineSm),
                    contentDescription = null,
                    tint = iconColor,
                    modifier = Modifier
                        .size(Ds.Size.M8)
                        .align(Alignment.Center)
                )
            }

            DsCheckbox.State.Selected -> {
                Icon(
                    painter = rememberVectorPainter(Ds.Icon.TickOutlineSm),
                    contentDescription = null,
                    tint = iconColor,
                    modifier = Modifier
                        .size(Ds.Size.M8)
                        .align(Alignment.Center)
                )
            }

            else -> Unit
        }
    }
}

object DsCheckbox {

    enum class State {
        Selected,
        Indeterminate,
        Unselected,
    }

    enum class Variant {
        Brand,
        User,
    }
}

private enum class UserState {
    Default,
    Pressed,
    Disabled,
}
