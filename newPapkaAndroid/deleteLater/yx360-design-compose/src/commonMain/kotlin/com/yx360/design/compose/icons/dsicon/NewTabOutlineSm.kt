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

public val DsIcon.NewTabOutlineSm: ImageVector
    get() {
        if (_newTabOutlineSm != null) {
            return _newTabOutlineSm!!
        }
        _newTabOutlineSm = Builder(name = "NewTabOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 12.105f, 3.895f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(12.105f, 13.0f, 13.0f, 12.105f, 13.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 13.209f, 13.209f, 15.0f, 11.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 15.0f, 1.0f, 13.209f, 1.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 2.791f, 2.791f, 1.0f, 5.0f, 1.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineTo(11.586f)
                lineTo(6.793f, 7.793f)
                lineTo(8.207f, 9.207f)
                lineTo(13.0f, 4.414f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _newTabOutlineSm!!
    }

private var _newTabOutlineSm: ImageVector? = null
