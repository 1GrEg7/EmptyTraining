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

public val DsIcon.LocationOutlineMd: ImageVector
    get() {
        if (_locationOutlineMd != null) {
            return _locationOutlineMd!!
        }
        _locationOutlineMd = Builder(name = "LocationOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.554f, 12.443f)
                lineTo(13.557f, 17.787f)
                lineTo(18.617f, 5.381f)
                lineTo(6.211f, 10.44f)
                lineTo(11.554f, 12.443f)
                close()
                moveTo(10.0f, 13.997f)
                lineTo(13.0f, 21.997f)
                horizontalLineTo(14.0f)
                lineTo(21.75f, 2.996f)
                lineTo(21.0f, 2.25f)
                lineTo(2.0f, 9.996f)
                verticalLineTo(10.997f)
                lineTo(10.0f, 13.997f)
                close()
            }
        }
        .build()
        return _locationOutlineMd!!
    }

private var _locationOutlineMd: ImageVector? = null
