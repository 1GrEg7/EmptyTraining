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

public val DsIcon.DragOutlineSm: ImageVector
    get() {
        if (_dragOutlineSm != null) {
            return _dragOutlineSm!!
        }
        _dragOutlineSm = Builder(name = "DragOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 3.25f)
                curveTo(6.5f, 3.94f, 5.94f, 4.5f, 5.25f, 4.5f)
                curveTo(4.56f, 4.5f, 4.0f, 3.94f, 4.0f, 3.25f)
                curveTo(4.0f, 2.56f, 4.56f, 2.0f, 5.25f, 2.0f)
                curveTo(5.94f, 2.0f, 6.5f, 2.56f, 6.5f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 8.0f)
                curveTo(6.5f, 8.69f, 5.94f, 9.25f, 5.25f, 9.25f)
                curveTo(4.56f, 9.25f, 4.0f, 8.69f, 4.0f, 8.0f)
                curveTo(4.0f, 7.31f, 4.56f, 6.75f, 5.25f, 6.75f)
                curveTo(5.94f, 6.75f, 6.5f, 7.31f, 6.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 12.75f)
                curveTo(6.5f, 13.44f, 5.94f, 14.0f, 5.25f, 14.0f)
                curveTo(4.56f, 14.0f, 4.0f, 13.44f, 4.0f, 12.75f)
                curveTo(4.0f, 12.06f, 4.56f, 11.5f, 5.25f, 11.5f)
                curveTo(5.94f, 11.5f, 6.5f, 12.06f, 6.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.25f)
                curveTo(11.5f, 3.94f, 10.94f, 4.5f, 10.25f, 4.5f)
                curveTo(9.56f, 4.5f, 9.0f, 3.94f, 9.0f, 3.25f)
                curveTo(9.0f, 2.56f, 9.56f, 2.0f, 10.25f, 2.0f)
                curveTo(10.94f, 2.0f, 11.5f, 2.56f, 11.5f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 8.0f)
                curveTo(11.5f, 8.69f, 10.94f, 9.25f, 10.25f, 9.25f)
                curveTo(9.56f, 9.25f, 9.0f, 8.69f, 9.0f, 8.0f)
                curveTo(9.0f, 7.31f, 9.56f, 6.75f, 10.25f, 6.75f)
                curveTo(10.94f, 6.75f, 11.5f, 7.31f, 11.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 12.75f)
                curveTo(11.5f, 13.44f, 10.94f, 14.0f, 10.25f, 14.0f)
                curveTo(9.56f, 14.0f, 9.0f, 13.44f, 9.0f, 12.75f)
                curveTo(9.0f, 12.06f, 9.56f, 11.5f, 10.25f, 11.5f)
                curveTo(10.94f, 11.5f, 11.5f, 12.06f, 11.5f, 12.75f)
                close()
            }
        }
        .build()
        return _dragOutlineSm!!
    }

private var _dragOutlineSm: ImageVector? = null
