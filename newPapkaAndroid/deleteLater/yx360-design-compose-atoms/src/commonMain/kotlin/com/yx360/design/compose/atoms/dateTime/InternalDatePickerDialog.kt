package com.yx360.design.compose.atoms.dateTime

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsSpacing

@ExperimentalMaterial3Api
@Composable
internal fun YandexDatePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    shape: Shape = DatePickerDefaults.shape,
    tonalElevation: Dp = 0.dp,
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
    content: @Composable ColumnScope.() -> Unit
) {
    BasicAlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = modifier.wrapContentHeight(),
        properties = properties
    ) {
        Surface(
            modifier = Modifier.requiredWidth(360.0.dp),
            color = Ds.Color.ElevationBase,
            shape = shape,
            tonalElevation = tonalElevation,
        ) {
            Column(verticalArrangement = Arrangement.SpaceBetween) {
                Box(Modifier.weight(1f, fill = false)) {
                    this@Column.content()
                }
                Box(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(
                            bottom = DsSpacing.M4,
                            end = DsSpacing.M2,
                        )
                ) {
                    Row {
                        dismissButton?.invoke()
                        confirmButton()
                    }
                }
            }
        }
    }
}
