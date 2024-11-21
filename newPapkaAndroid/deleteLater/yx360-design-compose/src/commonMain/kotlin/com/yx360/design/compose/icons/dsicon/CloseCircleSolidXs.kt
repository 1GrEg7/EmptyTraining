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

public val DsIcon.CloseCircleSolidXs: ImageVector
    get() {
        if (_closeCircleSolidXs != null) {
            return _closeCircleSolidXs!!
        }
        _closeCircleSolidXs = Builder(name = "CloseCircleSolidXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 12.0f)
                    curveTo(9.314f, 12.0f, 12.0f, 9.314f, 12.0f, 6.0f)
                    curveTo(12.0f, 2.686f, 9.314f, 0.0f, 6.0f, 0.0f)
                    curveTo(2.686f, 0.0f, 0.0f, 2.686f, 0.0f, 6.0f)
                    curveTo(0.0f, 9.314f, 2.686f, 12.0f, 6.0f, 12.0f)
                    close()
                    moveTo(8.121f, 2.464f)
                    lineTo(9.536f, 3.879f)
                    lineTo(7.414f, 6.0f)
                    lineTo(9.536f, 8.121f)
                    lineTo(8.121f, 9.536f)
                    lineTo(6.0f, 7.414f)
                    lineTo(3.879f, 9.536f)
                    lineTo(2.465f, 8.121f)
                    lineTo(4.586f, 6.0f)
                    lineTo(2.464f, 3.879f)
                    lineTo(3.879f, 2.464f)
                    lineTo(6.0f, 4.586f)
                    lineTo(8.121f, 2.464f)
                    close()
                }
            }
        }
        .build()
        return _closeCircleSolidXs!!
    }

private var _closeCircleSolidXs: ImageVector? = null
