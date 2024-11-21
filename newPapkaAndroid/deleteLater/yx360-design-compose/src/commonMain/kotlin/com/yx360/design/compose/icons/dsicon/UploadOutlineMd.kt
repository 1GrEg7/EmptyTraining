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

public val DsIcon.UploadOutlineMd: ImageVector
    get() {
        if (_uploadOutlineMd != null) {
            return _uploadOutlineMd!!
        }
        _uploadOutlineMd = Builder(name = "UploadOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 6.707f)
                lineTo(15.293f, 8.121f)
                lineTo(13.0f, 5.828f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.828f)
                lineTo(8.707f, 8.121f)
                lineTo(7.293f, 6.707f)
                lineTo(12.0f, 2.0f)
                lineTo(16.707f, 6.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(7.041f, 20.0f, 6.421f, 19.999f, 5.948f, 19.967f)
                curveTo(5.492f, 19.935f, 5.318f, 19.882f, 5.235f, 19.848f)
                curveTo(4.745f, 19.645f, 4.355f, 19.255f, 4.152f, 18.765f)
                curveTo(4.118f, 18.682f, 4.065f, 18.508f, 4.033f, 18.052f)
                curveTo(4.001f, 17.579f, 4.0f, 16.959f, 4.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.864f, 2.0f, 18.796f, 2.304f, 19.531f)
                curveTo(2.71f, 20.511f, 3.489f, 21.289f, 4.469f, 21.695f)
                curveTo(5.204f, 22.0f, 6.136f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 22.0f, 18.796f, 22.0f, 19.531f, 21.695f)
                curveTo(20.511f, 21.289f, 21.289f, 20.511f, 21.695f, 19.531f)
                curveTo(22.0f, 18.796f, 22.0f, 17.864f, 22.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 16.959f, 19.999f, 17.579f, 19.967f, 18.052f)
                curveTo(19.935f, 18.508f, 19.882f, 18.682f, 19.848f, 18.765f)
                curveTo(19.645f, 19.255f, 19.255f, 19.645f, 18.765f, 19.848f)
                curveTo(18.682f, 19.882f, 18.508f, 19.935f, 18.052f, 19.967f)
                curveTo(17.579f, 19.999f, 16.959f, 20.0f, 16.0f, 20.0f)
                close()
            }
        }
        .build()
        return _uploadOutlineMd!!
    }

private var _uploadOutlineMd: ImageVector? = null
