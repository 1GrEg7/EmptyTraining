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

public val DsIcon.ShareSolidMd: ImageVector
    get() {
        if (_shareSolidMd != null) {
            return _shareSolidMd!!
        }
        _shareSolidMd = Builder(name = "ShareSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(14.5f)
                lineTo(23.5f, 12.0f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.027f)
                curveTo(8.17f, 8.805f, 3.859f, 12.095f, 2.348f, 17.751f)
                curveTo(2.182f, 18.373f, 2.077f, 19.239f, 2.0f, 20.0f)
                horizontalLineTo(3.5f)
                curveTo(6.0f, 17.5f, 9.5f, 16.001f, 13.0f, 16.001f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _shareSolidMd!!
    }

private var _shareSolidMd: ImageVector? = null
