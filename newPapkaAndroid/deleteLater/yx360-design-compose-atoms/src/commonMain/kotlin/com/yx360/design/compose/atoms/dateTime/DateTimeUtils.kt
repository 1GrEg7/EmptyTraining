package com.yx360.design.compose.atoms.dateTime

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atStartOfDayIn
import kotlinx.datetime.format.Padding
import kotlinx.datetime.format.char
import kotlinx.datetime.toLocalDateTime

internal object DateTimeUtils {
    fun getStartOfTheDayByTimeZone(selectedDateMillis: Long?, timeZone: TimeZone): Long {
        val selectedDayInstant = selectedDateMillis?.let { Instant.fromEpochMilliseconds(it) } ?: Clock.System.now()
        return selectedDayInstant
            .toLocalDateTime(timeZone)
            .date
            .atStartOfDayIn(timeZone)
            .toEpochMilliseconds()
    }

    val time = LocalTime.Format {
        hour(Padding.ZERO)
        char(':')
        minute(Padding.ZERO)
    }
}
