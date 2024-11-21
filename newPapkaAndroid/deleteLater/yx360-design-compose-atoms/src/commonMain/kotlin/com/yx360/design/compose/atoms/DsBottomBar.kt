package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsSize
import com.yx360.design.compose.atoms.fab.DsButtonFab

/**
 * [Figma](https://nda.ya.ru/t/YOrg3GjK77HsTv)
 */
@Composable
fun DsBottomBar(
    tabs: List<DsBottomBar.Item>,
    onTabSelect: (Int) -> Unit,
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    fab: DsBottomBar.Fab? = null
) {
    require(selectedTabIndex >= 0 && selectedTabIndex <= tabs.size - 1) {
        "selectedTab must be in range [0, ${tabs.size - 1}]"
    }
    Column(
        modifier = modifier,
    ) {
        if (fab != null) {
            Box(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(
                        end = Ds.Size.M8,
                        bottom = Ds.Size.M8
                    )
            ) {
                DsButtonFab(
                    type = fab.type,
                    loadingIndicator = fab.isLoading,
                    onClick = fab.onClick
                )
            }
        }
        HorizontalDivider(
            thickness = Ds.Line.M05,
            color = Ds.Color.LineGeneric,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Ds.Color.ElevationBase),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    tab,
                    index,
                    selectedTabIndex,
                    onTabSelect,
                    modifier = Modifier.weight(1f),
                )
            }
        }
    }
}

object DsBottomBar {

    sealed class Item(
        val status: Boolean,
        val contentDescription: String?,
    ) {
        @Stable
        class Icon(
            val painter: Painter,
            contentDescription: String? = null,
            status: Boolean,
        ) : Item(status, contentDescription)

        @Stable
        class Profile(
            val avatar: DsAvatar.Avatar,
            status: Boolean,
            contentDescription: String? = null,
        ) : Item(status, contentDescription)
    }

    @Stable
    class Fab(
        val type: DsButtonFab.Type,
        val isLoading: Boolean,
        val onClick: () -> Unit
    )
}

@Composable
private fun Tab(
    tab: DsBottomBar.Item,
    index: Int,
    selectedTab: Int,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    val isSelected = selectedTab == index
    Box(
        modifier = modifier
            .height(DsSize.M28)
            .selectable(
                selected = isSelected,
                role = Role.Tab,
                indication = ripple(),
                interactionSource = remember { MutableInteractionSource() },
                onClick = { onClick.invoke(index) },
            )
            .clearAndSetSemantics {
                tab.contentDescription?.let { contentDescription = it }
            },
        contentAlignment = Alignment.Center,
    ) {
        Box(contentAlignment = Alignment.TopEnd) {
            when (tab) {
                is DsBottomBar.Item.Icon -> {
                    Icon(
                        modifier = Modifier
                            .size(DsSize.M16),
                        painter = tab.painter,
                        contentDescription = null,
                        tint = if (isSelected) {
                            Ds.Color.TextPrimary
                        } else {
                            Ds.Color.TextTertiary
                        }
                    )
                }

                is DsBottomBar.Item.Profile -> {
                    DsAvatar(
                        avatar = tab.avatar,
                        style = if (isSelected) {
                            DsAvatar.Style.Indicator.SolidColor(
                                color = Ds.Color.LineGenericHeavy
                            )
                        } else {
                            DsAvatar.Style.Default
                        },
                        size = DsAvatar.Size.M16
                    )
                }
            }
            if (tab.status) {
                Status(tab, isSelected = isSelected)
            }
        }
    }
}

@Composable
private fun Status(
    tab: DsBottomBar.Item,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
) {
    val statusPadding = if (isSelected && tab is DsBottomBar.Item.Profile) {
        Ds.Spacing.M2
    } else {
        0.dp
    }
    Box(
        modifier = modifier
            .padding(top = statusPadding, end = statusPadding)
            .clip(CircleShape)
            .size(10.dp)
            .background(Ds.Color.ElevationBase),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = modifier
                .clip(CircleShape)
                .size(Ds.Size.M4)
                .background(Ds.BrandColor.SurfaceBrand),
        )
    }
}
