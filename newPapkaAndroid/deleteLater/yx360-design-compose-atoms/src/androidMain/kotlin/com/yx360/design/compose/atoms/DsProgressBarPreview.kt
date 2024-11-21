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
fun DsProgressBarNoLabelPreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand {
            Column {
                DrawAllCases {
                    DsProgressBar(
                        progress = drawEach(0.25f, 0.5f, 0.75f, 1f),
                        label = DsProgressBar.Label(
                            text = "Label",
                            maxLines = 1
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsProgressBarShortLabelSingleLinePreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand {
            Column {
                DrawAllCases {
                    DsProgressBar(
                        progress = drawEach(0.25f, 0.5f, 0.75f, 1f),
                        label = DsProgressBar.Label(
                            text = "Label",
                            maxLines = 1
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsProgressBarLongLabelSingleLinePreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand {
            Column {
                DrawAllCases {
                    DsProgressBar(
                        progress = drawEach(0.25f, 0.5f, 0.75f, 1f),
                        label = DsProgressBar.Label(
                            text = "Label".repeat(10),
                            maxLines = 1
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsProgressBarLongLabelMultiLinePreview() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        DrawForEachBrand {
            Column {
                DrawAllCases {
                    DsProgressBar(
                        progress = drawEach(0.25f, 0.5f, 0.75f, 1f),
                        label = DsProgressBar.Label(
                            text = "Label".repeat(10),
                            maxLines = 3
                        )
                    )
                }
            }
        }
    }
}
