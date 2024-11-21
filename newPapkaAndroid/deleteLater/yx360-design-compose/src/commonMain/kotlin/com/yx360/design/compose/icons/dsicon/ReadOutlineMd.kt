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

public val DsIcon.ReadOutlineMd: ImageVector
    get() {
        if (_readOutlineMd != null) {
            return _readOutlineMd!!
        }
        _readOutlineMd = Builder(name = "ReadOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.212f, 19.01f)
                lineTo(23.941f, 6.66f)
                lineTo(22.491f, 5.282f)
                lineTo(10.762f, 17.632f)
                lineTo(12.212f, 19.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.46f, 6.75f)
                lineTo(7.807f, 19.003f)
                lineTo(0.018f, 11.214f)
                lineTo(1.432f, 9.8f)
                lineTo(7.771f, 16.139f)
                lineTo(18.01f, 5.372f)
                lineTo(19.46f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.781f, 14.559f)
                lineTo(4.418f, 11.216f)
                lineTo(5.828f, 9.797f)
                lineTo(9.191f, 13.14f)
                lineTo(7.781f, 14.559f)
                close()
            }
        }
        .build()
        return _readOutlineMd!!
    }

private var _readOutlineMd: ImageVector? = null
