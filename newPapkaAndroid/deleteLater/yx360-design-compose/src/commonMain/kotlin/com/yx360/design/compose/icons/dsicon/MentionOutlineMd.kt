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

public val DsIcon.MentionOutlineMd: ImageVector
    get() {
        if (_mentionOutlineMd != null) {
            return _mentionOutlineMd!!
        }
        _mentionOutlineMd = Builder(name = "MentionOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.104f, 20.0f, 14.153f, 19.777f, 15.107f, 19.374f)
                lineTo(15.885f, 21.217f)
                curveTo(14.689f, 21.722f, 13.376f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 13.465f, 21.524f, 14.653f, 20.715f, 15.477f)
                curveTo(19.913f, 16.294f, 18.847f, 16.687f, 17.792f, 16.676f)
                curveTo(16.783f, 16.665f, 15.803f, 16.287f, 15.045f, 15.587f)
                curveTo(14.198f, 16.341f, 13.08f, 16.8f, 11.855f, 16.8f)
                curveTo(9.204f, 16.8f, 7.055f, 14.651f, 7.055f, 12.0f)
                curveTo(7.055f, 9.349f, 9.204f, 7.2f, 11.855f, 7.2f)
                curveTo(12.575f, 7.2f, 13.439f, 7.474f, 14.145f, 7.971f)
                curveTo(14.868f, 8.479f, 15.539f, 9.308f, 15.605f, 10.458f)
                lineTo(15.607f, 10.486f)
                verticalLineTo(12.0f)
                curveTo(15.607f, 13.882f, 16.778f, 14.665f, 17.814f, 14.676f)
                curveTo(18.359f, 14.682f, 18.891f, 14.48f, 19.288f, 14.076f)
                curveTo(19.677f, 13.679f, 20.0f, 13.02f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(13.925f, 13.886f)
                curveTo(13.721f, 13.332f, 13.607f, 12.701f, 13.607f, 12.0f)
                verticalLineTo(10.548f)
                curveTo(13.578f, 10.191f, 13.37f, 9.871f, 12.995f, 9.607f)
                curveTo(12.594f, 9.325f, 12.126f, 9.2f, 11.855f, 9.2f)
                curveTo(10.309f, 9.2f, 9.055f, 10.454f, 9.055f, 12.0f)
                curveTo(9.055f, 13.546f, 10.309f, 14.8f, 11.855f, 14.8f)
                curveTo(12.674f, 14.8f, 13.412f, 14.449f, 13.925f, 13.886f)
                close()
            }
        }
        .build()
        return _mentionOutlineMd!!
    }

private var _mentionOutlineMd: ImageVector? = null
