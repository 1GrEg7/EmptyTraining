package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawCaseProvider
import com.yx360.design.compose.atoms.preview.DrawForDifferentSurfaces
import com.yx360.design.compose.atoms.preview.DrawRtl

@Preview(showBackground = true)
@Composable
fun HeadingSurfacesLight() {
    Ds.Theme {
        HeadingSurfaces()
    }
}

@Preview(showBackground = true)
@Composable
fun HeadingSurfacesDark() {
    Ds.Theme(darkTheme = true) {
        HeadingSurfaces()
    }
}

@Suppress("StringLiteralDuplication")
@Composable
private fun HeadingSurfaces() {
    Ds.BrandTheme(brandTheme = BrandTheme.Messenger) {
        DrawForDifferentSurfaces(orientation = Orientation.Vertical) {
            DsHeading(
                title = "Title",
                subtitle = "Subtitle",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeadingSizes() {
    Ds.Theme {
        Column {
            DrawAllCases {
                val size = drawEach(*DsHeading.Size.entries.toTypedArray())
                DsHeading(
                    title = "Title $size",
                    subtitle = "Subtitle",
                    size = size,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeadingModes() {
    Ds.Theme(brandTheme = BrandTheme.Messenger) {
        Column {
            DrawAllCases {
                val align = drawEach(*DsHeading.Align.entries.toTypedArray())
                DsHeading(
                    title = align.name,
                    subtitle = drawEach(null, "Subtitle"),
                    align = align,
                    slot = { DrawSwitchOptional() }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeadingModesRtl() {
    DrawRtl {
        HeadingModes()
    }
}

@Preview(showBackground = true)
@Composable
fun HeadingLongText() {
    Ds.Theme(brandTheme = BrandTheme.Messenger) {
        Column {
            DrawAllCases {
                DsHeading(
                    title = "long text ".repeat(5),
                    subtitle = "long subtitle ".repeat(5),
                    align = drawEach(DsHeading.Align.Start, DsHeading.Align.Center),
                    slot = { DrawSwitchOptional() }
                )
            }
        }
    }
}

@Composable
private fun DrawCaseProvider.DrawSwitchOptional() {
    if (drawEach(true, false)) {
        Switch(checked = true, onCheckedChange = {})
    }
}
