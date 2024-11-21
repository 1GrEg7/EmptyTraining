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

public val DsIcon.AlarmOutlineMd: ImageVector
    get() {
        if (_alarmOutlineMd != null) {
            return _alarmOutlineMd!!
        }
        _alarmOutlineMd = Builder(name = "AlarmOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.276f, 4.345f)
                lineTo(3.356f, 9.266f)
                lineTo(1.941f, 7.852f)
                lineTo(6.862f, 2.931f)
                lineTo(8.276f, 4.345f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.718f, 4.344f)
                lineTo(20.642f, 9.278f)
                lineTo(22.058f, 7.865f)
                lineTo(17.134f, 2.932f)
                lineTo(15.718f, 4.344f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.017f, 8.097f)
                horizontalLineTo(12.985f)
                lineTo(13.231f, 12.508f)
                lineTo(15.445f, 15.082f)
                lineTo(14.068f, 16.462f)
                lineTo(10.771f, 13.527f)
                lineTo(11.017f, 8.097f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.001f, 20.873f)
                curveTo(16.349f, 20.873f, 19.874f, 17.348f, 19.874f, 13.0f)
                curveTo(19.874f, 8.652f, 16.349f, 5.127f, 12.001f, 5.127f)
                curveTo(7.653f, 5.127f, 4.128f, 8.652f, 4.128f, 13.0f)
                curveTo(4.128f, 17.348f, 7.653f, 20.873f, 12.001f, 20.873f)
                close()
                moveTo(12.001f, 18.873f)
                curveTo(15.244f, 18.873f, 17.874f, 16.243f, 17.874f, 13.0f)
                curveTo(17.874f, 9.756f, 15.244f, 7.127f, 12.001f, 7.127f)
                curveTo(8.757f, 7.127f, 6.128f, 9.756f, 6.128f, 13.0f)
                curveTo(6.128f, 16.243f, 8.757f, 18.873f, 12.001f, 18.873f)
                close()
            }
        }
        .build()
        return _alarmOutlineMd!!
    }

private var _alarmOutlineMd: ImageVector? = null
