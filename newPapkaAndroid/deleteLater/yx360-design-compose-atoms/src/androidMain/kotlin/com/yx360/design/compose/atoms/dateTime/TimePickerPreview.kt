package com.yx360.design.compose.atoms.dateTime

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yx360.design.BrandTheme
import com.yx360.design.compose.Ds

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun TimePicker24HourLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    TimePicker(
        confirmText = "Complete",
        dismissText = "Dismiss",
        onDismissRequest = { },
        onConfirmButtonClick = { },
        initialHour = 12,
        initialMinute = 12,
        is24Hour = true,
    )
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun TimePicker24HourDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    TimePicker(
        confirmText = "Complete",
        dismissText = "Dismiss",
        onDismissRequest = { },
        onConfirmButtonClick = { },
        initialHour = 12,
        initialMinute = 12,
        is24Hour = true,
    )
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun TimePickerNot24HourLightPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    TimePicker(
        confirmText = "Complete",
        dismissText = "Dismiss",
        onDismissRequest = { },
        onConfirmButtonClick = { },
        initialHour = 12,
        initialMinute = 12,
        is24Hour = false,
    )
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun TimePickerNot24HourDarkPreview() = Ds.Theme(
    brandTheme = BrandTheme.Disk,
    darkTheme = true
) {
    TimePicker(
        confirmText = "Complete",
        dismissText = "Dismiss",
        onDismissRequest = { },
        onConfirmButtonClick = { },
        initialHour = 12,
        initialMinute = 12,
        is24Hour = false,
    )
}

@Suppress("UnusedPrivateMember")
@Preview
@Composable
fun TimePickerNoDismissTextPreview() = Ds.Theme(brandTheme = BrandTheme.Disk) {
    TimePicker(
        confirmText = "Complete",
        dismissText = null,
        onDismissRequest = { },
        onConfirmButtonClick = { },
        initialHour = 12,
        initialMinute = 12,
        is24Hour = true,
    )
}
