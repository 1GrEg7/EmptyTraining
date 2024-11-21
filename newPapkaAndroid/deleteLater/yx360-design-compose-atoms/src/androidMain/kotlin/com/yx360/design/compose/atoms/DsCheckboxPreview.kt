package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForEachUser
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsCheckboxBrandPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand {
            Row {
                DrawAllCases {
                    DsCheckbox(
                        state = drawEach(
                            DsCheckbox.State.Selected,
                            DsCheckbox.State.Indeterminate,
                            DsCheckbox.State.Unselected
                        ),
                        enabled = drawEach(true, false),
                        variant = DsCheckbox.Variant.Brand,
                        onStateChanged = { _ -> }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsCheckboxUserPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachUser {
            Row {
                DrawAllCases {
                    DsCheckbox(
                        state = drawEach(
                            DsCheckbox.State.Selected,
                            DsCheckbox.State.Indeterminate,
                            DsCheckbox.State.Unselected
                        ),
                        enabled = drawEach(true, false),
                        variant = DsCheckbox.Variant.User,
                        onStateChanged = { _ -> }
                    )
                }
            }
        }
    }
}
