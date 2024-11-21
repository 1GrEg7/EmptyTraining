package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.fab.DsButtonFab
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.icons.dsicon.StarSolidMd

@Preview
@Composable
fun DsBottomBarBrandsLightPreview() {
    Ds.Theme(darkTheme = false) {
        val tabs = getTabs()
        Surface(color = Ds.Color.ElevationSunken) {
            DrawForEachBrand(
                orientation = Orientation.Vertical,
            ) {
                Column {
                    DsBottomBar(
                        fab = DsBottomBar.Fab(
                            type = DsButtonFab.Type.Icon(
                                painter = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            ),
                            isLoading = false,
                            onClick = {}
                        ),
                        tabs = tabs,
                        selectedTabIndex = 0,
                        onTabSelect = { }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsBottomBarBrandsDarkPreview() {
    Ds.Theme(darkTheme = true) {
        val tabs = getTabs()
        DrawForEachBrand(
            orientation = Orientation.Vertical,
        ) {
            Column {
                DsBottomBar(
                    fab = DsBottomBar.Fab(
                        type = DsButtonFab.Type.Icon(
                            painter = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                        ),
                        isLoading = false,
                        onClick = {}
                    ),
                    tabs = tabs,
                    selectedTabIndex = 0,
                    onTabSelect = { }
                )
            }
        }
    }
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun DsBottomBarDirectionPreview() {
    val tabs = getTabs()
    DrawForLightAndDarkTheme(
        orientation = Orientation.Vertical,
        brandTheme = BrandTheme.Mail,
    ) {
        Column {
            DrawAllCases {
                val selectedTab = drawEach(2, 4)
                DsBottomBar(
                    fab = null,
                    tabs = tabs,
                    selectedTabIndex = selectedTab,
                    onTabSelect = { },
                )
            }
            DrawRtl {
                DrawAllCases {
                    val selectedTab = drawEach(2, 4)
                    DsBottomBar(
                        fab = null,
                        tabs = tabs,
                        selectedTabIndex = selectedTab,
                        onTabSelect = { }
                    )
                }
            }
        }
    }
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun DsBottomBarStatusPreview() {
    DrawForLightAndDarkTheme(
        orientation = Orientation.Vertical,
        brandTheme = BrandTheme.Mail,
    ) {
        Column {
            DrawAllCases {
                val tabs = getTabs(hasStatus = drawEach({ it == 1 }, { it == 4 }, { true }))
                val selectedTab = drawEach(2, 4)
                DsBottomBar(
                    fab = null,
                    tabs = tabs,
                    selectedTabIndex = selectedTab,
                    onTabSelect = { },
                )
            }
        }
    }
}

@Suppress("MagicNumber")
@Composable
private fun getTabs(hasStatus: (index: Int) -> Boolean = { false }): List<DsBottomBar.Item> {
    return List(5) {
        val status = hasStatus(it)
        if (it == 4) {
            DsBottomBar.Item.Profile(
                avatar = DsAvatar.Avatar.Default,
                status = status,
            )
        } else {
            DsBottomBar.Item.Icon(
                rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                status = status,
            )
        }
    }
}
