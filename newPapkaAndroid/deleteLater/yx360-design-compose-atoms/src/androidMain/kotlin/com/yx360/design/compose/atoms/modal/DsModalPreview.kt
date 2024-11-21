package com.yx360.design.compose.atoms.modal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.atoms.DsButtonClose
import com.yx360.design.compose.atoms.preview.DrawAllCases
import kotlinx.coroutines.launch

@Preview
@Composable
fun DsModalPhoneTopBarBottomBarPreview() {
    DsModalTopBarBottomBarPreview(tablet = false)
}

@Preview
@Composable
fun DsModalTabletTopBarBottomBarPreview() {
    DsModalTopBarBottomBarPreview(tablet = true)
}

@Suppress("UnusedPrivateMember", "LongMethod", "StringLiteralDuplication", "MagicNumber")
@Composable
private fun DsModalTopBarBottomBarPreview(tablet: Boolean) {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawAllCases {
            var show by remember { mutableStateOf(true) }
            if (!show) return@DrawAllCases
            val scope = rememberCoroutineScope()
            ModalWrapper(
                tablet = tablet,
                fullScreen = drawEach(true, false),
                title = "Title".repeat(20),
                subtitle = "Subtitle".repeat(20),
                bottomBarActions = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(Ds.Size.M4)
                    ) {
                        DsButton(
                            modifier = Modifier
                                .weight(1f)
                                .height(Ds.Size.M28),
                            title = "Label",
                            onClick = {
                                scope.launch {
                                    hide()
                                    show = false
                                }
                            },
                            variant = DsButton.Style.Info
                        )
                        DsButton(
                            modifier = Modifier
                                .weight(1f)
                                .height(Ds.Size.M28),
                            title = "Label",
                            onClick = {
                                scope.launch {
                                    hide()
                                    show = false
                                }
                            },
                            variant = DsButton.Style.Brand
                        )
                    }
                },
                onDismiss = {
                    show = false
                },
                close = DsModal.Close(
                    closeType = DsButtonClose.Type.Close,
                    onClose = {
                        scope.launch {
                            hide()
                            show = false
                        }
                    },
                ),
                content = {
                    repeat(10) {
                        Text(text = "How are ya")
                    }
                }
            )
        }
    }
}

@Suppress("UnusedPrivateMember", "LongMethod", "StringLiteralDuplication", "MagicNumber")
@Preview
@Composable
fun DsModalTopBarNoBottomBarPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawAllCases {
            var show by remember { mutableStateOf(true) }
            if (!show) return@DrawAllCases
            val scope = rememberCoroutineScope()
            DsModal(
                fullScreen = drawEach(true, false),
                title = "Title".repeat(20),
                subtitle = "Subtitle".repeat(20),
                bottomBarActions = null,
                onDismiss = {
                    show = false
                },
                close = DsModal.Close(
                    closeType = DsButtonClose.Type.Close,
                    onClose = {
                        scope.launch {
                            hide()
                            show = false
                        }
                    },
                ),
                content = {
                    repeat(10) {
                        Text(text = "How are ya")
                    }
                }
            )
        }
    }
}

@Suppress("UnusedPrivateMember", "LongMethod", "StringLiteralDuplication", "MagicNumber")
@Preview
@Composable
fun DsModalNoTopBarBottomBarPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        var show by remember { mutableStateOf(true) }
        val scope = rememberCoroutineScope()
        DsModal(
            fullScreen = false,
            bottomBarActions = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(Ds.Size.M4)
                ) {
                    DsButton(
                        modifier = Modifier
                            .weight(1f)
                            .height(Ds.Size.M28),
                        title = "Label",
                        onClick = {
                            scope.launch {
                                hide()
                                show = false
                            }
                        },
                        variant = DsButton.Style.Info
                    )
                    DsButton(
                        modifier = Modifier
                            .weight(1f)
                            .height(Ds.Size.M28),
                        title = "Label",
                        onClick = {
                            scope.launch {
                                hide()
                                show = false
                            }
                        },
                        variant = DsButton.Style.Brand
                    )
                }
            },
            onDismiss = {
                show = false
            },
            close = null,
            content = {
                repeat(10) {
                    Text(text = "How are ya")
                }
            }
        )
    }
}

