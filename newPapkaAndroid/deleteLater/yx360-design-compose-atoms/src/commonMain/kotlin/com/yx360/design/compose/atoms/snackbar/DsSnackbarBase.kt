package com.yx360.design.compose.atoms.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.yx360.design.compose.Ds
import com.yx360.design.compose.dsShadow

@Composable
internal fun DsSnackbarBase(
    modifier: Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    val shape = RoundedCornerShape(Ds.Size.M12)
    Box(
        modifier = modifier.padding(
            horizontal = Ds.Spacing.M16,
            vertical = Ds.Spacing.M8,
        ),
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(minHeight = Ds.Size.M20)
                .dsShadow(
                    shape = shape,
                    shadow = Ds.Shadow.Level02,
                )
                .background(
                    shape = shape,
                    color = Ds.Color.ElevationOverlay,
                )
                .padding(
                    horizontal = Ds.Spacing.M4,
                    vertical = Ds.Spacing.M2,
                ),
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
    }
}
