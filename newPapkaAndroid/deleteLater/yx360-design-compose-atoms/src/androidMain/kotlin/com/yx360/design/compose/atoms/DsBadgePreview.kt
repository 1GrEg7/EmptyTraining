package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsBadgePreview() {
    DrawForLightAndDarkTheme {
        DrawForEachBrand(orientation = Orientation.Horizontal) {
            Column {
                DrawAllCases {
                    DsBadge(
                        counter = drawEach(1, 99, 100),
                        size = drawEach(*(DsBadge.Size.entries).toTypedArray()),
                        variant = drawEach(*(DsBadge.Variant.entries).toTypedArray())
                    )
                }
            }
        }
    }
}
