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

public val DsIcon.ViewSolidSm: ImageVector
    get() {
        if (_viewSolidSm != null) {
            return _viewSolidSm!!
        }
        _viewSolidSm = Builder(name = "ViewSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                curveTo(5.0f, 2.0f, 1.496f, 3.978f, 0.0f, 6.873f)
                verticalLineTo(9.127f)
                curveTo(1.496f, 12.021f, 5.0f, 14.0f, 8.0f, 14.0f)
                curveTo(11.0f, 14.0f, 14.504f, 12.022f, 16.0f, 9.127f)
                verticalLineTo(6.873f)
                curveTo(14.504f, 3.978f, 11.0f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(8.0f, 10.496f)
                curveTo(9.933f, 10.496f, 11.5f, 8.929f, 11.5f, 6.996f)
                curveTo(11.5f, 5.063f, 9.933f, 3.496f, 8.0f, 3.496f)
                curveTo(6.067f, 3.496f, 4.5f, 5.063f, 4.5f, 6.996f)
                curveTo(4.5f, 8.929f, 6.067f, 10.496f, 8.0f, 10.496f)
                close()
            }
        }
        .build()
        return _viewSolidSm!!
    }

private var _viewSolidSm: ImageVector? = null
