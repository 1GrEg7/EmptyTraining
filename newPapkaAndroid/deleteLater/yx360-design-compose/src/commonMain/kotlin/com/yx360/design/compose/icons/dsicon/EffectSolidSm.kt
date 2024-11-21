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

public val DsIcon.EffectSolidSm: ImageVector
    get() {
        if (_effectSolidSm != null) {
            return _effectSolidSm!!
        }
        _effectSolidSm = Builder(name = "EffectSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                horizontalLineTo(10.364f)
                lineTo(12.0f, 4.0f)
                lineTo(16.0f, 5.636f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 7.636f)
                lineTo(10.364f, 11.636f)
                horizontalLineTo(10.0f)
                lineTo(8.364f, 7.636f)
                lineTo(4.364f, 6.0f)
                verticalLineTo(5.636f)
                lineTo(8.364f, 4.0f)
                lineTo(10.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.909f, 10.182f)
                lineTo(4.182f, 7.273f)
                horizontalLineTo(4.545f)
                lineTo(5.818f, 10.182f)
                lineTo(8.727f, 11.455f)
                verticalLineTo(11.818f)
                lineTo(5.818f, 13.091f)
                lineTo(4.545f, 16.0f)
                horizontalLineTo(4.182f)
                lineTo(2.909f, 13.091f)
                lineTo(0.0f, 11.818f)
                verticalLineTo(11.455f)
                lineTo(2.909f, 10.182f)
                close()
            }
        }
        .build()
        return _effectSolidSm!!
    }

private var _effectSolidSm: ImageVector? = null
