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

public val DsIcon.SearchOutlineSm: ImageVector
    get() {
        if (_searchOutlineSm != null) {
            return _searchOutlineSm!!
        }
        _searchOutlineSm = Builder(name = "SearchOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 1.0f)
                curveTo(3.91f, 1.0f, 1.0f, 3.91f, 1.0f, 7.5f)
                curveTo(1.0f, 11.09f, 3.91f, 14.0f, 7.5f, 14.0f)
                curveTo(8.934f, 14.0f, 10.26f, 13.536f, 11.335f, 12.749f)
                lineTo(14.293f, 15.707f)
                lineTo(15.707f, 14.293f)
                lineTo(12.749f, 11.335f)
                curveTo(13.536f, 10.26f, 14.0f, 8.934f, 14.0f, 7.5f)
                curveTo(14.0f, 3.91f, 11.09f, 1.0f, 7.5f, 1.0f)
                close()
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 5.015f, 5.015f, 3.0f, 7.5f, 3.0f)
                curveTo(9.985f, 3.0f, 12.0f, 5.015f, 12.0f, 7.5f)
                curveTo(12.0f, 9.985f, 9.985f, 12.0f, 7.5f, 12.0f)
                curveTo(5.015f, 12.0f, 3.0f, 9.985f, 3.0f, 7.5f)
                close()
            }
        }
        .build()
        return _searchOutlineSm!!
    }

private var _searchOutlineSm: ImageVector? = null
