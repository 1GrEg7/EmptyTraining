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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.HistoryOutlineXs: ImageVector
    get() {
        if (_historyOutlineXs != null) {
            return _historyOutlineXs!!
        }
        _historyOutlineXs = Builder(name = "HistoryOutlineXs", defaultWidth = 12.0.dp, defaultHeight
                = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.681f, 11.76f)
                    curveTo(9.01f, 11.372f, 10.164f, 10.536f, 10.947f, 9.395f)
                    curveTo(11.731f, 8.253f, 12.095f, 6.875f, 11.979f, 5.496f)
                    curveTo(11.862f, 4.116f, 11.273f, 2.819f, 10.309f, 1.825f)
                    curveTo(9.345f, 0.83f, 8.068f, 0.2f, 6.692f, 0.04f)
                    curveTo(5.317f, -0.12f, 3.929f, 0.201f, 2.763f, 0.948f)
                    curveTo(1.597f, 1.695f, 0.726f, 2.822f, 0.296f, 4.138f)
                    curveTo(-0.133f, 5.455f, -0.095f, 6.879f, 0.406f, 8.17f)
                    curveTo(0.711f, 8.956f, 1.176f, 9.663f, 1.765f, 10.25f)
                    lineTo(1.0f, 10.25f)
                    lineTo(1.0f, 11.75f)
                    lineTo(4.75f, 11.75f)
                    lineTo(4.75f, 8.5f)
                    lineTo(3.25f, 8.5f)
                    lineTo(3.25f, 9.486f)
                    curveTo(2.63f, 8.997f, 2.149f, 8.349f, 1.861f, 7.606f)
                    curveTo(1.49f, 6.65f, 1.461f, 5.596f, 1.779f, 4.622f)
                    curveTo(2.097f, 3.648f, 2.742f, 2.814f, 3.605f, 2.262f)
                    curveTo(4.467f, 1.709f, 5.495f, 1.471f, 6.512f, 1.59f)
                    curveTo(7.53f, 1.708f, 8.476f, 2.175f, 9.189f, 2.91f)
                    curveTo(9.902f, 3.646f, 10.338f, 4.606f, 10.424f, 5.627f)
                    curveTo(10.51f, 6.648f, 10.241f, 7.667f, 9.661f, 8.512f)
                    curveTo(9.081f, 9.357f, 8.227f, 9.975f, 7.244f, 10.262f)
                    lineTo(7.681f, 11.76f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.3f, 3.3f)
                    lineTo(6.903f, 3.305f)
                    lineTo(7.103f, 6.214f)
                    lineTo(8.7f, 7.848f)
                    lineTo(7.648f, 8.7f)
                    lineTo(5.1f, 6.886f)
                    lineTo(5.3f, 3.3f)
                    close()
                }
            }
        }
        .build()
        return _historyOutlineXs!!
    }

private var _historyOutlineXs: ImageVector? = null
