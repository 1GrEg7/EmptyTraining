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

public val DsIcon.GeoPinSolidSm: ImageVector
    get() {
        if (_geoPinSolidSm != null) {
            return _geoPinSolidSm!!
        }
        _geoPinSolidSm = Builder(name = "GeoPinSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 6.6f)
                curveTo(1.5f, 2.9f, 4.5f, 0.0f, 8.0f, 0.0f)
                curveTo(11.5f, 0.0f, 14.5f, 2.9f, 14.5f, 6.6f)
                curveTo(14.439f, 9.775f, 12.961f, 10.974f, 11.478f, 12.178f)
                curveTo(10.532f, 12.945f, 9.584f, 13.715f, 9.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.418f, 13.719f, 5.473f, 12.965f, 4.53f, 12.212f)
                curveTo(3.044f, 11.026f, 1.561f, 9.842f, 1.5f, 6.6f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(9.381f, 9.0f, 10.5f, 7.881f, 10.5f, 6.5f)
                curveTo(10.5f, 5.119f, 9.381f, 4.0f, 8.0f, 4.0f)
                curveTo(6.619f, 4.0f, 5.5f, 5.119f, 5.5f, 6.5f)
                curveTo(5.5f, 7.881f, 6.619f, 9.0f, 8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _geoPinSolidSm!!
    }

private var _geoPinSolidSm: ImageVector? = null
