package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.PinOutlineSm: ImageVector
    get() {
        if (_pinOutlineSm != null) {
            return _pinOutlineSm!!
        }
        _pinOutlineSm = Builder(name = "PinOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.5f, 6.036f)
                curveTo(13.45f, 7.06f, 14.714f, 8.764f, 15.0f, 11.0f)
                curveTo(15.0f, 11.822f, 12.371f, 12.816f, 8.959f, 12.977f)
                lineTo(8.75f, 16.0f)
                horizontalLineTo(7.25f)
                lineTo(7.061f, 12.978f)
                curveTo(3.639f, 12.82f, 1.0f, 11.824f, 1.0f, 11.0f)
                curveTo(1.286f, 8.764f, 2.55f, 7.06f, 4.5f, 6.036f)
                lineTo(5.0f, 4.0f)
                lineTo(3.0f, 3.0f)
                verticalLineTo(1.5f)
                curveTo(3.566f, 0.734f, 5.477f, 0.0f, 8.0f, 0.0f)
                curveTo(10.523f, 0.0f, 12.434f, 0.734f, 13.0f, 1.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.364f, 10.424f)
                curveTo(12.526f, 10.375f, 12.667f, 10.326f, 12.79f, 10.28f)
                curveTo(12.417f, 9.21f, 11.666f, 8.382f, 10.57f, 7.806f)
                lineTo(9.773f, 7.388f)
                lineTo(8.677f, 2.926f)
                lineTo(10.087f, 2.22f)
                curveTo(9.513f, 2.088f, 8.806f, 2.0f, 8.0f, 2.0f)
                curveTo(7.194f, 2.0f, 6.487f, 2.088f, 5.913f, 2.22f)
                lineTo(7.323f, 2.926f)
                lineTo(6.227f, 7.388f)
                lineTo(5.43f, 7.806f)
                curveTo(4.334f, 8.382f, 3.583f, 9.21f, 3.21f, 10.28f)
                curveTo(3.333f, 10.326f, 3.474f, 10.375f, 3.636f, 10.424f)
                curveTo(4.69f, 10.747f, 6.24f, 11.0f, 8.0f, 11.0f)
                curveTo(9.76f, 11.0f, 11.31f, 10.747f, 12.364f, 10.424f)
                close()
            }
        }
        .build()
        return _pinOutlineSm!!
    }

private var _pinOutlineSm: ImageVector? = null
