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

public val DsIcon.BoxOutlineMd: ImageVector
    get() {
        if (_boxOutlineMd != null) {
            return _boxOutlineMd!!
        }
        _boxOutlineMd = Builder(name = "BoxOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 3.0f)
                curveTo(6.904f, 3.006f, 5.769f, 3.063f, 4.91f, 3.589f)
                curveTo(4.372f, 3.919f, 3.919f, 4.372f, 3.589f, 4.91f)
                curveTo(3.0f, 5.872f, 3.0f, 7.181f, 3.0f, 9.8f)
                verticalLineTo(14.2f)
                curveTo(3.0f, 16.819f, 3.0f, 18.128f, 3.589f, 19.09f)
                curveTo(3.919f, 19.628f, 4.372f, 20.081f, 4.91f, 20.411f)
                curveTo(5.872f, 21.0f, 7.181f, 21.0f, 9.8f, 21.0f)
                horizontalLineTo(14.2f)
                curveTo(16.819f, 21.0f, 18.128f, 21.0f, 19.09f, 20.411f)
                curveTo(19.628f, 20.081f, 20.081f, 19.628f, 20.411f, 19.09f)
                curveTo(21.0f, 18.128f, 21.0f, 16.819f, 21.0f, 14.2f)
                verticalLineTo(9.8f)
                curveTo(21.0f, 7.181f, 21.0f, 5.872f, 20.411f, 4.91f)
                curveTo(20.081f, 4.372f, 19.628f, 3.919f, 19.09f, 3.589f)
                curveTo(18.232f, 3.063f, 17.096f, 3.007f, 15.0f, 3.001f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(15.0f, 5.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.001f)
                curveTo(8.09f, 5.004f, 7.441f, 5.015f, 6.923f, 5.065f)
                curveTo(6.294f, 5.124f, 6.069f, 5.225f, 5.955f, 5.295f)
                curveTo(5.686f, 5.46f, 5.46f, 5.686f, 5.295f, 5.955f)
                curveTo(5.225f, 6.069f, 5.124f, 6.294f, 5.065f, 6.923f)
                curveTo(5.002f, 7.581f, 5.0f, 8.452f, 5.0f, 9.8f)
                verticalLineTo(14.2f)
                curveTo(5.0f, 15.548f, 5.002f, 16.419f, 5.065f, 17.077f)
                curveTo(5.124f, 17.705f, 5.225f, 17.931f, 5.295f, 18.045f)
                curveTo(5.46f, 18.314f, 5.686f, 18.54f, 5.955f, 18.705f)
                curveTo(6.069f, 18.775f, 6.294f, 18.875f, 6.923f, 18.935f)
                curveTo(7.581f, 18.998f, 8.452f, 19.0f, 9.8f, 19.0f)
                horizontalLineTo(14.2f)
                curveTo(15.548f, 19.0f, 16.419f, 18.998f, 17.077f, 18.935f)
                curveTo(17.705f, 18.875f, 17.931f, 18.775f, 18.045f, 18.705f)
                curveTo(18.314f, 18.54f, 18.54f, 18.314f, 18.705f, 18.045f)
                curveTo(18.775f, 17.931f, 18.875f, 17.705f, 18.935f, 17.077f)
                curveTo(18.998f, 16.419f, 19.0f, 15.548f, 19.0f, 14.2f)
                verticalLineTo(9.8f)
                curveTo(19.0f, 8.452f, 18.998f, 7.581f, 18.935f, 6.923f)
                curveTo(18.875f, 6.294f, 18.775f, 6.069f, 18.705f, 5.955f)
                curveTo(18.54f, 5.686f, 18.314f, 5.46f, 18.045f, 5.295f)
                curveTo(17.931f, 5.225f, 17.705f, 5.124f, 17.077f, 5.065f)
                curveTo(16.559f, 5.015f, 15.91f, 5.004f, 15.0f, 5.001f)
                close()
                moveTo(11.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _boxOutlineMd!!
    }

private var _boxOutlineMd: ImageVector? = null
