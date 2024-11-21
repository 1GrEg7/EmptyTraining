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

public val DsIcon.ListOutlineSm: ImageVector
    get() {
        if (_listOutlineSm != null) {
            return _listOutlineSm!!
        }
        _listOutlineSm = Builder(name = "ListOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.005f)
                curveTo(1.0f, 3.343f, 1.537f, 2.805f, 2.2f, 2.805f)
                curveTo(2.863f, 2.805f, 3.4f, 3.343f, 3.4f, 4.005f)
                curveTo(3.4f, 4.668f, 2.863f, 5.205f, 2.2f, 5.205f)
                curveTo(1.537f, 5.205f, 1.0f, 4.668f, 1.0f, 4.005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.005f)
                curveTo(1.0f, 11.343f, 1.537f, 10.805f, 2.2f, 10.805f)
                curveTo(2.863f, 10.805f, 3.4f, 11.343f, 3.4f, 12.005f)
                curveTo(3.4f, 12.668f, 2.863f, 13.205f, 2.2f, 13.205f)
                curveTo(1.537f, 13.205f, 1.0f, 12.668f, 1.0f, 12.005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2f, 6.805f)
                curveTo(1.537f, 6.805f, 1.0f, 7.343f, 1.0f, 8.005f)
                curveTo(1.0f, 8.668f, 1.537f, 9.205f, 2.2f, 9.205f)
                curveTo(2.863f, 9.205f, 3.4f, 8.668f, 3.4f, 8.005f)
                curveTo(3.4f, 7.343f, 2.863f, 6.805f, 2.2f, 6.805f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _listOutlineSm!!
    }

private var _listOutlineSm: ImageVector? = null
