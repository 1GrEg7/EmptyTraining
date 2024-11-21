package com.yx360.design.compose.atoms.listitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsCheckbox
import com.yx360.design.compose.atoms.DsListItem
import com.yx360.design.compose.atoms.DsListItemCompact
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsListItemCompactPreview_Text_StartSlot_MiddleSlot() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        val startSlots = mutableListOf<DsListItem.StartSlotCompact>().apply {
            add(DsListItem.StartSlotCompact.None)
            add(
                DsListItem.StartSlotCompact.Icon(
                    rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                )
            )
        }
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItemCompact(
                        label = DsListItem.Text.Label(value = drawEach("", "Label")),
                        startSlot = drawEach(*startSlots.toTypedArray()),
                        endSlot = DsListItem.EndSlot.Chevron(),
                        middleSlot = drawEach(null, StubSlot()),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemCompactPreview_EndSlot() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        val endSlots = mutableListOf<DsListItem.EndSlot>().apply {
            add(DsListItem.EndSlot.None)
            add(DsListItem.EndSlot.Chevron())
            add(DsListItem.EndSlot.Toggle(selected = true, onSelectedChange = {}))
            add(
                DsListItem.EndSlot.Checkbox(
                    state = DsCheckbox.State.Selected,
                    enabled = true,
                    onStateChanged = { _ -> },
                )
            )
            add(DsListItem.EndSlot.Radio(selected = true, onClick = {}))
        }
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItemCompact(
                        label = DsListItem.Text.Label("Label"),
                        startSlot = DsListItem.StartSlotCompact.None,
                        endSlot = drawEach(*endSlots.toTypedArray()),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemCompactPreview_Divider_Enabled() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItemCompact(
                        label = DsListItem.Text.Label("Label"),
                        divider = drawEach(*DsListItem.Divider.entries.toTypedArray()),
                        enabled = drawEach(true, false),
                        startSlot = DsListItem.StartSlotCompact.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Suppress("FunctionNaming")
private fun StubSlot() = @Composable {
    Box(
        modifier = Modifier
            .size(Ds.Size.M12)
            .background(
                shape = RoundedCornerShape(10.dp), color = Ds.BrandColor.SurfaceBrand
            ),
    )
}
