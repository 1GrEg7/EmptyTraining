package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsLayoutGroupPreview() = Ds.Theme(brandTheme = BrandTheme.Calendar) {
    Column {
        DsLayoutGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            )
        ) {
            DsListItem(
                label = DsListItem.Text.Label("Label"),
                startSlot = DsListItem.StartSlot.Icon(
                    painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                ),
                endSlot = DsListItem.EndSlot.Chevron(),
                description = DsListItem.Text.Description("Description"),
            )
        }

        DsLayoutGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            )
        ) {
            DsListItem(
                label = DsListItem.Text.Label("Label"),
                startSlot = DsListItem.StartSlot.Icon(
                    painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                ),
                endSlot = DsListItem.EndSlot.Chevron(),
                description = DsListItem.Text.Description("Description"),
            )
            DsListItem(
                label = DsListItem.Text.Label("Label"),
                startSlot = DsListItem.StartSlot.Icon(
                    painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                ),
                endSlot = DsListItem.EndSlot.Chevron(),
            )
        }

        DsLayoutGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            content = listOf(
                {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        startSlot = DsListItem.StartSlot.Icon(
                            painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                        description = DsListItem.Text.Description("Description"),
                    )
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        startSlot = DsListItem.StartSlot.Icon(
                            painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                },
                {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        startSlot = DsListItem.StartSlot.Icon(
                            painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                        description = DsListItem.Text.Description("Description"),
                    )
                }
            )
        )
    }
}
