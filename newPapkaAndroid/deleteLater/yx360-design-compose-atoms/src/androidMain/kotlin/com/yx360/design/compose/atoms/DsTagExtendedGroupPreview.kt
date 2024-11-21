package com.yx360.design.compose.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.group.DsGroup
import com.yx360.design.compose.atoms.preview.DrawForDifferentSurfaces
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.tags.DsTag
import com.yx360.design.compose.atoms.tags.DsTagExtended
import com.yx360.design.compose.atoms.tags.DsTagExtendedGroup
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@Preview(showBackground = true)
@Composable
fun DsTagExtendedGroupAllVariantsOfTagsPreview() {
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
                DsTagExtendedGroup.Item(
                    label = "Label $index",
                    description = "Description $index",
                    variant = variant,
                    startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm),
                )
            }
            DsTagExtendedGroup(
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

@Suppress("StringLiteralDuplication", "MagicNumber")
@Preview(
    name = "Monoline Primary Light",
    group = "Monoline",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "Monoline Primary Dark",
    group = "Monoline",
    showBackground = false,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsTagExtendedGroupMonolinePrimaryPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagExtendedGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Suppress("StringLiteralDuplication", "MagicNumber")
@Preview(
    name = "Monoline Secondary Light",
    group = "Monoline",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "Monoline Secondary Dark",
    group = "Monoline",
    showBackground = false,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsTagExtendedGroupMonolineSecondaryPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagExtendedGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Monoline,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Suppress("StringLiteralDuplication", "MagicNumber")
@Preview(
    name = "Multiline Primary Light",
    group = "Multiline",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "Multiline Primary Dark",
    group = "Multiline",
    showBackground = false,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsTagExtendedGroupMultilinePrimaryPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagExtendedGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.Neutral,
            items = items(startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Suppress("StringLiteralDuplication", "MagicNumber")
@Preview(
    name = "Multiline Secondary Light",
    group = "Multiline",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "Multiline Secondary Dark",
    group = "Multiline",
    showBackground = false,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsTagExtendedGroupMultilineSecondaryPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    DrawForDifferentSurfaces {
        DsTagExtendedGroup(
            modifier = Modifier.padding(
                horizontal = Ds.Spacing.M8,
                vertical = Ds.Spacing.M4,
            ),
            contentMode = DsGroup.ContentMode.Multiline.Max,
            variant = DsTag.Variant.NeutralAlt,
            items = items(startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm)),
        )
    }
}

@Suppress("StringLiteralDuplication", "MagicNumber")
@Composable
private fun items(startSlot: DsTagExtended.StartSlot) = listOf(
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 1",
        description = "Description",
        onClose = {},
    ),
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 12",
        description = "Description".repeat(10),
        onClose = {},
    ),
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 123",
        description = "Description",
        onClose = {},
    ),
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 1234",
        description = "Description".repeat(10),
        onClose = {},
    ),
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 12345",
        description = "Description",
        onClose = {},
    ),
    DsTagExtendedGroup.Item(
        startSlot = startSlot,
        label = "Size 12346",
        description = "Description".repeat(10),
        onClose = {},
    ),
)
