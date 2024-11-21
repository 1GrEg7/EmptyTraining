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

public val DsIcon.UndoOutlineMd: ImageVector
    get() {
        if (_undoOutlineMd != null) {
            return _undoOutlineMd!!
        }
        _undoOutlineMd = Builder(name = "UndoOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.414f, 3.708f)
                lineTo(7.0f, 2.294f)
                lineTo(2.293f, 7.001f)
                lineTo(7.0f, 11.708f)
                lineTo(8.414f, 10.294f)
                lineTo(6.121f, 8.001f)
                horizontalLineTo(13.707f)
                curveTo(16.745f, 8.001f, 19.207f, 10.464f, 19.207f, 13.501f)
                curveTo(19.207f, 16.539f, 16.745f, 19.001f, 13.707f, 19.001f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.001f)
                horizontalLineTo(13.707f)
                curveTo(17.849f, 21.001f, 21.207f, 17.643f, 21.207f, 13.501f)
                curveTo(21.207f, 9.359f, 17.849f, 6.001f, 13.707f, 6.001f)
                horizontalLineTo(6.121f)
                lineTo(8.414f, 3.708f)
                close()
            }
        }
        .build()
        return _undoOutlineMd!!
    }

private var _undoOutlineMd: ImageVector? = null
