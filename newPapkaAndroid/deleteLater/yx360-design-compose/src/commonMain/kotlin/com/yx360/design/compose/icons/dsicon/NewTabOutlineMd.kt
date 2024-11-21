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

public val DsIcon.NewTabOutlineMd: ImageVector
    get() {
        if (_newTabOutlineMd != null) {
            return _newTabOutlineMd!!
        }
        _newTabOutlineMd = Builder(name = "NewTabOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 3.0f, 6.204f, 3.0f, 5.469f, 3.304f)
                curveTo(4.489f, 3.71f, 3.71f, 4.489f, 3.304f, 5.469f)
                curveTo(3.0f, 6.204f, 3.0f, 7.136f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.864f, 3.0f, 17.796f, 3.304f, 18.531f)
                curveTo(3.71f, 19.511f, 4.489f, 20.289f, 5.469f, 20.695f)
                curveTo(6.204f, 21.0f, 7.136f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(16.864f, 21.0f, 17.796f, 21.0f, 18.531f, 20.695f)
                curveTo(19.511f, 20.289f, 20.289f, 19.511f, 20.695f, 18.531f)
                curveTo(21.0f, 17.796f, 21.0f, 16.864f, 21.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 15.959f, 18.999f, 16.579f, 18.967f, 17.052f)
                curveTo(18.935f, 17.508f, 18.882f, 17.682f, 18.848f, 17.765f)
                curveTo(18.645f, 18.255f, 18.255f, 18.645f, 17.765f, 18.848f)
                curveTo(17.682f, 18.882f, 17.508f, 18.935f, 17.052f, 18.967f)
                curveTo(16.579f, 18.999f, 15.959f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(8.041f, 19.0f, 7.421f, 18.999f, 6.948f, 18.967f)
                curveTo(6.492f, 18.935f, 6.318f, 18.882f, 6.235f, 18.848f)
                curveTo(5.745f, 18.645f, 5.355f, 18.255f, 5.152f, 17.765f)
                curveTo(5.118f, 17.682f, 5.065f, 17.508f, 5.033f, 17.052f)
                curveTo(5.001f, 16.579f, 5.0f, 15.959f, 5.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 8.041f, 5.001f, 7.421f, 5.033f, 6.948f)
                curveTo(5.065f, 6.492f, 5.118f, 6.318f, 5.152f, 6.235f)
                curveTo(5.355f, 5.745f, 5.745f, 5.355f, 6.235f, 5.152f)
                curveTo(6.318f, 5.118f, 6.492f, 5.065f, 6.948f, 5.033f)
                curveTo(7.421f, 5.001f, 8.041f, 5.0f, 9.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.001f)
                lineTo(14.0f, 5.0f)
                lineTo(17.581f, 5.0f)
                lineTo(9.678f, 12.902f)
                lineTo(11.093f, 14.316f)
                lineTo(19.0f, 6.409f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.992f)
                verticalLineTo(3.003f)
                lineTo(14.0f, 3.001f)
                close()
            }
        }
        .build()
        return _newTabOutlineMd!!
    }

private var _newTabOutlineMd: ImageVector? = null
