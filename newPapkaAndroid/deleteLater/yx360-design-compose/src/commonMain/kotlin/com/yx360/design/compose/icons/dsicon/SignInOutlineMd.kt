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

public val DsIcon.SignInOutlineMd: ImageVector
    get() {
        if (_signInOutlineMd != null) {
            return _signInOutlineMd!!
        }
        _signInOutlineMd = Builder(name = "SignInOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.967f, 18.052f)
                curveTo(18.999f, 17.579f, 19.0f, 16.959f, 19.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 7.041f, 18.999f, 6.421f, 18.967f, 5.948f)
                curveTo(18.935f, 5.492f, 18.882f, 5.318f, 18.848f, 5.235f)
                curveTo(18.645f, 4.745f, 18.255f, 4.355f, 17.765f, 4.152f)
                curveTo(17.682f, 4.118f, 17.508f, 4.065f, 17.052f, 4.033f)
                curveTo(16.579f, 4.001f, 15.959f, 4.0f, 15.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                curveTo(16.864f, 2.0f, 17.796f, 2.0f, 18.531f, 2.304f)
                curveTo(19.511f, 2.71f, 20.289f, 3.489f, 20.695f, 4.469f)
                curveTo(21.0f, 5.204f, 21.0f, 6.136f, 21.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 17.864f, 21.0f, 18.796f, 20.695f, 19.531f)
                curveTo(20.289f, 20.511f, 19.511f, 21.289f, 18.531f, 21.695f)
                curveTo(17.796f, 22.0f, 16.864f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.959f, 20.0f, 16.579f, 19.999f, 17.052f, 19.967f)
                curveTo(17.508f, 19.935f, 17.682f, 19.882f, 17.765f, 19.848f)
                curveTo(18.255f, 19.645f, 18.645f, 19.255f, 18.848f, 18.765f)
                curveTo(18.882f, 18.682f, 18.935f, 18.508f, 18.967f, 18.052f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.909f, 8.707f)
                lineTo(10.323f, 7.293f)
                lineTo(15.031f, 12.0f)
                lineTo(10.323f, 16.707f)
                lineTo(8.909f, 15.293f)
                lineTo(11.202f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.202f)
                lineTo(8.909f, 8.707f)
                close()
            }
        }
        .build()
        return _signInOutlineMd!!
    }

private var _signInOutlineMd: ImageVector? = null
