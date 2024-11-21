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

public val DsIcon.PlayOutlineSm: ImageVector
    get() {
        if (_playOutlineSm != null) {
            return _playOutlineSm!!
        }
        _playOutlineSm = Builder(name = "PlayOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.888f, 7.223f)
                curveTo(12.353f, 6.764f, 11.524f, 6.239f, 10.288f, 5.461f)
                lineTo(8.598f, 4.397f)
                curveTo(7.215f, 3.527f, 6.273f, 2.937f, 5.55f, 2.619f)
                curveTo(4.832f, 2.303f, 4.615f, 2.385f, 4.517f, 2.439f)
                curveTo(4.418f, 2.493f, 4.233f, 2.634f, 4.118f, 3.41f)
                curveTo(4.003f, 4.191f, 4.0f, 5.302f, 4.0f, 6.936f)
                lineTo(4.0f, 9.064f)
                curveTo(4.0f, 10.699f, 4.003f, 11.809f, 4.118f, 12.59f)
                curveTo(4.233f, 13.367f, 4.418f, 13.507f, 4.517f, 13.561f)
                curveTo(4.615f, 13.616f, 4.832f, 13.697f, 5.55f, 13.381f)
                curveTo(6.273f, 13.063f, 7.215f, 12.474f, 8.598f, 11.603f)
                lineTo(10.288f, 10.539f)
                curveTo(11.524f, 9.761f, 12.353f, 9.236f, 12.888f, 8.778f)
                curveTo(13.41f, 8.33f, 13.445f, 8.117f, 13.445f, 8.0f)
                curveTo(13.445f, 7.884f, 13.41f, 7.67f, 12.888f, 7.223f)
                close()
                moveTo(14.19f, 5.705f)
                curveTo(14.876f, 6.293f, 15.445f, 7.012f, 15.445f, 8.0f)
                curveTo(15.445f, 8.988f, 14.876f, 9.707f, 14.19f, 10.296f)
                curveTo(13.53f, 10.862f, 12.572f, 11.465f, 11.423f, 12.188f)
                lineTo(9.592f, 13.341f)
                curveTo(8.298f, 14.155f, 7.231f, 14.827f, 6.356f, 15.212f)
                curveTo(5.461f, 15.606f, 4.485f, 15.828f, 3.55f, 15.312f)
                curveTo(2.615f, 14.796f, 2.283f, 13.851f, 2.14f, 12.884f)
                curveTo(2.0f, 11.938f, 2.0f, 10.677f, 2.0f, 9.149f)
                lineTo(2.0f, 6.852f)
                curveTo(2.0f, 5.323f, 2.0f, 4.062f, 2.14f, 3.117f)
                curveTo(2.283f, 2.15f, 2.615f, 1.204f, 3.55f, 0.688f)
                curveTo(4.485f, 0.172f, 5.461f, 0.395f, 6.356f, 0.789f)
                curveTo(7.231f, 1.174f, 8.298f, 1.845f, 9.592f, 2.66f)
                lineTo(11.354f, 3.769f)
                curveTo(11.377f, 3.783f, 11.4f, 3.798f, 11.423f, 3.812f)
                curveTo(12.572f, 4.535f, 13.53f, 5.138f, 14.19f, 5.705f)
                close()
            }
        }
        .build()
        return _playOutlineSm!!
    }

private var _playOutlineSm: ImageVector? = null
