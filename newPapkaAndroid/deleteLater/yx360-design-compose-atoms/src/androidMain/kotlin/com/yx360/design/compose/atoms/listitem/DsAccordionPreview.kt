@file:Suppress("StringLiteralDuplication")

package com.yx360.design.compose.atoms.listitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsAccordion
import com.yx360.design.compose.atoms.DsAccordionCompact
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsAccordionPreviewLight_Texts() {
    DsAccordionPreview_Texts(false)
}

@Preview
@Composable
fun DsAccordionPreviewDark_Texts() {
    DsAccordionPreview_Texts(true)
}

@Composable
private fun DsAccordionPreview_Texts(darkTheme: Boolean) {
    Ds.Theme(darkTheme) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsAccordion(
                        initialOpened = false,
                        label = DsAccordion.Text.Label(value = drawEach("", "Label")),
                        description = DsAccordion.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsAccordion.Text.Superscript(
                            value = drawEach("", "Superscript")
                        ),
                        startSlot = DsAccordion.StartSlot.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        content = content(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsAccordionPreview_OpenedState_Texts() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsAccordion(
                        initialOpened = drawEach(false, true),
                        label = DsAccordion.Text.Label("Label"),
                        description = DsAccordion.Text.Description(
                            value = drawEach("", "Description"),
                        ),
                        superscript = DsAccordion.Text.Superscript("Superscript"),
                        startSlot = DsAccordion.StartSlot.Icon(
                            rememberVectorPainter(image = Ds.Icon.StarOutlineMd),
                        ),
                        content = content(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsAccordionPreview_OpenedState_Slots() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsAccordion(
                        initialOpened = drawEach(false, true),
                        superscript = DsAccordion.Text.Superscript("Superscript"),
                        label = DsAccordion.Text.Label("Label"),
                        description = DsAccordion.Text.Description("Description"),
                        startSlot = drawEach(
                            DsAccordion.StartSlot.None,
                            DsAccordion.StartSlot.Icon(
                                rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                            ),
                        ),
                        endSlot = drawEach(null, stub()),
                        content = content(),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsAccordionCompactPreview_OpenedState() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsAccordionCompact(
                        initialOpened = drawEach(false, true),
                        label = DsAccordion.Text.Label("Label"),
                        startSlot = drawEach(
                            DsAccordion.StartSlot.None,
                            DsAccordion.StartSlot.Icon(
                                rememberVectorPainter(image = Ds.Icon.StarOutlineMd)
                            ),
                        ),
                        endSlot = drawEach(null, stub()),
                        content = content(),
                    )
                }
            }
        }
    }
}

private fun stub(): (@Composable () -> Unit) {
    return {
        Box(
            modifier = Modifier
                .size(Ds.Size.M12)
                .background(
                    shape = RoundedCornerShape(10.dp),
                    color = Ds.Color.SurfaceAccent01,
                ),
        )
    }
}

private fun content(): (@Composable () -> Unit) {
    return {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(64.dp)
                .background(
                    shape = RoundedCornerShape(10.dp),
                    color = Ds.Color.SurfaceAccent12,
                )
        )
    }
}
