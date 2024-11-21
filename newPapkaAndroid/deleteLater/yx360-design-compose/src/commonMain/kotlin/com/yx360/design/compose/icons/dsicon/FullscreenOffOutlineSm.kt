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

public val DsIcon.FullscreenOffOutlineSm: ImageVector
    get() {
        if (_fullscreenOffOutlineSm != null) {
            return _fullscreenOffOutlineSm!!
        }
        _fullscreenOffOutlineSm = Builder(name = "FullscreenOffOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.413f)
                lineTo(12.413f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                lineTo(9.0f, 7.0f)
                verticalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.584f)
                lineTo(13.586f, 0.999f)
                lineTo(15.0f, 2.413f)
                close()
                moveTo(1.0f, 13.587f)
                lineTo(3.587f, 11.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                lineTo(7.0f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.416f)
                lineTo(2.414f, 15.001f)
                lineTo(1.0f, 13.587f)
                close()
            }
        }
        .build()
        return _fullscreenOffOutlineSm!!
    }

private var _fullscreenOffOutlineSm: ImageVector? = null
