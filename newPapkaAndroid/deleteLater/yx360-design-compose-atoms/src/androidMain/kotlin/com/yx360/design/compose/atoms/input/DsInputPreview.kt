@file:Suppress("StringLiteralDuplication")

package com.yx360.design.compose.atoms.input

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsInput
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Composable
private fun DsInputColumns(state: DsInput.State, modifier: Modifier) {
    val value = "Value"
    Column(
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8),
        modifier = modifier.padding(Ds.Spacing.M4)
    ) {
        DsInput(
            value = value,
            state = state,
            onValueChange = {}
        )
        DsInput(
            value = value,
            state = state,
            onValueChange = {},
            icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
        )
        DsInput(
            value = "",
            placeholder = "placeholder",
            label = "Label",
            state = if (state is DsInput.State.Default) DsInput.State.Success("Success status") else state,
            onValueChange = {},
            maxValue = 300,
            icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
        )
        DsInput(
            value = value,
            label = "Label",
            state = DsInput.State.Default("Very long status and description", enabled = false),
            onValueChange = {},
            maxValue = 300,
            icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
        )
    }
}

@Composable
fun ShowForLightAndDark() {
    Surface(color = Ds.Color.ElevationBase) {
        Row {
            DsInputColumns(DsInput.State.Default(), Modifier.weight(1f))
            DsInputColumns(DsInput.State.Error("ErrorStatus"), Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun DsInputPreview() {
    Ds.Theme {
        ShowForLightAndDark()
    }
}

@Preview
@Composable
fun DsInputPreviewDark() {
    Ds.Theme(darkTheme = true) {
        ShowForLightAndDark()
    }
}

@Preview
@Composable
fun DsInputRtlPreview() {
    DrawRtl {
        Ds.Theme {
            ShowForLightAndDark()
        }
    }
}

@Preview
@Composable
fun DsInputRtlPreviewDarkRtl() {
    DrawRtl {
        Ds.Theme(darkTheme = true) {
            ShowForLightAndDark()
        }
    }
}

@Preview
@Composable
fun DsInputExceedsLimitationPreview() {
    DrawForLightAndDarkTheme(
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                DsInput(
                    value = "value".repeat(100),
                    label = "Label",
                    state = DsInput.State.Default(
                        "Very long status and description",
                        enabled = false
                    ),
                    onValueChange = {},
                    maxValue = 100,
                    icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsInputMaxLinesPreview() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationBase) {
            Column {
                DrawAllCases {
                    DsInput(
                        value = "value".repeat(50),
                        label = "Label",
                        state = DsInput.State.Default(),
                        onValueChange = {},
                        maxLines = drawEach(1, 3, Int.MAX_VALUE),
                        icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsInputExceedsLimitationRtlPreview() {
    DrawRtl {
        DrawForLightAndDarkTheme(
            orientation = Orientation.Vertical
        ) {
            Column {
                DrawAllCases {
                    DsInput(
                        value = "value".repeat(100),
                        label = "Label",
                        state = DsInput.State.Default(
                            "Very long status and description",
                            enabled = false
                        ),
                        onValueChange = {},
                        maxValue = 100,
                        icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                    )
                }
            }
        }
    }
}


