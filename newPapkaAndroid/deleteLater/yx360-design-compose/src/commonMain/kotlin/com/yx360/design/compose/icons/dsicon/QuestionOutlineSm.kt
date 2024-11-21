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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.QuestionOutlineSm: ImageVector
    get() {
        if (_questionOutlineSm != null) {
            return _questionOutlineSm!!
        }
        _questionOutlineSm = Builder(name = "QuestionOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.773f, 3.901f)
                curveTo(11.625f, 3.52f, 11.396f, 3.178f, 11.101f, 2.901f)
                curveTo(10.762f, 2.597f, 10.362f, 2.372f, 9.93f, 2.241f)
                curveTo(9.292f, 2.077f, 8.637f, 1.996f, 7.979f, 2.001f)
                curveTo(7.322f, 1.995f, 6.666f, 2.076f, 6.029f, 2.241f)
                curveTo(5.611f, 2.374f, 5.226f, 2.595f, 4.897f, 2.891f)
                curveTo(4.599f, 3.165f, 4.369f, 3.508f, 4.224f, 3.891f)
                curveTo(4.073f, 4.317f, 3.997f, 5.11f, 4.0f, 5.563f)
                horizontalLineTo(6.195f)
                curveTo(6.19f, 5.38f, 6.217f, 4.855f, 6.273f, 4.681f)
                curveTo(6.324f, 4.506f, 6.418f, 4.345f, 6.54f, 4.211f)
                curveTo(6.951f, 3.887f, 7.339f, 3.749f, 7.993f, 3.749f)
                curveTo(8.646f, 3.749f, 9.019f, 3.886f, 9.44f, 4.221f)
                curveTo(9.562f, 4.355f, 9.674f, 4.516f, 9.725f, 4.691f)
                curveTo(9.776f, 4.866f, 9.803f, 5.048f, 9.803f, 5.231f)
                curveTo(9.817f, 5.546f, 9.743f, 5.858f, 9.589f, 6.131f)
                curveTo(9.449f, 6.358f, 9.274f, 6.561f, 9.072f, 6.731f)
                curveTo(8.859f, 6.914f, 8.634f, 7.081f, 8.399f, 7.231f)
                curveTo(8.148f, 7.382f, 7.919f, 7.567f, 7.716f, 7.781f)
                curveTo(7.505f, 8.004f, 7.33f, 8.261f, 7.199f, 8.541f)
                curveTo(7.056f, 8.899f, 6.975f, 9.284f, 6.99f, 9.671f)
                verticalLineTo(10.001f)
                horizontalLineTo(8.99f)
                verticalLineTo(9.661f)
                curveTo(8.988f, 9.549f, 9.014f, 9.437f, 9.054f, 9.332f)
                curveTo(9.094f, 9.227f, 9.154f, 9.132f, 9.23f, 9.051f)
                curveTo(9.397f, 8.863f, 9.546f, 8.699f, 9.755f, 8.561f)
                lineTo(10.476f, 8.051f)
                curveTo(10.745f, 7.865f, 10.99f, 7.647f, 11.208f, 7.401f)
                curveTo(11.473f, 7.111f, 11.68f, 6.77f, 11.815f, 6.397f)
                curveTo(11.951f, 6.025f, 12.013f, 5.628f, 11.998f, 5.231f)
                curveTo(12.001f, 4.778f, 11.925f, 4.327f, 11.773f, 3.901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.49f, 12.499f)
                curveTo(9.49f, 13.328f, 8.819f, 13.999f, 7.99f, 13.999f)
                curveTo(7.162f, 13.999f, 6.49f, 13.328f, 6.49f, 12.499f)
                curveTo(6.49f, 11.671f, 7.162f, 10.999f, 7.99f, 10.999f)
                curveTo(8.819f, 10.999f, 9.49f, 11.671f, 9.49f, 12.499f)
                close()
            }
        }
        .build()
        return _questionOutlineSm!!
    }

private var _questionOutlineSm: ImageVector? = null
