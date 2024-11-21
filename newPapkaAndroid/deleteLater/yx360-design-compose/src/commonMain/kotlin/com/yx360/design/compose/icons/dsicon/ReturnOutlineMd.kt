package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ReturnOutlineMd: ImageVector
    get() {
        if (_returnOutlineMd != null) {
            return _returnOutlineMd!!
        }
        _returnOutlineMd = Builder(name = "ReturnOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.81f, 5.493f)
                verticalLineTo(3.493f)
                lineTo(14.806f, 3.493f)
                verticalLineTo(9.543f)
                lineTo(16.806f, 9.543f)
                verticalLineTo(6.911f)
                curveTo(16.855f, 6.956f, 16.902f, 7.003f, 16.95f, 7.05f)
                curveTo(19.683f, 9.784f, 19.683f, 14.216f, 16.95f, 16.95f)
                curveTo(14.216f, 19.683f, 9.784f, 19.683f, 7.05f, 16.95f)
                curveTo(4.317f, 14.216f, 4.317f, 9.784f, 7.05f, 7.05f)
                curveTo(8.417f, 5.683f, 10.208f, 5.0f, 12.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(9.697f, 3.0f, 7.393f, 3.879f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                curveTo(9.151f, 21.879f, 14.849f, 21.879f, 18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(18.316f, 5.588f, 18.267f, 5.54f, 18.217f, 5.493f)
                lineTo(20.81f, 5.493f)
                close()
            }
        }
        .build()
        return _returnOutlineMd!!
    }

private var _returnOutlineMd: ImageVector? = null
