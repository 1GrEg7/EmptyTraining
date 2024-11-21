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

public val DsIcon.TimeOutlineMd: ImageVector
    get() {
        if (_timeOutlineMd != null) {
            return _timeOutlineMd!!
        }
        _timeOutlineMd = Builder(name = "TimeOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(9.348f, 2.0f, 6.804f, 3.054f, 4.929f, 4.929f)
                curveTo(3.054f, 6.804f, 2.0f, 9.348f, 2.0f, 12.0f)
                curveTo(2.0f, 14.652f, 3.054f, 17.196f, 4.929f, 19.071f)
                curveTo(6.804f, 20.946f, 9.348f, 22.0f, 12.0f, 22.0f)
                curveTo(14.652f, 22.0f, 17.196f, 20.946f, 19.071f, 19.071f)
                curveTo(20.946f, 17.196f, 22.0f, 14.652f, 22.0f, 12.0f)
                curveTo(22.0f, 9.348f, 20.946f, 6.804f, 19.071f, 4.929f)
                curveTo(17.196f, 3.054f, 14.652f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.343f, 6.343f)
                curveTo(7.843f, 4.843f, 9.878f, 4.0f, 12.0f, 4.0f)
                curveTo(14.122f, 4.0f, 16.157f, 4.843f, 17.657f, 6.343f)
                curveTo(19.157f, 7.843f, 20.0f, 9.878f, 20.0f, 12.0f)
                curveTo(20.0f, 14.122f, 19.157f, 16.157f, 17.657f, 17.657f)
                curveTo(16.157f, 19.157f, 14.122f, 20.0f, 12.0f, 20.0f)
                curveTo(9.878f, 20.0f, 7.843f, 19.157f, 6.343f, 17.657f)
                curveTo(4.843f, 16.157f, 4.0f, 14.122f, 4.0f, 12.0f)
                curveTo(4.0f, 9.878f, 4.843f, 7.843f, 6.343f, 6.343f)
                close()
                moveTo(13.25f, 11.482f)
                lineTo(13.0f, 6.008f)
                lineTo(11.0f, 6.0f)
                lineTo(10.75f, 12.518f)
                lineTo(14.316f, 15.699f)
                lineTo(15.629f, 14.387f)
                lineTo(13.25f, 11.482f)
                close()
            }
        }
        .build()
        return _timeOutlineMd!!
    }

private var _timeOutlineMd: ImageVector? = null
