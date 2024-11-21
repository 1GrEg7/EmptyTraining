package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CloudOffOutlineXs: ImageVector
    get() {
        if (_cloudOffOutlineXs != null) {
            return _cloudOffOutlineXs!!
        }
        _cloudOffOutlineXs = Builder(name = "CloudOffOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.0f, 0.0f)
                    horizontalLineTo(2.0f)
                    lineTo(3.193f, 2.045f)
                    curveTo(2.648f, 2.618f, 2.303f, 3.383f, 2.273f, 4.229f)
                    curveTo(0.945f, 4.725f, 0.0f, 6.005f, 0.0f, 7.505f)
                    curveTo(0.0f, 9.436f, 1.565f, 11.002f, 3.496f, 11.002f)
                    curveTo(3.514f, 11.002f, 3.532f, 11.002f, 3.549f, 11.001f)
                    lineTo(8.418f, 11.002f)
                    lineTo(9.0f, 12.0f)
                    horizontalLineTo(11.0f)
                    lineTo(4.0f, 0.0f)
                    close()
                    moveTo(4.313f, 3.965f)
                    curveTo(4.277f, 4.088f, 4.257f, 4.218f, 4.257f, 4.353f)
                    curveTo(4.257f, 4.714f, 4.398f, 5.042f, 4.628f, 5.286f)
                    lineTo(4.116f, 5.985f)
                    curveTo(3.941f, 5.917f, 3.751f, 5.88f, 3.551f, 5.88f)
                    curveTo(2.69f, 5.88f, 1.991f, 6.578f, 1.991f, 7.44f)
                    curveTo(1.991f, 8.302f, 2.69f, 9.0f, 3.551f, 9.0f)
                    curveTo(3.566f, 9.0f, 3.58f, 9.0f, 3.595f, 8.999f)
                    horizontalLineTo(7.25f)
                    lineTo(4.313f, 3.965f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.98f, 7.135f)
                    curveTo(9.98f, 7.291f, 9.961f, 7.442f, 9.925f, 7.587f)
                    lineTo(11.115f, 9.626f)
                    curveTo(11.665f, 8.966f, 11.996f, 8.118f, 11.996f, 7.193f)
                    curveTo(11.996f, 5.315f, 10.634f, 3.754f, 8.841f, 3.441f)
                    curveTo(8.487f, 2.187f, 7.421f, 1.232f, 6.107f, 1.04f)
                    lineTo(8.61f, 5.332f)
                    curveTo(9.4f, 5.551f, 9.98f, 6.275f, 9.98f, 7.135f)
                    close()
                }
            }
        }
        .build()
        return _cloudOffOutlineXs!!
    }

private var _cloudOffOutlineXs: ImageVector? = null
