package com.yx360.design.compose.atoms.dateTime

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import kotlinx.datetime.Instant

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalOrbitaDsAtom
@Composable
fun DatePickerContent(
    selectedDate: Instant,
    onDateChanged: (Long?) -> Unit,
    modifier: Modifier = Modifier,
    minDayUtcTimeMs: Long? = null,
) {
    val selectableDates = minDayUtcTimeMs?.let {
        object : SelectableDates {
            override fun isSelectableDate(utcTimeMillis: Long): Boolean {
                return utcTimeMillis >= minDayUtcTimeMs
            }
        }
    }
    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = selectedDate.toEpochMilliseconds(),
        selectableDates = selectableDates ?: DatePickerDefaults.AllDates,
    )
    val selectedDateMillisWatcher = remember(datePickerState, onDateChanged) {
        SelectedDateMillisWatcher(
            impl = datePickerState,
            onSelectedDateMillisChanged = onDateChanged,
        )
    }
    Column {
        androidx.compose.material3.DatePicker(
            state = selectedDateMillisWatcher,
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
            modifier = modifier.padding(top = Ds.Spacing.M4)
        )
    }
}

@ExperimentalMaterial3Api
@Stable
private class SelectedDateMillisWatcher(
    private val impl: DatePickerState,
    private val onSelectedDateMillisChanged: ((Long?) -> Unit),
) : DatePickerState by impl {
    override var selectedDateMillis: Long?
        get() = impl.selectedDateMillis
        set(value) {
            impl.selectedDateMillis = value
            onSelectedDateMillisChanged.invoke(value)
        }
}
