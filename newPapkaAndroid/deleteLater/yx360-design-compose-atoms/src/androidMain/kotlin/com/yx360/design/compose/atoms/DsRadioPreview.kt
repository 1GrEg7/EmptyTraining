package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsRadioPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Horizontal) {
        DrawForEachBrand {
            Row {
                DrawAllCases {
                    DsRadio(
                        selected = drawEach(true, false),
                        enabled = drawEach(true, false),
                        onClick = {}
                    )
                }
            }
        }
    }
}
