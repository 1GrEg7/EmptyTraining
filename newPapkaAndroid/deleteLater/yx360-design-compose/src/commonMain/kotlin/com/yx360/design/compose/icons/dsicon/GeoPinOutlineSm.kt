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

public val DsIcon.GeoPinOutlineSm: ImageVector
    get() {
        if (_geoPinOutlineSm != null) {
            return _geoPinOutlineSm!!
        }
        _geoPinOutlineSm = Builder(name = "GeoPinOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                curveTo(9.105f, 8.5f, 10.0f, 7.605f, 10.0f, 6.5f)
                curveTo(10.0f, 5.395f, 9.105f, 4.5f, 8.0f, 4.5f)
                curveTo(6.895f, 4.5f, 6.0f, 5.395f, 6.0f, 6.5f)
                curveTo(6.0f, 7.605f, 6.895f, 8.5f, 8.0f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 6.6f)
                curveTo(14.5f, 2.9f, 11.5f, 0.0f, 8.0f, 0.0f)
                curveTo(4.5f, 0.0f, 1.5f, 2.9f, 1.5f, 6.6f)
                curveTo(1.561f, 9.775f, 3.039f, 10.974f, 4.522f, 12.178f)
                curveTo(5.468f, 12.945f, 6.416f, 13.715f, 7.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.582f, 13.719f, 10.526f, 12.965f, 11.47f, 12.212f)
                curveTo(12.956f, 11.026f, 14.439f, 9.842f, 14.5f, 6.6f)
                close()
                moveTo(3.5f, 6.6f)
                curveTo(3.5f, 4.0f, 5.6f, 2.0f, 8.0f, 2.0f)
                curveTo(10.4f, 2.0f, 12.5f, 4.0f, 12.5f, 6.6f)
                curveTo(12.434f, 8.967f, 11.245f, 9.907f, 9.954f, 10.927f)
                curveTo(9.282f, 11.459f, 8.582f, 12.012f, 8.0f, 12.8f)
                curveTo(7.418f, 12.012f, 6.718f, 11.459f, 6.046f, 10.927f)
                curveTo(4.755f, 9.907f, 3.566f, 8.967f, 3.5f, 6.6f)
                close()
            }
        }
        .build()
        return _geoPinOutlineSm!!
    }

private var _geoPinOutlineSm: ImageVector? = null
