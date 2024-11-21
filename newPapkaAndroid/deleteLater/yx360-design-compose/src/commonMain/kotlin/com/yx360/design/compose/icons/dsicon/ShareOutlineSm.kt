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

public val DsIcon.ShareOutlineSm: ImageVector
    get() {
        if (_shareOutlineSm != null) {
            return _shareOutlineSm!!
        }
        _shareOutlineSm = Builder(name = "ShareOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 11.102f)
                curveTo(4.45f, 11.285f, 3.325f, 11.735f, 2.071f, 12.59f)
                curveTo(1.884f, 12.718f, 1.694f, 12.854f, 1.5f, 13.0f)
                horizontalLineTo(0.0f)
                curveTo(0.078f, 12.295f, 0.193f, 11.627f, 0.353f, 11.0f)
                curveTo(1.212f, 7.622f, 3.361f, 5.422f, 8.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.5f)
                lineTo(15.5f, 8.0f)
                lineTo(9.5f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                curveTo(7.25f, 11.0f, 6.594f, 11.031f, 6.0f, 11.102f)
                close()
                moveTo(9.83f, 11.412f)
                lineTo(10.0f, 9.836f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                curveTo(6.398f, 9.0f, 5.048f, 9.132f, 3.778f, 9.529f)
                curveTo(3.477f, 9.623f, 2.775f, 10.073f, 2.337f, 10.462f)
                curveTo(2.662f, 9.733f, 3.342f, 9.134f, 3.605f, 8.845f)
                curveTo(4.426f, 7.942f, 5.775f, 7.211f, 8.181f, 6.992f)
                lineTo(10.0f, 6.826f)
                verticalLineTo(6.077f)
                lineTo(9.824f, 4.709f)
                curveTo(10.254f, 5.345f, 10.735f, 5.946f, 11.261f, 6.504f)
                lineTo(12.672f, 8.0f)
                lineTo(11.614f, 9.132f)
                curveTo(10.953f, 9.839f, 10.356f, 10.601f, 9.83f, 11.412f)
                close()
            }
        }
        .build()
        return _shareOutlineSm!!
    }

private var _shareOutlineSm: ImageVector? = null
