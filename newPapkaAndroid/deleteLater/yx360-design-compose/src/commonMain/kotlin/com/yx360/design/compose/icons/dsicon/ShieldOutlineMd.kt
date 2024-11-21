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

public val DsIcon.ShieldOutlineMd: ImageVector
    get() {
        if (_shieldOutlineMd != null) {
            return _shieldOutlineMd!!
        }
        _shieldOutlineMd = Builder(name = "ShieldOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.924f, 8.135f)
                lineTo(12.0f, 4.288f)
                lineTo(5.076f, 8.135f)
                curveTo(5.312f, 11.44f, 5.732f, 14.024f, 6.783f, 16.095f)
                curveTo(7.747f, 17.993f, 9.323f, 19.593f, 12.0f, 20.823f)
                curveTo(14.679f, 19.594f, 16.253f, 17.993f, 17.216f, 16.095f)
                curveTo(18.267f, 14.024f, 18.688f, 11.44f, 18.924f, 8.135f)
                close()
                moveTo(12.0f, 23.0f)
                curveTo(15.521f, 21.579f, 17.701f, 19.56f, 19.0f, 17.0f)
                curveTo(20.389f, 14.263f, 20.779f, 10.906f, 21.0f, 7.0f)
                lineTo(12.0f, 2.0f)
                lineTo(3.0f, 7.0f)
                curveTo(3.221f, 10.906f, 3.611f, 14.263f, 5.0f, 17.0f)
                curveTo(6.299f, 19.56f, 8.481f, 21.579f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _shieldOutlineMd!!
    }

private var _shieldOutlineMd: ImageVector? = null
