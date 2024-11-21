package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand

@Preview(showBackground = true)
@Composable
fun DsTogglePreviewLight() {
    Ds.Theme {
        Surface(color = Ds.Color.ElevationBase) {
            DrawForEachBrand(orientation = Orientation.Horizontal) {
                Column(Modifier.padding(Ds.Spacing.M2)) {
                    DrawAllCases {
                        DsToggle(
                            selected = drawEach(true, false),
                            onSelectedChange = {},
                            enabled = drawEach(true, false)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DsTogglePreviewDark() {
    Ds.Theme(darkTheme = true) {
        Surface(color = Ds.Color.ElevationBase) {
            DrawForEachBrand(orientation = Orientation.Horizontal) {
                Column(Modifier.padding(Ds.Spacing.M2)) {
                    DrawAllCases {
                        DsToggle(
                            selected = drawEach(true, false),
                            onSelectedChange = {},
                            enabled = drawEach(true, false)
                        )
                    }
                }
            }
        }
    }
}
