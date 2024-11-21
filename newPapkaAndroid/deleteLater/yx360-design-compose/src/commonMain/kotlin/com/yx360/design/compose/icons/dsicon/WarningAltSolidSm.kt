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

public val DsIcon.WarningAltSolidSm: ImageVector
    get() {
        if (_warningAltSolidSm != null) {
            return _warningAltSolidSm!!
        }
        _warningAltSolidSm = Builder(name = "WarningAltSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.516f, 5.061f)
                lineTo(2.234f, 7.367f)
                curveTo(0.687f, 10.153f, -0.087f, 11.545f, 0.178f, 12.674f)
                curveTo(0.317f, 13.265f, 0.632f, 13.8f, 1.081f, 14.209f)
                curveTo(1.939f, 14.989f, 3.532f, 14.989f, 6.719f, 14.989f)
                horizontalLineTo(9.282f)
                curveTo(12.468f, 14.989f, 14.061f, 14.989f, 14.919f, 14.209f)
                curveTo(15.369f, 13.8f, 15.684f, 13.265f, 15.822f, 12.674f)
                curveTo(16.087f, 11.545f, 15.314f, 10.153f, 13.766f, 7.367f)
                lineTo(12.485f, 5.061f)
                curveTo(10.858f, 2.133f, 10.045f, 0.669f, 8.911f, 0.308f)
                curveTo(8.319f, 0.119f, 7.682f, 0.119f, 7.089f, 0.308f)
                curveTo(5.956f, 0.669f, 5.142f, 2.133f, 3.516f, 5.061f)
                close()
                moveTo(6.75f, 3.989f)
                horizontalLineTo(9.25f)
                lineTo(9.0f, 8.989f)
                horizontalLineTo(7.0f)
                lineTo(6.75f, 3.989f)
                close()
                moveTo(9.25f, 11.739f)
                curveTo(9.25f, 12.429f, 8.691f, 12.989f, 8.0f, 12.989f)
                curveTo(7.31f, 12.989f, 6.75f, 12.429f, 6.75f, 11.739f)
                curveTo(6.75f, 11.048f, 7.31f, 10.489f, 8.0f, 10.489f)
                curveTo(8.691f, 10.489f, 9.25f, 11.048f, 9.25f, 11.739f)
                close()
            }
        }
        .build()
        return _warningAltSolidSm!!
    }

private var _warningAltSolidSm: ImageVector? = null
