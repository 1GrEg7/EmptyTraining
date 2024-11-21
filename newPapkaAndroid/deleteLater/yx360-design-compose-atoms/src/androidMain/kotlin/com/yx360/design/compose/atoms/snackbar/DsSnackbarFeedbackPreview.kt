package com.yx360.design.compose.atoms.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds

@PreviewLightDark
@Composable
internal fun DsSnackbarFeedbackSuccessPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(DsSnackbarFeedback.Style.Success)
}

@PreviewLightDark
@Composable
internal fun DsSnackbarFeedbackWarningPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(DsSnackbarFeedback.Style.Warning)
}

@PreviewLightDark
@Composable
internal fun DsSnackbarFeedbackInfoPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(DsSnackbarFeedback.Style.Info)
}

@PreviewLightDark
@Composable
internal fun DsSnackbarFeedbackDangerPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(DsSnackbarFeedback.Style.Danger)
}

@PreviewLightDark
@Composable
internal fun DsSnackbarFeedbackNeutralPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(DsSnackbarFeedback.Style.Neutral)
}

@Composable
private fun Snackbar(
    style: DsSnackbarFeedback.Style,
) {
    Box(modifier = Modifier.fillMaxWidth()) {
        DsSnackbarFeedback(
            title = "Title",
            style = style,
            topOffset = 0.dp,
        )
    }
}
