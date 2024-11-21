package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsOpacity
import com.yx360.design.compose.atoms.utils.gesturesEnabled
import com.yx360.design.compose.icons.dsicon.ChevronOffsetRightOutlineSm

private const val LABEL_LINE_LIMIT_DEFAULT = 2
private const val DESCRIPTION_LINE_LIMIT_DEFAULT = 2
private const val SUPERSCRIPT_LINE_LIMIT_DEFAULT = 1

private val LocalEnabled = staticCompositionLocalOf { true }

/**
 * [Figma](https://nda.ya.ru/t/LiOQReQm78T3j2)
 */
@Composable
fun DsListItem(
    label: DsListItem.Text.Label?,
    startSlot: DsListItem.StartSlot,
    endSlot: DsListItem.EndSlot,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    description: DsListItem.Text.Description? = null,
    superscript: DsListItem.Text.Superscript? = null,
    middleSlot: @Composable (() -> Unit)? = null,
    bottomSlot: @Composable (() -> Unit)? = null,
    divider: DsListItem.Divider? = null,
    hierarchyPadding: Dp? = null,
    onClick: (() -> Unit)? = null,
) {
    DsListItemBase(
        label = label,
        description = description,
        superscript = superscript,
        modifier = modifier,
        enabled = enabled,
        compact = false,
        hierarchyPadding = hierarchyPadding,
        startSlot = startSlot,
        middleSlot = middleSlot,
        bottomSlot = bottomSlot,
        endSlot = endSlot,
        divider = divider,
        onClick = onClick,
    )
}

/**
 * [Figma](https://nda.ya.ru/t/gh0I_MXS78T3mw)
 */
@Composable
fun DsListItemCompact(
    label: DsListItem.Text.Label?,
    startSlot: DsListItem.StartSlotCompact,
    endSlot: DsListItem.EndSlot,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    middleSlot: @Composable (() -> Unit)? = null,
    divider: DsListItem.Divider? = null,
    hierarchyPadding: Dp? = null,
    onClick: (() -> Unit)? = null,
) {
    DsListItemBase(
        label = label,
        description = null,
        superscript = null,
        modifier = modifier,
        enabled = enabled,
        compact = true,
        hierarchyPadding = hierarchyPadding,
        startSlot = startSlot.mapToFullStartSlot(),
        middleSlot = middleSlot,
        bottomSlot = null,
        endSlot = endSlot,
        divider = divider,
        onClick = onClick,
    )
}

object DsListItem {

    @Stable
    sealed interface StartSlotCompact {

        companion object {

            /**
             * Temporary solution until Ds.Icon becomes Painter
             * TODO Remove in MOBILEDEV-35185
             */
            @Composable
            fun Icon(
                image: ImageVector,
                contentDescription: String? = null,
                tint: Color? = null,
            ): Icon {
                return Icon(
                    painter = rememberVectorPainter(image),
                    contentDescription = contentDescription,
                    tint = tint,
                )
            }
        }

        data class Icon(
            val painter: Painter,
            val contentDescription: String? = null,
            val tint: Color? = null,
        ) : StartSlotCompact

        data object None : StartSlotCompact

        fun mapToFullStartSlot(): StartSlot {
            return when (this) {
                is Icon -> StartSlot.Icon(
                    painter = painter,
                    contentDescription = contentDescription,
                    tint = tint,
                )

                None -> StartSlot.None
            }
        }
    }

    @Stable
    sealed interface StartSlot {

        companion object {

            /**
             * Temporary solution until Ds.Icon becomes Painter
             * TODO Remove in MOBILEDEV-35185
             */
            @Composable
            fun Icon(
                image: ImageVector,
                contentDescription: String? = null,
                tint: Color? = null,
            ): Icon {
                return Icon(
                    painter = rememberVectorPainter(image),
                    contentDescription = contentDescription,
                    tint = tint,
                )
            }
        }

        data class Icon(
            val painter: Painter,
            val contentDescription: String? = null,
            val tint: Color? = null,
        ) : StartSlot

        data class Avatar(
            val avatar: DsAvatar.Avatar,
            val style: DsAvatar.Style,
            val size: DsAvatar.Size = DsAvatar.Size.M24,
        ) : StartSlot

        data class IconTile(
            val painter: Painter,
            val backgroundColor: Color,
            val iconTint: Color? = null,
            val contentDescription: String? = null
        ) : StartSlot

