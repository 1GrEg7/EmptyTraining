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

public val DsIcon.LinkOutlineSm: ImageVector
    get() {
        if (_linkOutlineSm != null) {
            return _linkOutlineSm!!
        }
        _linkOutlineSm = Builder(name = "LinkOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 10.5f)
                curveTo(14.209f, 10.5f, 16.0f, 8.709f, 16.0f, 6.5f)
                curveTo(16.0f, 4.291f, 14.209f, 2.5f, 12.0f, 2.5f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 2.5f, 4.57f, 3.775f, 4.126f, 5.5f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 5.5f, 0.0f, 7.291f, 0.0f, 9.5f)
                curveTo(0.0f, 11.709f, 1.791f, 13.5f, 4.0f, 13.5f)
                horizontalLineTo(8.0f)
                curveTo(9.481f, 13.5f, 10.773f, 12.696f, 11.465f, 11.5f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 11.5f, 2.0f, 10.605f, 2.0f, 9.5f)
                curveTo(2.0f, 8.395f, 2.895f, 7.5f, 4.0f, 7.5f)
                horizontalLineTo(8.0f)
                curveTo(8.74f, 7.5f, 9.387f, 7.902f, 9.732f, 8.5f)
                horizontalLineTo(4.535f)
                curveTo(5.227f, 9.696f, 6.519f, 10.5f, 8.0f, 10.5f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(7.26f, 4.5f, 6.613f, 4.902f, 6.268f, 5.5f)
                horizontalLineTo(8.0f)
                curveTo(9.864f, 5.5f, 11.43f, 6.775f, 11.874f, 8.5f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 8.5f, 14.0f, 7.605f, 14.0f, 6.5f)
                curveTo(14.0f, 5.395f, 13.105f, 4.5f, 12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _linkOutlineSm!!
    }

private var _linkOutlineSm: ImageVector? = null
