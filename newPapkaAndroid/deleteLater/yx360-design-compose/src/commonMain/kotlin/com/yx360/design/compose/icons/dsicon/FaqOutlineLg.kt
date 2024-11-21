package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.FaqOutlineLg: ImageVector
    get() {
        if (_faqOutlineLg != null) {
            return _faqOutlineLg!!
        }
        _faqOutlineLg = Builder(name = "FaqOutlineLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 21.264f)
                curveTo(17.42f, 22.066f, 16.769f, 22.717f, 15.967f, 22.717f)
                curveTo(15.164f, 22.717f, 14.514f, 22.066f, 14.514f, 21.264f)
                curveTo(14.514f, 20.461f, 15.164f, 19.81f, 15.967f, 19.81f)
                curveTo(16.769f, 19.81f, 17.42f, 20.461f, 17.42f, 21.264f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.323f, 12.996f)
                curveTo(13.323f, 12.194f, 13.64f, 11.642f, 14.097f, 11.267f)
                curveTo(14.579f, 10.87f, 15.264f, 10.637f, 15.994f, 10.617f)
                curveTo(16.725f, 10.597f, 17.407f, 10.795f, 17.879f, 11.143f)
                curveTo(18.322f, 11.469f, 18.61f, 11.942f, 18.61f, 12.624f)
                curveTo(18.61f, 13.233f, 18.45f, 13.545f, 18.269f, 13.762f)
                curveTo(18.047f, 14.027f, 17.744f, 14.222f, 17.255f, 14.535f)
                lineTo(17.234f, 14.548f)
                curveTo(16.781f, 14.839f, 16.173f, 15.232f, 15.707f, 15.863f)
                curveTo(15.217f, 16.527f, 14.937f, 17.368f, 14.937f, 18.476f)
                horizontalLineTo(16.937f)
                curveTo(16.937f, 17.729f, 17.117f, 17.321f, 17.315f, 17.052f)
                curveTo(17.538f, 16.751f, 17.849f, 16.529f, 18.313f, 16.232f)
                lineTo(18.415f, 16.167f)
                curveTo(18.825f, 15.906f, 19.377f, 15.555f, 19.804f, 15.043f)
                curveTo(20.312f, 14.435f, 20.61f, 13.659f, 20.61f, 12.624f)
                curveTo(20.61f, 11.267f, 19.987f, 10.211f, 19.065f, 9.532f)
                curveTo(18.17f, 8.874f, 17.03f, 8.588f, 15.94f, 8.618f)
                curveTo(14.848f, 8.647f, 13.711f, 8.995f, 12.827f, 9.722f)
                curveTo(11.918f, 10.469f, 11.323f, 11.582f, 11.323f, 12.996f)
                horizontalLineTo(13.323f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 16.0f)
                curveTo(4.0f, 9.373f, 9.373f, 4.0f, 16.0f, 4.0f)
                curveTo(22.627f, 4.0f, 28.0f, 9.373f, 28.0f, 16.0f)
                curveTo(28.0f, 22.627f, 22.627f, 28.0f, 16.0f, 28.0f)
                curveTo(9.373f, 28.0f, 4.0f, 22.627f, 4.0f, 16.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(10.477f, 6.0f, 6.0f, 10.477f, 6.0f, 16.0f)
                curveTo(6.0f, 21.523f, 10.477f, 26.0f, 16.0f, 26.0f)
                curveTo(21.523f, 26.0f, 26.0f, 21.523f, 26.0f, 16.0f)
                curveTo(26.0f, 10.477f, 21.523f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _faqOutlineLg!!
    }

private var _faqOutlineLg: ImageVector? = null
