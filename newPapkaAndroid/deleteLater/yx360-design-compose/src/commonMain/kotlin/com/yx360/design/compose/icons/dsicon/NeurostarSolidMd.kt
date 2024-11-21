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

public val DsIcon.NeurostarSolidMd: ImageVector
    get() {
        if (_neurostarSolidMd != null) {
            return _neurostarSolidMd!!
        }
        _neurostarSolidMd = Builder(name = "NeurostarSolidMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.656f, 1.0f)
                horizontalLineTo(12.344f)
                lineTo(15.438f, 8.563f)
                lineTo(23.0f, 11.656f)
                verticalLineTo(12.344f)
                lineTo(15.438f, 15.438f)
                lineTo(12.344f, 23.0f)
                horizontalLineTo(11.656f)
                lineTo(8.563f, 15.438f)
                lineTo(1.0f, 12.344f)
                verticalLineTo(11.656f)
                lineTo(8.563f, 8.563f)
                lineTo(11.656f, 1.0f)
                close()
            }
        }
        .build()
        return _neurostarSolidMd!!
    }

private var _neurostarSolidMd: ImageVector? = null
