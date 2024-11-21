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

public val DsIcon.CallSolidSm: ImageVector
    get() {
        if (_callSolidSm != null) {
            return _callSolidSm!!
        }
        _callSolidSm = Builder(name = "CallSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 12.958f)
                    curveTo(15.213f, 11.794f, 13.246f, 10.615f, 11.523f, 10.218f)
                    lineTo(9.721f, 11.826f)
                    curveTo(8.432f, 11.376f, 7.265f, 10.632f, 6.312f, 9.655f)
                    curveTo(5.338f, 8.71f, 4.594f, 7.554f, 4.14f, 6.275f)
                    lineTo(5.749f, 4.474f)
                    curveTo(5.379f, 2.752f, 4.198f, 0.786f, 3.033f, 0.0f)
                    curveTo(2.267f, 0.392f, 1.356f, 1.089f, 0.615f, 1.777f)
                    curveTo(0.131f, 2.227f, -0.088f, 2.891f, 0.033f, 3.541f)
                    curveTo(0.586f, 6.518f, 2.224f, 9.359f, 4.41f, 11.583f)
                    curveTo(6.599f, 13.809f, 9.479f, 15.452f, 12.47f, 15.972f)
                    curveTo(13.113f, 16.083f, 13.766f, 15.862f, 14.21f, 15.385f)
                    curveTo(14.902f, 14.642f, 15.604f, 13.727f, 16.0f, 12.958f)
                    close()
                }
            }
        }
        .build()
        return _callSolidSm!!
    }

private var _callSolidSm: ImageVector? = null
