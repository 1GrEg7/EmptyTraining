package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsParagraphPreview_Sizes() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationRisen) {
            FlowColumn {
                DrawAllCases {
                    DsParagraph(
                        text = drawEach("title", "A".repeat(20)),
                        size = drawEach(*DsParagraph.Size.entries.toTypedArray()),
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsParagraphPreview_Colors() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        val colors = listOf(
            Ds.Color.TextPrimary,
            Ds.BrandColor.TextLink,
            Ds.BrandColor.TextBrand,
            Ds.Color.SurfaceAccent15,
            Ds.Color.TextSecondary,
        )
        Surface(color = Ds.Color.ElevationRisen) {
            FlowColumn {
                DrawAllCases {
                    DsParagraph(
                        text = "title",
                        color = drawEach(*colors.toTypedArray()),
                    )
                }
            }
        }
    }
}
