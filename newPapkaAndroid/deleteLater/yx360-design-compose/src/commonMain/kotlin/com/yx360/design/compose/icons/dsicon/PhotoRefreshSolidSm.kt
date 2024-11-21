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

public val DsIcon.PhotoRefreshSolidSm: ImageVector
    get() {
        if (_photoRefreshSolidSm != null) {
            return _photoRefreshSolidSm!!
        }
        _photoRefreshSolidSm = Builder(name = "PhotoRefreshSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.304f, 3.285f)
                    curveTo(1.71f, 2.99f, 2.234f, 2.818f, 3.282f, 2.473f)
                    lineTo(3.6f, 2.368f)
                    lineTo(3.805f, 1.964f)
                    curveTo(4.126f, 1.331f, 4.286f, 1.014f, 4.512f, 0.771f)
                    curveTo(4.812f, 0.446f, 5.199f, 0.21f, 5.627f, 0.09f)
                    curveTo(5.949f, 0.0f, 6.308f, 0.0f, 7.025f, 0.0f)
                    horizontalLineTo(8.975f)
                    curveTo(9.692f, 0.0f, 10.051f, 0.0f, 10.373f, 0.09f)
                    curveTo(10.801f, 0.21f, 11.188f, 0.446f, 11.488f, 0.771f)
                    curveTo(11.804f, 1.112f, 12.011f, 1.551f, 12.212f, 1.978f)
                    curveTo(12.274f, 2.11f, 12.336f, 2.242f, 12.4f, 2.368f)
                    curveTo(12.566f, 2.423f, 12.736f, 2.474f, 12.908f, 2.526f)
                    curveTo(13.532f, 2.714f, 14.178f, 2.909f, 14.696f, 3.285f)
                    curveTo(15.237f, 3.677f, 15.639f, 4.228f, 15.845f, 4.859f)
                    curveTo(16.0f, 5.332f, 16.0f, 6.015f, 16.0f, 7.105f)
                    verticalLineTo(10.263f)
                    curveTo(16.0f, 11.735f, 16.0f, 12.47f, 15.756f, 13.051f)
                    curveTo(15.432f, 13.824f, 14.809f, 14.439f, 14.025f, 14.76f)
                    curveTo(13.436f, 15.0f, 12.691f, 15.0f, 11.2f, 15.0f)
                    horizontalLineTo(4.8f)
                    curveTo(3.309f, 15.0f, 2.563f, 15.0f, 1.975f, 14.76f)
                    curveTo(1.191f, 14.439f, 0.568f, 13.824f, 0.244f, 13.051f)
                    curveTo(0.0f, 12.47f, 0.0f, 11.735f, 0.0f, 10.263f)
                    verticalLineTo(7.105f)
                    curveTo(0.0f, 6.015f, 0.0f, 5.332f, 0.155f, 4.859f)
                    curveTo(0.361f, 4.228f, 0.763f, 3.677f, 1.304f, 3.285f)
                    close()
                    moveTo(5.425f, 8.347f)
                    curveTo(5.425f, 6.946f, 6.576f, 5.811f, 7.995f, 5.811f)
                    curveTo(8.461f, 5.811f, 8.897f, 5.933f, 9.274f, 6.146f)
                    lineTo(8.835f, 6.627f)
                    lineTo(11.866f, 7.064f)
                    lineTo(11.091f, 4.155f)
                    lineTo(10.494f, 4.809f)
                    curveTo(9.786f, 4.321f, 8.923f, 4.034f, 7.995f, 4.034f)
                    curveTo(5.581f, 4.034f, 3.625f, 5.965f, 3.625f, 8.347f)
                    horizontalLineTo(5.425f)
                    close()
                    moveTo(10.574f, 8.309f)
                    curveTo(10.574f, 9.719f, 9.405f, 10.883f, 7.995f, 10.883f)
                    curveTo(7.459f, 10.883f, 6.962f, 10.722f, 6.551f, 10.445f)
                    lineTo(6.973f, 9.796f)
                    lineTo(3.902f, 9.796f)
                    lineTo(5.153f, 12.596f)
                    lineTo(5.579f, 11.94f)
                    curveTo(6.271f, 12.394f, 7.102f, 12.659f, 7.995f, 12.659f)
                    curveTo(10.418f, 12.659f, 12.374f, 10.681f, 12.374f, 8.309f)
                    horizontalLineTo(10.574f)
                    close()
                }
            }
        }
        .build()
        return _photoRefreshSolidSm!!
    }

private var _photoRefreshSolidSm: ImageVector? = null
