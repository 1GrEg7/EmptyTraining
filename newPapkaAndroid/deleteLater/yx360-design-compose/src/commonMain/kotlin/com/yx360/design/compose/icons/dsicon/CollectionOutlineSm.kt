package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.CollectionOutlineSm: ImageVector
    get() {
        if (_collectionOutlineSm != null) {
            return _collectionOutlineSm!!
        }
        _collectionOutlineSm = Builder(name = "CollectionOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(12.105f, 2.0f, 13.0f, 2.895f, 13.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 1.791f, 13.209f, 0.0f, 11.0f, 0.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                curveTo(2.343f, 4.0f, 1.0f, 5.343f, 1.0f, 7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                lineTo(6.0f, 14.182f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 5.343f, 9.657f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 6.448f, 3.448f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 6.0f, 9.0f, 6.448f, 9.0f, 7.0f)
                verticalLineTo(13.408f)
                lineTo(6.0f, 11.961f)
                lineTo(3.0f, 13.408f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _collectionOutlineSm!!
    }

private var _collectionOutlineSm: ImageVector? = null
