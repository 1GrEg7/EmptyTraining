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

public val DsIcon.BookmarkOutlineSm: ImageVector
    get() {
        if (_bookmarkOutlineSm != null) {
            return _bookmarkOutlineSm!!
        }
        _bookmarkOutlineSm = Builder(name = "BookmarkOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 10.346f)
                lineTo(12.0f, 13.19f)
                verticalLineTo(4.0f)
                curveTo(12.0f, 2.895f, 11.105f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(13.19f)
                lineTo(8.0f, 10.346f)
                close()
                moveTo(3.5f, 16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 1.791f, 3.791f, 0.0f, 6.0f, 0.0f)
                horizontalLineTo(10.0f)
                curveTo(12.209f, 0.0f, 14.0f, 1.791f, 14.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.5f)
                lineTo(8.0f, 12.8f)
                lineTo(3.5f, 16.0f)
                close()
            }
        }
        .build()
        return _bookmarkOutlineSm!!
    }

private var _bookmarkOutlineSm: ImageVector? = null
