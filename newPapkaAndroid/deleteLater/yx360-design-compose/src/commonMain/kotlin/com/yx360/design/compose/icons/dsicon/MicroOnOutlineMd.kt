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

public val DsIcon.MicroOnOutlineMd: ImageVector
    get() {
        if (_microOnOutlineMd != null) {
            return _microOnOutlineMd!!
        }
        _microOnOutlineMd = Builder(name = "MicroOnOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(9.239f, 2.0f, 7.0f, 4.239f, 7.0f, 7.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 13.761f, 9.239f, 16.0f, 12.0f, 16.0f)
                curveTo(14.761f, 16.0f, 17.0f, 13.761f, 17.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 4.239f, 14.761f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 5.343f, 13.657f, 4.0f, 12.0f, 4.0f)
                curveTo(10.343f, 4.0f, 9.0f, 5.343f, 9.0f, 7.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 12.657f, 10.343f, 14.0f, 12.0f, 14.0f)
                curveTo(13.657f, 14.0f, 15.0f, 12.657f, 15.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.612f, 19.894f)
                lineTo(11.0f, 23.0f)
                horizontalLineTo(13.0f)
                lineTo(13.388f, 19.894f)
                curveTo(17.7f, 19.226f, 21.0f, 15.498f, 21.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 14.866f, 15.866f, 18.0f, 12.0f, 18.0f)
                curveTo(8.134f, 18.0f, 5.0f, 14.866f, 5.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 15.498f, 6.3f, 19.226f, 10.612f, 19.894f)
                close()
            }
        }
        .build()
        return _microOnOutlineMd!!
    }

private var _microOnOutlineMd: ImageVector? = null
