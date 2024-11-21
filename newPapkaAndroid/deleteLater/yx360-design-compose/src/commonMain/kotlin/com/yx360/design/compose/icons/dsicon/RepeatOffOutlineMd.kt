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

public val DsIcon.RepeatOffOutlineMd: ImageVector
    get() {
        if (_repeatOffOutlineMd != null) {
            return _repeatOffOutlineMd!!
        }
        _repeatOffOutlineMd = Builder(name = "RepeatOffOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.159f, 3.0f)
                lineTo(20.894f, 8.851f)
                lineTo(14.802f, 8.478f)
                lineTo(16.358f, 6.522f)
                curveTo(14.143f, 4.761f, 11.19f, 4.558f, 8.822f, 5.762f)
                lineTo(17.099f, 16.798f)
                curveTo(17.23f, 16.658f, 17.357f, 16.511f, 17.479f, 16.358f)
                curveTo(18.682f, 14.845f, 19.158f, 12.988f, 18.955f, 11.208f)
                lineTo(20.942f, 10.981f)
                curveTo(21.203f, 13.27f, 20.591f, 15.658f, 19.044f, 17.604f)
                curveTo(18.814f, 17.893f, 18.57f, 18.164f, 18.313f, 18.417f)
                lineTo(21.0f, 22.0f)
                horizontalLineTo(18.0f)
                lineTo(6.903f, 7.203f)
                curveTo(6.903f, 7.203f, 6.903f, 7.203f, 6.903f, 7.203f)
                lineTo(5.688f, 5.584f)
                curveTo(5.688f, 5.584f, 5.688f, 5.584f, 5.688f, 5.584f)
                lineTo(3.001f, 2.0f)
                lineTo(6.001f, 2.0f)
                lineTo(7.608f, 4.143f)
                curveTo(10.7f, 2.416f, 14.659f, 2.616f, 17.603f, 4.957f)
                lineTo(19.159f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.628f, 6.838f)
                lineTo(5.911f, 8.547f)
                curveTo(5.161f, 9.864f, 4.881f, 11.354f, 5.045f, 12.793f)
                lineTo(3.058f, 13.019f)
                curveTo(2.817f, 10.9f, 3.324f, 8.696f, 4.628f, 6.838f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.894f, 20.524f)
                lineTo(13.61f, 18.813f)
                curveTo(11.595f, 19.288f, 9.389f, 18.868f, 7.642f, 17.479f)
                lineTo(9.199f, 15.522f)
                lineTo(3.107f, 15.149f)
                lineTo(4.841f, 21.0f)
                lineTo(6.398f, 19.044f)
                curveTo(8.884f, 21.022f, 12.093f, 21.472f, 14.894f, 20.524f)
                close()
            }
        }
        .build()
        return _repeatOffOutlineMd!!
    }

private var _repeatOffOutlineMd: ImageVector? = null
