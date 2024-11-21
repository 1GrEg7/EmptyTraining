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

public val DsIcon.CreditCardOutlineMd: ImageVector
    get() {
        if (_creditCardOutlineMd != null) {
            return _creditCardOutlineMd!!
        }
        _creditCardOutlineMd = Builder(name = "CreditCardOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.959f, 18.0f, 17.579f, 17.999f, 18.052f, 17.967f)
                curveTo(18.508f, 17.935f, 18.682f, 17.882f, 18.765f, 17.848f)
                curveTo(19.255f, 17.645f, 19.645f, 17.255f, 19.848f, 16.765f)
                curveTo(19.882f, 16.682f, 19.935f, 16.508f, 19.967f, 16.052f)
                curveTo(19.986f, 15.768f, 19.994f, 15.431f, 19.998f, 15.0f)
                horizontalLineTo(4.002f)
                curveTo(4.006f, 15.431f, 4.014f, 15.768f, 4.033f, 16.052f)
                curveTo(4.065f, 16.508f, 4.118f, 16.682f, 4.152f, 16.765f)
                curveTo(4.355f, 17.255f, 4.745f, 17.645f, 5.235f, 17.848f)
                curveTo(5.318f, 17.882f, 5.492f, 17.935f, 5.948f, 17.967f)
                curveTo(6.421f, 17.999f, 7.041f, 18.0f, 8.0f, 18.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 9.041f, 4.001f, 8.421f, 4.033f, 7.948f)
                curveTo(4.065f, 7.492f, 4.118f, 7.318f, 4.152f, 7.235f)
                curveTo(4.355f, 6.745f, 4.745f, 6.355f, 5.235f, 6.152f)
                curveTo(5.318f, 6.118f, 5.492f, 6.065f, 5.948f, 6.033f)
                curveTo(6.421f, 6.001f, 7.041f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(16.959f, 6.0f, 17.579f, 6.001f, 18.052f, 6.033f)
                curveTo(18.508f, 6.065f, 18.682f, 6.118f, 18.765f, 6.152f)
                curveTo(19.255f, 6.355f, 19.645f, 6.745f, 19.848f, 7.235f)
                curveTo(19.882f, 7.318f, 19.935f, 7.492f, 19.967f, 7.948f)
                curveTo(19.999f, 8.421f, 20.0f, 9.041f, 20.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 15.864f, 2.0f, 16.796f, 2.304f, 17.531f)
                curveTo(2.71f, 18.511f, 3.489f, 19.289f, 4.469f, 19.695f)
                curveTo(5.204f, 20.0f, 6.136f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 20.0f, 18.796f, 20.0f, 19.531f, 19.695f)
                curveTo(20.511f, 19.289f, 21.289f, 18.511f, 21.695f, 17.531f)
                curveTo(22.0f, 16.796f, 22.0f, 15.864f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.136f, 22.0f, 7.204f, 21.695f, 6.469f)
                curveTo(21.289f, 5.489f, 20.511f, 4.71f, 19.531f, 4.304f)
                curveTo(18.796f, 4.0f, 17.864f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 4.0f, 5.204f, 4.0f, 4.469f, 4.304f)
                curveTo(3.489f, 4.71f, 2.71f, 5.489f, 2.304f, 6.469f)
                curveTo(2.0f, 7.204f, 2.0f, 8.136f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _creditCardOutlineMd!!
    }

private var _creditCardOutlineMd: ImageVector? = null
