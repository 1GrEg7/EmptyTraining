package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.fab.DsButtonFab
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsButtonFabPreview_TypeIcon() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand(orientation = Orientation.Horizontal) {
            Column {
                DrawAllCases {
                    DsButtonFab(
                        type = DsButtonFab.Type.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        ),
                        onClick = {},
                        modifier = Modifier,
                        loadingIndicator = drawEach(false, true)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsButtonFabPreview_TypeText() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        Column {
            DrawAllCases {
                DsButtonFab(
                    type = DsButtonFab.Type.Text(
                        text = drawEach("A", "A".repeat(500)),
                    ),
                    onClick = {},
                    modifier = Modifier,
                    loadingIndicator = drawEach(false, true)
                )
            }
        }
    }
}
