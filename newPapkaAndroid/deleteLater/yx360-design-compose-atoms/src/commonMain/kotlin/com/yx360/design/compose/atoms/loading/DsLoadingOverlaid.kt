package com.yx360.design.compose.atoms.loading

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

/**
 * [Figma](https://nda.ya.ru/t/Evge_AIs77gE8M)
 */
@Composable
fun DsLoadingOverlaid(
    title: String,
    modifier: Modifier = Modifier,
    onDismissRequest: (() -> Unit) = {},
) {
    // TODO MOBILEDEV-35736: Investigate compile error
    // val scrimColor = Ds.Color.ElevationBase.copy(alpha = Ds.Opacity.M24)
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            dismissOnBackPress = false,
            dismissOnClickOutside = false,
            // scrimColor = scrimColor, // TODO MOBILEDEV-35736: Investigate compile error
        )
    ) {
        DsLoading(
            modifier = modifier,
            title = title,
        )
    }
}
