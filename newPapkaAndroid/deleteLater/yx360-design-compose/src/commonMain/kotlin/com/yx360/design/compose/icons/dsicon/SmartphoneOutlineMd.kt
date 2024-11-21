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

public val DsIcon.SmartphoneOutlineMd: ImageVector
    get() {
        if (_smartphoneOutlineMd != null) {
            return _smartphoneOutlineMd!!
        }
        _smartphoneOutlineMd = Builder(name = "SmartphoneOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 7.8f)
                curveTo(5.0f, 5.181f, 5.0f, 3.872f, 5.589f, 2.91f)
                curveTo(5.919f, 2.372f, 6.372f, 1.919f, 6.91f, 1.589f)
                curveTo(7.872f, 1.0f, 9.181f, 1.0f, 11.8f, 1.0f)
                horizontalLineTo(12.2f)
                curveTo(14.819f, 1.0f, 16.128f, 1.0f, 17.09f, 1.589f)
                curveTo(17.628f, 1.919f, 18.081f, 2.372f, 18.411f, 2.91f)
                curveTo(19.0f, 3.872f, 19.0f, 5.181f, 19.0f, 7.8f)
                verticalLineTo(16.2f)
                curveTo(19.0f, 18.819f, 19.0f, 20.128f, 18.411f, 21.09f)
                curveTo(18.081f, 21.628f, 17.628f, 22.081f, 17.09f, 22.411f)
                curveTo(16.128f, 23.0f, 14.819f, 23.0f, 12.2f, 23.0f)
                horizontalLineTo(11.8f)
                curveTo(9.181f, 23.0f, 7.872f, 23.0f, 6.91f, 22.411f)
                curveTo(6.372f, 22.081f, 5.919f, 21.628f, 5.589f, 21.09f)
                curveTo(5.0f, 20.128f, 5.0f, 18.819f, 5.0f, 16.2f)
                verticalLineTo(7.8f)
                close()
                moveTo(11.8f, 3.0f)
                horizontalLineTo(12.2f)
                curveTo(13.548f, 3.0f, 14.419f, 3.002f, 15.077f, 3.065f)
                curveTo(15.705f, 3.124f, 15.931f, 3.225f, 16.045f, 3.295f)
                curveTo(16.314f, 3.46f, 16.54f, 3.686f, 16.705f, 3.955f)
                curveTo(16.775f, 4.069f, 16.875f, 4.294f, 16.935f, 4.923f)
                curveTo(16.998f, 5.581f, 17.0f, 6.452f, 17.0f, 7.8f)
                verticalLineTo(16.2f)
                curveTo(17.0f, 17.548f, 16.998f, 18.419f, 16.935f, 19.077f)
                curveTo(16.875f, 19.705f, 16.775f, 19.931f, 16.705f, 20.045f)
                curveTo(16.54f, 20.314f, 16.314f, 20.54f, 16.045f, 20.705f)
                curveTo(15.931f, 20.775f, 15.705f, 20.875f, 15.077f, 20.935f)
                curveTo(14.419f, 20.998f, 13.548f, 21.0f, 12.2f, 21.0f)
                horizontalLineTo(11.8f)
                curveTo(10.452f, 21.0f, 9.581f, 20.998f, 8.923f, 20.935f)
                curveTo(8.294f, 20.875f, 8.069f, 20.775f, 7.955f, 20.705f)
                curveTo(7.686f, 20.54f, 7.46f, 20.314f, 7.295f, 20.045f)
                curveTo(7.225f, 19.931f, 7.124f, 19.705f, 7.065f, 19.077f)
                curveTo(7.002f, 18.419f, 7.0f, 17.548f, 7.0f, 16.2f)
                verticalLineTo(7.8f)
                curveTo(7.0f, 6.452f, 7.002f, 5.581f, 7.065f, 4.923f)
                curveTo(7.124f, 4.294f, 7.225f, 4.069f, 7.295f, 3.955f)
                curveTo(7.46f, 3.686f, 7.686f, 3.46f, 7.955f, 3.295f)
                curveTo(8.069f, 3.225f, 8.294f, 3.124f, 8.923f, 3.065f)
                curveTo(9.581f, 3.002f, 10.452f, 3.0f, 11.8f, 3.0f)
                close()
            }
        }
        .build()
        return _smartphoneOutlineMd!!
    }

private var _smartphoneOutlineMd: ImageVector? = null