@Suppress("UnusedPrivateMember", "LongMethod", "StringLiteralDuplication", "MagicNumber")
@Preview
@Composable
fun DsModalTopBarActionsPreview() {
    Ds.Theme(
        brandTheme = BrandTheme.Mail
    ) {
        DrawAllCases {
            var show by remember { mutableStateOf(true) }
            if (!show) return@DrawAllCases
            val scope = rememberCoroutineScope()
            DsModal(
                title = "Title".repeat(20),
                subtitle = "Subtitle".repeat(20),
                fullScreen = drawEach(true, false),
                bottomBarActions = null,
                topBarActions = {
                    Row {
                        repeat(2) {
                            Text("Label")
                        }
                    }
                },
                onDismiss = {
                    show = false
                },
                close = DsModal.Close(
                    closeType = DsButtonClose.Type.Close,
                    onClose = {
                        scope.launch {
                            hide()
                            show = false
                        }
                    },
                ),
                content = {
                    repeat(10) {
                        Text(text = "How are ya")
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun DsModalPhoneOverlappedModalsPreview() {
    DsModalOverlappedModalsPreview(tablet = false)
}

@Preview
@Composable
fun DsModalTabletOverlappedModalsPreview() {
    DsModalOverlappedModalsPreview(tablet = true)
}

@Suppress("UnusedPrivateMember", "LongMethod", "StringLiteralDuplication", "MagicNumber")
@Composable
private fun DsModalOverlappedModalsPreview(tablet: Boolean) {
    Ds.Theme(brandTheme = BrandTheme.Mail, darkTheme = true) {
        repeat(3) { modalIndex ->
            var show by remember { mutableStateOf(true) }
            if (!show) return@Theme
            val scope = rememberCoroutineScope()
            ModalWrapper(
                tablet = tablet,
                modifier = Modifier.padding(top = (modalIndex * 20).dp),
                fullScreen = true,
                bottomBarActions = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(Ds.Size.M4)
                    ) {
                        DsButton(
                            modifier = Modifier
                                .weight(1f)
                                .height(Ds.Size.M28),
                            title = "Label",
                            onClick = {
                                scope.launch {
                                    hide()
                                    show = false
                                }
                            },
                            variant = DsButton.Style.Info
                        )
                        DsButton(
                            modifier = Modifier
                                .weight(1f)
                                .height(Ds.Size.M28),
                            title = "Label",
                            onClick = {
                                scope.launch {
                                    hide()
                                    show = false
                                }
                            },
                            variant = DsButton.Style.Brand
                        )
                    }
                },
                onDismiss = {
                    show = false
                },
                content = {
                    repeat(10) {
                        Text(text = "Modal ${modalIndex + 1}")
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun DsModalPhoneOnlyContentPreview() {
    DsModalOnlyContentPreview(tablet = false, fullScreen = false)
}

@Preview
@Composable
fun DsModalTabletOnlyContentPreview() {
    DsModalOnlyContentPreview(tablet = true, fullScreen = false)
}

@Preview
@Composable
fun DsModalPhoneFullscreenOnlyContentPreview() {
    DsModalOnlyContentPreview(tablet = false, fullScreen = true)
}

@Preview
@Composable
fun DsModalTabletFullscreenOnlyContentPreview() {
    DsModalOnlyContentPreview(tablet = true, fullScreen = true)
}

@Composable
private fun DsModalOnlyContentPreview(tablet: Boolean, fullScreen: Boolean) {
    Ds.Theme(brandTheme = BrandTheme.Mail) {
        var show by remember { mutableStateOf(true) }
        if (!show) return@Theme
        ModalWrapper(
            tablet = tablet,
            fullScreen = fullScreen,
            onDismiss = {
                show = false
            },
            content = {
                Box(
                    modifier = Modifier
                        .background(Ds.BrandColor.SurfaceBrand)
                        .fillMaxWidth()
                        .height(240.dp)
                )
            },
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Composable
private fun ModalWrapper(
    fullScreen: Boolean,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    tablet: Boolean = false,
    tabletSize: DsModalTablet.Size = DsModalTablet.Size.Md,
    title: String? = null,
    subtitle: String? = null,
    topBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    bottomBarActions: (@Composable DsModalScope.() -> Unit)? = null,
    close: DsModal.Close? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    if (tablet) {
        DsModalTablet(
            fullScreen,
            onDismiss,
            modifier,
            tabletSize,
            title,
            subtitle,
            topBarActions,
            bottomBarActions,
            close,
            content
        )
    } else {
        DsModal(
            fullScreen,
            onDismiss,
            modifier,
            title,
            subtitle,
            topBarActions,
            bottomBarActions,
            close,
            content
        )
    }
}
