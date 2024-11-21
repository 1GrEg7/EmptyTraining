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

public val DsIcon.Ya360SolidMd: ImageVector
    get() {
        if (_ya360SolidMd != null) {
            return _ya360SolidMd!!
        }
        _ya360SolidMd = Builder(name = "Ya360SolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.522f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 17.799f)
                curveTo(13.878f, 17.799f, 15.4f, 15.203f, 15.4f, 12.0f)
                curveTo(15.4f, 8.796f, 13.878f, 6.2f, 12.0f, 6.2f)
                curveTo(10.122f, 6.2f, 8.6f, 8.796f, 8.6f, 12.0f)
                curveTo(8.6f, 15.203f, 10.122f, 17.799f, 12.0f, 17.799f)
                close()
                moveTo(5.625f, 7.4f)
                curveTo(4.616f, 7.348f, 3.4f, 9.459f, 3.4f, 11.999f)
                curveTo(3.4f, 14.538f, 4.616f, 16.65f, 5.625f, 16.598f)
                curveTo(6.626f, 16.546f, 7.2f, 14.538f, 7.2f, 11.999f)
                curveTo(7.2f, 9.459f, 6.626f, 7.452f, 5.625f, 7.4f)
                close()
                moveTo(18.375f, 16.598f)
                curveTo(19.384f, 16.65f, 20.6f, 14.538f, 20.6f, 11.999f)
                curveTo(20.6f, 9.459f, 19.384f, 7.348f, 18.375f, 7.4f)
                curveTo(17.374f, 7.452f, 16.8f, 9.459f, 16.8f, 11.999f)
                curveTo(16.8f, 14.538f, 17.374f, 16.546f, 18.375f, 16.598f)
                close()
            }
        }
        .build()
        return _ya360SolidMd!!
    }

private var _ya360SolidMd: ImageVector? = null
