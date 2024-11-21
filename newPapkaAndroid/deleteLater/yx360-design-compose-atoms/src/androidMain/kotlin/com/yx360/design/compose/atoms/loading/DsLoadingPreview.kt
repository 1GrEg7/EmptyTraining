package com.yx360.design.compose.atoms.loading

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForDifferentSurfaces

@Suppress("MagicNumber")
@PreviewLightDark
@Composable
fun DsLoadingPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column {
        DrawAllCases {
            val longText = drawEach(
                "Title",
                "Title".repeat(20),
            )
            DrawForDifferentSurfaces {
                DsLoading(
                    title = longText,
                )
            }
        }
    }
}
