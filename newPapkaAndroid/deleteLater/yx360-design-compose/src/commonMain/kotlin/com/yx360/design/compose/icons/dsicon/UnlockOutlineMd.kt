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

public val DsIcon.UnlockOutlineMd: ImageVector
    get() {
        if (_unlockOutlineMd != null) {
            return _unlockOutlineMd!!
        }
        _unlockOutlineMd = Builder(name = "UnlockOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(9.239f, 2.0f, 7.0f, 4.239f, 7.0f, 7.0f)
                verticalLineTo(11.126f)
                curveTo(5.275f, 11.57f, 4.0f, 13.136f, 4.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 20.209f, 5.791f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.209f, 22.0f, 20.0f, 20.209f, 20.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 12.791f, 18.209f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                curveTo(9.0f, 5.343f, 10.343f, 4.0f, 12.0f, 4.0f)
                curveTo(13.657f, 4.0f, 15.0f, 5.343f, 15.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 4.239f, 14.761f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 19.105f, 17.105f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.895f, 20.0f, 6.0f, 19.105f, 6.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.895f, 6.895f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 13.0f, 18.0f, 13.895f, 18.0f, 15.0f)
                close()
            }
        }
        .build()
        return _unlockOutlineMd!!
    }

private var _unlockOutlineMd: ImageVector? = null
