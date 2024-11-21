package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.LampOutlineMd: ImageVector
    get() {
        if (_lampOutlineMd != null) {
            return _lampOutlineMd!!
        }
        _lampOutlineMd = Builder(name = "LampOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.491f, 7.435f)
                lineTo(11.999f, 8.641f)
                lineTo(13.503f, 7.438f)
                lineTo(16.154f, 9.489f)
                lineTo(14.93f, 11.071f)
                lineTo(13.524f, 9.983f)
                lineTo(11.999f, 11.203f)
                lineTo(10.478f, 9.986f)
                lineTo(9.096f, 11.067f)
                lineTo(7.864f, 9.492f)
                lineTo(10.491f, 7.435f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.023f, 1.462f)
                curveTo(7.911f, 1.462f, 4.508f, 4.829f, 4.508f, 8.797f)
                curveTo(4.508f, 10.785f, 5.354f, 12.379f, 6.122f, 13.668f)
                curveTo(6.242f, 13.87f, 6.357f, 14.06f, 6.468f, 14.242f)
                curveTo(6.729f, 14.67f, 6.963f, 15.056f, 7.169f, 15.449f)
                curveTo(7.451f, 15.987f, 7.623f, 16.442f, 7.678f, 16.862f)
                lineTo(7.939f, 20.222f)
                lineTo(7.944f, 20.257f)
                curveTo(8.161f, 21.721f, 9.418f, 22.805f, 10.898f, 22.805f)
                horizontalLineTo(13.111f)
                curveTo(14.591f, 22.805f, 15.847f, 21.721f, 16.065f, 20.257f)
                lineTo(16.07f, 20.222f)
                lineTo(16.332f, 16.838f)
                curveTo(16.367f, 16.403f, 16.525f, 15.944f, 16.801f, 15.407f)
                curveTo(17.016f, 14.987f, 17.273f, 14.573f, 17.562f, 14.107f)
                curveTo(17.652f, 13.962f, 17.745f, 13.811f, 17.841f, 13.654f)
                curveTo(18.617f, 12.386f, 19.494f, 10.809f, 19.494f, 8.797f)
                curveTo(19.494f, 4.806f, 16.142f, 1.462f, 12.023f, 1.462f)
                close()
                moveTo(6.508f, 8.797f)
                curveTo(6.508f, 5.97f, 8.979f, 3.462f, 12.023f, 3.462f)
                curveTo(15.062f, 3.462f, 17.494f, 5.935f, 17.494f, 8.797f)
                curveTo(17.494f, 10.212f, 16.89f, 11.376f, 16.135f, 12.611f)
                curveTo(16.056f, 12.74f, 15.974f, 12.872f, 15.89f, 13.007f)
                curveTo(15.593f, 13.486f, 15.277f, 13.995f, 15.021f, 14.494f)
                curveTo(14.877f, 14.776f, 14.742f, 15.071f, 14.63f, 15.38f)
                horizontalLineTo(9.337f)
                curveTo(9.221f, 15.082f, 9.085f, 14.795f, 8.941f, 14.522f)
                curveTo(8.704f, 14.068f, 8.417f, 13.596f, 8.142f, 13.145f)
                curveTo(8.039f, 12.975f, 7.937f, 12.807f, 7.84f, 12.645f)
                curveTo(7.378f, 11.868f, 6.974f, 11.113f, 6.736f, 10.312f)
                curveTo(6.592f, 9.828f, 6.508f, 9.328f, 6.508f, 8.797f)
                close()
                moveTo(9.724f, 17.38f)
                lineTo(9.927f, 19.992f)
                curveTo(10.011f, 20.461f, 10.419f, 20.805f, 10.898f, 20.805f)
                horizontalLineTo(13.111f)
                curveTo(13.59f, 20.805f, 13.998f, 20.461f, 14.082f, 19.992f)
                lineTo(14.284f, 17.38f)
                horizontalLineTo(9.724f)
                close()
            }
        }
        .build()
        return _lampOutlineMd!!
    }

private var _lampOutlineMd: ImageVector? = null
