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

public val DsIcon.UndoOutlineSm: ImageVector
    get() {
        if (_undoOutlineSm != null) {
            return _undoOutlineSm!!
        }
        _undoOutlineSm = Builder(name = "UndoOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.414f, 6.0f)
                lineTo(5.707f, 7.293f)
                lineTo(4.293f, 8.707f)
                lineTo(0.586f, 5.0f)
                lineTo(4.293f, 1.293f)
                lineTo(5.707f, 2.707f)
                lineTo(4.414f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(12.262f, 4.0f, 14.5f, 6.239f, 14.5f, 9.0f)
                curveTo(14.5f, 11.762f, 12.262f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                curveTo(11.157f, 12.0f, 12.5f, 10.657f, 12.5f, 9.0f)
                curveTo(12.5f, 7.343f, 11.157f, 6.0f, 9.5f, 6.0f)
                horizontalLineTo(4.414f)
                close()
            }
        }
        .build()
        return _undoOutlineSm!!
    }

private var _undoOutlineSm: ImageVector? = null
