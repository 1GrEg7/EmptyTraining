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

public val DsIcon.WarningAltSolidMd: ImageVector
    get() {
        if (_warningAltSolidMd != null) {
            return _warningAltSolidMd!!
        }
        _warningAltSolidMd = Builder(name = "WarningAltSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.737f, 2.198f)
                curveTo(11.558f, 1.934f, 12.442f, 1.934f, 13.263f, 2.198f)
                curveTo(14.137f, 2.479f, 14.78f, 3.135f, 15.363f, 3.93f)
                curveTo(15.941f, 4.719f, 16.573f, 5.809f, 17.361f, 7.166f)
                lineTo(20.691f, 12.905f)
                curveTo(21.468f, 14.243f, 22.092f, 15.318f, 22.484f, 16.2f)
                curveTo(22.88f, 17.089f, 23.125f, 17.958f, 22.933f, 18.836f)
                curveTo(22.753f, 19.662f, 22.311f, 20.41f, 21.673f, 20.974f)
                curveTo(20.994f, 21.574f, 20.107f, 21.795f, 19.126f, 21.898f)
                curveTo(18.154f, 22.0f, 16.896f, 22.0f, 15.331f, 22.0f)
                horizontalLineTo(8.669f)
                curveTo(7.104f, 22.0f, 5.846f, 22.0f, 4.874f, 21.898f)
                curveTo(3.893f, 21.795f, 3.006f, 21.574f, 2.327f, 20.974f)
                curveTo(1.689f, 20.41f, 1.248f, 19.662f, 1.067f, 18.836f)
                curveTo(0.875f, 17.958f, 1.12f, 17.089f, 1.516f, 16.2f)
                curveTo(1.908f, 15.318f, 2.532f, 14.243f, 3.309f, 12.905f)
                lineTo(6.639f, 7.166f)
                curveTo(7.427f, 5.809f, 8.059f, 4.719f, 8.637f, 3.93f)
                curveTo(9.221f, 3.135f, 9.863f, 2.479f, 10.737f, 2.198f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(10.75f, 7.0f)
                horizontalLineTo(13.25f)
                lineTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.75f, 17.995f)
                curveTo(13.75f, 18.962f, 12.967f, 19.745f, 12.0f, 19.745f)
                curveTo(11.033f, 19.745f, 10.25f, 18.962f, 10.25f, 17.995f)
                curveTo(10.25f, 17.029f, 11.033f, 16.245f, 12.0f, 16.245f)
                curveTo(12.967f, 16.245f, 13.75f, 17.029f, 13.75f, 17.995f)
                close()
            }
        }
        .build()
        return _warningAltSolidMd!!
    }

private var _warningAltSolidMd: ImageVector? = null
