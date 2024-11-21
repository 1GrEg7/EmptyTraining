package com.yx360.design.compose.atoms.dateTime

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone

@Preview
@Composable
fun DatePickerPreviewLight() {
    val firstApril2024 = Instant.fromEpochMilliseconds(1711972800_000L)
    Ds.Theme(brandTheme = BrandTheme.Calendar) {
        DatePicker(
            selectedDate = firstApril2024,
            timeZone = TimeZone.UTC,
            onDateChanged = { },
            onDismissRequest = { },
            completeTitle = "Complete"
        )
    }
}

@Preview
@Composable
fun DatePickerPreviewDark() {
    val firstApril2024 = Instant.fromEpochMilliseconds(1711972800_000L)
    Ds.Theme(brandTheme = BrandTheme.Calendar, darkTheme = true) {
        DatePicker(
            selectedDate = firstApril2024,
            timeZone = TimeZone.UTC,
            onDateChanged = { },
            onDismissRequest = { },
            completeTitle = "Complete"
        )
    }
}
