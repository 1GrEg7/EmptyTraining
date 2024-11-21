package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.RedoOutlineSm: ImageVector
    get() {
        if (_redoOutlineSm != null) {
            return _redoOutlineSm!!
        }
        _redoOutlineSm = Builder(name = "RedoOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.586f, 6.0f)
                lineTo(10.293f, 7.293f)
                lineTo(11.707f, 8.707f)
                lineTo(15.414f, 5.0f)
                lineTo(11.707f, 1.293f)
                lineTo(10.293f, 2.707f)
                lineTo(11.586f, 4.0f)
                horizontalLineTo(6.5f)
                curveTo(3.739f, 4.0f, 1.5f, 6.239f, 1.5f, 9.0f)
                curveTo(1.5f, 11.762f, 3.739f, 14.0f, 6.5f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 12.0f, 3.5f, 10.657f, 3.5f, 9.0f)
                curveTo(3.5f, 7.343f, 4.843f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(11.586f)
                close()
            }
        }
        .build()
        return _redoOutlineSm!!
    }

private var _redoOutlineSm: ImageVector? = null
