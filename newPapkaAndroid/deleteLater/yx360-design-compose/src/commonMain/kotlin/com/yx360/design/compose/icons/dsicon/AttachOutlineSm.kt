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

public val DsIcon.AttachOutlineSm: ImageVector
    get() {
        if (_attachOutlineSm != null) {
            return _attachOutlineSm!!
        }
        _attachOutlineSm = Builder(name = "AttachOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.959f, 2.031f)
                curveTo(8.504f, 0.485f, 11.01f, 0.485f, 12.555f, 2.031f)
                curveTo(14.101f, 3.576f, 14.101f, 6.082f, 12.555f, 7.627f)
                lineTo(9.375f, 10.807f)
                curveTo(8.398f, 11.784f, 6.814f, 11.784f, 5.837f, 10.807f)
                curveTo(4.86f, 9.83f, 4.86f, 8.246f, 5.837f, 7.269f)
                lineTo(8.714f, 4.392f)
                lineTo(10.128f, 5.807f)
                lineTo(7.252f, 8.683f)
                curveTo(7.056f, 8.879f, 7.056f, 9.197f, 7.252f, 9.393f)
                curveTo(7.447f, 9.589f, 7.765f, 9.589f, 7.961f, 9.393f)
                lineTo(11.141f, 6.213f)
                curveTo(11.905f, 5.448f, 11.905f, 4.209f, 11.141f, 3.445f)
                curveTo(10.377f, 2.68f, 9.137f, 2.68f, 8.373f, 3.445f)
                lineTo(5.107f, 6.711f)
                curveTo(3.782f, 8.036f, 3.782f, 10.183f, 5.107f, 11.508f)
                curveTo(6.431f, 12.832f, 8.579f, 12.832f, 9.903f, 11.508f)
                lineTo(10.437f, 10.973f)
                lineTo(11.852f, 12.388f)
                lineTo(11.317f, 12.922f)
                curveTo(9.212f, 15.027f, 5.798f, 15.027f, 3.692f, 12.922f)
                curveTo(1.587f, 10.816f, 1.587f, 7.402f, 3.692f, 5.297f)
                lineTo(6.959f, 2.031f)
                close()
            }
        }
        .build()
        return _attachOutlineSm!!
    }

private var _attachOutlineSm: ImageVector? = null
