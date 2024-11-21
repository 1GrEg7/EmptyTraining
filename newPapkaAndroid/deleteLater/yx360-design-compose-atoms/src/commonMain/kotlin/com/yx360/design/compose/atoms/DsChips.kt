package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import com.yx360.design.compose.icons.dsicon.CloseCircleSolidSm

/**
 * [Figma](https://nda.ya.ru/t/h8TcEZR477jcc4)
 */
@ExperimentalOrbitaDsAtom
@Composable
fun DsChips(
    label: String,
    modifier: Modifier = Modifier,
    variant: DsChips.Variant = DsChips.Variant.Primary,
    size: DsChips.Size = DsChips.Size.Md,
    selected: Boolean = false,
    leftIcon: Painter? = null,
    iconTint: Color? = if (!selected) Ds.Color.TextPrimary else Ds.Color.TextInverse,
    onClose: (() -> Unit)? = null,
    onClick: ((Boolean) -> Unit)? = null,
) {
    val horizontalSpacing = Ds.Spacing.M4
    val closeIconWidth = if (onClose == null || !selected) 0.dp else Ds.Size.M8
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()
    val backgroundColor = when (variant) {
        DsChips.Variant.Primary -> {
            when {
                !selected && !pressed -> Ds.Color.SurfaceGenericMedium
                !selected && pressed -> Ds.Color.SurfaceGenericMediumPressed
                selected && !pressed -> Ds.Color.SurfaceInverse
                else -> Ds.Color.SurfaceInversePressed
            }
        }

        DsChips.Variant.Secondary -> {
            when {
                !selected && !pressed -> Ds.Color.SurfaceGenericAlt
                !selected && pressed -> Ds.Color.SurfaceGenericMediumPressed
                selected && !pressed -> Ds.Color.SurfaceInverse
                else -> Ds.Color.SurfaceInversePressed
            }
        }
    }

    Row(
        modifier = modifier
            .height(
                when (size) {
                    DsChips.Size.Sm -> Ds.Size.M16
                    DsChips.Size.Md -> Ds.Size.M20
                }
            )
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(Ds.Rounding.Full)
            )
            .then(
                if (onClick != null) {
                    Modifier.clickable(
                        interactionSource = interactionSource,
                        indication = null,
                        onClick = {
                            onClick.invoke(selected)
                        },
                    )
                } else {
                    Modifier
                }
            )
            .padding(
                horizontal = when {
                    leftIcon == null && size == DsChips.Size.Sm -> Ds.Spacing.M6
                    leftIcon != null && size == DsChips.Size.Sm -> Ds.Spacing.M4
                    leftIcon == null && size == DsChips.Size.Md -> Ds.Spacing.M8
                    leftIcon != null && size == DsChips.Size.Md -> Ds.Spacing.M6
                    else -> 0.dp
                }
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(horizontalSpacing)
    ) {

        if (leftIcon != null) {
            Icon(
                modifier = Modifier
                    .size(Ds.Size.M8),
                painter = leftIcon,
                contentDescription = null,
                tint = iconTint ?: Color.Unspecified
            )
        }
        BoxWithConstraints {
            Text(
                modifier = Modifier
                    .widthIn(
                        max = this@BoxWithConstraints.maxWidth - closeIconWidth - horizontalSpacing
                    ),
                text = label,
                color = if (!selected) Ds.Color.TextPrimary else Ds.Color.TextInverse,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                style = Ds.Typography.BodyMdMedium
            )
        }
        if (selected && onClose != null) {
            Icon(
                modifier = Modifier
                    .size(closeIconWidth)
                    .clickable(onClick = onClose),
                imageVector = Ds.Icon.CloseCircleSolidSm,
                contentDescription = null,
                tint = Ds.Color.TextInverse
            )
        }
    }
}

object DsChips {
    enum class Size {
        Sm,
        Md
    }

    enum class Variant {
        Primary,
        Secondary
    }
}
