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

public val DsIcon.HistoryOutlineMd: ImageVector
    get() {
        if (_historyOutlineMd != null) {
            return _historyOutlineMd!!
        }
        _historyOutlineMd = Builder(name = "HistoryOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.043f, 18.507f)
                lineTo(3.043f, 20.507f)
                lineTo(9.194f, 20.507f)
                lineTo(9.194f, 14.311f)
                lineTo(7.194f, 14.311f)
                lineTo(7.194f, 17.089f)
                curveTo(7.145f, 17.044f, 7.098f, 16.997f, 7.05f, 16.95f)
                curveTo(4.317f, 14.216f, 4.317f, 9.784f, 7.05f, 7.05f)
                curveTo(9.784f, 4.317f, 14.216f, 4.317f, 16.95f, 7.05f)
                curveTo(19.683f, 9.784f, 19.683f, 14.216f, 16.95f, 16.95f)
                curveTo(15.583f, 18.317f, 13.792f, 19.0f, 12.0f, 19.0f)
                lineTo(12.0f, 21.0f)
                curveTo(14.303f, 21.0f, 16.607f, 20.121f, 18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                curveTo(5.685f, 18.413f, 5.733f, 18.46f, 5.783f, 18.507f)
                lineTo(3.043f, 18.507f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.707f, 7.689f)
                lineTo(12.707f, 7.697f)
                lineTo(12.957f, 12.179f)
                lineTo(14.95f, 14.697f)
                lineTo(13.637f, 16.009f)
                lineTo(10.457f, 13.215f)
                lineTo(10.707f, 7.689f)
                close()
            }
        }
        .build()
        return _historyOutlineMd!!
    }

private var _historyOutlineMd: ImageVector? = null
