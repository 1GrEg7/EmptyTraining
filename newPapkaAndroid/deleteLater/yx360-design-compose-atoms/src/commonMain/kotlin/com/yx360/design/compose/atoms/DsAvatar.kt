package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.AvatarNotLoaded
import kotlin.math.abs

/**
 * [Figma](https://nda.ya.ru/t/33gYp_g577jcQb)
 */
@Composable
@Suppress("MagicNumber")
fun DsAvatar(
    modifier: Modifier = Modifier,
    avatar: DsAvatar.Avatar = DsAvatar.Avatar.Default,
    style: DsAvatar.Style = DsAvatar.Style.Default,
    size: DsAvatar.Size = DsAvatar.Size.M12,
    counter: Int? = null,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null,
) {
    val boxSize = if (style is DsAvatar.Style.Indicator) size.value + Ds.Size.M4 else size.value
    var avatarModifier = Modifier
        .size(boxSize)
        .clip(CircleShape)
        .then(
            if (onClick != null) {
                Modifier.clickable(onClick = onClick)
            } else {
                Modifier
            }
        )
        .clearAndSetSemantics {
            contentDescription?.let { this.contentDescription = it }
        }

    if (style is DsAvatar.Style.Indicator) {
        when (style) {
            is DsAvatar.Style.Indicator.YaPlus -> {
                avatarModifier = avatarModifier.border(
                    Ds.Size.M,
                    Brush.horizontalGradient(colorStops = Ds.Gradient.YaPlus),
                    CircleShape
                )
            }

            is DsAvatar.Style.Indicator.SolidColor -> {
                val color = if (style.color == Color.Unspecified) {
                    Ds.Color.LineGenericHeavy
                } else {
                    style.color
                }
                avatarModifier = avatarModifier.border(Ds.Size.M, color, CircleShape)
            }
        }
        avatarModifier = avatarModifier
            .padding(Ds.Size.M2)
            .border(Ds.Size.M, Color.Transparent, CircleShape)
    }

    Box(modifier = modifier, contentAlignment = Alignment.BottomEnd) {
        val iconModifier = Modifier.size(size.value).clip(CircleShape)

        Box(modifier = avatarModifier, contentAlignment = Alignment.Center) {
            when (avatar) {
                is DsAvatar.Avatar.Default -> {
                    Icon(
                        painter = rememberVectorPainter(Ds.Icon.AvatarNotLoaded),
                        contentDescription = null,
                        modifier = iconModifier,
                        tint = Color.Unspecified,
                    )
                }

                is DsAvatar.Avatar.Image -> {
                    Icon(
                        painter = avatar.avatar,
                        contentDescription = null,
                        modifier = iconModifier,
                        tint = Color.Unspecified,
                    )
                }

                is DsAvatar.Avatar.OnlyName -> {
                    val background = avatar.color ?: getBackgroundColor(avatar.uid)
                    val textStyle = when (size) {
                        DsAvatar.Size.M12 -> Ds.Typography.CaptionSmMedium
                        DsAvatar.Size.M16 -> Ds.Typography.CaptionMdMedium
                        DsAvatar.Size.M20 -> Ds.Typography.BodyMdRegular
                        DsAvatar.Size.M24 -> Ds.Typography.HeadingXs
                        DsAvatar.Size.M28 -> Ds.Typography.HeadingSm
                        DsAvatar.Size.M36 -> Ds.Typography.HeadingLg
                    }
                    Box(
                        modifier = iconModifier.background(background),
                        contentAlignment = Alignment.Center
                    ) {
                        val textColor = avatar.textColor ?: if (background.luminance() > 0.5) {
                            Color.Black
                        } else {
                            Color.White
                        }
                        Text(
                            avatar.name,
                            style = textStyle,
                            color = textColor,
                            maxLines = 1,
                        )
                    }
                }
            }
        }
        if (style is DsAvatar.Style.Status) {
            val statusSize = when (size) {
                DsAvatar.Size.M12,
                DsAvatar.Size.M16,
                DsAvatar.Size.M20 -> DsStatus.Size.Sm
                DsAvatar.Size.M24,
                DsAvatar.Size.M28 -> DsStatus.Size.Md
                DsAvatar.Size.M36 -> DsStatus.Size.Lg
            }

            val offset = when (size) {
                DsAvatar.Size.M16,
                DsAvatar.Size.M20,
                DsAvatar.Size.M36 -> Ds.Size.M
                DsAvatar.Size.M12,
                DsAvatar.Size.M24,
                DsAvatar.Size.M28 -> Ds.Size.M2
            }

            DsStatus(
                style.status,
                statusSize,
                modifier = Modifier.offset(x = offset, y = offset),
            )
        }
        if (counter != null) {
            AvatarBadge(
                size = size,
                style = style,
                counter = counter,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .clearAndSetSemantics { },
            )
        }
    }
}

