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

public val DsIcon.DragOutlineMd: ImageVector
    get() {
        if (_dragOutlineMd != null) {
            return _dragOutlineMd!!
        }
        _dragOutlineMd = Builder(name = "DragOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveTo(8.172f, 5.0f, 7.5f, 5.672f, 7.5f, 6.5f)
                curveTo(7.5f, 7.328f, 8.172f, 8.0f, 9.0f, 8.0f)
                curveTo(9.828f, 8.0f, 10.5f, 7.328f, 10.5f, 6.5f)
                curveTo(10.5f, 5.672f, 9.828f, 5.0f, 9.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.5f)
                curveTo(8.172f, 10.5f, 7.5f, 11.172f, 7.5f, 12.0f)
                curveTo(7.5f, 12.828f, 8.172f, 13.5f, 9.0f, 13.5f)
                curveTo(9.828f, 13.5f, 10.5f, 12.828f, 10.5f, 12.0f)
                curveTo(10.5f, 11.172f, 9.828f, 10.5f, 9.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 17.5f)
                curveTo(7.5f, 16.672f, 8.172f, 16.0f, 9.0f, 16.0f)
                curveTo(9.828f, 16.0f, 10.5f, 16.672f, 10.5f, 17.5f)
                curveTo(10.5f, 18.328f, 9.828f, 19.0f, 9.0f, 19.0f)
                curveTo(8.172f, 19.0f, 7.5f, 18.328f, 7.5f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                curveTo(14.172f, 5.0f, 13.5f, 5.672f, 13.5f, 6.5f)
                curveTo(13.5f, 7.328f, 14.172f, 8.0f, 15.0f, 8.0f)
                curveTo(15.828f, 8.0f, 16.5f, 7.328f, 16.5f, 6.5f)
                curveTo(16.5f, 5.672f, 15.828f, 5.0f, 15.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.5f)
                curveTo(14.172f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                curveTo(13.5f, 12.828f, 14.172f, 13.5f, 15.0f, 13.5f)
                curveTo(15.828f, 13.5f, 16.5f, 12.828f, 16.5f, 12.0f)
                curveTo(16.5f, 11.172f, 15.828f, 10.5f, 15.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 16.672f, 14.172f, 16.0f, 15.0f, 16.0f)
                curveTo(15.828f, 16.0f, 16.5f, 16.672f, 16.5f, 17.5f)
                curveTo(16.5f, 18.328f, 15.828f, 19.0f, 15.0f, 19.0f)
                curveTo(14.172f, 19.0f, 13.5f, 18.328f, 13.5f, 17.5f)
                close()
            }
        }
        .build()
        return _dragOutlineMd!!
    }

private var _dragOutlineMd: ImageVector? = null
