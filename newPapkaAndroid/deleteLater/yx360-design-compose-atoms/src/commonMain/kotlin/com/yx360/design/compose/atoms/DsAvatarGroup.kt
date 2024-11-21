package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom
import kotlin.math.min

private const val OVERLAPPING_RATIO = -0.33f // 33%

@ExperimentalOrbitaDsAtom
@Composable
fun DsAvatarGroup(
    items: List<DsAvatar.Avatar>,
    maxAvatars: Int,
    size: DsAvatar.Size = DsAvatar.Size.M12,
    modifier: Modifier = Modifier,
) {
    val remaining = items.size - maxAvatars
    Row(
        modifier,
        horizontalArrangement = Arrangement.spacedBy(size.value * OVERLAPPING_RATIO)
    ) {
        repeat(min(items.size, maxAvatars)) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(size.value.plus(Ds.Size.M2))
                    .background(Ds.Color.ElevationBase),
                contentAlignment = Alignment.Center,
            ) {
                DsAvatar(
                    avatar = items[it],
                    style = DsAvatar.Style.Default,
                    size = size,
                )
            }
        }
        if (remaining > 0) {
            More(remaining, size)
        }
    }
}

@Composable
private fun More(
    remaining: Int,
    size: DsAvatar.Size,
) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(size.value.plus(Ds.Size.M2))
            .background(Ds.Color.ElevationBase),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(size.value)
                .background(Ds.Color.SurfaceGenericMedium),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "+$remaining",
                color = Ds.Color.TextPrimary,
                maxLines = 1,
                style = when (size) {
                    DsAvatar.Size.M12 -> Ds.Typography.CaptionSmMedium
                    DsAvatar.Size.M16 -> Ds.Typography.CaptionMdMedium
                    DsAvatar.Size.M20 -> Ds.Typography.BodyMdMedium
                    DsAvatar.Size.M24,
                    DsAvatar.Size.M28,
                    DsAvatar.Size.M36 -> Ds.Typography.BodyLgMedium
                }
            )
        }
    }
}
