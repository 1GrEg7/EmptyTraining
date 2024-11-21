package com.yx360.design.compose.atoms.dateTime

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.offsetAt
import kotlin.time.Duration.Companion.seconds

/**
 * [Figma](https://nda.ya.ru/t/1uz7Leb578oKEj)
 */
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalOrbitaDsAtom
@Composable
fun DatePicker(
    selectedDate: Instant,
    timeZone: TimeZone,
    onDateChanged: (Instant) -> Unit,
    onDismissRequest: () -> Unit,
    completeTitle: String,
    minDateTime: Instant? = null,
    modifier: Modifier = Modifier,
) {
    var selectedDateMs: Long by remember { mutableStateOf(selectedDate.toEpochMilliseconds()) }
    val offset = timeZone.offsetAt(selectedDate).totalSeconds.seconds.inWholeMilliseconds
    YandexDatePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(
                onClick = {
                    val selectedMills = selectedDateMs - offset
                    onDateChanged(Instant.fromEpochMilliseconds(selectedMills))
                }
            ) {
                Text(
                    text = completeTitle,
                    color = Ds.BrandColor.TextBrand
                )
            }
        },
    ) {
        DatePickerContent(
            modifier = modifier,
            selectedDate = Instant.fromEpochMilliseconds(selectedDateMs),
            onDateChanged = { date ->
                selectedDateMs = date ?: 0
            },
            minDayUtcTimeMs = minDateTime?.toEpochMilliseconds()
        )
    }
}
