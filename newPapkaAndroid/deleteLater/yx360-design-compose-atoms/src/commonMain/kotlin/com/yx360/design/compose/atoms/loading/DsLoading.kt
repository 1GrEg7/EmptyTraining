package com.yx360.design.compose.atoms.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.DsSpinner
import com.yx360.design.compose.dsShadow

private const val MAX_LINES = 2

/**
 * [Figma](https://nda.ya.ru/t/Evge_AIs77gE8M)
 */
@Composable
fun DsLoading(
    title: String,
    modifier: Modifier = Modifier,
) {
    val shape = RoundedCornerShape(Ds.Size.M12)
    Box(
        modifier = modifier.padding(horizontal = Ds.Spacing.M16),
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
                    start = Ds.Spacing.M4,
                    top = Ds.Spacing.M2,
                    end = Ds.Spacing.M8,
                    bottom = Ds.Spacing.M2,
                ),
            horizontalArrangement = Arrangement.spacedBy(Ds.Spacing.M4),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            DsSpinner(
                color = Ds.Color.TextPrimary,
                size = Ds.Size.M12,
            )
            Text(
                text = title,
                style = Ds.Typography.BodyShortMdMedium,
                color = Ds.Color.TextPrimary,
                maxLines = MAX_LINES,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}
