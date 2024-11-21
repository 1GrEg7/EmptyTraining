package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl

@Preview
@Composable
fun DsInputInlineDifferentSizesPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier.background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            DsInputInline(
                value = drawEach("", "value", "value".repeat(5)),
                placeholder = "placeholder",
                size = drawEach(*(DsInputInline.Size.entries.toTypedArray())),
                onValueChange = { }
            )
        }
    }
}

@Preview
@Composable
fun DsInputInlineLightAndDarkPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        Column {
            DrawAllCases {
                DsInputInline(
                    value = drawEach("", "value"),
                    placeholder = "placeholder",
                    size = drawEach(*(DsInputInline.Size.entries.toTypedArray())),
                    onValueChange = { }
                )
            }
        }
    }
}

@Preview
@Composable
fun DsInputInlineInfiniteLinesPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier.background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            DsInputInline(
                value = drawEach("", "value".repeat(10)),
                placeholder = drawEach("placeholder", "placeholder".repeat(5)),
                size = drawEach(*(DsInputInline.Size.entries.toTypedArray())),
                onValueChange = { }
            )
        }
    }
}

@Preview
@Composable
fun DsInputInlineInfiniteLinesRtlPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawRtl {
            Column(
                modifier = Modifier
                    .background(Ds.Color.ElevationBase)
            ) {
                DrawAllCases {
                    DsInputInline(
                        value = drawEach("", "value".repeat(10)),
                        placeholder = drawEach("placeholder", "placeholder".repeat(5)),
                        size = drawEach(*(DsInputInline.Size.entries.toTypedArray())),
                        onValueChange = { }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsInputInlineSingleLinePreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            DsInputInline(
                value = drawEach("", "value".repeat(10)),
                placeholder = "placeholder",
                size = drawEach(*DsInputInline.Size.entries.toTypedArray()),
                valueLinesLimit = 1,
                onValueChange = {}
            )
        }
    }
}

@Preview
@Composable
fun DsInputInlineSingleLineRtlPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    DrawRtl {
        Column(
            modifier = Modifier
                .background(Ds.Color.ElevationBase)
        ) {
            DrawAllCases {
                DsInputInline(
                    value = drawEach("", "value".repeat(10)),
                    placeholder = "placeholder",
                    size = drawEach(*DsInputInline.Size.entries.toTypedArray()),
                    valueLinesLimit = 1,
                    onValueChange = {}
                )
            }
        }
    }
}

@Preview
@Composable
fun DsInputInlineEnabledAndNotEnabledPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            DsInputInline(
                value = drawEach("", "value".repeat(10)),
                placeholder = "placeholder",
                size = drawEach(*DsInputInline.Size.entries.toTypedArray()),
                valueLinesLimit = 1,
                onValueChange = {},
                enabled = drawEach(true, false)
            )
        }
    }
}

@Preview
@Composable
fun DsInputInline10LinesWithLimitOf3LinesPreview() = Ds.Theme(
    brandTheme = BrandTheme.Mail,
    darkTheme = false
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            DsInputInline(
                value = "value\n".repeat(10),
                placeholder = "placeholder",
                size = drawEach(*DsInputInline.Size.entries.toTypedArray()),
                valueLinesLimit = 3,
                onValueChange = {}
            )
        }
    }
}
