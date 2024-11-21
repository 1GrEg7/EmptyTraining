package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.MinusOutlineSm
import com.yx360.design.compose.icons.dsicon.MinusOutlineXs
import com.yx360.design.compose.icons.dsicon.MinusOutlineXxs
import com.yx360.design.compose.icons.dsicon.QuestionOutlineSm
import com.yx360.design.compose.icons.dsicon.QuestionOutlineXs
import com.yx360.design.compose.icons.dsicon.QuestionOutlineXxs
import com.yx360.design.compose.icons.dsicon.TickOutlineSm
import com.yx360.design.compose.icons.dsicon.TickOutlineXs
import com.yx360.design.compose.icons.dsicon.TickOutlineXxs

/**
 * [Figma](https://nda.ya.ru/t/KrRtWOAj77ko6X)
 */
@Composable
fun DsStatus(
    size: DsStatus.Size,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconColor: Color = DsStatus.Defaults.iconColor,
    statusColor: Color = DsStatus.Defaults.statusColor,
    containerColor: Color = DsStatus.Defaults.containerColor,
) {
    val containerSize: Dp
    val statusSize: Dp

    when (size) {
        DsStatus.Size.Xs -> {
            containerSize = 10.dp
            statusSize = Ds.Size.M4
        }
        DsStatus.Size.Sm -> {
            containerSize = 14.dp
            statusSize = Ds.Size.M6
        }
        DsStatus.Size.Md -> {
            containerSize = 20.dp
            statusSize = Ds.Size.M8
        }
        DsStatus.Size.Lg -> {
            containerSize = 28.dp
            statusSize = Ds.Size.M12
        }
    }

    Box(
        modifier = modifier
            .clip(CircleShape)
            .size(containerSize)
            .background(containerColor),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(statusSize)
                .background(statusColor),
            contentAlignment = Alignment.Center,
        ) {
            if (icon != null) {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    tint = iconColor,
                )
            }
        }
    }
}

@Composable
fun DsStatus(
    preset: DsStatus.Preset,
    size: DsStatus.Size,
    modifier: Modifier = Modifier,
) {
    val icon: ImageVector
    val statusColor: Color

    when (preset) {
        DsStatus.Preset.Success -> {
            statusColor = Ds.Color.SurfaceFeedbackSuccess
            icon = when (size) {
                DsStatus.Size.Xs -> Ds.Icon.TickOutlineXxs
                DsStatus.Size.Sm -> Ds.Icon.TickOutlineXxs
                DsStatus.Size.Md -> Ds.Icon.TickOutlineXs
                DsStatus.Size.Lg -> Ds.Icon.TickOutlineSm
            }
        }
        DsStatus.Preset.Danger -> {
            statusColor = Ds.Color.SurfaceFeedbackDanger
            icon = when (size) {
                DsStatus.Size.Xs -> Ds.Icon.MinusOutlineXxs
                DsStatus.Size.Sm -> Ds.Icon.MinusOutlineXxs
                DsStatus.Size.Md -> Ds.Icon.MinusOutlineXs
                DsStatus.Size.Lg -> Ds.Icon.MinusOutlineSm
            }
        }
        DsStatus.Preset.Unknown -> {
            statusColor = Ds.Color.SurfaceFeedbackNeutral
            icon = when (size) {
                DsStatus.Size.Xs -> Ds.Icon.QuestionOutlineXxs
                DsStatus.Size.Sm -> Ds.Icon.QuestionOutlineXxs
                DsStatus.Size.Md -> Ds.Icon.QuestionOutlineXs
                DsStatus.Size.Lg -> Ds.Icon.QuestionOutlineSm
            }
        }
    }

    DsStatus(
        size = size,
        modifier = modifier,
        icon = rememberVectorPainter(icon),
        statusColor = statusColor,
    )
}

@Composable
fun DsStatus(
    status: DsStatus.Status,
    size: DsStatus.Size,
    modifier: Modifier = Modifier,
) {
    when (status) {
        is DsStatus.Status.Colored -> {
            DsStatus(
                icon = status.icon,
                iconColor = status.iconColor ?: DsStatus.Defaults.iconColor,
                statusColor = status.statusColor ?: DsStatus.Defaults.statusColor,
                containerColor = status.containerColor ?: DsStatus.Defaults.containerColor,
                size = size,
                modifier = modifier,
            )
        }
        is DsStatus.Preset -> {
            DsStatus(
                preset = status,
                size = size,
                modifier = modifier,
            )
        }
    }
}

object DsStatus {

    enum class Size {
        Xs,
        Sm,
        Md,
        Lg,
    }

    sealed interface Status {
        data class Colored(
            val icon: Painter? = null,
            val iconColor: Color? = null,
            val statusColor: Color? = null,
            val containerColor: Color? = null,
        ) : Status
    }

    enum class Preset : Status {
        Success,
        Danger,
        Unknown,
    }

    object Defaults {
        val iconColor: Color @Composable get() = Ds.Color.TextStaticLight
        val statusColor: Color @Composable get() = Ds.Color.SurfaceAccent08
        val containerColor: Color @Composable get() = Ds.Color.ElevationBase
    }
}
