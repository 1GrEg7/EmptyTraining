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

public val DsIcon.EffectSolidMd: ImageVector
    get() {
        if (_effectSolidMd != null) {
            return _effectSolidMd!!
        }
        _effectSolidMd = Builder(name = "EffectSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 1.0f)
                horizontalLineTo(15.25f)
                lineTo(17.5f, 6.5f)
                lineTo(23.0f, 8.75f)
                verticalLineTo(9.25f)
                lineTo(17.5f, 11.5f)
                lineTo(15.25f, 17.0f)
                horizontalLineTo(14.75f)
                lineTo(12.5f, 11.5f)
                lineTo(7.0f, 9.25f)
                verticalLineTo(8.75f)
                lineTo(12.5f, 6.5f)
                lineTo(14.75f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                lineTo(6.75f, 11.0f)
                horizontalLineTo(7.25f)
                lineTo(9.0f, 15.0f)
                lineTo(13.0f, 16.75f)
                verticalLineTo(17.25f)
                lineTo(9.0f, 19.0f)
                lineTo(7.25f, 23.0f)
                horizontalLineTo(6.75f)
                lineTo(5.0f, 19.0f)
                lineTo(1.0f, 17.25f)
                verticalLineTo(16.75f)
                lineTo(5.0f, 15.0f)
                close()
            }
        }
        .build()
        return _effectSolidMd!!
    }

private var _effectSolidMd: ImageVector? = null
