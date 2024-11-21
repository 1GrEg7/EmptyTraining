package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@Preview
@Composable
fun DsButtonIconTransparentStylesPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand(orientation = Orientation.Horizontal) {
            Column {
                DrawAllCases {
                    DsButtonIconTransparent(
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
fun DsButtonIconTransparentPreview_Enabled_Loading_Sizes() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        FlowColumn {
            DrawAllCases {
                DsButtonIconTransparent(
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
