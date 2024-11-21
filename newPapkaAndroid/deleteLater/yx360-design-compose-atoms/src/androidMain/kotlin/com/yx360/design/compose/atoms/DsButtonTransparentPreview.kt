package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineSm
import com.yx360.design.compose.icons.dsicon.StarSolidSm

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsButtonTransparentPreview_Sizes_Icons() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationSunken) {
            FlowColumn {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Neutral,
                        description = "test",
                        loadingIndicator = false,
                        leftIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarSolidSm)),
                        rightIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarOutlineSm)),
                        size = drawEach(*DsButton.Size.entries.toTypedArray()),
                        sideMargins = true,
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsButtonTransparentPreview_Enabled_Texts_Loading() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationSunken) {
            FlowColumn {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Neutral,
                        enabled = drawEach(true, false),
                        description = drawEach("test", null),
                        loadingIndicator = drawEach(true, false),
                        leftIcon = rememberVectorPainter(Ds.Icon.StarSolidSm),
                        rightIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                        size = DsButton.Size.Md,
                        sideMargins = true,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentStylesPreview_Mail_Disk() {
    Row {
        Column {
            DsButtonTransparentStylesPreview(BrandTheme.Mail)
            Spacer(Modifier.height(16.dp))
            DsButtonTransparentStylesPreview(BrandTheme.Disk)
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentStylesPreview_Messenger_Telemost() {
    Row {
        Column {
            DsButtonTransparentStylesPreview(BrandTheme.Messenger)
            Spacer(Modifier.height(16.dp))
            DsButtonTransparentStylesPreview(BrandTheme.Telemost)
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentStylesPreview_Calendar_Pres() {
    Row {
        Column {
            DsButtonTransparentStylesPreview(BrandTheme.Calendar)
            Spacer(Modifier.height(16.dp))
            DsButtonTransparentStylesPreview(BrandTheme.Pres)
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentStylesPreview_Docs_Tables() {
    Row {
        Column {
            DsButtonTransparentStylesPreview(BrandTheme.Docs)
            Spacer(Modifier.height(16.dp))
            DsButtonTransparentStylesPreview(BrandTheme.Tables)
        }
    }
}

@Composable
private fun DsButtonTransparentStylesPreview(brandTheme: BrandTheme) {
    DrawForLightAndDarkTheme(brandTheme = brandTheme) {
        Surface(color = Ds.Color.ElevationSunken) {
            Column {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        onClick = {},
                        variant = drawEach(*DsButton.Style.entries.toTypedArray()),
                        loadingIndicator = false,
                        leftIcon = rememberVectorPainter(Ds.Icon.StarSolidSm),
                        rightIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                        size = DsButton.Size.Md,
                        sideMargins = true,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentMaxWidthPreview() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationSunken) {
            Column {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {},
                        variant = DsButton.Style.Brand,
                        description = drawEach("test", null),
                        leftIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarSolidSm)),
                        rightIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarOutlineSm)),
                        size = DsButton.Size.Lg,
                        sideMargins = true,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsButtonTransparentLoadingMaxWidthPreview() {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationSunken) {
            Column {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {},
                        variant = DsButton.Style.Brand,
                        loadingIndicator = true,
                        description = drawEach("test", null),
                        leftIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarSolidSm)),
                        rightIcon = drawEach(null, rememberVectorPainter(Ds.Icon.StarOutlineSm)),
                        size = DsButton.Size.Lg,
                        sideMargins = true,
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsButtonTransparentPreview_SideMargins_Size_Loading() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        Surface(color = Ds.Color.ElevationSunken) {
            FlowColumn {
                DrawAllCases {
                    DsButtonTransparent(
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Neutral,
                        loadingIndicator = drawEach(true, false),
                        leftIcon = rememberVectorPainter(Ds.Icon.StarSolidSm),
                        rightIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                        size = drawEach(*DsButton.Size.entries.toTypedArray()),
                        sideMargins = drawEach(true, false),
                    )
                }
            }
        }
    }
}
