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

public val DsIcon.YaDiskSolidLg: ImageVector
    get() {
        if (_yaDiskSolidLg != null) {
            return _yaDiskSolidLg!!
        }
        _yaDiskSolidLg = Builder(name = "YaDiskSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.763f, 7.702f)
                curveTo(21.349f, 8.79f, 22.903f, 9.111f, 23.312f, 9.181f)
                curveTo(26.839f, 8.75f, 29.432f, 9.347f, 30.192f, 11.081f)
                curveTo(31.045f, 13.033f, 29.794f, 16.141f, 26.292f, 18.909f)
                curveTo(26.24f, 18.728f, 26.18f, 18.56f, 26.12f, 18.42f)
                curveTo(25.721f, 17.503f, 24.362f, 15.437f, 20.399f, 16.065f)
                curveTo(19.066f, 16.276f, 17.503f, 16.779f, 15.882f, 17.516f)
                curveTo(13.925f, 18.407f, 12.313f, 19.437f, 11.222f, 20.495f)
                curveTo(8.755f, 22.885f, 9.329f, 25.073f, 9.689f, 25.903f)
                curveTo(9.747f, 26.035f, 9.831f, 26.191f, 9.93f, 26.358f)
                curveTo(5.591f, 27.16f, 2.478f, 26.034f, 1.631f, 24.087f)
                curveTo(0.866f, 22.335f, 2.174f, 19.944f, 4.862f, 17.543f)
                curveTo(5.128f, 17.153f, 5.999f, 15.753f, 6.265f, 13.848f)
                curveTo(6.764f, 10.289f, 8.133f, 7.736f, 11.101f, 6.383f)
                curveTo(14.07f, 5.032f, 16.843f, 5.7f, 19.763f, 7.702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.811f, 19.473f)
                curveTo(23.449f, 18.643f, 22.333f, 18.408f, 20.809f, 18.65f)
                curveTo(19.687f, 18.827f, 18.346f, 19.262f, 16.925f, 19.911f)
                curveTo(13.568f, 21.44f, 11.368f, 23.401f, 12.0f, 24.852f)
                curveTo(12.363f, 25.685f, 13.475f, 25.921f, 14.991f, 25.681f)
                curveTo(16.112f, 25.503f, 17.457f, 25.064f, 18.886f, 24.413f)
                curveTo(22.241f, 22.885f, 24.437f, 20.911f, 23.811f, 19.473f)
                close()
            }
        }
        .build()
        return _yaDiskSolidLg!!
    }

private var _yaDiskSolidLg: ImageVector? = null
