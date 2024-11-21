package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsDividerPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        Column {
            DrawAllCases {
                DsDivider(
                    compact = drawEach(true, false),
                    verticalPadding = drawEach(*DsDivider.VerticalPadding.entries.toTypedArray()),
                )
            }
        }
    }
}
