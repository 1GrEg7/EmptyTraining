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

public val DsIcon.ListOutlineMd: ImageVector
    get() {
        if (_listOutlineMd != null) {
            return _listOutlineMd!!
        }
        _listOutlineMd = Builder(name = "ListOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 8.5f)
                curveTo(5.328f, 8.5f, 6.0f, 7.828f, 6.0f, 7.0f)
                curveTo(6.0f, 6.172f, 5.328f, 5.5f, 4.5f, 5.5f)
                curveTo(3.672f, 5.5f, 3.0f, 6.172f, 3.0f, 7.0f)
                curveTo(3.0f, 7.828f, 3.672f, 8.5f, 4.5f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 13.5f)
                curveTo(5.328f, 13.5f, 6.0f, 12.828f, 6.0f, 12.0f)
                curveTo(6.0f, 11.172f, 5.328f, 10.5f, 4.5f, 10.5f)
                curveTo(3.672f, 10.5f, 3.0f, 11.172f, 3.0f, 12.0f)
                curveTo(3.0f, 12.828f, 3.672f, 13.5f, 4.5f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.0f)
                curveTo(6.0f, 17.828f, 5.328f, 18.5f, 4.5f, 18.5f)
                curveTo(3.672f, 18.5f, 3.0f, 17.828f, 3.0f, 17.0f)
                curveTo(3.0f, 16.172f, 3.672f, 15.5f, 4.5f, 15.5f)
                curveTo(5.328f, 15.5f, 6.0f, 16.172f, 6.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _listOutlineMd!!
    }

private var _listOutlineMd: ImageVector? = null
