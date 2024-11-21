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

public val DsIcon.SherifSolidSm: ImageVector
    get() {
        if (_sherifSolidSm != null) {
            return _sherifSolidSm!!
        }
        _sherifSolidSm = Builder(name = "SherifSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.479f, 1.498f)
                curveTo(6.419f, 1.091f, 6.893f, 0.503f, 6.996f, 0.0f)
                horizontalLineTo(9.033f)
                curveTo(9.136f, 0.507f, 9.608f, 1.094f, 10.537f, 1.499f)
                curveTo(11.447f, 1.896f, 12.692f, 2.061f, 14.065f, 1.778f)
                lineTo(15.0f, 3.476f)
                curveTo(14.778f, 3.68f, 14.221f, 4.507f, 14.395f, 5.478f)
                curveTo(14.409f, 5.558f, 14.448f, 5.688f, 14.499f, 5.859f)
                curveTo(14.839f, 6.994f, 15.726f, 9.957f, 13.683f, 12.52f)
                curveTo(12.286f, 14.272f, 9.869f, 15.341f, 8.358f, 15.875f)
                lineTo(8.004f, 16.0f)
                lineTo(7.65f, 15.878f)
                curveTo(6.16f, 15.364f, 3.713f, 14.272f, 2.317f, 12.52f)
                curveTo(0.274f, 9.957f, 1.161f, 6.994f, 1.501f, 5.859f)
                curveTo(1.552f, 5.688f, 1.591f, 5.558f, 1.605f, 5.478f)
                curveTo(1.779f, 4.508f, 1.222f, 3.68f, 1.0f, 3.476f)
                lineTo(1.935f, 1.778f)
                curveTo(3.307f, 2.061f, 4.561f, 1.896f, 5.479f, 1.498f)
                close()
                moveTo(9.325f, 6.148f)
                lineTo(8.0f, 3.908f)
                lineTo(6.675f, 6.148f)
                lineTo(4.051f, 6.668f)
                lineTo(5.856f, 8.572f)
                lineTo(5.559f, 11.134f)
                lineTo(8.0f, 10.071f)
                lineTo(10.44f, 11.134f)
                lineTo(10.144f, 8.572f)
                lineTo(11.949f, 6.668f)
                lineTo(9.325f, 6.148f)
                close()
            }
        }
        .build()
        return _sherifSolidSm!!
    }

private var _sherifSolidSm: ImageVector? = null
