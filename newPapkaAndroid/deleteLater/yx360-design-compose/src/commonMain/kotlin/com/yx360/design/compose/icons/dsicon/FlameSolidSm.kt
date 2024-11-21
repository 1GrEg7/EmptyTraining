package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.FlameSolidSm: ImageVector
    get() {
        if (_flameSolidSm != null) {
            return _flameSolidSm!!
        }
        _flameSolidSm = Builder(name = "FlameSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.056f, 4.571f)
                    curveTo(6.782f, 3.296f, 8.0f, 1.143f, 8.778f, 0.0f)
                    horizontalLineTo(9.556f)
                    curveTo(10.952f, 1.368f, 12.424f, 3.168f, 13.389f, 4.81f)
                    curveTo(14.351f, 6.446f, 15.0f, 8.199f, 15.0f, 9.905f)
                    curveTo(15.0f, 13.396f, 12.278f, 16.0f, 9.556f, 16.0f)
                    lineTo(9.167f, 15.238f)
                    curveTo(10.333f, 14.857f, 11.111f, 13.714f, 11.111f, 12.191f)
                    curveTo(11.111f, 10.179f, 9.105f, 7.962f, 8.0f, 6.857f)
                    curveTo(6.895f, 7.962f, 4.889f, 10.286f, 4.889f, 12.191f)
                    curveTo(4.889f, 13.714f, 6.056f, 14.857f, 6.833f, 15.238f)
                    lineTo(6.444f, 16.0f)
                    curveTo(3.722f, 16.0f, 1.0f, 13.396f, 1.0f, 9.905f)
                    curveTo(1.0f, 6.596f, 2.926f, 3.834f, 4.111f, 2.286f)
                    horizontalLineTo(4.889f)
                    lineTo(6.056f, 4.571f)
                    close()
                }
            }
        }
        .build()
        return _flameSolidSm!!
    }

private var _flameSolidSm: ImageVector? = null