@Composable
private fun AvatarBadge(
    size: DsAvatar.Size,
    style: DsAvatar.Style,
    counter: Int,
    modifier: Modifier,
) {
    val badgeSize = when (size) {
        DsAvatar.Size.M12,
        DsAvatar.Size.M16,
        -> null
        DsAvatar.Size.M20,
        DsAvatar.Size.M24,
        DsAvatar.Size.M28,
        -> DsBadge.Size.Sm
        DsAvatar.Size.M36,
        -> DsBadge.Size.Md
    }

    val offset = when (style) {
        DsAvatar.Style.Default,
        is DsAvatar.Style.Status,
        -> when (size) {
            DsAvatar.Size.M12,
            DsAvatar.Size.M16,
            -> 0.dp
            DsAvatar.Size.M20,
            -> Ds.Spacing.M
            DsAvatar.Size.M24,
            DsAvatar.Size.M28,
            -> Ds.Spacing.M2
            DsAvatar.Size.M36,
            -> 0.dp
        }
        is DsAvatar.Style.Indicator,
        -> 0.dp
    }

    val offsetModifier = modifier
        .offset(x = offset, y = -offset)

    if (badgeSize != null) {
        DsBadge(
            counter = counter,
            variant = DsBadge.Variant.Brand,
            size = badgeSize,
            modifier = offsetModifier
                .background(Ds.Color.ElevationBase, RoundedCornerShape(Ds.Size.M10))
                .padding(Ds.Spacing.M),
        )
    } else {
        DsStatus(
            size = DsStatus.Size.Xs,
            statusColor = Ds.BrandColor.SurfaceBrand,
            modifier = offsetModifier,
        )
    }
}

object DsAvatar {
    sealed class Avatar {
        data object Default : Avatar()
        data class OnlyName(
            val name: String,
            val uid: Long? = null,
            val color: Color? = null,
            val textColor: Color? = null
        ) : Avatar()

        data class Image(val avatar: Painter) : Avatar()
    }

    sealed class Style {
        data object Default : Style()
        sealed class Indicator : Style() {
            data object YaPlus : Indicator()
            data class SolidColor(val color: Color = Color.Unspecified) : Indicator()
        }

        class Status(val status: DsStatus.Status) : Style()
    }

    enum class Size(val value: Dp) {
        M12(Ds.Size.M12),
        M16(Ds.Size.M16),
        M20(Ds.Size.M20),
        M24(Ds.Size.M24),
        M28(Ds.Size.M28),
        M36(Ds.Size.M36),
    }
}

@Composable
private fun getBackgroundColor(uid: Long? = null): Color {
    val colors = listOf(
        Ds.Color.SurfaceAccent01,
        Ds.Color.SurfaceAccent02,
        Ds.Color.SurfaceAccent03,
        Ds.Color.SurfaceAccent04,
        Ds.Color.SurfaceAccent05,
        Ds.Color.SurfaceAccent06,
        Ds.Color.SurfaceAccent07,
        Ds.Color.SurfaceAccent08,
        Ds.Color.SurfaceAccent09,
        Ds.Color.SurfaceAccent10,
        Ds.Color.SurfaceAccent11,
        Ds.Color.SurfaceAccent12,
        Ds.Color.SurfaceAccent13,
        Ds.Color.SurfaceAccent14,
        Ds.Color.SurfaceAccent15
    )
    // TODO Update when color conversion logic will be implemented (MOBILEDEV-34906)
    val colorIndex = if (uid != null) {
        abs(uid.hashCode() % colors.size)
    } else {
        (0..colors.lastIndex).random()
    }
    return colors[colorIndex]
}
