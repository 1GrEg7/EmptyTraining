package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@Preview
@Composable
fun DsEmptyPreview_Title_Description() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationRisen) {
            Column {
                DrawAllCases {
                    DsEmpty(
                        title = drawEach(null, "Title"),
                        description = drawEach(null, "Some description"),
                        image = null,
                        buttonTitle = null,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsEmptyPreviewLight_ButtonTitle_Image() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        DsEmptyPreview_ButtonTitle_Image()
    }
}

@Preview
@Composable
fun DsEmptyPreviewDark_ButtonTitle_Image() {
    Ds.Theme(brandTheme = BrandTheme.Mail, darkTheme = true) {
        DsEmptyPreview_ButtonTitle_Image()
    }
}

@Composable
private fun DsEmptyPreview_ButtonTitle_Image() {
    Surface(color = Ds.Color.ElevationRisen) {
        Column {
            DrawAllCases {
                DsEmpty(
                    title = "Title",
                    description = "Some description",
                    image = drawEach(
                        null,
                        {
                            Box(
                                modifier = Modifier
                                    .size(180.dp)
                                    .background(Ds.Color.SurfaceAccent01)
                            )
                        }
                    ),
                    buttonTitle = drawEach(null, "Label"),
                )
            }
        }
    }
}
