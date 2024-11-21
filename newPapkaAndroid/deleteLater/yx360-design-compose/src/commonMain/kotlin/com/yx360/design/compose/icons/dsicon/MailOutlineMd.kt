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

public val DsIcon.MailOutlineMd: ImageVector
    get() {
        if (_mailOutlineMd != null) {
            return _mailOutlineMd!!
        }
        _mailOutlineMd = Builder(name = "MailOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 8.136f, 2.0f, 7.204f, 2.304f, 6.469f)
                curveTo(2.71f, 5.489f, 3.489f, 4.71f, 4.469f, 4.304f)
                curveTo(5.204f, 4.0f, 6.136f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 4.0f, 18.796f, 4.0f, 19.531f, 4.304f)
                curveTo(20.511f, 4.71f, 21.289f, 5.489f, 21.695f, 6.469f)
                curveTo(22.0f, 7.204f, 22.0f, 8.136f, 22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.864f, 22.0f, 16.796f, 21.695f, 17.531f)
                curveTo(21.289f, 18.511f, 20.511f, 19.289f, 19.531f, 19.695f)
                curveTo(18.796f, 20.0f, 17.864f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 20.0f, 5.204f, 20.0f, 4.469f, 19.695f)
                curveTo(3.489f, 19.289f, 2.71f, 18.511f, 2.304f, 17.531f)
                curveTo(2.0f, 16.796f, 2.0f, 15.864f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(4.001f, 9.307f)
                curveTo(4.0f, 9.517f, 4.0f, 9.747f, 4.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 14.959f, 4.001f, 15.578f, 4.033f, 16.052f)
                curveTo(4.065f, 16.508f, 4.118f, 16.682f, 4.152f, 16.765f)
                curveTo(4.355f, 17.255f, 4.745f, 17.645f, 5.235f, 17.848f)
                curveTo(5.318f, 17.882f, 5.492f, 17.935f, 5.948f, 17.967f)
                curveTo(6.421f, 17.999f, 7.041f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.959f, 18.0f, 17.579f, 17.999f, 18.052f, 17.967f)
                curveTo(18.508f, 17.935f, 18.682f, 17.882f, 18.765f, 17.848f)
                curveTo(19.255f, 17.645f, 19.645f, 17.255f, 19.848f, 16.765f)
                curveTo(19.882f, 16.682f, 19.935f, 16.508f, 19.967f, 16.052f)
                curveTo(19.999f, 15.578f, 20.0f, 14.959f, 20.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 9.752f, 20.0f, 9.527f, 19.999f, 9.321f)
                lineTo(12.998f, 13.349f)
                curveTo(12.38f, 13.705f, 11.618f, 13.705f, 11.001f, 13.348f)
                lineTo(4.001f, 9.307f)
                close()
                moveTo(19.8f, 7.128f)
                curveTo(19.587f, 6.688f, 19.219f, 6.34f, 18.765f, 6.152f)
                curveTo(18.682f, 6.118f, 18.508f, 6.065f, 18.052f, 6.033f)
                curveTo(17.579f, 6.001f, 16.959f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.041f, 6.0f, 6.421f, 6.001f, 5.948f, 6.033f)
                curveTo(5.492f, 6.065f, 5.318f, 6.118f, 5.235f, 6.152f)
                curveTo(4.785f, 6.339f, 4.42f, 6.682f, 4.206f, 7.116f)
                lineTo(12.0f, 11.616f)
                lineTo(19.8f, 7.128f)
                close()
            }
        }
        .build()
        return _mailOutlineMd!!
    }

private var _mailOutlineMd: ImageVector? = null
