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

public val DsIcon.RedoOutlineMd: ImageVector
    get() {
        if (_redoOutlineMd != null) {
            return _redoOutlineMd!!
        }
        _redoOutlineMd = Builder(name = "RedoOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.562f, 3.708f)
                lineTo(16.977f, 2.294f)
                lineTo(21.684f, 7.001f)
                lineTo(16.977f, 11.708f)
                lineTo(15.562f, 10.294f)
                lineTo(17.855f, 8.001f)
                horizontalLineTo(10.269f)
                curveTo(7.232f, 8.001f, 4.77f, 10.464f, 4.77f, 13.501f)
                curveTo(4.77f, 16.539f, 7.232f, 19.001f, 10.269f, 19.001f)
                horizontalLineTo(16.977f)
                verticalLineTo(21.001f)
                horizontalLineTo(10.269f)
                curveTo(6.127f, 21.001f, 2.77f, 17.643f, 2.77f, 13.501f)
                curveTo(2.77f, 9.359f, 6.127f, 6.001f, 10.269f, 6.001f)
                horizontalLineTo(17.855f)
                lineTo(15.562f, 3.708f)
                close()
            }
        }
        .build()
        return _redoOutlineMd!!
    }

private var _redoOutlineMd: ImageVector? = null
