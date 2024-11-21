package com.yx360.design.compose.atoms.tags

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
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
import com.yx360.design.compose.atoms.DsAvatar
import com.yx360.design.compose.atoms.DsStatus
import com.yx360.design.compose.icons.dsicon.CloseCircleSolidSm

/**
 * [Figma](https://nda.ya.ru/t/8eGk-utt77AK69)
 */
@Composable
fun DsTag(
    label: String,
    variant: DsTag.Variant,
    modifier: Modifier = Modifier,
    size: DsTag.Size = DsTag.Size.Md,
    startSlot: DsTag.StartSlot = DsTag.StartSlot.None,
    postfix: String? = null,
    onClick: (() -> Unit)? = null,
    onClose: (() -> Unit)? = null,
) {
    val closeIconWidth = when {
        onClose != null && size == DsTag.Size.Xs -> Ds.Size.M8
        onClose != null && size == DsTag.Size.Sm -> Ds.Size.M12
        onClose != null && size == DsTag.Size.Md -> Ds.Size.M16
        else -> 0.dp
    }
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = modifier
            .height(
                when (size) {
                    DsTag.Size.Xs -> Ds.Size.M8
                    DsTag.Size.Sm -> Ds.Size.M12
                    DsTag.Size.Md -> Ds.Size.M16
                }
            )
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
                start = when {
                    startSlot == DsTag.StartSlot.None && size == DsTag.Size.Xs -> Ds.Size.M2
                    startSlot == DsTag.StartSlot.None && size == DsTag.Size.Sm -> Ds.Size.M4
                    startSlot == DsTag.StartSlot.None && size == DsTag.Size.Md -> Ds.Size.M6
                    else -> 0.dp
                },
                end = when {
                    onClose == null && size == DsTag.Size.Xs -> Ds.Size.M2
                    onClose == null && size == DsTag.Size.Sm -> Ds.Size.M4
                    onClose == null && size == DsTag.Size.Md -> Ds.Size.M6
                    else -> 0.dp
                }
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        StartSlot(
            startSlot = startSlot,
            size = size,
            iconColor = variant.iconColor(),
        )
        BoxWithConstraints {
            Row(
                modifier = Modifier
                    .widthIn(max = this@BoxWithConstraints.maxWidth - closeIconWidth)
            ) {
                Text(
                    text = label,
                    color = variant.labelColor(),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = when (size) {
                        DsTag.Size.Xs -> Ds.Typography.CaptionSmMedium
                        DsTag.Size.Sm -> Ds.Typography.CaptionMdMedium
                        DsTag.Size.Md -> Ds.Typography.BodyMdMedium
                    },
                    modifier = Modifier
                        .padding(
                            start = when {
                                startSlot == DsTag.StartSlot.None -> 0.dp
                                size == DsTag.Size.Xs -> Ds.Size.M
                                size == DsTag.Size.Sm -> Ds.Size.M2
                                size == DsTag.Size.Md -> Ds.Size.M4
                                else -> 0.dp
                            },
                        )
                )
                postfix?.let {
                    Text(
                        text = it,
                        color = variant.secondaryTextColor(),
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        modifier = Modifier.padding(
                            start = when (size) {
                                DsTag.Size.Xs, DsTag.Size.Sm -> Ds.Size.M
                                DsTag.Size.Md -> Ds.Size.M2
                            },
                        ),
                        style = when (size) {
                            DsTag.Size.Xs -> Ds.Typography.CaptionSmRegular
                            DsTag.Size.Sm -> Ds.Typography.CaptionMdRegular
                            DsTag.Size.Md -> Ds.Typography.BodyMdRegular
                        }
                    )
                }
            }
        }
        if (onClose != null) {
            Box(
                modifier = Modifier
                    .size(closeIconWidth)
                    .clickable(
                        onClick = onClose,
                        role = Role.Button,
                        interactionSource = interactionSource,
                        indication = null,
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
                        .size(
                            when (size) {
                                DsTag.Size.Xs -> Ds.Size.M6
                                DsTag.Size.Sm, DsTag.Size.Md -> Ds.Size.M8
                            }
                        ),
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
    startSlot: DsTag.StartSlot,
    size: DsTag.Size,
    iconColor: Color,
) {
    Box(
        modifier = Modifier.align(Alignment.CenterVertically)
    ) {
        when (startSlot) {
            is DsTag.StartSlot.Avatar -> {
                DsAvatar(
                    avatar = startSlot.avatar,
                    style = if (size == DsTag.Size.Md) {
                        startSlot.style
                    } else {
                        DsAvatar.Style.Default
                    },
                    modifier = Modifier
                        .padding(
                            start = when (size) {
                                DsTag.Size.Xs -> 0.dp
                                DsTag.Size.Sm -> Ds.Spacing.M
                                DsTag.Size.Md -> Ds.Spacing.M2
                            }
                        )
                        .size(
                            when (size) {
                                DsTag.Size.Xs -> Ds.Spacing.M8
                                DsTag.Size.Sm -> Ds.Spacing.M10
                                DsTag.Size.Md -> Ds.Spacing.M12
                            }
                        ),
                )
            }

            is DsTag.StartSlot.Icon -> {
                Icon(
                    painter = startSlot.painter,
                    contentDescription = startSlot.contentDescription,
                    tint = iconColor,
                    modifier = Modifier
                        .padding(
                            start = when (size) {
                                DsTag.Size.Xs -> Ds.Spacing.M
                                DsTag.Size.Sm -> Ds.Spacing.M2
                                DsTag.Size.Md -> Ds.Spacing.M4
                            }
                        )
                        .size(
                            when (size) {
                                DsTag.Size.Xs -> Ds.Size.M6
                                DsTag.Size.Sm, DsTag.Size.Md -> Ds.Size.M8
                            }
                        ),
                )
            }

            is DsTag.StartSlot.Status -> {
                DsStatus(
                    status = startSlot.value,
                    size = DsStatus.Size.Xs,
                    modifier = Modifier.padding(
                        start = when (size) {
                            DsTag.Size.Xs -> Ds.Spacing.M
                            DsTag.Size.Sm -> Ds.Spacing.M2
                            DsTag.Size.Md -> Ds.Spacing.M4
                        }
                    ),
                )
            }

            is DsTag.StartSlot.File -> {
                Image(
                    painter = startSlot.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            start = when (size) {
                                DsTag.Size.Xs -> 0.dp
                                DsTag.Size.Sm -> Ds.Spacing.M
                                DsTag.Size.Md -> Ds.Spacing.M2
                            }
                        )
                        .size(
                            when (size) {
                                DsTag.Size.Xs -> Ds.Size.M8
                                DsTag.Size.Sm -> Ds.Size.M10
                                DsTag.Size.Md -> Ds.Size.M12
                            }
                        )
                        .clip(CircleShape),
                )
            }

            is DsTag.StartSlot.Image -> {
                Image(
                    painter = startSlot.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            start = when (size) {
                                DsTag.Size.Xs -> Ds.Spacing.M
                                DsTag.Size.Sm -> Ds.Spacing.M2
                                DsTag.Size.Md -> Ds.Spacing.M4
                            }
                        )
                        .size(
                            when (size) {
                                DsTag.Size.Xs -> Ds.Size.M6
                                DsTag.Size.Sm, DsTag.Size.Md -> Ds.Size.M8
                            }
                        ),
                )
            }

            DsTag.StartSlot.None -> Unit
        }
    }
}

object DsTag {

    enum class Size {
        Xs,
        Sm,
        Md,
    }

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
            contentDescription = contentDescription
        )
    }

    @Stable
    sealed class StartSlot {
        data class Icon(
            val painter: Painter,
            val contentDescription: String? = null
        ) : StartSlot()

        data class Avatar(
            val avatar: DsAvatar.Avatar,
            val style: DsAvatar.Style,
        ) : StartSlot()

        data class Status(
            val value: DsStatus.Status
        ) : StartSlot()

        data class File(val painter: Painter) : StartSlot()
        data class Image(val painter: Painter) : StartSlot()

        data object None : StartSlot()
    }

    sealed interface Variant {
        val containerColor: @Composable () -> Color
        val iconColor: @Composable () -> Color
        val labelColor: @Composable () -> Color
        val secondaryTextColor: @Composable () -> Color
        val closeIconColor: @Composable () -> Color

        data object Neutral : Variant {
            override val containerColor = @Composable { Ds.Color.SurfaceGeneric }
            override val iconColor = @Composable { Ds.Color.TextPrimary }
            override val labelColor = @Composable { Ds.Color.TextPrimary }
            override val secondaryTextColor = @Composable { Ds.Color.TextSecondary }
            override val closeIconColor = @Composable { Ds.Color.TextTertiary }
        }

        data object NeutralAlt : Variant {
            override val containerColor = @Composable { Ds.Color.SurfaceGenericAlt }
            override val iconColor = @Composable { Ds.Color.TextPrimary }
            override val labelColor = @Composable { Ds.Color.TextPrimary }
            override val secondaryTextColor = @Composable { Ds.Color.TextSecondary }
            override val closeIconColor = @Composable { Ds.Color.TextTertiary }
        }

        data object Danger : Variant {
            override val containerColor = @Composable { Ds.Color.SurfaceFeedbackDangerLight }
            override val iconColor = @Composable { Ds.Color.TextPrimary }
            override val labelColor = @Composable { Ds.Color.TextPrimary }
            override val secondaryTextColor = @Composable { Ds.Color.TextSecondary }
            override val closeIconColor = @Composable { Ds.Color.TextTertiary }
        }

        data object Warning : Variant {
            override val containerColor = @Composable { Ds.Color.SurfaceFeedbackWarningLight }
            override val iconColor = @Composable { Ds.Color.TextPrimary }
            override val labelColor = @Composable { Ds.Color.TextPrimary }
            override val secondaryTextColor = @Composable { Ds.Color.TextSecondary }
            override val closeIconColor = @Composable { Ds.Color.TextTertiary }
        }

        class Colored(
            private val container: Color,
            private val icon: Color,
            private val label: Color,
            private val secondaryText: Color,
            private val closeIcon: Color
        ) : Variant {
            override val containerColor = @Composable { container }
            override val iconColor = @Composable { icon }
            override val labelColor = @Composable { label }
            override val secondaryTextColor = @Composable { secondaryText }
            override val closeIconColor = @Composable { closeIcon }
        }
    }
}
