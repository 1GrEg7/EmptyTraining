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

public val DsIcon.MoreHorizontalOutlineMd: ImageVector
    get() {
        if (_moreHorizontalOutlineMd != null) {
            return _moreHorizontalOutlineMd!!
        }
        _moreHorizontalOutlineMd = Builder(name = "MoreHorizontalOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 12.0f)
                curveTo(2.5f, 13.105f, 3.395f, 14.0f, 4.5f, 14.0f)
                curveTo(5.605f, 14.0f, 6.5f, 13.105f, 6.5f, 12.0f)
                curveTo(6.5f, 10.895f, 5.605f, 10.0f, 4.5f, 10.0f)
                curveTo(3.395f, 10.0f, 2.5f, 10.895f, 2.5f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(19.5f, 14.0f)
                curveTo(18.395f, 14.0f, 17.5f, 13.105f, 17.5f, 12.0f)
                curveTo(17.5f, 10.895f, 18.395f, 10.0f, 19.5f, 10.0f)
                curveTo(20.605f, 10.0f, 21.5f, 10.895f, 21.5f, 12.0f)
                curveTo(21.5f, 13.105f, 20.605f, 14.0f, 19.5f, 14.0f)
                close()
            }
        }
        .build()
        return _moreHorizontalOutlineMd!!
    }

private var _moreHorizontalOutlineMd: ImageVector? = null
