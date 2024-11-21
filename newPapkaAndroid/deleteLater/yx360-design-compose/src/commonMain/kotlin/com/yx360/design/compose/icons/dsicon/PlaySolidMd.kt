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

public val DsIcon.PlaySolidMd: ImageVector
    get() {
        if (_playSolidMd != null) {
            return _playSolidMd!!
        }
        _playSolidMd = Builder(name = "PlaySolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.647f, 8.909f)
                curveTo(20.642f, 9.764f, 21.366f, 10.726f, 21.366f, 12.0f)
                curveTo(21.366f, 13.274f, 20.642f, 14.235f, 19.647f, 15.091f)
                curveTo(18.678f, 15.925f, 17.259f, 16.821f, 15.498f, 17.933f)
                lineTo(13.763f, 19.029f)
                curveTo(11.774f, 20.286f, 10.182f, 21.291f, 8.89f, 21.862f)
                curveTo(7.578f, 22.442f, 6.288f, 22.705f, 5.081f, 22.04f)
                curveTo(3.874f, 21.375f, 3.407f, 20.144f, 3.197f, 18.725f)
                curveTo(2.99f, 17.327f, 2.99f, 15.445f, 2.99f, 13.091f)
                lineTo(2.99f, 10.909f)
                curveTo(2.99f, 8.555f, 2.99f, 6.672f, 3.197f, 5.275f)
                curveTo(3.407f, 3.856f, 3.874f, 2.625f, 5.081f, 1.96f)
                curveTo(6.288f, 1.294f, 7.578f, 1.557f, 8.89f, 2.138f)
                curveTo(10.182f, 2.709f, 11.774f, 3.714f, 13.763f, 4.971f)
                lineTo(15.498f, 6.067f)
                curveTo(17.259f, 7.179f, 18.678f, 8.075f, 19.647f, 8.909f)
                close()
            }
        }
        .build()
        return _playSolidMd!!
    }

private var _playSolidMd: ImageVector? = null
