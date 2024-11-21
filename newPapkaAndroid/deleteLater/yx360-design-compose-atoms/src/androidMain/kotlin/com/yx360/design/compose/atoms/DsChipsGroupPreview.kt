package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForEachBrand
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@Preview(showBackground = true)
@Composable
fun DsChipsGroupAllVariantsOfChipsPreview() {
    Ds.Theme(brandTheme = BrandTheme.Disk) {
        DrawForLightAndDarkTheme {
            val items = listOf(
                DsChips.Variant.Primary,
                DsChips.Variant.Secondary,
                null,
            ).mapIndexed { index, variant ->
                DsChipsGroup.Item(
                    label = "Label $index",
                    variant = variant,
                    onClick = {},
                )
            }
            DsChipsGroup(
                modifier = Modifier.padding(
                    horizontal = Ds.Spacing.M8,
                    vertical = Ds.Spacing.M4,
                ),
                contentMode = DsGroup.ContentMode.Multiline.Max,
                variant = DsChips.Variant.Primary,
                chips = items,
                size = DsChips.Size.Md,
            )
        }
    }
}

@Preview
@Composable
fun DsChipsGroupMonoLinePreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(color = Ds.Color.ElevationBase) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    DrawAllCases {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(10) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Monoline,
                            size = drawEach(*(DsChips.Size.entries).toTypedArray()),
                            variant = drawEach(*(DsChips.Variant.entries.toTypedArray()))
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupMonoLineRtlPreview() {
    DrawRtl {
        Ds.Theme {
            Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
                Surface(color = Ds.Color.ElevationBase) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        DrawAllCases {
                            DsChipsGroup(
                                modifier = Modifier.padding(
                                    horizontal = Ds.Spacing.M8,
                                    vertical = Ds.Spacing.M4,
                                ),
                                chips = List(10) {
                                    DsChipsGroup.Item(
                                        label = "Label",
                                        leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                        iconColor = Ds.BrandColor.SurfaceBrand,
                                        onClick = {}
                                    )
                                },
                                contentMode = DsGroup.ContentMode.Monoline,
                                size = drawEach(*(DsChips.Size.entries).toTypedArray()),
                                variant = drawEach(*(DsChips.Variant.entries.toTypedArray()))
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupMultiLineContainerMatchParentPreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(color = Ds.Color.ElevationBase) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(5) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline(
                                maxLines = 3,
                                onMoreClick = { }
                            ),
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupSingleLineContainerExactlyPreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(
                color = Ds.Color.ElevationBase
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .width(370.dp)
                    ) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(10) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline(
                                maxLines = 1,
                                onMoreClick = { }
                            ),
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupMultiLineMaxContainerWidthSmallPreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(color = Ds.Color.ElevationBase) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .width(130.dp)
                    ) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(5) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline.Max,
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupExpandPreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(color = Ds.Color.ElevationBase) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                    ) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(50) {
                                DsChipsGroup.Item(
                                    label = "Label 1234575657",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {},
                                    onClose = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline(
                                maxLines = 3,
                                onMoreClick = { }
                            ),
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupLotsOfItemsPreview() {
    Ds.Theme {
        Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
            Surface(color = Ds.Color.ElevationBase) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                    ) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(100) {
                                DsChipsGroup.Item(
                                    label = "Label 1234575657",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {},
                                    onClose = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline.Max,
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupLotsOfItemsRtlPreview() {
    DrawRtl {
        Ds.Theme {
            Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
                Surface(color = Ds.Color.ElevationBase) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier
                                .verticalScroll(rememberScrollState())
                        ) {
                            DsChipsGroup(
                                modifier = Modifier.padding(
                                    horizontal = Ds.Spacing.M8,
                                    vertical = Ds.Spacing.M4,
                                ),
                                chips = List(100) {
                                    DsChipsGroup.Item(
                                        label = "Label 1234575657",
                                        leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                        iconColor = Ds.BrandColor.SurfaceBrand,
                                        onClick = {},
                                        onClose = {}
                                    )
                                },
                                contentMode = DsGroup.ContentMode.Multiline.Max,
                                size = DsChips.Size.Md,
                                variant = DsChips.Variant.Primary
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupSingleLineContainerExactlyRTLPreview() {
    DrawRtl {
        Ds.Theme {
            Ds.BrandTheme(brandTheme = BrandTheme.Mail) {
                Surface(
                    color = Ds.Color.ElevationBase
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(10) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {},
                                    onClose = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline(
                                maxLines = 1,
                                onMoreClick = { }
                            ),
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DsChipsGroupDiffBrandsPreview() {
    Ds.Theme {
        DrawForLightAndDarkTheme(orientation = Orientation.Vertical) {
            DrawForEachBrand(orientation = Orientation.Vertical) {
                Surface(
                    color = Ds.Color.ElevationBase
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        DsChipsGroup(
                            modifier = Modifier.padding(
                                horizontal = Ds.Spacing.M8,
                                vertical = Ds.Spacing.M4,
                            ),
                            chips = List(10) {
                                DsChipsGroup.Item(
                                    label = "Label",
                                    leftIcon = rememberVectorPainter(Ds.Icon.StarOutlineSm),
                                    iconColor = Ds.BrandColor.SurfaceBrand,
                                    onClick = {},
                                    onClose = {}
                                )
                            },
                            contentMode = DsGroup.ContentMode.Multiline(
                                maxLines = 1,
                                onMoreClick = { }
                            ),
                            size = DsChips.Size.Md,
                            variant = DsChips.Variant.Primary
                        )
                    }
                }
            }
        }
    }
}
