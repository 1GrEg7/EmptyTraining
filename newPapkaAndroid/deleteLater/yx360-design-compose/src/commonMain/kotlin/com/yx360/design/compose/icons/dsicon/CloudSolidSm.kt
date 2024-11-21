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

public val DsIcon.CloudSolidSm: ImageVector
    get() {
        if (_cloudSolidSm != null) {
            return _cloudSolidSm!!
        }
        _cloudSolidSm = Builder(name = "CloudSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.273f, 5.091f)
                    curveTo(11.183f, 4.094f, 10.723f, 3.166f, 9.982f, 2.493f)
                    curveTo(9.241f, 1.819f, 8.274f, 1.449f, 7.273f, 1.455f)
                    curveTo(6.212f, 1.455f, 5.194f, 1.876f, 4.444f, 2.626f)
                    curveTo(3.694f, 3.376f, 3.273f, 4.394f, 3.273f, 5.455f)
                    curveTo(3.272f, 5.839f, 3.329f, 6.221f, 3.44f, 6.589f)
                    curveTo(2.487f, 6.725f, 1.615f, 7.2f, 0.983f, 7.927f)
                    curveTo(0.352f, 8.653f, 0.003f, 9.583f, 0.0f, 10.546f)
                    curveTo(0.0f, 11.606f, 0.421f, 12.624f, 1.172f, 13.374f)
                    curveTo(1.922f, 14.124f, 2.939f, 14.546f, 4.0f, 14.546f)
                    horizontalLineTo(11.273f)
                    curveTo(12.526f, 14.546f, 13.729f, 14.047f, 14.615f, 13.161f)
                    curveTo(15.502f, 12.274f, 16.0f, 11.072f, 16.0f, 9.818f)
                    curveTo(16.0f, 8.565f, 15.502f, 7.362f, 14.615f, 6.476f)
                    curveTo(13.729f, 5.589f, 12.526f, 5.091f, 11.273f, 5.091f)
                    close()
                }
            }
        }
        .build()
        return _cloudSolidSm!!
    }

private var _cloudSolidSm: ImageVector? = null
