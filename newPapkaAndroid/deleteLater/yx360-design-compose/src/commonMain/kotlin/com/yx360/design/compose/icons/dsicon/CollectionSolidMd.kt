package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CollectionSolidMd: ImageVector
    get() {
        if (_collectionSolidMd != null) {
            return _collectionSolidMd!!
        }
        _collectionSolidMd = Builder(name = "CollectionSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.536f, 4.0f)
                horizontalLineTo(12.0f)
                curveTo(15.314f, 4.0f, 18.0f, 6.686f, 18.0f, 10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.136f, 21.0f, 5.204f, 20.695f, 4.469f)
                curveTo(20.289f, 3.489f, 19.511f, 2.71f, 18.531f, 2.304f)
                curveTo(17.796f, 2.0f, 16.864f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(12.136f, 2.0f, 11.204f, 2.0f, 10.469f, 2.304f)
                curveTo(9.651f, 2.643f, 8.974f, 3.242f, 8.536f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 10.136f, 3.0f, 9.204f, 3.304f, 8.469f)
                curveTo(3.71f, 7.489f, 4.489f, 6.71f, 5.469f, 6.304f)
                curveTo(6.204f, 6.0f, 7.136f, 6.0f, 9.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(11.864f, 6.0f, 12.796f, 6.0f, 13.531f, 6.304f)
                curveTo(14.511f, 6.71f, 15.29f, 7.489f, 15.696f, 8.469f)
                curveTo(16.0f, 9.204f, 16.0f, 10.136f, 16.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                lineTo(9.5f, 18.5f)
                lineTo(4.5f, 22.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _collectionSolidMd!!
    }

private var _collectionSolidMd: ImageVector? = null
