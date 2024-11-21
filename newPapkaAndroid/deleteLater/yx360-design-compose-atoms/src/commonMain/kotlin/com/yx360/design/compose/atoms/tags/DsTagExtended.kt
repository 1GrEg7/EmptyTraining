package com.yx360.design.compose.atoms.tags

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.CloseCircleSolidSm

/**
 * [Figma](https://nda.ya.ru/t/8eGk-utt77AK69)
 */
@Composable
fun DsTagExtended(
    label: String,
    description: String,
    variant: DsTag.Variant,
    modifier: Modifier = Modifier,
    startSlot: DsTagExtended.StartSlot = DsTagExtended.StartSlot.None,
    onClick: (() -> Unit)? = null,
    onClose: (() -> Unit)? = null,
) {
    val closeIconWidth = if (onClose == null) 0.dp else Ds.Size.M16
    val tagHeight = Ds.Size.M28
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = modifier
            .height(tagHeight)
            .clip(RoundedCornerShape(Ds.Rounding.M8))
            .background(variant.containerColor())
            .then(
                if (onClick != null) {
                    Modifier.clickable(
                        enabled = true,
                        indication = ripple(),
                        interactionSource = interactionSource,
                        onClick = onClick,
                    )
                } else {
                    Modifier
                }
            )
            .padding(
                start = if (startSlot == DsTagExtended.StartSlot.None) Ds.Size.M6 else 0.dp,
                end = if (onClose == null) Ds.Size.M6 else 0.dp
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        StartSlot(startSlot, variant.iconColor())
        BoxWithConstraints {
            Column(
                modifier = Modifier
                    .widthIn(max = this@BoxWithConstraints.maxWidth - closeIconWidth)
                    .padding(
                        start = if (startSlot == DsTagExtended.StartSlot.None) {
                            0.dp
                        } else {
                            Ds.Spacing.M4
                        }
                    )
            ) {
                Text(
                    text = label,
                    color = variant.labelColor(),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = Ds.Typography.BodyMdMedium
                )
                if (description.isNotEmpty()) {
                    Text(
                        text = description,
                        color = variant.secondaryTextColor(),
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        style = Ds.Typography.BodyMdRegular,
                    )
                }
            }
        }
        if (onClose != null) {
            val verticalOffset = -((tagHeight - closeIconWidth) / 2)
            Box(
                modifier = Modifier
                    .offset(
                        x = 0.dp,
                        y = verticalOffset
                    )
                    .size(closeIconWidth)
                    .clickable(
                        onClick = onClose,
                        role = Role.Button,
                        interactionSource = interactionSource,
                        indication = null,
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    modifier = Modifier
                        .size(Ds.Size.M8),
                    painter = rememberVectorPainter(Ds.Icon.CloseCircleSolidSm),
                    contentDescription = null,
                    tint = variant.closeIconColor(),
                )
            }
        }
    }
}

@Composable
private fun RowScope.StartSlot(
    startSlot: DsTagExtended.StartSlot,
    iconColor: Color?,
) {
    Box(
        modifier = Modifier.align(Alignment.CenterVertically)
    ) {
        when (startSlot) {
            is DsTagExtended.StartSlot.Icon -> {
                Icon(
                    painter = startSlot.painter,
                    contentDescription = startSlot.contentDescription,
                    tint = iconColor ?: Ds.Color.TextPrimary,
                    modifier = Modifier
                        .padding(start = Ds.Spacing.M4)
                        .size(Ds.Size.M8),
                )
            }

            is DsTagExtended.StartSlot.File -> {
                Image(
                    painter = startSlot.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = Ds.Spacing.M4)
                        .size(Ds.Size.M20)
                        .clip(RoundedCornerShape(Ds.Rounding.M6)),
                )
            }

            DsTagExtended.StartSlot.None -> Unit
        }
    }
}

object DsTagExtended {

    /**
     * Temporary solution until Ds.Icon becomes Painter
     * TODO Remove in MOBILEDEV-35185
     */
    @Composable
    fun Icon(
        image: ImageVector,
        contentDescription: String? = null,
    ): StartSlot.Icon {
        return StartSlot.Icon(
            painter = rememberVectorPainter(image),
            contentDescription = contentDescription,
        )
    }

    @Stable
    sealed class StartSlot {

        data class File(val painter: Painter) : StartSlot()
        data class Icon(
            val painter: Painter,
            val contentDescription: String? = null,
        ) : StartSlot()

        data object None : StartSlot()
    }
}
