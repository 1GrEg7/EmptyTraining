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

public val DsIcon.SignOutOutlineMd: ImageVector
    get() {
        if (_signOutOutlineMd != null) {
            return _signOutOutlineMd!!
        }
        _signOutOutlineMd = Builder(name = "SignOutOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                lineTo(5.0f, 8.0f)
                curveTo(5.0f, 7.041f, 5.001f, 6.421f, 5.033f, 5.948f)
                curveTo(5.065f, 5.492f, 5.118f, 5.318f, 5.152f, 5.235f)
                curveTo(5.355f, 4.745f, 5.745f, 4.355f, 6.235f, 4.152f)
                curveTo(6.318f, 4.118f, 6.492f, 4.065f, 6.948f, 4.033f)
                curveTo(7.421f, 4.001f, 8.041f, 4.0f, 9.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 2.0f, 6.204f, 2.0f, 5.469f, 2.304f)
                curveTo(4.489f, 2.71f, 3.71f, 3.489f, 3.304f, 4.469f)
                curveTo(3.0f, 5.204f, 3.0f, 6.136f, 3.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 17.864f, 3.0f, 18.796f, 3.304f, 19.531f)
                curveTo(3.71f, 20.511f, 4.489f, 21.289f, 5.469f, 21.695f)
                curveTo(6.204f, 22.0f, 7.136f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                curveTo(8.041f, 20.0f, 7.421f, 19.999f, 6.948f, 19.967f)
                curveTo(6.492f, 19.935f, 6.318f, 19.882f, 6.235f, 19.848f)
                curveTo(5.745f, 19.645f, 5.355f, 19.255f, 5.152f, 18.765f)
                curveTo(5.118f, 18.682f, 5.065f, 18.508f, 5.033f, 18.052f)
                curveTo(5.001f, 17.579f, 5.0f, 16.959f, 5.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.879f, 8.707f)
                lineTo(17.293f, 7.293f)
                lineTo(22.0f, 12.0f)
                lineTo(17.293f, 16.707f)
                lineTo(15.879f, 15.293f)
                lineTo(18.172f, 13.0f)
                lineTo(8.969f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.172f)
                lineTo(15.879f, 8.707f)
                close()
            }
        }
        .build()
        return _signOutOutlineMd!!
    }

private var _signOutOutlineMd: ImageVector? = null
