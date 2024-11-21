package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsStatusPreview_Predefined_Sizes() {
    DrawForLightAndDarkTheme {
        FlowColumn(maxItemsInEachColumn = 3) {
            DrawAllCases {
                DsStatus(
                    preset = drawEach(*DsStatus.Preset.entries.toTypedArray()),
                    size = drawEach(*DsStatus.Size.entries.toTypedArray()),
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsStatusPreview_Colors_Icon() {
    DrawForLightAndDarkTheme {
        FlowColumn(maxItemsInEachColumn = 4) {
            DrawAllCases {
                DsStatus(
                    icon = drawEach(null, rememberVectorPainter(image = Ds.Icon.StarOutlineSm)),
                    iconColor = drawEach(DsStatus.Defaults.iconColor, Ds.Color.SurfaceAccent01),
                    containerColor = drawEach(DsStatus.Defaults.containerColor, Ds.Color.SurfaceAccent05),
                    statusColor = drawEach(DsStatus.Defaults.statusColor, Ds.Color.SurfaceAccent10),
                    size = DsStatus.Size.Md,
                )
            }
        }
    }
}
