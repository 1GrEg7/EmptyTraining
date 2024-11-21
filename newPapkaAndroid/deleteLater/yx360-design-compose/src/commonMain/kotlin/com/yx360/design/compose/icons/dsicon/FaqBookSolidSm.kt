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

public val DsIcon.FaqBookSolidSm: ImageVector
    get() {
        if (_faqBookSolidSm != null) {
            return _faqBookSolidSm!!
        }
        _faqBookSolidSm = Builder(name = "FaqBookSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.125f, -0.042f)
                curveTo(1.727f, -0.042f, 0.594f, 1.092f, 0.594f, 2.489f)
                verticalLineTo(13.425f)
                curveTo(0.594f, 13.441f, 0.594f, 13.456f, 0.594f, 13.472f)
                lineTo(0.594f, 13.496f)
                curveTo(0.594f, 14.894f, 1.727f, 16.027f, 3.125f, 16.027f)
                horizontalLineTo(15.355f)
                verticalLineTo(14.227f)
                horizontalLineTo(3.125f)
                curveTo(2.721f, 14.227f, 2.394f, 13.9f, 2.394f, 13.496f)
                curveTo(2.394f, 13.093f, 2.721f, 12.766f, 3.125f, 12.766f)
                horizontalLineTo(14.132f)
                curveTo(14.854f, 12.766f, 15.44f, 12.18f, 15.44f, 11.458f)
                verticalLineTo(1.266f)
                curveTo(15.44f, 0.544f, 14.854f, -0.042f, 14.132f, -0.042f)
                horizontalLineTo(3.125f)
                close()
                moveTo(7.328f, 4.416f)
                curveTo(7.192f, 4.528f, 7.09f, 4.689f, 7.09f, 4.964f)
                horizontalLineTo(5.29f)
                curveTo(5.29f, 4.139f, 5.642f, 3.472f, 6.185f, 3.026f)
                curveTo(6.705f, 2.598f, 7.361f, 2.402f, 7.976f, 2.386f)
                curveTo(8.59f, 2.369f, 9.249f, 2.529f, 9.779f, 2.918f)
                curveTo(10.334f, 3.327f, 10.711f, 3.969f, 10.711f, 4.779f)
                curveTo(10.711f, 5.379f, 10.535f, 5.859f, 10.217f, 6.24f)
                curveTo(9.962f, 6.545f, 9.635f, 6.752f, 9.436f, 6.878f)
                lineTo(9.384f, 6.911f)
                curveTo(9.151f, 7.061f, 9.056f, 7.136f, 8.995f, 7.219f)
                curveTo(8.955f, 7.273f, 8.886f, 7.388f, 8.886f, 7.687f)
                horizontalLineTo(7.086f)
                curveTo(7.086f, 7.063f, 7.245f, 6.558f, 7.547f, 6.149f)
                curveTo(7.826f, 5.771f, 8.185f, 5.542f, 8.409f, 5.398f)
                lineTo(8.413f, 5.396f)
                curveTo(8.679f, 5.225f, 8.771f, 5.162f, 8.835f, 5.086f)
                curveTo(8.859f, 5.057f, 8.911f, 4.995f, 8.911f, 4.779f)
                curveTo(8.911f, 4.576f, 8.835f, 4.459f, 8.712f, 4.368f)
                curveTo(8.562f, 4.258f, 8.316f, 4.177f, 8.025f, 4.185f)
                curveTo(7.735f, 4.193f, 7.486f, 4.286f, 7.328f, 4.416f)
                close()
                moveTo(8.001f, 10.415f)
                curveTo(8.573f, 10.415f, 9.037f, 9.951f, 9.037f, 9.379f)
                curveTo(9.037f, 8.807f, 8.573f, 8.343f, 8.001f, 8.343f)
                curveTo(7.429f, 8.343f, 6.965f, 8.807f, 6.965f, 9.379f)
                curveTo(6.965f, 9.951f, 7.429f, 10.415f, 8.001f, 10.415f)
                close()
            }
        }
        .build()
        return _faqBookSolidSm!!
    }

private var _faqBookSolidSm: ImageVector? = null
