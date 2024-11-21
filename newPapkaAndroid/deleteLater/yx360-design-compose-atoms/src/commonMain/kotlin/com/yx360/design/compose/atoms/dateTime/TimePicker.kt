package com.yx360.design.compose.atoms.dateTime

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom

/**
 * [Figma](https://nda.ya.ru/t/uucGOv4778oKAK)
 */
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalOrbitaDsAtom
@Composable
fun TimePicker(
    confirmText: String,
    onConfirmButtonClick: (TimePicker.Time) -> Unit,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    dismissText: String? = null,
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = true,
) {
    val state = rememberTimePickerState(
        initialHour = initialHour,
        initialMinute = initialMinute,
        is24Hour = is24Hour,
    )
    InternalTimePickerDialog(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        confirmButton = {
            DialogButton(
                text = confirmText,
                onClick = {
                    onConfirmButtonClick(
                        TimePicker.Time(
                            hour = state.hour,
                            minute = state.minute,
                        )
                    )
                }
            )
        },
        dismissButton = if (dismissText != null) {
            {
                DialogButton(
                    text = dismissText,
                    onClick = onDismissRequest,
                )
            }
        } else {
            null
        }
    ) {
        androidx.compose.material3.TimePicker(
            state = state,
        )
    }
}

object TimePicker {
    data class Time(
        val hour: Int,
        val minute: Int,
    )
}

@Composable
private fun DialogButton(
    text: String,
    onClick: () -> Unit,
) {
    TextButton(onClick = onClick) {
        Text(
            text = text,
            color = Ds.BrandColor.TextBrand,
        )
    }
}
