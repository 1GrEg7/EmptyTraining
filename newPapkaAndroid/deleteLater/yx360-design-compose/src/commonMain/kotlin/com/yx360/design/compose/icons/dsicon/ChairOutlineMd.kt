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

public val DsIcon.ChairOutlineMd: ImageVector
    get() {
        if (_chairOutlineMd != null) {
            return _chairOutlineMd!!
        }
        _chairOutlineMd = Builder(name = "ChairOutlineMd", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.479f, 0.0f)
                    curveTo(4.475f, 0.0f, 2.997f, 1.808f, 3.459f, 3.692f)
                    lineTo(3.947f, 5.682f)
                    curveTo(4.083f, 6.237f, 4.148f, 6.804f, 4.141f, 7.369f)
                    lineTo(3.154f, 7.051f)
                    lineTo(2.5f, 8.949f)
                    lineTo(3.482f, 9.265f)
                    lineTo(3.672f, 10.182f)
                    curveTo(3.674f, 10.191f, 3.676f, 10.2f, 3.677f, 10.209f)
                    lineTo(3.715f, 10.392f)
                    curveTo(3.909f, 11.327f, 4.758f, 12.0f, 5.744f, 12.0f)
                    horizontalLineTo(6.965f)
                    verticalLineTo(12.926f)
                    curveTo(6.46f, 12.978f, 5.969f, 13.069f, 5.539f, 13.208f)
                    curveTo(5.182f, 13.323f, 4.801f, 13.491f, 4.49f, 13.749f)
                    curveTo(4.419f, 13.807f, 4.349f, 13.873f, 4.283f, 13.947f)
                    curveTo(4.036f, 14.207f, 3.862f, 14.55f, 3.862f, 15.0f)
                    verticalLineTo(15.999f)
                    lineTo(5.931f, 16.0f)
                    verticalLineTo(15.238f)
                    curveTo(5.961f, 15.227f, 5.996f, 15.215f, 6.039f, 15.201f)
                    curveTo(6.258f, 15.133f, 6.566f, 15.077f, 6.965f, 15.041f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(9.035f)
                    verticalLineTo(15.041f)
                    curveTo(9.434f, 15.077f, 9.742f, 15.133f, 9.961f, 15.201f)
                    curveTo(10.004f, 15.215f, 10.04f, 15.227f, 10.069f, 15.238f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(12.138f)
                    verticalLineTo(15.0f)
                    lineTo(12.138f, 14.997f)
                    curveTo(12.137f, 14.548f, 11.963f, 14.206f, 11.717f, 13.946f)
                    curveTo(11.651f, 13.873f, 11.581f, 13.807f, 11.51f, 13.749f)
                    curveTo(11.2f, 13.491f, 10.818f, 13.323f, 10.461f, 13.208f)
                    curveTo(10.031f, 13.069f, 9.54f, 12.978f, 9.035f, 12.926f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(10.256f)
                    curveTo(11.242f, 12.0f, 12.091f, 11.327f, 12.285f, 10.392f)
                    lineTo(12.321f, 10.215f)
                    curveTo(12.324f, 10.202f, 12.327f, 10.189f, 12.33f, 10.175f)
                    lineTo(12.518f, 9.265f)
                    lineTo(13.5f, 8.949f)
                    lineTo(12.846f, 7.051f)
                    lineTo(11.859f, 7.369f)
                    curveTo(11.852f, 6.804f, 11.917f, 6.237f, 12.054f, 5.682f)
                    lineTo(12.541f, 3.692f)
                    curveTo(13.003f, 1.808f, 11.525f, 0.0f, 9.521f, 0.0f)
                    horizontalLineTo(6.479f)
                    close()
                    moveTo(10.219f, 10.0f)
                    curveTo(9.715f, 8.454f, 9.652f, 6.802f, 10.04f, 5.22f)
                    lineTo(10.528f, 3.231f)
                    curveTo(10.682f, 2.603f, 10.189f, 2.0f, 9.521f, 2.0f)
                    horizontalLineTo(6.479f)
                    curveTo(5.811f, 2.0f, 5.318f, 2.603f, 5.472f, 3.231f)
                    lineTo(5.96f, 5.22f)
                    curveTo(6.348f, 6.802f, 6.285f, 8.454f, 5.781f, 10.0f)
                    lineTo(10.219f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _chairOutlineMd!!
    }

private var _chairOutlineMd: ImageVector? = null
