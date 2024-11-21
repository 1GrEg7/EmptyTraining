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

public val DsIcon.PrintSolidMd: ImageVector
    get() {
        if (_printSolidMd != null) {
            return _printSolidMd!!
        }
        _printSolidMd = Builder(name = "PrintSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 7.027f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.027f)
                curveTo(19.654f, 7.06f, 20.122f, 7.135f, 20.53f, 7.304f)
                curveTo(21.511f, 7.71f, 22.29f, 8.489f, 22.696f, 9.47f)
                curveTo(23.0f, 10.205f, 23.0f, 11.136f, 23.0f, 12.999f)
                curveTo(23.0f, 14.861f, 23.0f, 15.793f, 22.696f, 16.527f)
                curveTo(22.29f, 17.508f, 21.511f, 18.287f, 20.53f, 18.693f)
                curveTo(20.122f, 18.862f, 19.654f, 18.937f, 19.0f, 18.971f)
                verticalLineTo(21.996f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.971f)
                curveTo(4.346f, 18.937f, 3.878f, 18.862f, 3.47f, 18.693f)
                curveTo(2.489f, 18.287f, 1.71f, 17.508f, 1.304f, 16.527f)
                curveTo(1.0f, 15.793f, 1.0f, 14.861f, 1.0f, 12.999f)
                curveTo(1.0f, 11.136f, 1.0f, 10.205f, 1.304f, 9.47f)
                curveTo(1.71f, 8.489f, 2.489f, 7.71f, 3.47f, 7.304f)
                curveTo(3.878f, 7.135f, 4.346f, 7.06f, 5.0f, 7.027f)
                close()
                moveTo(17.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 16.229f)
                verticalLineTo(19.996f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.229f)
                horizontalLineTo(7.0f)
                close()
                moveTo(13.82f, 12.996f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.82f)
                verticalLineTo(12.996f)
                horizontalLineTo(13.82f)
                close()
            }
        }
        .build()
        return _printSolidMd!!
    }

private var _printSolidMd: ImageVector? = null
