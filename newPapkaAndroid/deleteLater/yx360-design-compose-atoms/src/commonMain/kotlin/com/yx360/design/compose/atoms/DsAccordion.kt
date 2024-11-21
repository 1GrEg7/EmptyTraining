package com.yx360.design.compose.atoms

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsOpacity
import com.yx360.design.compose.atoms.utils.gesturesEnabled
import com.yx360.design.compose.icons.dsicon.ChevronBottomOutlineSm
import com.yx360.design.compose.icons.dsicon.ChevronTopOutlineSm

private const val LABEL_LINE_LIMIT_DEFAULT = 2
private const val DESCRIPTION_LINE_LIMIT_DEFAULT = 2
private const val SUPERSCRIPT_LINE_LIMIT_DEFAULT = 1

private val LocalEnabled = staticCompositionLocalOf { true }

/**
 * [Figma](https://nda.ya.ru/t/pczQTZRe78T3qF)
 */
@Composable
fun DsAccordion(
    initialOpened: Boolean,
    label: DsAccordion.Text.Label,
    startSlot: DsAccordion.StartSlot,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    description: DsAccordion.Text.Description? = null,
    superscript: DsAccordion.Text.Superscript? = null,
    endSlot: @Composable (() -> Unit)? = null,
    divider: DsAccordion.Divider? = null,
    hierarchyPadding: Dp? = null,
    content: @Composable (() -> Unit),
) {
    DsAccordionBase(
        initialOpened = initialOpened,
        label = label,
        description = description,
        superscript = superscript,
        modifier = modifier,
        enabled = enabled,
        compact = false,
        hierarchyPadding = hierarchyPadding,
        startSlot = startSlot,
        endSlot = endSlot,
        divider = divider,
        content = content,
    )
}

/**
 * [Figma](https://nda.ya.ru/t/2_O05TfW78T3rG)
 */
@Composable
fun DsAccordionCompact(
    initialOpened: Boolean,
    label: DsAccordion.Text.Label,
    startSlot: DsAccordion.StartSlot,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    endSlot: @Composable (() -> Unit)? = null,
    divider: DsAccordion.Divider? = null,
    hierarchyPadding: Dp? = null,
    content: @Composable (() -> Unit),
) {
    DsAccordionBase(
        initialOpened = initialOpened,
        label = label,
        description = null,
        superscript = null,
        modifier = modifier,
        enabled = enabled,
        compact = true,
        hierarchyPadding = hierarchyPadding,
        startSlot = startSlot,
        endSlot = endSlot,
        divider = divider,
        content = content,
    )
}

object DsAccordion {

    @Stable
    sealed interface StartSlot {

        data class Icon(
            val painter: Painter,
            val contentDescription: String? = null,
            val tint: Color? = null,
        ) : StartSlot

        data object None : StartSlot
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
private fun DsAccordionBase(
    initialOpened: Boolean,
    label: DsAccordion.Text.Label,
    description: DsAccordion.Text.Description?,
    superscript: DsAccordion.Text.Superscript?,
    startSlot: DsAccordion.StartSlot,
    endSlot: @Composable (() -> Unit)?,
    modifier: Modifier,
    enabled: Boolean,
    compact: Boolean,
    divider: DsAccordion.Divider? = null,
    hierarchyPadding: Dp?,
    content: @Composable (() -> Unit),
) {
    var opened by remember(initialOpened) { mutableStateOf(initialOpened) }
    CompositionLocalProvider(LocalEnabled provides enabled) {
        Column(modifier = modifier) {
            Row(
                modifier = Modifier
                    .clickable(
                        onClick = { opened = !opened },
                        enabled = LocalEnabled.current,
                        interactionSource = null,
                        indication = null,
                    )
                    .padding(horizontal = Ds.Spacing.M8)
                    .fillMaxWidth()
                    .heightIn(min = if (compact) Ds.Size.M24 else Ds.Size.M28),
                horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M6),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                hierarchyPadding?.let {
                    Spacer(modifier = Modifier.width(it))
                }
                if (startSlot is DsAccordion.StartSlot.Icon) {
                    StartSlot(startSlot, compact)
                }
                Central(
                    superscript = superscript,
                    label = label,
                    description = description,
                )
                endSlot?.let {
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24)
                            .gesturesEnabled(LocalEnabled.current)
                    ) {
                        it.invoke()
                    }
                }
                val chevron = if (!opened) {
                    Ds.Icon.ChevronBottomOutlineSm
                } else {
                    Ds.Icon.ChevronTopOutlineSm
                }
                Icon(
                    modifier = Modifier.align(Alignment.CenterVertically)
                        .size(Ds.Size.M8)
                        .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24),
                    painter = rememberVectorPainter(image = chevron),
                    contentDescription = null,
                    tint = Ds.Color.TextTertiary,
                )
            }
            AnimatedVisibility(opened) {
                Box(Modifier.padding(bottom = Ds.Spacing.M4)) {
                    content()
                }
            }
            if (divider != null) {
                Divider(divider)
            }
        }
    }
}

@Composable
private fun RowScope.Central(
    superscript: DsAccordion.Text.Superscript?,
    label: DsAccordion.Text.Label,
    description: DsAccordion.Text.Description?,
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
    }
}

@Composable
private fun RowScope.StartSlot(startSlot: DsAccordion.StartSlot.Icon, compact: Boolean) {
    Box(
        modifier = Modifier.align(Alignment.Top)
            .padding(vertical = if (compact) Ds.Spacing.M2 else Ds.Spacing.M4)
            .alpha(if (LocalEnabled.current) 1f else DsOpacity.M24),
    ) {
        Icon(
            painter = startSlot.painter,
            contentDescription = startSlot.contentDescription,
            tint = startSlot.tint ?: Ds.Color.TextPrimary,
            modifier = Modifier.padding(top = Ds.Spacing.M4),
        )
    }
}

@Composable
private fun TextContent(
    superscript: DsAccordion.Text.Superscript?,
    label: DsAccordion.Text.Label,
    description: DsAccordion.Text.Description?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M),
    ) {
        if (superscript != null && superscript.value.isNotEmpty()) {
            Superscript(superscript)
        }
        Label(label)
        if (description != null && description.value.isNotEmpty()) {
            Description(description)
        }
    }
}

@Composable
private fun Superscript(superscript: DsAccordion.Text.Superscript) {
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
private fun Label(label: DsAccordion.Text.Label) {
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
private fun Description(description: DsAccordion.Text.Description) {
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
private fun Divider(divider: DsAccordion.Divider) {
    when (divider) {
        DsAccordion.Divider.Default -> {
            DsDivider(
                compact = false,
                verticalPadding = DsDivider.VerticalPadding.NONE,
            )
        }
        DsAccordion.Divider.Compact -> {
            DsDivider(
                compact = true,
                verticalPadding = DsDivider.VerticalPadding.NONE,
            )
        }
    }
}
