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

public val DsIcon.LinkOutlineMd: ImageVector
    get() {
        if (_linkOutlineMd != null) {
            return _linkOutlineMd!!
        }
        _linkOutlineMd = Builder(name = "LinkOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 15.0f)
                curveTo(21.761f, 15.0f, 24.0f, 12.761f, 24.0f, 10.0f)
                curveTo(24.0f, 7.239f, 21.761f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(10.581f, 5.0f, 8.563f, 6.718f, 8.1f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(2.239f, 9.0f, 0.0f, 11.239f, 0.0f, 14.0f)
                curveTo(0.0f, 16.761f, 2.239f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(11.0f)
                curveTo(13.05f, 19.0f, 14.812f, 17.766f, 15.584f, 16.0f)
                horizontalLineTo(13.236f)
                curveTo(12.687f, 16.614f, 11.889f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 17.0f, 2.0f, 15.657f, 2.0f, 14.0f)
                curveTo(2.0f, 12.343f, 3.343f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(11.0f)
                curveTo(12.306f, 11.0f, 13.417f, 11.835f, 13.829f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(12.111f, 13.0f, 11.313f, 12.614f, 10.764f, 12.0f)
                horizontalLineTo(8.416f)
                curveTo(9.188f, 13.766f, 10.95f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(11.694f, 7.0f, 10.583f, 7.835f, 10.171f, 9.0f)
                horizontalLineTo(11.0f)
                curveTo(13.419f, 9.0f, 15.437f, 10.718f, 15.9f, 13.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 13.0f, 22.0f, 11.657f, 22.0f, 10.0f)
                curveTo(22.0f, 8.343f, 20.657f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return _linkOutlineMd!!
    }

private var _linkOutlineMd: ImageVector? = null
