package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl
import com.yx360.design.compose.atoms.tags.DsTag
import com.yx360.design.compose.atoms.tags.DsTagExtended
import com.yx360.design.compose.icons.dsicon.CameraOutlineSm
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagExtendedPreview_Texts_StartSlotIcon() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTagExtended(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    description = drawEach("description", "description".repeat(100)),
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(
                        DsTagExtended.StartSlot.None,
                        DsTagExtended.Icon(Ds.Icon.StarOutlineSm),
                    ),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagExtendedPreviewRtl_Texts_StartSlotIcon() {
    DrawRtl {
        DsTagExtendedPreview_Texts_StartSlotIcon()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagExtendedPreview_Variants_CloseIcon() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTagExtended(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = drawEach(null, {}),
                    description = "description",
                    variant = drawEach(
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
                        )
                    ),
                    startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagExtendedPreviewRtl_Variants_CloseIcon() {
    DrawRtl {
        DsTagExtendedPreview_Variants_CloseIcon()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagExtendedPreview_LongText() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTagExtended(
                    modifier = Modifier.padding(4.dp),
                    label = drawEach("Label", "Label".repeat(100)),
                    description = drawEach("description", "description".repeat(100)),
                    variant = DsTag.Variant.Neutral,
                    startSlot = DsTagExtended.Icon(Ds.Icon.StarOutlineSm),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagExtendedPreviewRtl_LongText() {
    DrawRtl {
        DsTagExtendedPreview_LongText()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagExtendedPreview_StartSlotFile() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTagExtended(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    description = "description",
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(
                        DsTagExtended.StartSlot.None,
                        DsTagExtended.StartSlot.File(rememberVectorPainter(Ds.Icon.CameraOutlineSm)),
                    ),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagExtendedPreviewRtl_StartSlotFile() {
    DrawRtl {
        DsTagExtendedPreview_StartSlotFile()
    }
}
