package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsAvatarPreview_Sizes() {
    DrawForLightAndDarkTheme(orientation = Orientation.Horizontal) {
        FlowColumn(maxItemsInEachColumn = 6) {
            DrawAllCases {
                DsAvatar(
                    size = drawEach(*DsAvatar.Size.entries.toTypedArray()),
                    avatar = drawEach(
                        DsAvatar.Avatar.Default,
                        DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                    ),
                    style = DsAvatar.Style.Default,
                    modifier = Modifier.padding(Ds.Size.M),
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsAvatarPreview_Texts() {
    DrawForLightAndDarkTheme {
        FlowColumn(maxItemsInEachColumn = 6) {
            DrawAllCases {
                DsAvatar(
                    size = drawEach(*DsAvatar.Size.entries.toTypedArray()),
                    avatar = drawEach(
                        DsAvatar.Avatar.OnlyName("A", uid = 1L),
                        DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                        DsAvatar.Avatar.OnlyName("AAA", uid = 1L),
                    ),
                    style = DsAvatar.Style.Default,
                    modifier = Modifier.padding(Ds.Size.M),
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsAvatarPreview_Styles() {
    Ds.Theme {
        val styles = mutableListOf<DsAvatar.Style>().apply {
            add(DsAvatar.Style.Default)
            addAll(DsStatus.Preset.entries.map { DsAvatar.Style.Status(it) })
            add(DsAvatar.Style.Indicator.YaPlus)
            add(DsAvatar.Style.Indicator.SolidColor(color = Ds.Color.Ya360SurfacePrimary))
        }
        DrawForLightAndDarkTheme {
            FlowColumn(maxItemsInEachColumn = 6) {
                DrawAllCases {
                    DsAvatar(
                        style = drawEach(*styles.toTypedArray()),
                        avatar = drawEach(
                            DsAvatar.Avatar.Default,
                            DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                        ),
                        size = DsAvatar.Size.M24,
                        modifier = Modifier.padding(Ds.Size.M),
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsAvatarPreview_Status_Sizes() {
    DrawForLightAndDarkTheme {
        FlowColumn(maxItemsInEachColumn = 6) {
            DrawAllCases {
                DsAvatar(
                    size = drawEach(*DsAvatar.Size.entries.toTypedArray()),
                    avatar = DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                    style = DsAvatar.Style.Status(
                        drawEach(*DsStatus.Preset.entries.toTypedArray()),
                    ),
                    modifier = Modifier.padding(Ds.Size.M),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsAvatarPreview_Badge_BrandThemes() {
    DrawForLightAndDarkTheme {
        DrawForEachBrand(orientation = Orientation.Horizontal) {
            Column {
                DrawAllCases {
                    DsAvatar(
                        size = DsAvatar.Size.M20,
                        avatar = DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                        counter = drawEach(1, 99, 100),
                        modifier = Modifier.padding(Ds.Size.M),
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsAvatarPreview_Badge_Sizes_Styles() {
    DrawForLightAndDarkTheme(brandTheme = BrandTheme.Mail) {
        FlowColumn(maxItemsInEachColumn = 6) {
            DrawAllCases {
                DsAvatar(
                    size = drawEach(*DsAvatar.Size.entries.toTypedArray()),
                    avatar = DsAvatar.Avatar.OnlyName("AA", uid = 1L),
                    style = drawEach(DsAvatar.Style.Default, DsAvatar.Style.Indicator.YaPlus),
                    counter = drawEach(1, 100),
                    modifier = Modifier.padding(Ds.Size.M),
                )
            }
        }
    }
}