        data class Status(
            val status: DsStatus.Status,
        ) : StartSlot

        data class Image(
            val content: @Composable () -> Unit,
        ) : StartSlot

        data object None : StartSlot
    }

    @Stable
    sealed interface EndSlot {

        data class Chevron(
            val icon: ImageVector = Ds.Icon.ChevronOffsetRightOutlineSm,
            val tint: Color? = null,
        ) : EndSlot

        data class Toggle(
            val selected: Boolean,
            val enabled: Boolean = true,
            val onSelectedChange: (Boolean) -> Unit,
        ) : EndSlot

        data class Checkbox(
            val state: DsCheckbox.State,
            val enabled: Boolean,
            val onStateChanged: (DsCheckbox.State) -> Unit,
        ) : EndSlot

        class Radio(
            val selected: Boolean,
            val enabled: Boolean = true,
            val onClick: () -> Unit,
        ) : EndSlot

        data object None : EndSlot
    }

    sealed class Text(
        val value: String,
        val lineLimit: Int
    ) {
        class Label(
            value: String,
            lineLimit: Int = LABEL_LINE_LIMIT_DEFAULT,
            val color: Color? = null,
        ) : Text(value, lineLimit)

        class Description(
            value: String,
            lineLimit: Int = DESCRIPTION_LINE_LIMIT_DEFAULT
        ) : Text(value, lineLimit)

        class Superscript(
            value: String,
            lineLimit: Int = SUPERSCRIPT_LINE_LIMIT_DEFAULT
        ) : Text(value, lineLimit)
    }

    enum class Divider {
        Default,
        Compact,
    }
}

@Composable
private fun DsListItemBase(
    label: DsListItem.Text.Label?,
    description: DsListItem.Text.Description?,
    superscript: DsListItem.Text.Superscript?,
    startSlot: DsListItem.StartSlot,
    middleSlot: @Composable (() -> Unit)?,
    endSlot: DsListItem.EndSlot,
    bottomSlot: @Composable (() -> Unit)?,
    modifier: Modifier,
    enabled: Boolean,
    compact: Boolean,
    hierarchyPadding: Dp?,
    divider: DsListItem.Divider?,
    onClick: (() -> Unit)?,
) {
    CompositionLocalProvider(LocalEnabled provides enabled) {
        Column(
            modifier = modifier.run {
                if (onClick != null) {
                    clickable(onClick = onClick, enabled = LocalEnabled.current)
                } else {
                    this
                }
            },
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = Ds.Spacing.M8)
                    .fillMaxWidth()
                    .heightIn(min = if (compact) Ds.Size.M24 else Ds.Size.M28),
                horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M6),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                hierarchyPadding?.let {
                    Spacer(modifier = Modifier.width(it))
                }
                if (startSlot != DsListItem.StartSlot.None) {
                    StartSlot(startSlot, compact)
                }
                Central(
                    superscript = superscript,
                    label = label,
                    description = description,
                    bottomSlot = bottomSlot,
                )
                middleSlot?.let {
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24)
                            .gesturesEnabled(LocalEnabled.current)
                    ) {
                        it.invoke()
                    }
                }
                EndSlot(endSlot)
            }
            if (divider != null) {
                Divider(divider)
            }
        }
    }
}

@Composable
private fun RowScope.Central(
    superscript: DsListItem.Text.Superscript?,
    label: DsListItem.Text.Label?,
    description: DsListItem.Text.Description?,
    bottomSlot: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.weight(1f)
            .align(Alignment.CenterVertically)
            .padding(vertical = Ds.Spacing.M4)
            .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24),
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M4),
    ) {
        TextContent(
            label = label,
            description = description,
            superscript = superscript,
        )
        if (bottomSlot != null) {
            Box(Modifier.gesturesEnabled(LocalEnabled.current)) {
                bottomSlot()
            }
        }
    }
}

