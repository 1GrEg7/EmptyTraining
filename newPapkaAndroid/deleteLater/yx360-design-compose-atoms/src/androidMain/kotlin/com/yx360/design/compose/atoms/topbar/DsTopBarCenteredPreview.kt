package com.yx360.design.compose.atoms.topbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.ChevronBottomOutlineMd
import com.yx360.design.compose.icons.dsicon.ChevronLeftOutlineMd
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsTopBarCentered_FullDarkAndLightPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBarCentered(
                        middleBlock = DsTopBar.MiddleBlock.Title.Value(
                            title = drawEach("Title", "Title".repeat(30)),
                            middleSlot = drawEach(
                                DsTopBar.Slot.None,
                                DsTopBar.Slot.Icon(
                                    painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                                    onClick = {},
                                ),
                            ),
                        ),
                        firstStartSlot = drawEach(
                            DsTopBar.Slot.None,
                            DsTopBar.Slot.Icon(
                                painter = rememberVectorPainter(Ds.Icon.ChevronLeftOutlineMd),
                                onClick = { },
                            )
                        ),
                        firstEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                            onClick = {}
                        ),
                        secondEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        ),
                        thirdEndSlot = DsTopBar.Slot.Button(
                            isTransparent = true,
                            title = "Label",
                            onClick = {},
                            variant = DsButton.Style.Brand,
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
}

@Preview
@Composable
fun DsTopBarCentered_NoStartNoMiddleEndActionPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBarCentered(
                    middleBlock = DsTopBar.MiddleBlock.Title.Value(
                        title = drawEach("Title", "Title".repeat(30)),
                        middleSlot = drawEach(
                            DsTopBar.Slot.None,
                            DsTopBar.Slot.Icon(
                                painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                                onClick = {},
                            ),
                        ),
                    ),
                    firstStartSlot = drawEach(
                        DsTopBar.Slot.None,
                        DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.ChevronLeftOutlineMd),
                            onClick = { },
                        )
                    ),
                    firstEndSlot = drawEach(
                        DsTopBar.Slot.None,
                        DsTopBar.Slot.Button(
                            isTransparent = true,
                            title = "Label",
                            onClick = {},
                            variant = DsButton.Style.Brand,
                        ),
                    ),
                    secondEndSlot = DsTopBar.Slot.None,
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

@Preview
@Composable
fun DsTopBarCentered_WithStartEndSlotsContainerColorsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBarCentered(
                    containerColor = drawEach(
                        Ds.Color.ElevationBase,
                        Ds.Color.ElevationSunken,
                        Ds.BrandColor.SurfaceBrandLight,
                    ),
                    middleBlock = DsTopBar.MiddleBlock.Title.Value(
                        title = drawEach("Title", "Title".repeat(30)),
                        middleSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                            onClick = {},
                        ),
                    ),
                    firstStartSlot = drawEach(
                        DsTopBar.Slot.Button(
                            isTransparent = true,
                            title = "Label",
                            onClick = {},
                            variant = DsButton.Style.Brand,
                        ),
                        DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        ),
                    ),
                    firstEndSlot = DsTopBar.Slot.Button(
                        isTransparent = true,
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Brand,
                    ),
                    secondEndSlot = DsTopBar.Slot.None,
                    thirdEndSlot = DsTopBar.Slot.None,
                    scrollBehavior = null,
                )
            }
        }
    }
}
