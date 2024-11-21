package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.icons.dsicon.YaMessengerSolidMd

@Preview
@Composable
fun DsChipsPreview_Light() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        DsChipsPreview()
    }
}

@Preview
@Composable
fun DsChipsPreview_Dark() {
    Ds.Theme(brandTheme = BrandTheme.Mail, darkTheme = true) {
        DsChipsPreview()
    }
}

@Preview
@Composable
fun DsChipsPreview_Rtl() {
    DrawRtl {
        DsChipsPreview_Light()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
private fun DsChipsPreview() {
    Surface(color = Ds.Color.ElevationSunken) {
        FlowColumn {
            DrawAllCases {
                DsChips(
                    label = "Label",
                    selected = drawEach(false, true),
                    leftIcon = rememberVectorPainter(Ds.Icon.YaMessengerSolidMd),
                    iconTint = drawEach(null, Ds.Color.SurfaceAccent08),
                    size = drawEach(*DsChips.Size.entries.toTypedArray()),
                    variant = drawEach(*DsChips.Variant.entries.toTypedArray()),
                    onClose = drawEach(null, {})
                )
            }
        }
    }
}
