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

public val DsIcon.MentionSolidSm: ImageVector
    get() {
        if (_mentionSolidSm != null) {
            return _mentionSolidSm!!
        }
        _mentionSolidSm = Builder(name = "MentionSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.694f, 7.98f)
                    curveTo(8.694f, 8.361f, 8.747f, 8.711f, 8.845f, 9.028f)
                    curveTo(8.597f, 9.248f, 8.271f, 9.381f, 7.914f, 9.381f)
                    curveTo(7.141f, 9.381f, 6.514f, 8.754f, 6.514f, 7.98f)
                    curveTo(6.514f, 7.207f, 7.141f, 6.58f, 7.914f, 6.58f)
                    curveTo(8.017f, 6.58f, 8.243f, 6.635f, 8.441f, 6.774f)
                    curveTo(8.616f, 6.897f, 8.682f, 7.02f, 8.694f, 7.132f)
                    verticalLineTo(7.98f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 15.967f)
                    curveTo(12.4f, 15.967f, 15.967f, 12.4f, 15.967f, 8.0f)
                    curveTo(15.967f, 3.6f, 12.4f, 0.033f, 8.0f, 0.033f)
                    curveTo(3.6f, 0.033f, 0.033f, 3.6f, 0.033f, 8.0f)
                    curveTo(0.033f, 12.4f, 3.6f, 15.967f, 8.0f, 15.967f)
                    close()
                    moveTo(3.519f, 7.98f)
                    curveTo(3.519f, 5.506f, 5.525f, 3.5f, 8.0f, 3.5f)
                    curveTo(10.474f, 3.5f, 12.481f, 5.506f, 12.481f, 7.98f)
                    curveTo(12.481f, 8.528f, 12.309f, 8.849f, 12.132f, 9.029f)
                    curveTo(11.95f, 9.216f, 11.703f, 9.31f, 11.446f, 9.308f)
                    curveTo(10.977f, 9.303f, 10.394f, 8.957f, 10.394f, 7.98f)
                    verticalLineTo(7.077f)
                    lineTo(10.393f, 7.052f)
                    curveTo(10.348f, 6.271f, 9.89f, 5.715f, 9.419f, 5.383f)
                    curveTo(8.961f, 5.061f, 8.398f, 4.88f, 7.914f, 4.88f)
                    curveTo(6.202f, 4.88f, 4.813f, 6.268f, 4.813f, 7.98f)
                    curveTo(4.813f, 9.693f, 6.202f, 11.081f, 7.914f, 11.081f)
                    curveTo(8.625f, 11.081f, 9.279f, 10.842f, 9.801f, 10.441f)
                    curveTo(10.267f, 10.804f, 10.838f, 11.001f, 11.428f, 11.008f)
                    curveTo(12.118f, 11.015f, 12.818f, 10.757f, 13.345f, 10.22f)
                    curveTo(13.879f, 9.677f, 14.181f, 8.905f, 14.181f, 7.98f)
                    curveTo(14.181f, 4.567f, 11.413f, 1.8f, 8.0f, 1.8f)
                    curveTo(4.587f, 1.8f, 1.819f, 4.567f, 1.819f, 7.98f)
                    curveTo(1.819f, 11.394f, 4.587f, 14.161f, 8.0f, 14.161f)
                    curveTo(8.85f, 14.161f, 9.662f, 13.989f, 10.401f, 13.677f)
                    lineTo(9.74f, 12.111f)
                    curveTo(9.206f, 12.336f, 8.619f, 12.461f, 8.0f, 12.461f)
                    curveTo(5.525f, 12.461f, 3.519f, 10.455f, 3.519f, 7.98f)
                    close()
                }
            }
        }
        .build()
        return _mentionSolidSm!!
    }

private var _mentionSolidSm: ImageVector? = null
