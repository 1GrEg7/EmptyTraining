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

public val DsIcon.SuccessSolidXs: ImageVector
    get() {
        if (_successSolidXs != null) {
            return _successSolidXs!!
        }
        _successSolidXs = Builder(name = "SuccessSolidXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 6.0f)
                    curveTo(12.0f, 9.314f, 9.314f, 12.0f, 6.0f, 12.0f)
                    curveTo(2.686f, 12.0f, 0.0f, 9.314f, 0.0f, 6.0f)
                    curveTo(0.0f, 2.686f, 2.686f, 0.0f, 6.0f, 0.0f)
                    curveTo(9.314f, 0.0f, 12.0f, 2.686f, 12.0f, 6.0f)
                    close()
                    moveTo(8.054f, 3.286f)
                    lineTo(9.469f, 4.73f)
                    lineTo(5.286f, 9.0f)
                    lineTo(2.597f, 6.255f)
                    lineTo(4.011f, 4.811f)
                    lineTo(5.286f, 6.112f)
                    lineTo(8.054f, 3.286f)
                    close()
                }
            }
        }
        .build()
        return _successSolidXs!!
    }

private var _successSolidXs: ImageVector? = null
