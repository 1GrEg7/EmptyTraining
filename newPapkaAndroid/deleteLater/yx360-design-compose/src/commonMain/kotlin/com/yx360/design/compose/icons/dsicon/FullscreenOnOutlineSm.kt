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

public val DsIcon.FullscreenOnOutlineSm: ImageVector
    get() {
        if (_fullscreenOnOutlineSm != null) {
            return _fullscreenOnOutlineSm!!
        }
        _fullscreenOnOutlineSm = Builder(name = "FullscreenOnOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 5.586f)
                lineTo(11.587f, 2.999f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 0.999f)
                lineTo(14.0f, 0.999f)
                lineTo(15.0f, 0.999f)
                lineTo(15.0f, 1.999f)
                verticalLineTo(5.999f)
                lineTo(13.0f, 5.999f)
                verticalLineTo(4.414f)
                lineTo(10.414f, 7.0f)
                lineTo(9.0f, 5.586f)
                close()
                moveTo(7.0f, 10.414f)
                lineTo(4.413f, 13.001f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.001f)
                horizontalLineTo(2.0f)
                lineTo(1.0f, 15.001f)
                verticalLineTo(14.001f)
                verticalLineTo(10.001f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.586f)
                lineTo(5.586f, 9.0f)
                lineTo(7.0f, 10.414f)
                close()
            }
        }
        .build()
        return _fullscreenOnOutlineSm!!
    }

private var _fullscreenOnOutlineSm: ImageVector? = null
