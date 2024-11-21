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

public val DsIcon.TredsSolidMd: ImageVector
    get() {
        if (_tredsSolidMd != null) {
            return _tredsSolidMd!!
        }
        _tredsSolidMd = Builder(name = "TredsSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 5.667f, 6.473f, 3.0f, 12.0f, 3.0f)
                curveTo(17.527f, 3.0f, 22.0f, 5.667f, 22.0f, 11.0f)
                curveTo(22.0f, 16.333f, 17.527f, 19.0f, 12.0f, 19.0f)
                curveTo(11.753f, 19.0f, 11.507f, 18.995f, 11.265f, 18.984f)
                lineTo(8.5f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.131f)
                curveTo(4.01f, 16.952f, 2.0f, 14.575f, 2.0f, 11.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _tredsSolidMd!!
    }

private var _tredsSolidMd: ImageVector? = null
