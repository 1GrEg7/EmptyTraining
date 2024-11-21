package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsSpacing
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsSpinnerPreview_Sizes() {
    val spacings = listOf(
        DsSpacing.M05,
        DsSpacing.M,
        DsSpacing.M2,
        DsSpacing.M4,
        DsSpacing.M6,
        DsSpacing.M8,
        DsSpacing.M10,
        DsSpacing.M12,
        DsSpacing.M16,
        DsSpacing.M20,
        DsSpacing.M24,
        DsSpacing.M28,
        DsSpacing.M36,
    )
    Ds.Theme {
        Surface(color = Ds.Color.ElevationSunken) {
            FlowColumn {
                DrawAllCases {
                    Spacer(Modifier.height(Ds.Spacing.M2))
                    DsSpinner(size = drawEach(*spacings.toTypedArray()))
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsSpinnerPreview_Colors() {
    DrawForLightAndDarkTheme {
        val colors = listOf(
            Ds.Color.TextPrimary,
            Ds.Color.TextSecondary,
            Ds.Color.TextTertiary,
            Ds.Color.TextFeedbackDanger,
            Ds.Color.TextFeedbackSuccess,
            Ds.Color.LineFeedbackInfo,
        )
        Surface(color = Ds.Color.ElevationSunken) {
            FlowColumn {
                DrawAllCases {
                    Spacer(Modifier.height(Ds.Spacing.M2))
                    DsSpinner(color = drawEach(*colors.toTypedArray()))
                }
            }
        }
    }
}
