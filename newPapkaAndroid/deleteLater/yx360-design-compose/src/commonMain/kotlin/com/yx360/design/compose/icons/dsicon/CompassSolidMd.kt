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

public val DsIcon.CompassSolidMd: ImageVector
    get() {
        if (_compassSolidMd != null) {
            return _compassSolidMd!!
        }
        _compassSolidMd = Builder(name = "CompassSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.896f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.896f, 10.0f, 10.0f, 10.896f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.896f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.929f, 4.929f)
                curveTo(6.804f, 3.054f, 9.348f, 2.0f, 12.0f, 2.0f)
                curveTo(14.652f, 2.0f, 17.196f, 3.054f, 19.071f, 4.929f)
                curveTo(20.946f, 6.804f, 22.0f, 9.348f, 22.0f, 12.0f)
                curveTo(22.0f, 14.652f, 20.946f, 17.196f, 19.071f, 19.071f)
                curveTo(17.196f, 20.946f, 14.652f, 22.0f, 12.0f, 22.0f)
                curveTo(9.348f, 22.0f, 6.804f, 20.946f, 4.929f, 19.071f)
                curveTo(3.054f, 17.196f, 2.0f, 14.652f, 2.0f, 12.0f)
                curveTo(2.0f, 9.348f, 3.054f, 6.804f, 4.929f, 4.929f)
                close()
                moveTo(17.5f, 7.0f)
                lineTo(14.5f, 14.5f)
                lineTo(7.0f, 17.5f)
                lineTo(6.5f, 17.0f)
                lineTo(9.5f, 9.5f)
                lineTo(17.0f, 6.5f)
                lineTo(17.5f, 7.0f)
                close()
            }
        }
        .build()
        return _compassSolidMd!!
    }

private var _compassSolidMd: ImageVector? = null
