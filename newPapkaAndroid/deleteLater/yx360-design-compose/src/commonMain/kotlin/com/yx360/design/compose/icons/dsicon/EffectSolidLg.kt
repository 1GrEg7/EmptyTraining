package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.EffectSolidLg: ImageVector
    get() {
        if (_effectSolidLg != null) {
            return _effectSolidLg!!
        }
        _effectSolidLg = Builder(name = "EffectSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 2.0f)
                horizontalLineTo(20.136f)
                lineTo(23.0f, 9.0f)
                lineTo(30.0f, 11.864f)
                verticalLineTo(12.5f)
                lineTo(23.0f, 15.364f)
                lineTo(20.136f, 22.364f)
                horizontalLineTo(19.5f)
                lineTo(16.636f, 15.364f)
                lineTo(9.636f, 12.5f)
                verticalLineTo(11.864f)
                lineTo(16.636f, 9.0f)
                lineTo(19.5f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.091f, 19.818f)
                lineTo(9.318f, 14.727f)
                horizontalLineTo(9.955f)
                lineTo(12.182f, 19.818f)
                lineTo(17.273f, 22.045f)
                verticalLineTo(22.682f)
                lineTo(12.182f, 24.909f)
                lineTo(9.955f, 30.0f)
                horizontalLineTo(9.318f)
                lineTo(7.091f, 24.909f)
                lineTo(2.0f, 22.682f)
                verticalLineTo(22.045f)
                lineTo(7.091f, 19.818f)
                close()
            }
        }
        .build()
        return _effectSolidLg!!
    }

private var _effectSolidLg: ImageVector? = null
