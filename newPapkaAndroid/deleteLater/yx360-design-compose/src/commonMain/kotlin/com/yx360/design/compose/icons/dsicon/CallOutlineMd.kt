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

public val DsIcon.CallOutlineMd: ImageVector
    get() {
        if (_callOutlineMd != null) {
            return _callOutlineMd!!
        }
        _callOutlineMd = Builder(name = "CallOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.57f, 1.592f)
                lineTo(7.06f, 1.923f)
                curveTo(7.891f, 2.484f, 8.652f, 3.404f, 9.25f, 4.393f)
                curveTo(9.855f, 5.394f, 10.346f, 6.552f, 10.585f, 7.663f)
                lineTo(10.675f, 8.08f)
                lineTo(9.467f, 9.861f)
                curveTo(9.694f, 10.316f, 10.02f, 10.793f, 10.375f, 11.243f)
                curveTo(10.838f, 11.829f, 11.303f, 12.307f, 11.54f, 12.544f)
                curveTo(11.78f, 12.784f, 12.255f, 13.249f, 12.839f, 13.712f)
                curveTo(13.286f, 14.066f, 13.761f, 14.39f, 14.215f, 14.616f)
                lineTo(16.005f, 13.374f)
                lineTo(16.436f, 13.473f)
                curveTo(17.541f, 13.727f, 18.695f, 14.224f, 19.694f, 14.832f)
                curveTo(20.681f, 15.433f, 21.601f, 16.194f, 22.162f, 17.025f)
                lineTo(22.493f, 17.516f)
                lineTo(22.222f, 18.043f)
                curveTo(21.673f, 19.108f, 20.768f, 20.273f, 19.897f, 21.176f)
                curveTo(19.287f, 21.808f, 18.408f, 22.105f, 17.538f, 21.967f)
                curveTo(13.759f, 21.367f, 10.304f, 19.167f, 7.629f, 16.443f)
                curveTo(4.967f, 13.734f, 2.776f, 10.331f, 2.132f, 6.57f)
                curveTo(1.982f, 5.692f, 2.275f, 4.797f, 2.916f, 4.178f)
                curveTo(3.818f, 3.308f, 4.98f, 2.407f, 6.044f, 1.862f)
                lineTo(6.57f, 1.592f)
                close()
                moveTo(6.401f, 3.959f)
                curveTo(5.698f, 4.398f, 4.941f, 5.004f, 4.305f, 5.617f)
                curveTo(4.14f, 5.777f, 4.065f, 6.006f, 4.104f, 6.232f)
                curveTo(4.656f, 9.461f, 6.57f, 12.512f, 9.055f, 15.042f)
                curveTo(11.533f, 17.564f, 14.619f, 19.478f, 17.851f, 19.991f)
                curveTo(18.073f, 20.027f, 18.299f, 19.951f, 18.457f, 19.787f)
                curveTo(19.073f, 19.149f, 19.682f, 18.388f, 20.125f, 17.683f)
                curveTo(19.761f, 17.305f, 19.258f, 16.908f, 18.654f, 16.541f)
                curveTo(17.944f, 16.108f, 17.153f, 15.752f, 16.404f, 15.531f)
                lineTo(14.484f, 16.864f)
                lineTo(14.003f, 16.695f)
                curveTo(13.109f, 16.383f, 12.256f, 15.802f, 11.597f, 15.279f)
                curveTo(10.924f, 14.746f, 10.386f, 14.219f, 10.126f, 13.959f)
                curveTo(9.864f, 13.696f, 9.338f, 13.156f, 8.806f, 12.483f)
                curveTo(8.284f, 11.823f, 7.705f, 10.971f, 7.391f, 10.086f)
                lineTo(7.221f, 9.609f)
                lineTo(8.529f, 7.68f)
                curveTo(8.32f, 6.932f, 7.97f, 6.141f, 7.539f, 5.428f)
                curveTo(7.175f, 4.825f, 6.779f, 4.322f, 6.401f, 3.959f)
                close()
            }
        }
        .build()
        return _callOutlineMd!!
    }

private var _callOutlineMd: ImageVector? = null
