package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl

@Preview
@Composable
fun DsSearchPreview_Title() {
    DrawForLightAndDarkTheme {
        Column {
            DrawAllCases {
                DsSearch(
                    size = DsSearch.Size.Lg,
                    value = drawEach("", "Value", "Value".repeat(20)),
                    placeholder = "",
                    enabled = true,
                    onValueChanged = {},
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSearchPreviewRtl_Title() {
    DrawRtl {
        DsSearchPreview_Title()
    }
}

@Preview
@Composable
fun DsSearchPreview_Placeholder() {
    DrawForLightAndDarkTheme {
        Column {
            DrawAllCases {
                DsSearch(
                    size = DsSearch.Size.Lg,
                    value = "",
                    placeholder = drawEach("", "Placeholder", "Placeholder".repeat(20)),
                    enabled = false,
                    onValueChanged = {},
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSearchPreviewRtl_Placeholder() {
    DrawRtl {
        DsSearchPreview_Placeholder()
    }
}

@Preview
@Composable
fun DsSearchPreview_Sizes_States() {
    DrawForLightAndDarkTheme {
        Column {
            DrawAllCases {
                DsSearch(
                    size = drawEach(*DsSearch.Size.entries.toTypedArray()),
                    value = "Value",
                    placeholder = "",
                    enabled = drawEach(true, false),
                    onValueChanged = {},
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSearchPreviewRtl_Sizes_States() {
    DrawRtl {
        DsSearchPreview_Sizes_States()
    }
}
