@file:Suppress("LongMethod", "SpreadOperator")

package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun DsIconTilePreview() {
    DrawForLightAndDarkTheme(
        orientation = Orientation.Vertical,
        brandTheme = BrandTheme.Mail,
    ) {
        val cases = listOf(
            Ds.Color.SurfaceAccent01 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent02 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent03 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent04 to Ds.Color.SurfaceStaticHeavy,
            Ds.Color.SurfaceAccent05 to Ds.Color.SurfaceStaticHeavy,
            Ds.Color.SurfaceAccent06 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent07 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent08 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent09 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent10 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent11 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent12 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent13 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent14 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent15 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceAccent16 to Ds.Color.SurfaceStaticLight,
            Ds.Color.SurfaceGeneric to Ds.Color.TextPrimary,
        )
        FlowRow(
            modifier = Modifier.padding(Ds.Spacing.M4),
            horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M2),
        ) {
            DrawAllCases {
                val (backgroundColor, iconTine) = drawEach(*cases.toTypedArray())
                DsIconTile(
                    icon = rememberVectorPainter(image = Ds.Icon.StarOutlineSm),
                    iconTint = iconTine,
                    backgroundColor = backgroundColor,
                )
            }
        }
    }
}
