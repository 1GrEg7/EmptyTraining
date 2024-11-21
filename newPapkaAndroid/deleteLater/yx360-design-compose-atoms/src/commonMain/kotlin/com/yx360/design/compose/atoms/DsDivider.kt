package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds

/**
 * [Figma](https://nda.ya.ru/t/HymRmN4r77bS8x)
 */
@Composable
fun DsDivider(
    compact: Boolean,
    verticalPadding: DsDivider.VerticalPadding = DsDivider.VerticalPadding.M4,
    modifier: Modifier = Modifier,
) {
    HorizontalDivider(
        modifier = modifier.padding(
            horizontal = if (compact) {
                Ds.Spacing.M8
            } else {
                0.dp
            },
            vertical = verticalPadding.value
        ),
        thickness = Ds.Line.M05,
        color = Ds.Color.LineGeneric
    )
}

object DsDivider {

    enum class VerticalPadding(val value: Dp) {
        NONE(0.dp),
        M4(Ds.Spacing.M4),
    }
}
