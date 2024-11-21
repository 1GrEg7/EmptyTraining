package com.yx360.design.compose.atoms.topbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsTopBarSearch_FullPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        var searchValue by remember { mutableStateOf("") }
        Column {
            DrawAllCases {
                DsTopBarSearch(
                    back = drawEach(null, {}),
                    middleBlock = DsTopBar.MiddleBlock.Search(
                        value = searchValue,
                        placeholder = "Search",
                        onValueChanged = { searchValue = it },
                        enabled = true,
                        onClear = { searchValue = "" }

                    ),
                    firstEndSlot = DsTopBar.Slot.Icon(
                        painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        tint = Ds.BrandColor.TextBrand,
                    ),
                    secondEndSlot = DsTopBar.Slot.Image(
                        painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                    ),
                    thirdEndSlot = DsTopBar.Slot.Button(
                        isTransparent = true,
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Success,
                    ),
                    scrollBehavior = null,
                )
                Spacer(
                    Modifier
                        .background(Ds.Color.ElevationSunken)
                        .fillMaxWidth()
                        .height(Ds.Spacing.M)
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTopBarSearch_NoBackNoEndWithContainerColorsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        var searchValue by remember { mutableStateOf("") }
        Column {
            DrawAllCases {
                DsTopBarSearch(
                    containerColor = drawEach(
                        Ds.Color.ElevationBase,
                        Ds.Color.ElevationSunken,
                        Ds.BrandColor.SurfaceBrandLight,
                    ),
                    back = drawEach(null, {}),
                    middleBlock = DsTopBar.MiddleBlock.Search(
                        value = searchValue,
                        placeholder = "Search",
                        onValueChanged = { searchValue = it },
                        enabled = true,
                        onClear = { searchValue = "" }
                    ),
                    firstEndSlot = DsTopBar.Slot.None,
                    secondEndSlot = DsTopBar.Slot.None,
                    thirdEndSlot = DsTopBar.Slot.None,
                    scrollBehavior = null,
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTopBarSearch_WithActionsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        var searchValue by remember { mutableStateOf("") }
        Column {
            DrawAllCases {
                DsTopBarSearch(
                    back = drawEach(null, {}),
                    middleBlock = DsTopBar.MiddleBlock.Search(
                        value = searchValue,
                        placeholder = "Search",
                        onValueChanged = { searchValue = it },
                        enabled = true,
                        onClear = { searchValue = "" }
                    ),
                    firstEndSlot = DsTopBar.Slot.Button(
                        isTransparent = true,
                        title = "Save",
                        onClick = {},
                        variant = DsButton.Style.Brand,
                    ),
                    secondEndSlot = DsTopBar.Slot.Button(
                        isTransparent = true,
                        title = "Delete",
                        onClick = {},
                        variant = DsButton.Style.Neutral,
                    ),
                    thirdEndSlot = DsTopBar.Slot.None,
                    scrollBehavior = null,
                )
                Spacer(
                    Modifier
                        .background(Ds.Color.ElevationSunken)
                        .fillMaxWidth()
                        .height(Ds.Spacing.M)
                )
            }
        }
    }
}
