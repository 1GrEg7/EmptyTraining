package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@Preview
@Composable
fun DsButtonIconStylesPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand(orientation = Orientation.Horizontal) {
            Column {
                DrawAllCases {
                    DsButtonIcon(
                        icon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                        onClick = {},
                        variant = drawEach(*DsButton.Style.entries.toTypedArray()),
                        size = DsButton.Size.Sm,
                        loadingIndicator = false
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsButtonIconPreview_Enabled_Loading_Sizes() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        FlowColumn {
            DrawAllCases {
                DsButtonIcon(
                    icon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                    onClick = {},
                    enabled = drawEach(true, false),
                    variant = DsButton.Style.Neutral,
                    size = drawEach(*DsButton.Size.entries.toTypedArray()),
                    loadingIndicator = drawEach(true, false)
                )
            }
        }
    }
}
