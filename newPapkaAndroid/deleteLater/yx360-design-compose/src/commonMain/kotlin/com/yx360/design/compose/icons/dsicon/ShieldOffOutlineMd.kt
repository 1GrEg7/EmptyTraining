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

public val DsIcon.ShieldOffOutlineMd: ImageVector
    get() {
        if (_shieldOffOutlineMd != null) {
            return _shieldOffOutlineMd!!
        }
        _shieldOffOutlineMd = Builder(name = "ShieldOffOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                curveTo(18.93f, 17.138f, 18.858f, 17.274f, 18.783f, 17.408f)
                lineTo(17.477f, 15.542f)
                curveTo(18.339f, 13.568f, 18.708f, 11.152f, 18.924f, 8.135f)
                lineTo(12.0f, 4.288f)
                lineTo(10.271f, 5.248f)
                lineTo(9.118f, 3.601f)
                lineTo(12.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                curveTo(20.779f, 10.906f, 20.389f, 14.263f, 19.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.678f, 20.115f)
                lineTo(18.0f, 22.003f)
                horizontalLineTo(20.5f)
                lineTo(6.5f, 2.004f)
                horizontalLineTo(4.0f)
                lineTo(6.238f, 5.201f)
                lineTo(3.0f, 7.0f)
                curveTo(3.221f, 10.906f, 3.611f, 14.263f, 5.0f, 17.0f)
                curveTo(6.299f, 19.56f, 8.481f, 21.579f, 12.0f, 23.0f)
                curveTo(13.941f, 22.217f, 15.475f, 21.252f, 16.678f, 20.115f)
                close()
                moveTo(15.516f, 18.454f)
                curveTo(14.626f, 19.349f, 13.482f, 20.143f, 12.0f, 20.823f)
                curveTo(9.323f, 19.593f, 7.747f, 17.993f, 6.783f, 16.095f)
                curveTo(5.732f, 14.024f, 5.312f, 11.44f, 5.076f, 8.135f)
                lineTo(7.391f, 6.848f)
                lineTo(15.516f, 18.454f)
                close()
            }
        }
        .build()
        return _shieldOffOutlineMd!!
    }

private var _shieldOffOutlineMd: ImageVector? = null
