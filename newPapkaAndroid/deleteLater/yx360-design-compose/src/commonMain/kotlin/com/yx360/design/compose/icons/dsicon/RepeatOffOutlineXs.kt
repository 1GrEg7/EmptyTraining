package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.RepeatOffOutlineXs: ImageVector
    get() {
        if (_repeatOffOutlineXs != null) {
            return _repeatOffOutlineXs!!
        }
        _repeatOffOutlineXs = Builder(name = "RepeatOffOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.0f)
                curveTo(1.0f, 5.014f, 1.292f, 4.05f, 1.838f, 3.229f)
                lineTo(2.889f, 4.629f)
                curveTo(2.699f, 5.059f, 2.6f, 5.526f, 2.6f, 6.0f)
                horizontalLineTo(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.337f, 9.335f)
                curveTo(5.704f, 9.408f, 6.078f, 9.419f, 6.445f, 9.371f)
                lineTo(7.495f, 10.771f)
                curveTo(6.698f, 11.021f, 5.848f, 11.068f, 5.025f, 10.904f)
                curveTo(4.158f, 10.731f, 3.354f, 10.333f, 2.693f, 9.75f)
                lineTo(2.009f, 10.476f)
                lineTo(1.268f, 7.2f)
                lineTo(4.405f, 7.934f)
                lineTo(3.792f, 8.585f)
                curveTo(4.233f, 8.962f, 4.765f, 9.221f, 5.337f, 9.335f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.739f, 9.319f)
                lineTo(11.0f, 11.0f)
                horizontalLineTo(8.917f)
                lineTo(1.417f, 1.0f)
                horizontalLineTo(3.5f)
                lineTo(3.861f, 1.481f)
                curveTo(3.935f, 1.446f, 4.01f, 1.412f, 4.087f, 1.381f)
                curveTo(5.0f, 1.002f, 6.006f, 0.903f, 6.975f, 1.096f)
                curveTo(7.879f, 1.276f, 8.715f, 1.702f, 9.39f, 2.325f)
                lineTo(10.137f, 1.663f)
                lineTo(10.581f, 4.992f)
                lineTo(7.523f, 3.98f)
                lineTo(8.184f, 3.394f)
                curveTo(7.748f, 3.028f, 7.225f, 2.777f, 6.663f, 2.665f)
                curveTo(6.057f, 2.545f, 5.43f, 2.592f, 4.85f, 2.8f)
                lineTo(8.75f, 8.0f)
                curveTo(8.776f, 7.963f, 8.802f, 7.926f, 8.827f, 7.889f)
                curveTo(9.201f, 7.33f, 9.4f, 6.672f, 9.4f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 6.989f, 10.707f, 7.956f, 10.157f, 8.778f)
                curveTo(10.03f, 8.968f, 9.89f, 9.149f, 9.739f, 9.319f)
                close()
            }
        }
        .build()
        return _repeatOffOutlineXs!!
    }

private var _repeatOffOutlineXs: ImageVector? = null
