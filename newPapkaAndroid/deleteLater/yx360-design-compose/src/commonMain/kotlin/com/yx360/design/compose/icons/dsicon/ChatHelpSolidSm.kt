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

public val DsIcon.ChatHelpSolidSm: ImageVector
    get() {
        if (_chatHelpSolidSm != null) {
            return _chatHelpSolidSm!!
        }
        _chatHelpSolidSm = Builder(name = "ChatHelpSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.467f)
                    curveTo(0.0f, 2.133f, 3.578f, -0.033f, 8.0f, -0.033f)
                    curveTo(12.422f, -0.033f, 16.0f, 2.133f, 16.0f, 6.467f)
                    curveTo(16.0f, 10.8f, 12.422f, 12.967f, 8.0f, 12.967f)
                    lineTo(5.0f, 15.967f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(12.26f)
                    curveTo(1.608f, 11.303f, 0.0f, 9.372f, 0.0f, 6.467f)
                    close()
                    moveTo(7.184f, 4.348f)
                    curveTo(7.054f, 4.469f, 6.917f, 4.689f, 6.917f, 5.109f)
                    horizontalLineTo(5.217f)
                    curveTo(5.217f, 4.274f, 5.51f, 3.584f, 6.024f, 3.105f)
                    curveTo(6.523f, 2.639f, 7.163f, 2.434f, 7.765f, 2.42f)
                    curveTo(8.362f, 2.407f, 8.985f, 2.58f, 9.478f, 2.954f)
                    curveTo(9.988f, 3.342f, 10.351f, 3.944f, 10.351f, 4.7f)
                    curveTo(10.351f, 5.32f, 10.2f, 5.817f, 9.913f, 6.222f)
                    curveTo(9.652f, 6.59f, 9.314f, 6.821f, 9.098f, 6.969f)
                    lineTo(9.082f, 6.98f)
                    curveTo(8.833f, 7.152f, 8.732f, 7.227f, 8.662f, 7.32f)
                    curveTo(8.619f, 7.378f, 8.552f, 7.49f, 8.552f, 7.78f)
                    horizontalLineTo(6.852f)
                    curveTo(6.852f, 7.174f, 7.009f, 6.69f, 7.303f, 6.299f)
                    curveTo(7.554f, 5.965f, 7.876f, 5.745f, 8.081f, 5.606f)
                    lineTo(8.12f, 5.579f)
                    curveTo(8.355f, 5.418f, 8.457f, 5.336f, 8.526f, 5.238f)
                    curveTo(8.577f, 5.167f, 8.651f, 5.028f, 8.651f, 4.7f)
                    curveTo(8.651f, 4.532f, 8.584f, 4.41f, 8.45f, 4.308f)
                    curveTo(8.299f, 4.194f, 8.064f, 4.114f, 7.803f, 4.12f)
                    curveTo(7.546f, 4.126f, 7.328f, 4.213f, 7.184f, 4.348f)
                    close()
                    moveTo(7.706f, 10.521f)
                    curveTo(8.217f, 10.521f, 8.631f, 10.106f, 8.631f, 9.595f)
                    curveTo(8.631f, 9.084f, 8.217f, 8.67f, 7.706f, 8.67f)
                    curveTo(7.195f, 8.67f, 6.78f, 9.084f, 6.78f, 9.595f)
                    curveTo(6.78f, 10.106f, 7.195f, 10.521f, 7.706f, 10.521f)
                    close()
                }
            }
        }
        .build()
        return _chatHelpSolidSm!!
    }

private var _chatHelpSolidSm: ImageVector? = null
