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

public val DsIcon.MoreVerticalOutlineSm: ImageVector
    get() {
        if (_moreVerticalOutlineSm != null) {
            return _moreVerticalOutlineSm!!
        }
        _moreVerticalOutlineSm = Builder(name = "MoreVerticalOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.5f)
                curveTo(6.5f, 1.672f, 7.172f, 1.0f, 8.0f, 1.0f)
                curveTo(8.828f, 1.0f, 9.5f, 1.672f, 9.5f, 2.5f)
                curveTo(9.5f, 3.328f, 8.828f, 4.0f, 8.0f, 4.0f)
                curveTo(7.172f, 4.0f, 6.5f, 3.328f, 6.5f, 2.5f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(6.5f, 7.172f, 7.172f, 6.5f, 8.0f, 6.5f)
                curveTo(8.828f, 6.5f, 9.5f, 7.172f, 9.5f, 8.0f)
                curveTo(9.5f, 8.828f, 8.828f, 9.5f, 8.0f, 9.5f)
                curveTo(7.172f, 9.5f, 6.5f, 8.828f, 6.5f, 8.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(7.172f, 12.0f, 6.5f, 12.672f, 6.5f, 13.5f)
                curveTo(6.5f, 14.328f, 7.172f, 15.0f, 8.0f, 15.0f)
                curveTo(8.828f, 15.0f, 9.5f, 14.328f, 9.5f, 13.5f)
                curveTo(9.5f, 12.672f, 8.828f, 12.0f, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moreVerticalOutlineSm!!
    }

private var _moreVerticalOutlineSm: ImageVector? = null
