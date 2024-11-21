package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsAvatarGroupPreview_Sizes() {
    DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
        Column {
            DrawAllCases {
                val items = List(10) {
                    DsAvatar.Avatar.Default
                }
                DsAvatarGroup(
                    size = drawEach(*DsAvatar.Size.entries.toTypedArray()),
                    items = items,
                    maxAvatars = 5,
                    modifier = Modifier.padding(Ds.Size.M),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsAvatarGroupPreview_Variants() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationBase) {
            Column {
                DrawAllCases {
                    val items = List(drawEach(5, 100)) {
                        DsAvatar.Avatar.Default
                    }
                    DsAvatarGroup(
                        items = items,
                        maxAvatars = drawEach(1, 3, 7),
                        modifier = Modifier.padding(Ds.Size.M),
                    )
                }
            }
        }
    }
}
