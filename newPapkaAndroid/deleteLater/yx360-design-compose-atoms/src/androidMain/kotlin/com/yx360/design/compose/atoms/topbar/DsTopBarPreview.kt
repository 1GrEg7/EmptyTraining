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
import com.yx360.design.compose.icons.dsicon.CloudOutlineMd
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsTopBar_FullAndContainerColorPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBar(
                    containerColor = drawEach(
                        Ds.Color.ElevationBase,
                        Ds.Color.ElevationSunken,
                        Ds.BrandColor.SurfaceBrandLight,
                    ),
                    back = {},
                    middleBlock = DsTopBar.MiddleBlock.Title.Value(
                        title = drawEach("Title", "Title".repeat(30)),
                        middleSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                            onClick = {},
                        )
                    ),
                    firstEndSlot = DsTopBar.Slot.Image(
                        painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        onClick = {}
                    ),
                    secondEndSlot = DsTopBar.Slot.Button(
                        isTransparent = false,
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Success,
                    ),
                    thirdEndSlot = DsTopBar.Slot.Icon(
                        painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        tint = Ds.BrandColor.TextBrand
                    ),
                    fourthEndSlot = DsTopBar.Slot.Button(
                        isTransparent = true,
                        title = "Label",
                        onClick = {},
                        variant = DsButton.Style.Success,
                    ),
                    scrollBehavior = null,
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTopBar_NoBackNoMiddleSlotNoEndSlotsWithDarkLightPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBar(
                        back = drawEach(null, {}),
                        middleBlock = DsTopBar.MiddleBlock.Title.Value(
                            title = drawEach("Title", "Title".repeat(30)),
                            middleSlot = drawEach(
                                DsTopBar.Slot.None,
                                DsTopBar.Slot.Icon(
                                    painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                                    tint = Ds.Color.TextPrimary,
                                ),
                            )
                        ),
                        firstEndSlot = DsTopBar.Slot.None,
                        secondEndSlot = DsTopBar.Slot.None,
                        thirdEndSlot = DsTopBar.Slot.None,
                        fourthEndSlot = DsTopBar.Slot.None,
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
fun DsTopBar_NoTitleNoBackPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBar(
                        back = drawEach(null, {}),
                        middleBlock = DsTopBar.MiddleBlock.Title.None,
                        firstEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                            onClick = {}
                        ),
                        secondEndSlot = DsTopBar.Slot.Button(
                            isTransparent = false,
                            title = "Label",
                            onClick = {},
                            variant = DsButton.Style.Success,
                        ),
                        thirdEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                            tint = Ds.BrandColor.TextBrand
                        ),
                        fourthEndSlot = DsTopBar.Slot.Button(
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
}

@Preview
@Composable
fun DsTopBar_NoTitleWithActionsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBar(
                        back = drawEach(null, {}),
                        middleBlock = DsTopBar.MiddleBlock.Title.None,
                        firstEndSlot = DsTopBar.Slot.Button(
                            isTransparent = false,
                            title = "Save",
                            onClick = {},
                            variant = DsButton.Style.Brand,
                        ),
                        secondEndSlot = DsTopBar.Slot.Button(
                            isTransparent = false,
                            title = "Delete",
                            onClick = {},
                            variant = DsButton.Style.Neutral,
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
fun DsTopBar_WithTitleWithActionsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBar(
                        back = drawEach(null, {}),
                        middleBlock = DsTopBar.MiddleBlock.Title.Value(
                            title = "Title",
                            middleSlot = drawEach(
                                DsTopBar.Slot.Icon(
                                    painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                                    onClick = {},
                                ),
                                DsTopBar.Slot.Button(
                                    isTransparent = true,
                                    title = "Press",
                                    onClick = {},
                                    variant = DsButton.Style.Info,
                                )
                            )
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
fun DsTopBar_WithIconsAndButtonIconsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBar(
                        back = {},
                        middleBlock = DsTopBar.MiddleBlock.Title.Value(
                            title = "Title",
                            middleSlot = DsTopBar.Slot.Icon(
                                painter = rememberVectorPainter(Ds.Icon.ChevronBottomOutlineMd),
                                onClick = {},
                            )
                        ),
                        firstEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                            tint = Ds.BrandColor.TextBrand
                        ),
                        secondEndSlot = DsTopBar.Slot.Icon(
                            painter = rememberVectorPainter(Ds.Icon.CloudOutlineMd),
                            tint = Ds.BrandColor.TextBrand
                        ),
                        thirdEndSlot = DsTopBar.Slot.ButtonIcon(
                            icon = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                            isTransparent = true,
                            onClick = {},
                            variant = DsButton.Style.Neutral,
                        ),
                        fourthEndSlot = DsTopBar.Slot.ButtonIcon(
                            icon = rememberVectorPainter(Ds.Icon.CloudOutlineMd),
                            isTransparent = true,
                            onClick = {},
                            variant = DsButton.Style.Neutral,
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
