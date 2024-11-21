package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.preview.DrawForDifferentSurfaces
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.atoms.tags.DsTag
import com.yx360.design.compose.atoms.tags.DsTagGroup
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@Preview(showBackground = true)
@Composable
fun DsTagGroupAllVariantsOfTagsPreview() {
    Ds.Theme(brandTheme = BrandTheme.Disk) {
        DrawForLightAndDarkTheme {
            val items = listOf(
                DsTag.Variant.Neutral,
                DsTag.Variant.NeutralAlt,
                DsTag.Variant.Danger,
                DsTag.Variant.Warning,
                DsTag.Variant.Colored(
                    container = Ds.Color.SurfaceAccent17,
                    icon = Ds.Color.TextStaticLight,
                    label = Ds.Color.TextStaticLight,
                    secondaryText = Ds.Color.TextStaticLight,
                    closeIcon = Ds.Color.TextStaticLight,
                ),
                null,
            ).mapIndexed { index, variant ->
                DsTagGroup.Item(
                    label = "Label $index",
                    variant = variant,
                    startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm),
                )
            }
            DsTagGroup(
                modifier = Modifier.padding(
                    horizontal = Ds.Spacing.M8,
                    vertical = Ds.Spacing.M4,
                ),
                contentMode = DsGroup.ContentMode.Multiline.Max,
                variant = DsTag.Variant.Neutral,
                items = items,
            )
        }
    }
}

@Preview(
    name = "Monoline Neutral Light",
    group = "Monoline",
    showBackground = true,
)
@Composable
fun DsTagGroupMonolineNeutralLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Monoline Neutral Dark",
    group = "Monoline",
    showBackground = false,
)
@Composable
fun DsTagGroupMonolineNeutralDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Monoline Neutral Alt Light",
    group = "Monoline",
    showBackground = true
)
@Composable
fun DsTagGroupMonolineNeutralAltLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Monoline Neutral Alt Dark",
    group = "Monoline",
    showBackground = false,
)
@Composable
fun DsTagGroupMonolineSecondaryDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Monoline Rtl",
    group = "Monoline",
    showBackground = true
)
@Composable
fun DsTagGroupMonolineRtlPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawRtl {
        DrawForDifferentSurfaces {
            DsTagGroup(
                modifier = Modifier.padding(
                    horizontal = Ds.Spacing.M8,
                    vertical = Ds.Spacing.M4,
                ),
                contentMode = DsGroup.ContentMode.Monoline,
                variant = DsTag.Variant.NeutralAlt,
                items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
            )
        }
    }
}

@Preview(
    name = "Multiline Neutral Light",
    group = "Multiline",
    showBackground = true,
)
@Composable
fun DsTagGroupMultilineNeutralLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Multiline Neutral Dark",
    group = "Multiline",
    showBackground = false,
)
@Composable
fun DsTagGroupMultilineNeutralDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Multiline Neutral Alt Light",
    group = "Multiline",
    showBackground = true,
)
@Composable
fun DsTagGroupMultilineNeutralAltLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Multiline Neutral Alt Dark",
    group = "Multiline",
    showBackground = false,
)
@Composable
fun DsTagGroupMultilineNeutralAltDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Preview(
    name = "Multiline Rtl",
    group = "Multiline",
    showBackground = true,
)
@Composable
fun DsTagGroupMultilineRtlPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawRtl {
        DrawForDifferentSurfaces {
            DsTagGroup(
                modifier = Modifier.padding(
                    horizontal = Ds.Spacing.M8,
                    vertical = Ds.Spacing.M4,
                ),
                contentMode = DsGroup.ContentMode.Multiline.Max,
                variant = DsTag.Variant.NeutralAlt,
                items = items(startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm)),
            )
        }
    }
}

@Preview(
    group = "Multiline",
    showBackground = false,
)
@Composable
fun DsTagGroupMultilineLongLabelPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.NeutralAlt,
            items = List(3) {
                DsTagGroup.Item(
                    startSlot = DsTag.StartSlot.None,
                    label = "Label".repeat(30),
                    onClose = {},
                )
            }
        )
    }
}

@Preview(
    group = "Multiline",
    showBackground = false,
)
@Composable
fun DsTagGroupMultilineIconLongLabelPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.NeutralAlt,
            items = List(3) {
                DsTagGroup.Item(
                    startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm),
                    label = "Label".repeat(30),
                    onClose = {},
                )
            }
        )
    }
}

@Preview(
    group = "Multiline",
    showBackground = false,
)
@Composable
fun DsTagGroupMultiline3RowsWrapContentHeightPreview() =
    Ds.Theme(brandTheme = BrandTheme.Disk) {
        DrawForDifferentSurfaces {
            DsTagGroup(
                modifier = Modifier.padding(
                    horizontal = Ds.Spacing.M8,
                    vertical = Ds.Spacing.M4,
                ),
                contentMode = DsGroup.ContentMode.Multiline(
                    maxLines = 3,
                    onMoreClick = { }
                ),
                variant = DsTag.Variant.NeutralAlt,
                items = List(10) {
                    DsTagGroup.Item(
                        startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm),
                        label = "Label".repeat(30),
                        onClose = {},
                    )
                }
            )
        }
    }

@Composable
private fun items(startSlot: DsTag.StartSlot) = listOf(
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 1",
        onClose = {},
    ),
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 12",
        onClose = {},
    ),
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 123",
        onClose = {},
    ),
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 1234",
        onClose = {},
    ),
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 12345",
        onClose = {},
    ),
    DsTagGroup.Item(
        startSlot = startSlot,
        label = "Size 12346",
        onClose = {},
    ),
)
