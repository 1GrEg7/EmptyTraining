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
import com.yx360.design.compose.icons.dsicon.AliceOutlineSm
import com.yx360.design.compose.icons.dsicon.CameraOutlineSm
import com.yx360.design.compose.icons.dsicon.StarOutlineSm

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagPreview_Closable_Texts_StartSlotIcon() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTag(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = drawEach(null, {}),
                    postfix = drawEach(null, "postfix"),
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(DsTag.StartSlot.None, DsTag.Icon(Ds.Icon.StarOutlineSm)),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagPreviewRtl_Closable_Texts_StartSlotIcon() {
    DrawRtl {
        DsTagPreview_Closable_Texts_StartSlotIcon()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagPreview_WhenSlotFileAndImage() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTag(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = {},
                    postfix = "postfix",
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(
                        DsTag.StartSlot.Image(rememberVectorPainter(Ds.Icon.AliceOutlineSm)),
                        DsTag.StartSlot.File(rememberVectorPainter(Ds.Icon.CameraOutlineSm)),
                    ),
                    size = drawEach(*DsTag.Size.entries.toTypedArray()),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagPreviewRtl_WhenSlotFileAndImage() {
    DrawRtl {
        DsTagPreview_WhenSlotFileAndImage()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagPreview_Variants_Sizes() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTag(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = {},
                    postfix = "postfix",
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
                    startSlot = DsTag.Icon(Ds.Icon.StarOutlineSm),
                    size = drawEach(*DsTag.Size.entries.toTypedArray()),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagPreviewRtl_Variants_Sizes() {
    DrawRtl {
        DsTagPreview_Variants_Sizes()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagPreview_WhenSlotAvatar() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTag(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = {},
                    postfix = "postfix",
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(
                        DsTag.StartSlot.Avatar(
                            avatar = DsAvatar.Avatar.Default,
                            style = DsAvatar.Style.Default,
                        ),
                        DsTag.StartSlot.Avatar(
                            avatar = DsAvatar.Avatar.Default,
                            style = DsAvatar.Style.Status(DsStatus.Preset.Success),
                        ),
                        DsTag.StartSlot.Avatar(
                            avatar = DsAvatar.Avatar.Default,
                            style = DsAvatar.Style.Status(DsStatus.Preset.Danger),
                        ),
                        DsTag.StartSlot.Avatar(
                            avatar = DsAvatar.Avatar.Default,
                            style = DsAvatar.Style.Status(DsStatus.Preset.Unknown),
                        ),
                    ),
                    size = drawEach(*DsTag.Size.entries.toTypedArray()),
                )
            }
        }
    }
}

@Preview
@Composable
fun DsTagPreviewRtl_WhenSlotAvatar() {
    DrawRtl {
        DsTagPreview_WhenSlotAvatar()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun DsTagPreview_WhenSlotAvatarOnlyName() {
    DrawForLightAndDarkTheme {
        FlowColumn {
            DrawAllCases {
                DsTag(
                    modifier = Modifier.padding(4.dp),
                    label = "Label",
                    onClose = {},
                    postfix = "postfix",
                    variant = DsTag.Variant.Neutral,
                    startSlot = drawEach(
                        DsTag.StartSlot.Avatar(
                            avatar = DsAvatar.Avatar.OnlyName(
                                "ЖА",
                                color = Ds.Color.SurfaceAccent01,
                            ),
                            style = DsAvatar.Style.Default,
                        ),
                    ),
                    size = drawEach(*DsTag.Size.entries.toTypedArray()),
                )
            }
        }
    }
}
