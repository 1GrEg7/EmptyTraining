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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.MentionSolidMd: ImageVector
    get() {
        if (_mentionSolidMd != null) {
            return _mentionSolidMd!!
        }
        _mentionSolidMd = Builder(name = "MentionSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.097f, 12.0f)
                curveTo(13.097f, 12.476f, 13.169f, 12.911f, 13.297f, 13.299f)
                curveTo(12.97f, 13.618f, 12.524f, 13.812f, 12.033f, 13.812f)
                curveTo(11.032f, 13.812f, 10.221f, 13.001f, 10.221f, 12.0f)
                curveTo(10.221f, 10.999f, 11.032f, 10.188f, 12.033f, 10.188f)
                curveTo(12.185f, 10.188f, 12.482f, 10.263f, 12.739f, 10.444f)
                curveTo(12.974f, 10.609f, 13.08f, 10.789f, 13.097f, 10.972f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(6.613f, 12.0f)
                curveTo(6.613f, 8.949f, 9.086f, 6.476f, 12.137f, 6.476f)
                curveTo(15.188f, 6.476f, 17.661f, 8.949f, 17.661f, 12.0f)
                curveTo(17.661f, 12.687f, 17.445f, 13.108f, 17.206f, 13.351f)
                curveTo(16.96f, 13.601f, 16.63f, 13.727f, 16.289f, 13.724f)
                curveTo(15.653f, 13.717f, 14.897f, 13.243f, 14.897f, 12.0f)
                verticalLineTo(10.914f)
                lineTo(14.896f, 10.888f)
                curveTo(14.845f, 9.995f, 14.322f, 9.357f, 13.775f, 8.972f)
                curveTo(13.243f, 8.597f, 12.589f, 8.387f, 12.033f, 8.387f)
                curveTo(10.038f, 8.387f, 8.421f, 10.005f, 8.421f, 12.0f)
                curveTo(8.421f, 13.995f, 10.038f, 15.612f, 12.033f, 15.612f)
                curveTo(12.896f, 15.612f, 13.688f, 15.31f, 14.308f, 14.806f)
                curveTo(14.863f, 15.266f, 15.554f, 15.516f, 16.269f, 15.524f)
                curveTo(17.069f, 15.532f, 17.88f, 15.234f, 18.49f, 14.612f)
                curveTo(19.107f, 13.984f, 19.461f, 13.087f, 19.461f, 12.0f)
                curveTo(19.461f, 7.955f, 16.182f, 4.676f, 12.137f, 4.676f)
                curveTo(8.092f, 4.676f, 4.813f, 7.955f, 4.813f, 12.0f)
                curveTo(4.813f, 16.045f, 8.092f, 19.324f, 12.137f, 19.324f)
                curveTo(13.144f, 19.324f, 14.106f, 19.12f, 14.982f, 18.75f)
                lineTo(14.282f, 17.092f)
                curveTo(13.624f, 17.37f, 12.899f, 17.524f, 12.137f, 17.524f)
                curveTo(9.086f, 17.524f, 6.613f, 15.051f, 6.613f, 12.0f)
                close()
            }
        }
        .build()
        return _mentionSolidMd!!
    }

private var _mentionSolidMd: ImageVector? = null
