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

public val DsIcon.ShieldOffSolidMd: ImageVector
    get() {
        if (_shieldOffSolidMd != null) {
            return _shieldOffSolidMd!!
        }
        _shieldOffSolidMd = Builder(name = "ShieldOffSolidMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.116f, 3.602f)
                lineTo(18.782f, 17.41f)
                curveTo(18.857f, 17.275f, 18.93f, 17.138f, 19.0f, 17.0f)
                curveTo(20.389f, 14.263f, 20.779f, 10.906f, 21.0f, 7.0f)
                lineTo(12.0f, 2.0f)
                lineTo(9.116f, 3.602f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.236f, 5.202f)
                lineTo(4.0f, 2.008f)
                horizontalLineTo(6.5f)
                lineTo(20.5f, 22.008f)
                horizontalLineTo(18.0f)
                lineTo(16.676f, 20.116f)
                curveTo(15.473f, 21.253f, 13.94f, 22.217f, 12.0f, 23.0f)
                curveTo(8.481f, 21.579f, 6.299f, 19.56f, 5.0f, 17.0f)
                curveTo(3.611f, 14.263f, 3.221f, 10.906f, 3.0f, 7.0f)
                lineTo(6.236f, 5.202f)
                close()
            }
        }
        .build()
        return _shieldOffSolidMd!!
    }

private var _shieldOffSolidMd: ImageVector? = null
