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

public val DsIcon.AttachOutlineMd: ImageVector
    get() {
        if (_attachOutlineMd != null) {
            return _attachOutlineMd!!
        }
        _attachOutlineMd = Builder(name = "AttachOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.843f, 17.633f)
                curveTo(8.601f, 19.39f, 11.45f, 19.39f, 13.207f, 17.633f)
                lineTo(16.389f, 14.451f)
                lineTo(17.804f, 15.865f)
                lineTo(14.622f, 19.047f)
                curveTo(12.083f, 21.585f, 7.968f, 21.585f, 5.429f, 19.047f)
                curveTo(2.891f, 16.508f, 2.891f, 12.393f, 5.429f, 9.855f)
                lineTo(11.44f, 3.844f)
                curveTo(13.392f, 1.891f, 16.558f, 1.891f, 18.511f, 3.844f)
                curveTo(20.463f, 5.797f, 20.463f, 8.963f, 18.511f, 10.915f)
                lineTo(12.5f, 16.926f)
                curveTo(11.133f, 18.292f, 8.917f, 18.292f, 7.551f, 16.926f)
                curveTo(6.184f, 15.559f, 6.184f, 13.343f, 7.551f, 11.976f)
                lineTo(13.207f, 6.319f)
                lineTo(14.622f, 7.733f)
                lineTo(8.965f, 13.39f)
                curveTo(8.379f, 13.976f, 8.379f, 14.926f, 8.965f, 15.511f)
                curveTo(9.551f, 16.097f, 10.5f, 16.097f, 11.086f, 15.511f)
                lineTo(17.097f, 9.501f)
                curveTo(18.268f, 8.329f, 18.268f, 6.43f, 17.097f, 5.258f)
                curveTo(15.925f, 4.087f, 14.025f, 4.087f, 12.854f, 5.258f)
                lineTo(6.843f, 11.269f)
                curveTo(5.086f, 13.026f, 5.086f, 15.875f, 6.843f, 17.633f)
                close()
            }
        }
        .build()
        return _attachOutlineMd!!
    }

private var _attachOutlineMd: ImageVector? = null
