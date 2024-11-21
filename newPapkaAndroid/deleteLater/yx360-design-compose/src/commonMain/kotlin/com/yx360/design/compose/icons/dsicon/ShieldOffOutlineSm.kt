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

public val DsIcon.ShieldOffOutlineSm: ImageVector
    get() {
        if (_shieldOffOutlineSm != null) {
            return _shieldOffOutlineSm!!
        }
        _shieldOffOutlineSm = Builder(name = "ShieldOffOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.945f)
                lineTo(6.599f, 2.695f)
                lineTo(5.621f, 1.274f)
                lineTo(8.0f, 0.0f)
                lineTo(15.0f, 3.75f)
                curveTo(14.864f, 6.095f, 14.627f, 8.189f, 14.0f, 10.0f)
                curveTo(13.747f, 10.731f, 13.431f, 11.417f, 13.035f, 12.053f)
                lineTo(11.951f, 10.477f)
                curveTo(12.114f, 10.145f, 12.255f, 9.799f, 12.38f, 9.439f)
                curveTo(12.837f, 8.118f, 13.072f, 6.571f, 13.215f, 4.739f)
                lineTo(8.0f, 1.945f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.881f, 2.742f)
                lineTo(1.0f, 3.75f)
                curveTo(1.135f, 6.083f, 1.38f, 8.207f, 2.0f, 10.0f)
                curveTo(2.911f, 12.633f, 4.631f, 14.667f, 8.0f, 16.0f)
                curveTo(9.145f, 15.547f, 10.101f, 15.012f, 10.899f, 14.4f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(14.25f)
                lineTo(3.25f, 0.008f)
                horizontalLineTo(1.0f)
                lineTo(2.881f, 2.742f)
                close()
                moveTo(9.926f, 12.985f)
                lineTo(3.858f, 4.163f)
                lineTo(2.785f, 4.739f)
                curveTo(2.929f, 6.569f, 3.168f, 8.134f, 3.62f, 9.44f)
                curveTo(4.31f, 11.434f, 5.521f, 13.003f, 8.0f, 14.138f)
                curveTo(8.751f, 13.794f, 9.386f, 13.41f, 9.926f, 12.985f)
                close()
            }
        }
        .build()
        return _shieldOffOutlineSm!!
    }

private var _shieldOffOutlineSm: ImageVector? = null
