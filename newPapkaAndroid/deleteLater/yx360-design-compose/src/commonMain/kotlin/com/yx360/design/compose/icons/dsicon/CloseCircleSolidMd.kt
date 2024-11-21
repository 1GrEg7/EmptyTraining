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

public val DsIcon.CloseCircleSolidMd: ImageVector
    get() {
        if (_closeCircleSolidMd != null) {
            return _closeCircleSolidMd!!
        }
        _closeCircleSolidMd = Builder(name = "CloseCircleSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.29f, 8.704f)
                lineTo(10.586f, 12.0f)
                lineTo(7.29f, 15.295f)
                lineTo(8.705f, 16.71f)
                lineTo(12.0f, 13.414f)
                lineTo(15.295f, 16.71f)
                lineTo(16.709f, 15.295f)
                lineTo(13.414f, 12.0f)
                lineTo(16.71f, 8.704f)
                lineTo(15.296f, 7.29f)
                lineTo(12.0f, 10.586f)
                lineTo(8.704f, 7.29f)
                lineTo(7.29f, 8.704f)
                close()
            }
        }
        .build()
        return _closeCircleSolidMd!!
    }

private var _closeCircleSolidMd: ImageVector? = null
