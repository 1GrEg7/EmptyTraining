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

public val DsIcon.RefreshOutlineMd: ImageVector
    get() {
        if (_refreshOutlineMd != null) {
            return _refreshOutlineMd!!
        }
        _refreshOutlineMd = Builder(name = "RefreshOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.042f)
                lineTo(20.5f, 3.04f)
                lineTo(20.505f, 9.187f)
                lineTo(14.311f, 9.192f)
                lineTo(14.31f, 7.192f)
                lineTo(17.086f, 7.19f)
                curveTo(17.04f, 7.142f, 16.993f, 7.094f, 16.946f, 7.047f)
                curveTo(14.21f, 4.315f, 9.778f, 4.318f, 7.047f, 7.054f)
                curveTo(4.315f, 9.79f, 4.318f, 14.222f, 7.054f, 16.954f)
                curveTo(9.79f, 19.685f, 14.222f, 19.682f, 16.954f, 16.946f)
                curveTo(18.319f, 15.578f, 19.001f, 13.786f, 19.0f, 11.995f)
                lineTo(21.0f, 11.993f)
                curveTo(21.002f, 14.297f, 20.125f, 16.601f, 18.369f, 18.359f)
                curveTo(14.857f, 21.876f, 9.158f, 21.881f, 5.641f, 18.369f)
                curveTo(2.123f, 14.857f, 2.119f, 9.158f, 5.631f, 5.641f)
                curveTo(9.143f, 2.123f, 14.842f, 2.119f, 18.359f, 5.631f)
                curveTo(18.408f, 5.68f, 18.456f, 5.729f, 18.503f, 5.778f)
                lineTo(18.5f, 3.042f)
                close()
            }
        }
        .build()
        return _refreshOutlineMd!!
    }

private var _refreshOutlineMd: ImageVector? = null
