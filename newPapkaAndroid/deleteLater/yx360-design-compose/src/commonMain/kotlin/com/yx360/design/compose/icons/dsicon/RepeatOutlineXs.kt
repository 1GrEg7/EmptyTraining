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

public val DsIcon.RepeatOutlineXs: ImageVector
    get() {
        if (_repeatOutlineXs != null) {
            return _repeatOutlineXs!!
        }
        _repeatOutlineXs = Builder(name = "RepeatOutlineXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.843f, 3.222f)
                curveTo(1.293f, 4.044f, 1.0f, 5.011f, 1.0f, 6.0f)
                horizontalLineTo(2.6f)
                curveTo(2.6f, 5.328f, 2.799f, 4.67f, 3.173f, 4.111f)
                curveTo(3.547f, 3.552f, 4.078f, 3.116f, 4.699f, 2.859f)
                curveTo(5.32f, 2.601f, 6.004f, 2.534f, 6.663f, 2.665f)
                curveTo(7.225f, 2.777f, 7.748f, 3.028f, 8.184f, 3.394f)
                lineTo(7.523f, 3.98f)
                lineTo(10.581f, 4.992f)
                lineTo(10.137f, 1.663f)
                lineTo(9.39f, 2.325f)
                curveTo(8.715f, 1.702f, 7.879f, 1.276f, 6.975f, 1.096f)
                curveTo(6.006f, 0.903f, 5.0f, 1.002f, 4.087f, 1.381f)
                curveTo(3.173f, 1.759f, 2.392f, 2.4f, 1.843f, 3.222f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.157f, 8.778f)
                curveTo(10.707f, 7.956f, 11.0f, 6.989f, 11.0f, 6.0f)
                horizontalLineTo(9.4f)
                curveTo(9.4f, 6.672f, 9.201f, 7.33f, 8.827f, 7.889f)
                curveTo(8.453f, 8.448f, 7.922f, 8.884f, 7.301f, 9.141f)
                curveTo(6.68f, 9.399f, 5.996f, 9.466f, 5.337f, 9.335f)
                curveTo(4.765f, 9.221f, 4.233f, 8.962f, 3.792f, 8.585f)
                lineTo(4.405f, 7.934f)
                lineTo(1.268f, 7.2f)
                lineTo(2.009f, 10.476f)
                lineTo(2.693f, 9.75f)
                curveTo(3.354f, 10.333f, 4.158f, 10.731f, 5.025f, 10.904f)
                curveTo(5.994f, 11.097f, 7.0f, 10.998f, 7.913f, 10.619f)
                curveTo(8.827f, 10.241f, 9.608f, 9.6f, 10.157f, 8.778f)
                close()
            }
        }
        .build()
        return _repeatOutlineXs!!
    }

private var _repeatOutlineXs: ImageVector? = null
