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

public val DsIcon.CreateOutlineSm: ImageVector
    get() {
        if (_createOutlineSm != null) {
            return _createOutlineSm!!
        }
        _createOutlineSm = Builder(name = "CreateOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 0.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(0.0f, 13.761f, 2.239f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(13.761f, 16.0f, 16.0f, 13.761f, 16.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                curveTo(14.0f, 12.657f, 12.657f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 14.0f, 2.0f, 12.657f, 2.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(13.414f, 1.0f)
                curveTo(12.633f, 0.219f, 11.367f, 0.219f, 10.586f, 1.0f)
                lineTo(4.0f, 7.586f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.414f)
                lineTo(15.0f, 5.414f)
                curveTo(15.781f, 4.633f, 15.781f, 3.367f, 15.0f, 2.586f)
                lineTo(13.414f, 1.0f)
                close()
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.414f)
                lineTo(12.0f, 2.414f)
                lineTo(13.586f, 4.0f)
                lineTo(7.586f, 10.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _createOutlineSm!!
    }

private var _createOutlineSm: ImageVector? = null
