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

public val DsIcon.CompassOutlineMd: ImageVector
    get() {
        if (_compassOutlineMd != null) {
            return _compassOutlineMd!!
        }
        _compassOutlineMd = Builder(name = "CompassOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(17.0f, 7.5f)
                lineTo(14.475f, 14.475f)
                lineTo(7.5f, 17.0f)
                lineTo(7.0f, 16.5f)
                lineTo(9.525f, 9.525f)
                lineTo(16.5f, 7.0f)
                lineTo(17.0f, 7.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.829f, 10.5f, 12.0f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12.0f, 10.5f)
                curveTo(12.829f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                curveTo(13.5f, 12.829f, 12.829f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _compassOutlineMd!!
    }

private var _compassOutlineMd: ImageVector? = null
