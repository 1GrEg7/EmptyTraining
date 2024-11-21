package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.NeurostarSolidSm: ImageVector
    get() {
        if (_neurostarSolidSm != null) {
            return _neurostarSolidSm!!
        }
        _neurostarSolidSm = Builder(name = "NeurostarSolidSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.333f, 5.333f)
                    lineTo(7.667f, 0.0f)
                    horizontalLineTo(8.333f)
                    lineTo(10.667f, 5.333f)
                    lineTo(16.0f, 7.667f)
                    verticalLineTo(8.333f)
                    lineTo(10.667f, 10.667f)
                    lineTo(8.333f, 16.0f)
                    horizontalLineTo(7.667f)
                    lineTo(5.333f, 10.667f)
                    lineTo(0.0f, 8.333f)
                    verticalLineTo(7.667f)
                    lineTo(5.333f, 5.333f)
                    close()
                }
            }
        }
        .build()
        return _neurostarSolidSm!!
    }

private var _neurostarSolidSm: ImageVector? = null
