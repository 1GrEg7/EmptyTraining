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

public val DsIcon.BugSolidLg: ImageVector
    get() {
        if (_bugSolidLg != null) {
            return _bugSolidLg!!
        }
        _bugSolidLg = Builder(name = "BugSolidLg", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.806f, 10.247f)
                curveTo(21.588f, 10.382f, 21.296f, 10.53f, 20.923f, 10.676f)
                curveTo(19.847f, 11.095f, 18.192f, 11.453f, 15.981f, 11.453f)
                curveTo(13.771f, 11.453f, 12.157f, 11.095f, 11.096f, 10.677f)
                curveTo(10.668f, 10.508f, 10.339f, 10.333f, 10.101f, 10.174f)
                curveTo(10.151f, 9.149f, 10.37f, 7.885f, 10.982f, 6.761f)
                curveTo(11.392f, 6.008f, 11.985f, 5.307f, 12.826f, 4.798f)
                curveTo(13.667f, 4.289f, 14.71f, 4.0f, 15.974f, 4.0f)
                curveTo(17.238f, 4.0f, 18.276f, 4.287f, 19.111f, 4.798f)
                curveTo(19.944f, 5.308f, 20.526f, 6.01f, 20.926f, 6.763f)
                curveTo(21.541f, 7.917f, 21.746f, 9.221f, 21.806f, 10.247f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.89f, 11.602f)
                curveTo(23.187f, 11.887f, 23.448f, 12.201f, 23.675f, 12.538f)
                lineTo(26.978f, 10.988f)
                lineTo(27.812f, 12.788f)
                lineTo(24.515f, 14.335f)
                curveTo(24.818f, 15.334f, 24.922f, 16.423f, 24.857f, 17.516f)
                horizontalLineTo(28.0f)
                verticalLineTo(19.502f)
                horizontalLineTo(24.555f)
                curveTo(24.491f, 19.762f, 24.419f, 20.018f, 24.338f, 20.271f)
                curveTo(24.139f, 20.889f, 23.884f, 21.501f, 23.575f, 22.088f)
                lineTo(26.498f, 24.555f)
                lineTo(25.229f, 26.076f)
                lineTo(22.487f, 23.763f)
                curveTo(20.984f, 25.652f, 18.799f, 27.0f, 16.03f, 27.0f)
                curveTo(13.247f, 27.0f, 11.053f, 25.637f, 9.549f, 23.732f)
                lineTo(6.771f, 26.076f)
                lineTo(5.502f, 24.555f)
                lineTo(8.467f, 22.053f)
                curveTo(8.166f, 21.476f, 7.917f, 20.877f, 7.723f, 20.271f)
                curveTo(7.642f, 20.018f, 7.569f, 19.762f, 7.506f, 19.502f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.516f)
                horizontalLineTo(7.204f)
                curveTo(7.139f, 16.432f, 7.241f, 15.352f, 7.538f, 14.36f)
                lineTo(4.187f, 12.788f)
                lineTo(5.022f, 10.988f)
                lineTo(8.371f, 12.559f)
                curveTo(8.597f, 12.221f, 8.857f, 11.905f, 9.154f, 11.618f)
                curveTo(9.512f, 11.856f, 9.951f, 12.084f, 10.468f, 12.288f)
                curveTo(11.598f, 12.734f, 13.141f, 13.084f, 15.107f, 13.165f)
                verticalLineTo(20.313f)
                horizontalLineTo(16.827f)
                verticalLineTo(13.167f)
                curveTo(18.813f, 13.088f, 20.396f, 12.736f, 21.545f, 12.289f)
                curveTo(22.074f, 12.083f, 22.527f, 11.85f, 22.89f, 11.602f)
                close()
            }
        }
        .build()
        return _bugSolidLg!!
    }

private var _bugSolidLg: ImageVector? = null
