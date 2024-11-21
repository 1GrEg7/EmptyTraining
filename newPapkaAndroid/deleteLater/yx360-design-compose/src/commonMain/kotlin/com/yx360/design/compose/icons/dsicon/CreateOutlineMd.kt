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

public val DsIcon.CreateOutlineMd: ImageVector
    get() {
        if (_createOutlineMd != null) {
            return _createOutlineMd!!
        }
        _createOutlineMd = Builder(name = "CreateOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.691f, 2.85f)
                curveTo(18.671f, 2.154f, 17.329f, 2.154f, 16.309f, 2.85f)
                curveTo(16.075f, 3.01f, 15.855f, 3.23f, 15.599f, 3.486f)
                lineTo(6.5f, 12.585f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.414f)
                lineTo(20.514f, 8.4f)
                curveTo(20.769f, 8.145f, 20.99f, 7.925f, 21.149f, 7.691f)
                curveTo(21.846f, 6.671f, 21.846f, 5.328f, 21.149f, 4.308f)
                curveTo(20.99f, 4.074f, 20.769f, 3.854f, 20.514f, 3.599f)
                lineTo(20.401f, 3.486f)
                curveTo(20.145f, 3.23f, 19.925f, 3.01f, 19.691f, 2.85f)
                close()
                moveTo(17.436f, 4.502f)
                curveTo(17.776f, 4.27f, 18.224f, 4.27f, 18.564f, 4.502f)
                curveTo(18.622f, 4.542f, 18.699f, 4.613f, 19.043f, 4.957f)
                curveTo(19.387f, 5.301f, 19.458f, 5.378f, 19.497f, 5.436f)
                curveTo(19.73f, 5.776f, 19.73f, 6.223f, 19.497f, 6.563f)
                curveTo(19.458f, 6.621f, 19.387f, 6.698f, 19.043f, 7.043f)
                lineTo(18.5f, 7.585f)
                lineTo(16.414f, 5.5f)
                lineTo(16.957f, 4.957f)
                curveTo(17.301f, 4.613f, 17.378f, 4.542f, 17.436f, 4.502f)
                close()
                moveTo(15.0f, 6.914f)
                lineTo(17.086f, 9.0f)
                lineTo(10.586f, 15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(13.414f)
                lineTo(15.0f, 6.914f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.041f, 6.0f, 6.421f, 6.001f, 5.948f, 6.033f)
                curveTo(5.492f, 6.065f, 5.318f, 6.118f, 5.235f, 6.152f)
                curveTo(4.745f, 6.355f, 4.355f, 6.745f, 4.152f, 7.235f)
                curveTo(4.118f, 7.318f, 4.065f, 7.492f, 4.033f, 7.948f)
                curveTo(4.001f, 8.421f, 4.0f, 9.041f, 4.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.959f, 4.001f, 17.579f, 4.033f, 18.052f)
                curveTo(4.065f, 18.508f, 4.118f, 18.682f, 4.152f, 18.765f)
                curveTo(4.355f, 19.255f, 4.745f, 19.645f, 5.235f, 19.848f)
                curveTo(5.318f, 19.882f, 5.492f, 19.935f, 5.948f, 19.967f)
                curveTo(6.421f, 19.999f, 7.041f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(14.959f, 20.0f, 15.578f, 19.999f, 16.052f, 19.967f)
                curveTo(16.508f, 19.935f, 16.682f, 19.882f, 16.765f, 19.848f)
                curveTo(17.255f, 19.645f, 17.645f, 19.255f, 17.848f, 18.765f)
                curveTo(17.882f, 18.682f, 17.935f, 18.508f, 17.967f, 18.052f)
                curveTo(17.999f, 17.579f, 18.0f, 16.959f, 18.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 17.864f, 20.0f, 18.796f, 19.695f, 19.531f)
                curveTo(19.289f, 20.511f, 18.511f, 21.289f, 17.531f, 21.695f)
                curveTo(16.796f, 22.0f, 15.864f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 22.0f, 5.204f, 22.0f, 4.469f, 21.695f)
                curveTo(3.489f, 21.289f, 2.71f, 20.511f, 2.304f, 19.531f)
                curveTo(2.0f, 18.796f, 2.0f, 17.864f, 2.0f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.136f, 2.0f, 7.204f, 2.304f, 6.469f)
                curveTo(2.71f, 5.489f, 3.489f, 4.71f, 4.469f, 4.304f)
                curveTo(5.204f, 4.0f, 6.136f, 4.0f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _createOutlineMd!!
    }

private var _createOutlineMd: ImageVector? = null
