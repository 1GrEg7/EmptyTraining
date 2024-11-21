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

public val DsIcon.CameraSolidSm: ImageVector
    get() {
        if (_cameraSolidSm != null) {
            return _cameraSolidSm!!
        }
        _cameraSolidSm = Builder(name = "CameraSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.983f, 2.0f)
                horizontalLineTo(7.966f)
                curveTo(10.1f, 2.0f, 11.843f, 3.686f, 11.945f, 5.803f)
                lineTo(14.366f, 4.101f)
                curveTo(15.026f, 3.638f, 15.932f, 4.112f, 15.932f, 4.921f)
                curveTo(15.932f, 4.921f, 16.0f, 5.556f, 16.0f, 8.017f)
                curveTo(16.0f, 10.479f, 15.932f, 11.079f, 15.932f, 11.079f)
                curveTo(15.932f, 11.888f, 15.026f, 12.363f, 14.366f, 11.899f)
                lineTo(11.945f, 10.197f)
                curveTo(11.843f, 12.314f, 10.1f, 14.0f, 7.966f, 14.0f)
                horizontalLineTo(3.983f)
                curveTo(1.783f, 14.0f, 0.0f, 12.209f, 0.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(0.0f, 3.791f, 1.783f, 2.0f, 3.983f, 2.0f)
                close()
            }
        }
        .build()
        return _cameraSolidSm!!
    }

private var _cameraSolidSm: ImageVector? = null
