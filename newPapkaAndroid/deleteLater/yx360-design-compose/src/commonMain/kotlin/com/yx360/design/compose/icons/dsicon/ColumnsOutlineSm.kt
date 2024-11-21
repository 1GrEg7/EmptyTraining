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

public val DsIcon.ColumnsOutlineSm: ImageVector
    get() {
        if (_columnsOutlineSm != null) {
            return _columnsOutlineSm!!
        }
        _columnsOutlineSm = Builder(name = "ColumnsOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.446f, 1.0f)
                curveTo(11.684f, 1.0f, 11.969f, 1.0f, 12.22f, 1.02f)
                curveTo(12.51f, 1.044f, 12.926f, 1.105f, 13.362f, 1.327f)
                curveTo(13.927f, 1.615f, 14.385f, 2.074f, 14.673f, 2.638f)
                curveTo(14.895f, 3.074f, 14.956f, 3.49f, 14.98f, 3.78f)
                curveTo(15.0f, 4.031f, 15.0f, 4.316f, 15.0f, 4.554f)
                verticalLineTo(11.446f)
                curveTo(15.0f, 11.684f, 15.0f, 11.969f, 14.98f, 12.22f)
                curveTo(14.956f, 12.51f, 14.895f, 12.926f, 14.673f, 13.362f)
                curveTo(14.385f, 13.927f, 13.927f, 14.385f, 13.362f, 14.673f)
                curveTo(12.926f, 14.895f, 12.51f, 14.956f, 12.22f, 14.98f)
                curveTo(11.969f, 15.0f, 11.684f, 15.0f, 11.446f, 15.0f)
                horizontalLineTo(4.554f)
                curveTo(4.316f, 15.0f, 4.031f, 15.0f, 3.78f, 14.98f)
                curveTo(3.49f, 14.956f, 3.074f, 14.895f, 2.638f, 14.673f)
                curveTo(2.074f, 14.385f, 1.615f, 13.927f, 1.327f, 13.362f)
                curveTo(1.105f, 12.926f, 1.044f, 12.51f, 1.02f, 12.22f)
                curveTo(1.0f, 11.969f, 1.0f, 11.684f, 1.0f, 11.446f)
                verticalLineTo(4.554f)
                curveTo(1.0f, 4.316f, 1.0f, 4.031f, 1.02f, 3.78f)
                curveTo(1.044f, 3.49f, 1.105f, 3.074f, 1.327f, 2.638f)
                curveTo(1.615f, 2.074f, 2.074f, 1.615f, 2.638f, 1.327f)
                curveTo(3.074f, 1.105f, 3.49f, 1.044f, 3.78f, 1.02f)
                curveTo(4.031f, 1.0f, 4.316f, 1.0f, 4.554f, 1.0f)
                horizontalLineTo(11.446f)
                close()
                moveTo(3.109f, 3.546f)
                curveTo(3.0f, 3.76f, 3.0f, 4.04f, 3.0f, 4.6f)
                verticalLineTo(11.4f)
                curveTo(3.0f, 11.96f, 3.0f, 12.24f, 3.109f, 12.454f)
                curveTo(3.205f, 12.642f, 3.358f, 12.795f, 3.546f, 12.891f)
                curveTo(3.76f, 13.0f, 4.04f, 13.0f, 4.6f, 13.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 3.0f, 3.76f, 3.0f, 3.546f, 3.109f)
                curveTo(3.358f, 3.205f, 3.205f, 3.358f, 3.109f, 3.546f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(11.4f)
                curveTo(11.96f, 13.0f, 12.24f, 13.0f, 12.454f, 12.891f)
                curveTo(12.642f, 12.795f, 12.795f, 12.642f, 12.891f, 12.454f)
                curveTo(13.0f, 12.24f, 13.0f, 11.96f, 13.0f, 11.4f)
                verticalLineTo(4.6f)
                curveTo(13.0f, 4.04f, 13.0f, 3.76f, 12.891f, 3.546f)
                curveTo(12.795f, 3.358f, 12.642f, 3.205f, 12.454f, 3.109f)
                curveTo(12.24f, 3.0f, 11.96f, 3.0f, 11.4f, 3.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 13.0f)
                close()
            }
        }
        .build()
        return _columnsOutlineSm!!
    }

private var _columnsOutlineSm: ImageVector? = null
