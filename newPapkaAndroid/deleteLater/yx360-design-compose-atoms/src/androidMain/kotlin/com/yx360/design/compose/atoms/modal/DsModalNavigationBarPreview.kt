package com.yx360.design.compose.atoms.modal

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsButtonClose
import com.yx360.design.compose.atoms.preview.DrawAllCases
import com.yx360.design.compose.atoms.preview.DrawForDifferentSurfaces

@Preview(
    name = "All cases page 1 Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "All cases page 1 Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsModalNavigationBarDrawAllCasesPreviewPage1() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8)) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                null,
                "",
                "Subtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Preview(
    name = "All cases page 2 Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "All cases page 2 Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsModalNavigationBarDrawAllCasesPreviewPage2() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8)) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "SubtitleSubtitleSubtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Preview(
    name = "All cases page 3 Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "All cases page 3 Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsModalNavigationBarDrawAllCasesPreviewPage3() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8)) {
        DrawAllCases {
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Preview(
    name = "All cases page 4 Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "All cases page 4 Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsModalNavigationBarDrawAllCasesPreviewPage4() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8)) {
        DrawAllCases {
            val title = drawEach(
                "Title",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "Subtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Preview(
    name = "DifferentSurfaces Light",
    group = "Monoline",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(
    name = "DifferentSurfaces Dark",
    group = "Monoline",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DsModalNavigationBarDifferentSurfacesPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M8)) {
        DrawForDifferentSurfaces {
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                actions = {
                    Row {
                        repeat(3) {
                            DsButtonClose(action = DsButtonClose.Type.Close, onClick = {})
                        }
                    }
                },
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage1LightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                null,
                "",
                "Subtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage1DarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                null,
                "",
                "Subtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage2LightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "SubtitleSubtitleSubtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage2DarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                null,
                "",
                "Title",
                "TitleTitleTitle",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "SubtitleSubtitleSubtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage3LightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage3DarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage4LightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                "Title",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "Subtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage4DarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawAllCases {
            val title = drawEach(
                "Title",
                "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
            )
            val subtitle = drawEach(
                "Subtitle",
                "SubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitleSubtitle",
            )
            val closeType = drawEach(DsButtonClose.Type.Close, DsButtonClose.Type.Back)
            DsModalNavigationBar(
                title = title,
                subtitle = subtitle,
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = closeType
                ),
                actions = drawEach({ Text("Label", color = Ds.Color.TextPrimary) }, null),
                showGrabber = true,
            )
        }
    }
}

@Composable
fun DsModalNavigationBarDrawAllCasesPage5LightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawForDifferentSurfaces {
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                actions = {
                    Row {
                        repeat(3) {
                            DsButtonClose(action = DsButtonClose.Type.Close, onClick = {})
                        }
                    }
                },
                showGrabber = true,
            )
        }
    }
}

@Suppress("MagicNumber")
@Composable
fun DsModalNavigationBarDrawAllCasesPage5DarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    Column(
        modifier = Modifier
            .background(Ds.Color.ElevationBase)
    ) {
        DrawForDifferentSurfaces {
            DsModalNavigationBar(
                title = "Title",
                close = DsModalNavigationBar.Close(
                    onClose = {},
                    closeType = DsButtonClose.Type.Close
                ),
                actions = {
                    Row {
                        repeat(3) {
                            DsButtonClose(action = DsButtonClose.Type.Close, onClick = {})
                        }
                    }
                },
                showGrabber = true,
            )
        }
    }
}
