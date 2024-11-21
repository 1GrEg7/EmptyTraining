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

public val DsIcon.ShareSolidSm: ImageVector
    get() {
        if (_shareSolidSm != null) {
            return _shareSolidSm!!
        }
        _shareSolidSm = Builder(name = "ShareSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.186f, 14.0f)
                horizontalLineTo(9.302f)
                lineTo(16.0f, 8.0f)
                lineTo(9.302f, 2.0f)
                horizontalLineTo(8.186f)
                verticalLineTo(5.352f)
                curveTo(4.591f, 5.87f, 1.384f, 8.064f, 0.259f, 11.834f)
                curveTo(0.136f, 12.248f, 0.057f, 12.826f, 0.0f, 13.333f)
                horizontalLineTo(1.116f)
                curveTo(2.977f, 11.667f, 5.581f, 10.667f, 8.186f, 10.667f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _shareSolidSm!!
    }

private var _shareSolidSm: ImageVector? = null
