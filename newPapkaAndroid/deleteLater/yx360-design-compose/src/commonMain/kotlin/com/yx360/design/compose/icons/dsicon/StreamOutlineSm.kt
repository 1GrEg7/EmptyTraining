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

public val DsIcon.StreamOutlineSm: ImageVector
    get() {
        if (_streamOutlineSm != null) {
            return _streamOutlineSm!!
        }
        _streamOutlineSm = Builder(name = "StreamOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.578f, 15.562f)
                curveTo(14.647f, 14.116f, 16.0f, 11.716f, 16.0f, 9.0f)
                curveTo(16.0f, 4.582f, 12.418f, 1.0f, 8.0f, 1.0f)
                curveTo(3.582f, 1.0f, 0.0f, 4.582f, 0.0f, 9.0f)
                curveTo(0.0f, 11.69f, 1.328f, 14.07f, 3.364f, 15.521f)
                lineTo(4.288f, 13.841f)
                curveTo(2.836f, 12.726f, 1.9f, 10.972f, 1.9f, 9.0f)
                curveTo(1.9f, 5.631f, 4.631f, 2.9f, 8.0f, 2.9f)
                curveTo(11.369f, 2.9f, 14.1f, 5.631f, 14.1f, 9.0f)
                curveTo(14.1f, 11.018f, 13.12f, 12.807f, 11.61f, 13.917f)
                curveTo(11.933f, 14.464f, 12.263f, 15.025f, 12.578f, 15.562f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.022f, 12.506f)
                lineTo(5.971f, 10.781f)
                curveTo(5.553f, 10.306f, 5.3f, 9.683f, 5.3f, 9.0f)
                curveTo(5.3f, 7.509f, 6.509f, 6.3f, 8.0f, 6.3f)
                curveTo(9.491f, 6.3f, 10.7f, 7.509f, 10.7f, 9.0f)
                curveTo(10.7f, 9.774f, 10.374f, 10.472f, 9.852f, 10.965f)
                curveTo(10.1f, 11.374f, 10.448f, 11.955f, 10.841f, 12.618f)
                curveTo(11.912f, 11.776f, 12.6f, 10.468f, 12.6f, 9.0f)
                curveTo(12.6f, 6.459f, 10.54f, 4.4f, 8.0f, 4.4f)
                curveTo(5.459f, 4.4f, 3.4f, 6.459f, 3.4f, 9.0f)
                curveTo(3.4f, 10.405f, 4.03f, 11.662f, 5.022f, 12.506f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2f, 9.0f)
                curveTo(9.2f, 9.663f, 8.663f, 10.2f, 8.0f, 10.2f)
                curveTo(7.337f, 10.2f, 6.8f, 9.663f, 6.8f, 9.0f)
                curveTo(6.8f, 8.337f, 7.337f, 7.8f, 8.0f, 7.8f)
                curveTo(8.663f, 7.8f, 9.2f, 8.337f, 9.2f, 9.0f)
                close()
            }
        }
        .build()
        return _streamOutlineSm!!
    }

private var _streamOutlineSm: ImageVector? = null
