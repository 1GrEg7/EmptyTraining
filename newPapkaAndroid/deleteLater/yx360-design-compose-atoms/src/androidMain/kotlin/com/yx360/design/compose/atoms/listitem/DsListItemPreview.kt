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
import com.yx360.design.compose.atoms.DsAvatar
import com.yx360.design.compose.atoms.DsCheckbox
import com.yx360.design.compose.atoms.DsListItem
import com.yx360.design.compose.atoms.DsStatus
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsListItemPreviewLight_Texts() {
    DsListItemPreview_Texts(false)
}

@Preview
@Composable
fun DsListItemPreviewDark_Texts() {
    DsListItemPreview_Texts(true)
}

@Preview
@Composable
fun DsListItemPreview_Texts_WhenStartSlotIsBig() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label(value = drawEach("", "Label")),
                        description = DsListItem.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsListItem.Text.Superscript(
                            value = drawEach("", "Superscript")
                        ),
                        startSlot = DsListItem.StartSlot.IconTile(
                            painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                            backgroundColor = Ds.Color.SurfaceAccent01,
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemPreview_Texts_WhenStartSlotIsStatus() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label(value = drawEach("", "Label")),
                        description = DsListItem.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsListItem.Text.Superscript(
                            value = drawEach("", "Superscript")
                        ),
                        startSlot = DsListItem.StartSlot.Status(DsStatus.Preset.Success),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemPreviewLight_StartSlot() {
    DsListItemPreview_StartSlot(false)
}

@Preview
@Composable
fun DsListItemPreviewDark_StartSlot() {
    DsListItemPreview_StartSlot(true)
}

@Preview
@Composable
fun DsListItemPreview_EndSlot() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        val endSlots = mutableListOf<DsListItem.EndSlot>().apply {
            add(DsListItem.EndSlot.None)
            add(DsListItem.EndSlot.Chevron())
            add(DsListItem.EndSlot.Toggle(selected = true, onSelectedChange = {}))
            add(
                DsListItem.EndSlot.Checkbox(
                    enabled = true,
                    state = DsCheckbox.State.Selected,
                    onStateChanged = { _ -> },
                )
            )
            add(DsListItem.EndSlot.Radio(selected = true, onClick = {}))
        }
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        description = DsListItem.Text.Description("Description"),
                        startSlot = DsListItem.StartSlot.None,
                        endSlot = drawEach(*endSlots.toTypedArray()),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemPreview_Divider_Enabled() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        description = DsListItem.Text.Description("Description"),
                        superscript = DsListItem.Text.Superscript("Superscript"),
                        divider = drawEach(*DsListItem.Divider.entries.toTypedArray()),
                        enabled = drawEach(true, false),
                        startSlot = DsListItem.StartSlot.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemPreview_CustomSlots() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        description = DsListItem.Text.Description("Description"),
                        superscript = DsListItem.Text.Superscript("Superscript"),
                        startSlot = DsListItem.StartSlot.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                        middleSlot = drawEach(null, StubSlot()),
                        bottomSlot = drawEach(null, StubSlot()),
                    )
                }
            }
        }
    }
}

@Composable
private fun DsListItemPreview_Texts(darkTheme: Boolean) {
    Ds.Theme(darkTheme) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label(value = drawEach("", "Label")),
                        description = DsListItem.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsListItem.Text.Superscript(
                            value = drawEach("", "Superscript")
                        ),
                        startSlot = DsListItem.StartSlot.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsListItemPreview_Status_Position() {
    DsListItemPreview_StartSlot_Position(
        DsListItem.StartSlot.Status(DsStatus.Preset.Success),
    )
}

@Preview
@Composable
fun DsListItemPreview_Avatar_Position() {
    DsListItemPreview_StartSlot_Position(
        DsListItem.StartSlot.Avatar(
            avatar = DsAvatar.Avatar.Default,
            style = DsAvatar.Style.Status((DsStatus.Preset.Danger)),
        ),
    )
}

@Preview
@Composable
fun DsListItemPreview_Icon_Position() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        DsListItemPreview_StartSlot_Position(
            DsListItem.StartSlot.Icon(
                rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
            ),
        )
    }
}

@Composable
private fun DsListItemPreview_StartSlot_Position(startSlot: DsListItem.StartSlot) {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label(value = "Label"),
                        description = DsListItem.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsListItem.Text.Superscript(
                            value = drawEach("", "Superscript")
                        ),
                        startSlot = startSlot,
                        bottomSlot = drawEach(null, StubSlot()),
                        endSlot = DsListItem.EndSlot.Chevron(),
                    )
                }
            }
        }
    }
}

@Composable
private fun DsListItemPreview_StartSlot(darkTheme: Boolean) {
    Ds.Theme(darkTheme, brandTheme = BrandTheme.Mail) {
        val startSlots = mutableListOf<DsListItem.StartSlot>().apply {
            add(DsListItem.StartSlot.None)
            add(DsListItem.StartSlot.Icon(
                rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
            ))
            add(DsListItem.StartSlot.Avatar(
                avatar = DsAvatar.Avatar.Default,
                style = DsAvatar.Style.Default,
            ))
            add(DsListItem.StartSlot.IconTile(
                painter = rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                backgroundColor = Ds.Color.SurfaceAccent01,
            ))
            addAll(DsStatus.Preset.entries.map { DsListItem.StartSlot.Status(it) })
            add(DsListItem.StartSlot.Image(StubSlot()))
        }
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsListItem(
                        label = DsListItem.Text.Label("Label"),
                        description = DsListItem.Text.Description("Description"),
                        startSlot = drawEach(*startSlots.toTypedArray()),
                        endSlot = DsListItem.EndSlot.None,
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
