package com.yx360.design.compose.atoms

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.icons.dsicon.StarSolidMd

@Preview
@Composable
fun DsSegmentedControlPreview_ShortLabels_WrapContentContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                DsSegmentedControl(
                    items = listOf(
                        DsSegmentedControl.Item(
                            enabled = drawEach(true, false),
                            label = drawEach("Label"),
                            startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            endSlot = drawEach(null, { DsBadge(counter = 100) })
                        ),
                        DsSegmentedControl.Item(
                            enabled = true,
                            label = drawEach("Label"),
                            startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            endSlot = drawEach(null, { DsBadge(counter = 100) })
                        )
                    ),
                    selectedItemIndex = 0,
                    onSelect = { },
                    container = DsSegmentedControl.Container.Hug
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSegmentedControlPreview_LongLabels_WrapContentContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                DsSegmentedControl(
                    items = listOf(
                        DsSegmentedControl.Item(
                            enabled = drawEach(true, false),
                            label = "Label".repeat(7),
                            startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            endSlot = drawEach(null, { DsBadge(counter = 100) })
                        ),
                        DsSegmentedControl.Item(
                            enabled = true,
                            label = "Label".repeat(7),
                            startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            endSlot = drawEach(null, { DsBadge(counter = 100) })
                        )
                    ),
                    selectedItemIndex = 0,
                    onSelect = { },
                    container = DsSegmentedControl.Container.Hug
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSegmentedControlPreview_ShortLabels_FixedContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                Box(modifier = Modifier.width(300.dp)) {
                    DsSegmentedControl(
                        items = listOf(
                            DsSegmentedControl.Item(
                                enabled = drawEach(true, false),
                                label = drawEach("Label"),
                                startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                                endSlot = drawEach(null, { DsBadge(counter = 100) })
                            ),
                            DsSegmentedControl.Item(
                                enabled = true,
                                label = drawEach("Label"),
                                startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                                endSlot = drawEach(null, { DsBadge(counter = 100) })
                            )
                        ),
                        selectedItemIndex = 0,
                        onSelect = { },
                        container = DsSegmentedControl.Container.Fixed
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsSegmentedControlPreview_LongLabels_FixedContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                Box(modifier = Modifier.width(300.dp)) {
                    DsSegmentedControl(
                        items = listOf(
                            DsSegmentedControl.Item(
                                enabled = drawEach(true, false),
                                label = "Label".repeat(7),
                                startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                                endSlot = drawEach(null, { DsBadge(counter = 100) })
                            ),
                            DsSegmentedControl.Item(
                                enabled = true,
                                label = "Label".repeat(7),
                                startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                                endSlot = drawEach(null, { DsBadge(counter = 100) })
                            )
                        ),
                        selectedItemIndex = 0,
                        onSelect = { },
                        container = DsSegmentedControl.Container.Fixed
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DsSegmentedControlPreview_Icons_WrapContentContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            DrawAllCases {
                DsSegmentedControl(
                    items = List(3) {
                        DsSegmentedControl.Item(
                            enabled = drawEach(true, false),
                            startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                        )
                    },
                    selectedItemIndex = 0,
                    onSelect = { },
                    container = DsSegmentedControl.Container.Hug
                )
            }
        }
    }
}

@Preview
@Composable
fun DsSegmentedControlPreview_Icons_FixedContainer() {
    DrawForLightAndDarkTheme(
        brandTheme = BrandTheme.Mail,
        orientation = Orientation.Vertical
    ) {
        Column {
            Box(modifier = Modifier.width(300.dp)) {
                DrawAllCases {
                    DsSegmentedControl(
                        items = List(4) {
                            DsSegmentedControl.Item(
                                enabled = true,
                                startIcon = rememberVectorPainter(image = Ds.Icon.StarSolidMd),
                            )
                        },
                        selectedItemIndex = 0,
                        onSelect = { },
                        container = DsSegmentedControl.Container.Fixed
                    )
                }
            }
        }
    }
}
