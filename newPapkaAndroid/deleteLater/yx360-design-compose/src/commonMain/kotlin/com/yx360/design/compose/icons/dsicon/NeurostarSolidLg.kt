package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.NeurostarSolidLg: ImageVector
    get() {
        if (_neurostarSolidLg != null) {
            return _neurostarSolidLg!!
        }
        _neurostarSolidLg = Builder(name = "NeurostarSolidLg", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.594f, 3.0f)
                horizontalLineTo(16.406f)
                lineTo(20.063f, 11.938f)
                lineTo(29.0f, 15.594f)
                verticalLineTo(16.406f)
                lineTo(20.063f, 20.063f)
                lineTo(16.406f, 29.0f)
                horizontalLineTo(15.594f)
                lineTo(11.938f, 20.063f)
                lineTo(3.0f, 16.406f)
                verticalLineTo(15.594f)
                lineTo(11.938f, 11.938f)
                lineTo(15.594f, 3.0f)
                close()
            }
        }
        .build()
        return _neurostarSolidLg!!
    }

private var _neurostarSolidLg: ImageVector? = null
