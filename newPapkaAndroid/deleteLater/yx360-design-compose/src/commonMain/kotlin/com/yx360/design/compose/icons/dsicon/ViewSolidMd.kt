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

public val DsIcon.ViewSolidMd: ImageVector
    get() {
        if (_viewSolidMd != null) {
            return _viewSolidMd!!
        }
        _viewSolidMd = Builder(name = "ViewSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.611f, 6.246f)
                curveTo(7.546f, 5.103f, 9.752f, 4.499f, 12.0f, 4.5f)
                curveTo(14.248f, 4.499f, 16.454f, 5.103f, 18.389f, 6.246f)
                curveTo(20.324f, 7.39f, 21.917f, 9.031f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.915f, 14.968f, 20.323f, 16.61f, 18.388f, 17.753f)
                curveTo(16.453f, 18.896f, 14.247f, 19.5f, 12.0f, 19.5f)
                curveTo(9.753f, 19.5f, 7.547f, 18.896f, 5.612f, 17.753f)
                curveTo(3.677f, 16.61f, 2.085f, 14.968f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.083f, 9.031f, 3.676f, 7.39f, 5.611f, 6.246f)
                close()
                moveTo(12.0f, 15.5f)
                curveTo(14.485f, 15.5f, 16.5f, 13.485f, 16.5f, 11.0f)
                curveTo(16.5f, 8.515f, 14.485f, 6.5f, 12.0f, 6.5f)
                curveTo(9.515f, 6.5f, 7.5f, 8.515f, 7.5f, 11.0f)
                curveTo(7.5f, 13.485f, 9.515f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _viewSolidMd!!
    }

private var _viewSolidMd: ImageVector? = null
