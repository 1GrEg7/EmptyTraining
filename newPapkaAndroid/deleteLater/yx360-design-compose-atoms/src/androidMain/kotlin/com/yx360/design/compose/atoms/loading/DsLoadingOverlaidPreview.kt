package com.yx360.design.compose.atoms.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds

@PreviewLightDark
@Composable
fun DsLoadingOverlaidPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Box(modifier = Modifier.size(250.dp)) {
        DsLoadingOverlaid(
            title = "Title",
        )
    }
}

@PreviewLightDark
@Composable
fun DsLoadingOverlaidLongTextPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Box(modifier = Modifier.size(250.dp)) {
        DsLoadingOverlaid(
            title = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        )
    }
}
