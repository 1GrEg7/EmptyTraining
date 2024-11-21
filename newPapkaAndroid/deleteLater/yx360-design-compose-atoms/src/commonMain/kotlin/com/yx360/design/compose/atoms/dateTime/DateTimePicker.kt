package com.yx360.design.compose.atoms.dateTime

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsRounding
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.offsetAt
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalOrbitaDsAtom
@Composable
fun DateTimePicker(
    selectedDateTime: Instant,
    timeZone: TimeZone,
    onDateChanged: (Instant) -> Unit,
    onDismissRequest: () -> Unit,
    completeTitle: String,
    timeTitle: String,
    minDateTime: Instant? = null,
    modifier: Modifier = Modifier,
) {
    val localDateTime = selectedDateTime.toLocalDateTime(timeZone)
    var selectedTime by remember { mutableStateOf(localDateTime.time) }

    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = localDateTime.toInstant(TimeZone.UTC).toEpochMilliseconds(),
    )

    if (minDateTime != null) {
        val minDateMills = minDateTime.toEpochMilliseconds()
        if ((datePickerState.selectedDateMillis ?: minDateMills) < minDateMills) {
            datePickerState.selectedDateMillis = minDateMills
        }
        val minTime = minDateTime.toLocalDateTime(timeZone).time
        if ((datePickerState.selectedDateMillis ?: minDateMills) <= minDateMills &&
            (
                selectedTime.hour < minTime.hour ||
                    (selectedTime.hour == minTime.hour && selectedTime.minute < minTime.minute)
            )
        ) {
            selectedTime = minTime
        }
    }

    var showTimePicker by remember { mutableStateOf(false) }

    // date picker component
    YandexDatePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(
                onClick = {
                    val dayStartMillsUtc = datePickerState.selectedDateMillis
                        ?: DateTimeUtils.getStartOfTheDayByTimeZone(
                            selectedDateMillis = selectedDateTime.toEpochMilliseconds(),
                            timeZone = timeZone,
                        )
                    val instant = Instant.fromEpochMilliseconds(
                        epochMilliseconds = dayStartMillsUtc + selectedTime
                            .toMillisecondOfDay()
                            .toLong()
                    )
                    onDateChanged(instant - timeZone.offsetAt(instant).totalSeconds.seconds)
                }
            ) {
                Text(
                    text = completeTitle,
                    color = Ds.BrandColor.TextBrand
                )
            }
        },
    ) {
        Column {
            DatePicker(
                state = datePickerState,
                title = null,
                headline = null,
                colors = DatePickerDefaults.colors(
                    containerColor = Ds.Color.ElevationBase,
                    selectedDayContentColor = Ds.Color.TextStaticLight,
                    selectedDayContainerColor = Ds.BrandColor.SurfaceBrand,
                    selectedYearContentColor = Ds.Color.TextStaticLight,
                    todayDateBorderColor = Color.Transparent,
                ),
                showModeToggle = false,
                modifier = modifier.padding(top = 16.dp),
            )

            Row(
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = timeTitle,
                    style = Ds.Typography.BodyLgRegular,
                    color = Ds.Color.TextPrimary,
                )
                Spacer(Modifier.weight(1f))
                Box(
                    Modifier
                        .clip(RoundedCornerShape(DsRounding.M6))
                        .background(Ds.Color.SurfaceGenericMedium)
                        .clickable { showTimePicker = true }
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = selectedTime.format(DateTimeUtils.time),
                        style = Ds.Typography.BodyLgRegular,
                        color = Ds.Color.TextPrimary,
                    )
                }
            }
        }
    }

    // time picker component
    if (showTimePicker) {
        TimePicker(
            confirmText = completeTitle,
            onDismissRequest = {
                showTimePicker = false
            },
            onConfirmButtonClick = { (hour, minute) ->
                showTimePicker = false
                selectedTime = LocalTime(
                    hour = hour,
                    minute = minute,
                )
            }
        )
    }
}
