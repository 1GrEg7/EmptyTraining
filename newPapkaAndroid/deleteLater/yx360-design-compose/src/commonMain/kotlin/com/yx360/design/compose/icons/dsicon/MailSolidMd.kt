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

public val DsIcon.MailSolidMd: ImageVector
    get() {
        if (_mailSolidMd != null) {
            return _mailSolidMd!!
        }
        _mailSolidMd = Builder(name = "MailSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.5f)
                lineTo(19.967f, 7.948f)
                curveTo(19.935f, 7.492f, 19.882f, 7.318f, 19.848f, 7.235f)
                curveTo(19.645f, 6.745f, 19.255f, 6.355f, 18.765f, 6.152f)
                curveTo(18.682f, 6.118f, 18.508f, 6.065f, 18.052f, 6.033f)
                curveTo(17.579f, 6.001f, 16.959f, 6.0f, 16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveTo(7.041f, 6.0f, 6.421f, 6.001f, 5.948f, 6.033f)
                curveTo(5.492f, 6.065f, 5.318f, 6.118f, 5.235f, 6.152f)
                curveTo(4.745f, 6.355f, 4.355f, 6.745f, 4.152f, 7.235f)
                curveTo(4.118f, 7.318f, 4.065f, 7.492f, 4.033f, 7.948f)
                lineTo(12.0f, 12.5f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.864f, 22.0f, 16.796f, 21.695f, 17.531f)
                curveTo(21.289f, 18.511f, 20.511f, 19.289f, 19.531f, 19.695f)
                curveTo(18.796f, 20.0f, 17.864f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 20.0f, 5.204f, 20.0f, 4.469f, 19.695f)
                curveTo(3.489f, 19.289f, 2.71f, 18.511f, 2.304f, 17.531f)
                curveTo(2.0f, 16.796f, 2.0f, 15.864f, 2.0f, 14.0f)
                lineTo(2.0f, 10.0f)
                curveTo(2.0f, 8.136f, 2.0f, 7.204f, 2.304f, 6.469f)
                curveTo(2.71f, 5.489f, 3.489f, 4.71f, 4.469f, 4.304f)
                curveTo(5.204f, 4.0f, 6.136f, 4.0f, 8.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                curveTo(17.864f, 4.0f, 18.796f, 4.0f, 19.531f, 4.304f)
                curveTo(20.511f, 4.71f, 21.289f, 5.489f, 21.695f, 6.469f)
                curveTo(22.0f, 7.204f, 22.0f, 8.136f, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mailSolidMd!!
    }

private var _mailSolidMd: ImageVector? = null