@Composable
private fun RowScope.StartSlot(startSlot: DsListItem.StartSlot, compact: Boolean) {
    Box(
        modifier = Modifier.align(Alignment.Top)
            .padding(vertical = if (compact) Ds.Spacing.M2 else Ds.Spacing.M4)
            .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24),
    ) {
        when (startSlot) {
            is DsListItem.StartSlot.Avatar -> {
                DsAvatar(
                    avatar = startSlot.avatar,
                    style = startSlot.style,
                    size = startSlot.size,
                )
            }

            is DsListItem.StartSlot.Icon -> {
                Icon(
                    painter = startSlot.painter,
                    contentDescription = startSlot.contentDescription,
                    tint = startSlot.tint ?: Ds.Color.TextPrimary,
                    modifier = Modifier.padding(top = Ds.Spacing.M4),
                )
            }

            is DsListItem.StartSlot.IconTile -> {
                DsIconTile(
                    icon = startSlot.painter,
                    iconTint = startSlot.iconTint ?: Ds.Color.TextPrimary,
                    backgroundColor = startSlot.backgroundColor,
                    contentDescription = startSlot.contentDescription
                )
            }

            is DsListItem.StartSlot.Image -> {
                Box(
                    modifier = Modifier
                        .background(
                            shape = RoundedCornerShape(Ds.Rounding.M8),
                            color = Color.Unspecified,
                        ),
                    contentAlignment = Alignment.Center,
                ) {
                    startSlot.content()
                }
            }
            is DsListItem.StartSlot.Status -> {
                DsStatus(
                    status = startSlot.status,
                    size = DsStatus.Size.Md,
                    modifier = Modifier.padding(top = 10.dp),
                )
            }
            DsListItem.StartSlot.None -> { /* do nothing */ }
        }
    }
}

@Composable
private fun RowScope.EndSlot(endSlot: DsListItem.EndSlot) {
    when (endSlot) {
        is DsListItem.EndSlot.Chevron -> {
            Icon(
                modifier = Modifier.align(Alignment.CenterVertically)
                    .size(Ds.Size.M8)
                    .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24),
                painter = rememberVectorPainter(image = endSlot.icon),
                contentDescription = null,
                tint = endSlot.tint ?: Ds.Color.TextTertiary,
            )
        }

        is DsListItem.EndSlot.Checkbox -> {
            DsCheckbox(
                state = endSlot.state,
                onStateChanged = endSlot.onStateChanged,
                enabled = LocalEnabled.current && endSlot.enabled,
                modifier = Modifier.align(Alignment.CenterVertically),
            )
        }

        is DsListItem.EndSlot.Radio -> {
            DsRadio(
                selected = endSlot.selected,
                onClick = endSlot.onClick,
                enabled = LocalEnabled.current && endSlot.enabled,
                modifier = Modifier.align(Alignment.CenterVertically),
            )
        }

        is DsListItem.EndSlot.Toggle -> {
            DsToggle(
                selected = endSlot.selected,
                onSelectedChange = endSlot.onSelectedChange,
                enabled = LocalEnabled.current && endSlot.enabled,
                modifier = Modifier.align(Alignment.CenterVertically),
            )
        }
        DsListItem.EndSlot.None -> { /* do nothing */ }
    }
}

@Composable
private fun TextContent(
    superscript: DsListItem.Text.Superscript?,
    label: DsListItem.Text.Label?,
    description: DsListItem.Text.Description?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M),
    ) {
        if (superscript != null && superscript.value.isNotEmpty()) {
            Superscript(superscript)
        }
        if (label != null && label.value.isNotEmpty()) {
            Label(label)
        }
        if (description != null && description.value.isNotEmpty()) {
            Description(description)
        }
    }
}

@Composable
private fun Superscript(superscript: DsListItem.Text.Superscript) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = superscript.value,
        style = Ds.Typography.CaptionMdRegular,
        maxLines = superscript.lineLimit,
        overflow = TextOverflow.Ellipsis,
        color = Ds.Color.TextSecondary,
    )
}

@Composable
private fun Label(label: DsListItem.Text.Label) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = label.value,
        style = Ds.Typography.BodyShortLgRegular,
        maxLines = label.lineLimit,
        overflow = TextOverflow.Ellipsis,
        color = label.color ?: Ds.Color.TextPrimary,
    )
}

@Composable
private fun Description(description: DsListItem.Text.Description) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = description.value,
        style = Ds.Typography.BodyShortMdRegular,
        maxLines = description.lineLimit,
        overflow = TextOverflow.Ellipsis,
        color = Ds.Color.TextSecondary,
    )
}

@Composable
private fun Divider(divider: DsListItem.Divider) {
    when (divider) {
        DsListItem.Divider.Default -> {
            DsDivider(
                compact = false,
                verticalPadding = DsDivider.VerticalPadding.NONE,
            )
        }
        DsListItem.Divider.Compact -> {
            DsDivider(
                compact = true,
                verticalPadding = DsDivider.VerticalPadding.NONE,
            )
        }
    }
}
