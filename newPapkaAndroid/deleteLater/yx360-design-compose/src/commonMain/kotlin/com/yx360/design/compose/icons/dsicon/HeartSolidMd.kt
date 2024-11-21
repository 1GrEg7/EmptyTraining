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

public val DsIcon.HeartSolidMd: ImageVector
    get() {
        if (_heartSolidMd != null) {
            return _heartSolidMd!!
        }
        _heartSolidMd = Builder(name = "HeartSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.455f, 3.007f)
                curveTo(8.502f, 3.044f, 9.51f, 3.412f, 10.328f, 4.056f)
                curveTo(11.147f, 4.701f, 11.733f, 5.509f, 12.0f, 6.507f)
                curveTo(12.267f, 5.509f, 12.853f, 4.701f, 13.671f, 4.056f)
                curveTo(14.49f, 3.412f, 15.498f, 3.044f, 16.545f, 3.007f)
                curveTo(19.909f, 3.007f, 22.0f, 5.007f, 22.0f, 8.99f)
                curveTo(22.0f, 15.007f, 14.045f, 20.161f, 12.455f, 20.993f)
                horizontalLineTo(11.545f)
                curveTo(9.955f, 20.161f, 2.0f, 15.007f, 2.0f, 9.007f)
                curveTo(2.0f, 5.007f, 4.091f, 3.007f, 7.455f, 3.007f)
                close()
            }
        }
        .build()
        return _heartSolidMd!!
    }

private var _heartSolidMd: ImageVector? = null
