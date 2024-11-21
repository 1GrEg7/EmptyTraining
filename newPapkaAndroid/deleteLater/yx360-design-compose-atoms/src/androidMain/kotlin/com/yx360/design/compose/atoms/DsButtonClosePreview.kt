package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsButtonClosePreview() {
    DrawForLightAndDarkTheme {
        Column {
            DrawAllCases {
                DsButtonClose(
                    onClick = {},
                    action = drawEach(*DsButtonClose.Type.entries.toTypedArray()),
                )
            }
        }
    }
}
