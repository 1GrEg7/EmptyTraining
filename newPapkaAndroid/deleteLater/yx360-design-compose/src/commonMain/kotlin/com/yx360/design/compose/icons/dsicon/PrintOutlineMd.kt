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

public val DsIcon.PrintOutlineMd: ImageVector
    get() {
        if (_printOutlineMd != null) {
            return _printOutlineMd!!
        }
        _printOutlineMd = Builder(name = "PrintOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                verticalLineTo(7.025f)
                curveTo(4.346f, 7.058f, 3.878f, 7.134f, 3.47f, 7.302f)
                curveTo(2.489f, 7.708f, 1.71f, 8.487f, 1.304f, 9.468f)
                curveTo(1.0f, 10.203f, 1.0f, 11.134f, 1.0f, 12.997f)
                curveTo(1.0f, 14.859f, 1.0f, 15.791f, 1.304f, 16.525f)
                curveTo(1.71f, 17.506f, 2.489f, 18.285f, 3.47f, 18.691f)
                curveTo(3.878f, 18.86f, 4.346f, 18.935f, 5.0f, 18.969f)
                verticalLineTo(21.996f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.969f)
                curveTo(19.654f, 18.935f, 20.122f, 18.86f, 20.53f, 18.691f)
                curveTo(21.511f, 18.285f, 22.29f, 17.506f, 22.696f, 16.525f)
                curveTo(23.0f, 15.791f, 23.0f, 14.859f, 23.0f, 12.997f)
                curveTo(23.0f, 11.134f, 23.0f, 10.203f, 22.696f, 9.468f)
                curveTo(22.29f, 8.487f, 21.511f, 7.708f, 20.53f, 7.302f)
                curveTo(20.122f, 7.134f, 19.654f, 7.058f, 19.0f, 7.025f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.0f, 6.998f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.998f)
                close()
                moveTo(4.948f, 9.031f)
                curveTo(5.251f, 9.011f, 5.613f, 9.003f, 6.086f, 9.0f)
                horizontalLineTo(17.914f)
                curveTo(18.387f, 9.003f, 18.749f, 9.011f, 19.052f, 9.031f)
                curveTo(19.508f, 9.063f, 19.682f, 9.116f, 19.765f, 9.15f)
                curveTo(20.255f, 9.353f, 20.645f, 9.743f, 20.848f, 10.233f)
                curveTo(20.882f, 10.316f, 20.935f, 10.49f, 20.967f, 10.946f)
                curveTo(20.999f, 11.419f, 21.0f, 12.038f, 21.0f, 12.997f)
                curveTo(21.0f, 13.955f, 20.999f, 14.574f, 20.967f, 15.048f)
                curveTo(20.935f, 15.504f, 20.882f, 15.677f, 20.848f, 15.76f)
                curveTo(20.645f, 16.251f, 20.255f, 16.64f, 19.765f, 16.844f)
                curveTo(19.682f, 16.878f, 19.508f, 16.931f, 19.052f, 16.962f)
                lineTo(19.0f, 16.966f)
                verticalLineTo(12.996f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.966f)
                lineTo(4.948f, 16.962f)
                curveTo(4.492f, 16.931f, 4.318f, 16.878f, 4.235f, 16.844f)
                curveTo(3.745f, 16.64f, 3.355f, 16.251f, 3.152f, 15.76f)
                curveTo(3.118f, 15.677f, 3.064f, 15.504f, 3.033f, 15.048f)
                curveTo(3.001f, 14.574f, 3.0f, 13.955f, 3.0f, 12.997f)
                curveTo(3.0f, 12.038f, 3.001f, 11.419f, 3.033f, 10.946f)
                curveTo(3.064f, 10.49f, 3.118f, 10.316f, 3.152f, 10.233f)
                curveTo(3.355f, 9.743f, 3.745f, 9.353f, 4.235f, 9.15f)
                curveTo(4.318f, 9.116f, 4.492f, 9.063f, 4.948f, 9.031f)
                close()
                moveTo(7.0f, 19.996f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.996f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.996f)
                close()
            }
        }
        .build()
        return _printOutlineMd!!
    }

private var _printOutlineMd: ImageVector? = null
