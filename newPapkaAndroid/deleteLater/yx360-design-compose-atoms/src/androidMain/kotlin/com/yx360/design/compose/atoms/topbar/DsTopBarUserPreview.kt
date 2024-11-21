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
import com.yx360.design.compose.atoms.DsAvatar
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.DsStatus
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
fun DsTopBarUser_FullPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBarUser(
                    back = drawEach(null, {}),
                    middleBlock = DsTopBar.MiddleBlock.Avatar(
                        title = drawEach("Title", "Title".repeat(30)),
                        avatar = DsAvatar.Avatar.Default,
                        style = DsAvatar.Style.Default,
                        subtitle = drawEach(null, "Subtitle"),
                    ),
                    firstEndSlot = DsTopBar.Slot.Icon(
                        painter = rememberVectorPainter(Ds.Icon.StarOutlineMd),
                        tint = Ds.BrandColor.TextBrand
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
fun DsTopBarUser_NoBackNoSubtitleNoEndSlotsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBarUser(
                    back = drawEach(null, {}),
                    middleBlock = DsTopBar.MiddleBlock.Avatar(
                        title = drawEach("Title", "Title".repeat(30)),
                        avatar = DsAvatar.Avatar.Default,
                        style = DsAvatar.Style.Default,
                        subtitle = drawEach(null, "Subtitle"),
                    ),
                    firstEndSlot = DsTopBar.Slot.None,
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
fun DsTopBarUser_NoBackWithActionsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawForLightAndDarkTheme {
            Column {
                DrawAllCases {
                    DsTopBarUser(
                        back = drawEach(null, {}),
                        middleBlock = DsTopBar.MiddleBlock.Avatar(
                            title = drawEach("Title", "Title".repeat(30)),
                            avatar = DsAvatar.Avatar.Default,
                            style = DsAvatar.Style.Default,
                            subtitle = drawEach(null, "Subtitle"),
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
                }
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
fun DsTopBarUser_WithAvatarStatusContainerColorsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        Column {
            DrawAllCases {
                DsTopBarUser(
                    containerColor = drawEach(
                        Ds.Color.ElevationBase,
                        Ds.Color.ElevationSunken,
                        Ds.BrandColor.SurfaceBrandLight,
                    ),
                    back = {},
                    middleBlock = DsTopBar.MiddleBlock.Avatar(
                        title = "Title",
                        avatar = DsAvatar.Avatar.Default,
                        style = DsAvatar.Style.Status(DsStatus.Preset.Success),
                        subtitle = "Subtitle",
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
