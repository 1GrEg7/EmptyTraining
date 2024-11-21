package com.yx360.design.compose.atoms.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButton
import com.yx360.design.compose.icons.dsicon.ChevronRightOutlineMd
import com.yx360.design.compose.icons.dsicon.StarOutlineMd

@Preview
@Composable
internal fun DsSnackbarOnlyTextPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(
        title = "Title",
        icon = null,
        button = null,
        chevron = null,
    )
}

@Preview
@Composable
fun DsSnackbarIconTextPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(
        title = "Title",
        icon = Ds.Icon.StarOutlineMd,
        button = null,
        chevron = null,
    )
}

@Preview
@Composable
fun DsSnackbarIconTextButtonPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(
        title = "Title",
        icon = Ds.Icon.StarOutlineMd,
        button = DsSnackbar.Button("Button", {}, DsButton.Style.Success),
        chevron = null,
    )
}

@Preview
@Composable
fun DsSnackbarIconTextButtonChevronPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(
        title = "Title",
        icon = Ds.Icon.StarOutlineMd,
        button = DsSnackbar.Button("Button", {}, DsButton.Style.Success),
        chevron = DsSnackbar.Chevron(rememberVectorPainter(Ds.Icon.ChevronRightOutlineMd)),
    )
}

@Preview
@Composable
fun DsSnackbarTextButtonPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Snackbar(
        title = "Title",
        icon = null,
        button = DsSnackbar.Button("Button", {}, DsButton.Style.Success),
        chevron = null,
    )
}

@Composable
private fun Snackbar(
    title: String,
    icon: ImageVector?,
    button: DsSnackbar.Button?,
    chevron: DsSnackbar.Chevron?,
) {
    Box(modifier = Modifier.fillMaxWidth()) {
        DsSnackbar(
            title = title,
            icon = icon?.let { DsSnackbar.Icon(it) },
            topOffset = 0.dp,
            chevron = chevron,
            button = button,
        )
    }
}
