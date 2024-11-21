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

public val DsIcon.ShieldOffSolidSm: ImageVector
    get() {
        if (_shieldOffSolidSm != null) {
            return _shieldOffSolidSm!!
        }
        _shieldOffSolidSm = Builder(name = "ShieldOffSolidSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.621f, 1.274f)
                lineTo(13.035f, 12.053f)
                curveTo(13.431f, 11.417f, 13.747f, 10.731f, 14.0f, 10.0f)
                curveTo(14.627f, 8.189f, 14.864f, 6.095f, 15.0f, 3.75f)
                lineTo(8.0f, 0.0f)
                lineTo(5.621f, 1.274f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.881f, 2.742f)
                lineTo(1.0f, 0.008f)
                horizontalLineTo(3.25f)
                lineTo(14.25f, 16.0f)
                horizontalLineTo(12.0f)
                lineTo(10.899f, 14.4f)
                curveTo(10.101f, 15.012f, 9.145f, 15.547f, 8.0f, 16.0f)
                curveTo(4.631f, 14.667f, 2.911f, 12.633f, 2.0f, 10.0f)
                curveTo(1.38f, 8.207f, 1.135f, 6.083f, 1.0f, 3.75f)
                lineTo(2.881f, 2.742f)
                close()
            }
        }
        .build()
        return _shieldOffSolidSm!!
    }

private var _shieldOffSolidSm: ImageVector? = null
