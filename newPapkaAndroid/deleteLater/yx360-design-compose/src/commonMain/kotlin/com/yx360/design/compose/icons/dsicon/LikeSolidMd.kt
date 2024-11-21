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

public val DsIcon.LikeSolidMd: ImageVector
    get() {
        if (_likeSolidMd != null) {
            return _likeSolidMd!!
        }
        _likeSolidMd = Builder(name = "LikeSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(19.5f)
                curveTo(21.001f, 9.0f, 21.49f, 9.92f, 21.5f, 11.0f)
                curveTo(21.45f, 11.809f, 21.092f, 12.447f, 20.5f, 13.0f)
                curveTo(20.536f, 13.1f, 20.573f, 13.193f, 20.609f, 13.284f)
                curveTo(20.801f, 13.769f, 20.961f, 14.172f, 20.75f, 15.015f)
                curveTo(20.5f, 16.015f, 19.5f, 16.75f, 19.5f, 16.75f)
                curveTo(19.5f, 16.75f, 19.192f, 18.005f, 17.994f, 18.995f)
                curveTo(16.795f, 19.984f, 16.0f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(12.006f)
                curveTo(10.475f, 20.0f, 8.778f, 19.384f, 7.5f, 18.015f)
                curveTo(7.5f, 18.015f, 7.0f, 17.0f, 7.0f, 15.0f)
                curveTo(7.0f, 13.0f, 7.5f, 11.5f, 7.5f, 11.5f)
                curveTo(9.58f, 8.516f, 11.448f, 4.595f, 12.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(15.5f, 1.0f, 15.62f, 4.036f, 15.62f, 5.0f)
                curveTo(15.62f, 5.964f, 15.307f, 7.684f, 15.0f, 9.0f)
                close()
                moveTo(2.0f, 15.011f)
                curveTo(2.0f, 17.741f, 2.9f, 20.011f, 4.0f, 20.011f)
                horizontalLineTo(7.0f)
                curveTo(6.0f, 19.011f, 5.5f, 17.011f, 5.5f, 15.011f)
                curveTo(5.5f, 13.011f, 6.0f, 11.011f, 7.0f, 10.011f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 10.011f, 2.0f, 12.281f, 2.0f, 15.011f)
                close()
            }
        }
        .build()
        return _likeSolidMd!!
    }

private var _likeSolidMd: ImageVector? = null
