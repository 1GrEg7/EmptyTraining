package com.yx360.design.compose.atoms.dateTime

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone

@Preview
@Composable
fun DateAndTimePickerPreviewLight() {
    val firstApril2024 = Instant.fromEpochMilliseconds(1711972800_000L)
    Ds.Theme(brandTheme = BrandTheme.Calendar) {
        DateTimePicker(
            selectedDateTime = firstApril2024,
            timeZone = TimeZone.UTC,
            onDateChanged = { },
            onDismissRequest = { },
            completeTitle = "Complete",
            timeTitle = "Time",
        )
    }
}

@Preview
@Composable
fun DateAndTimePickerPreviewDark() {
    val firstApril2024 = Instant.fromEpochMilliseconds(1711972800_000L)
    Ds.Theme(brandTheme = BrandTheme.Calendar, darkTheme = true) {
        DateTimePicker(
            selectedDateTime = firstApril2024,
            timeZone = TimeZone.UTC,
            onDateChanged = { },
            onDismissRequest = { },
            completeTitle = "Complete",
            timeTitle = "Time",
        )
    }
}
