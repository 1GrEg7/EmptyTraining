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

public val DsIcon.DownloadOutlineMd: ImageVector
    get() {
        if (_downloadOutlineMd != null) {
            return _downloadOutlineMd!!
        }
        _downloadOutlineMd = Builder(name = "DownloadOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.707f, 10.879f)
                lineTo(7.293f, 12.293f)
                lineTo(12.0f, 17.0f)
                lineTo(16.707f, 12.293f)
                lineTo(15.293f, 10.879f)
                lineTo(13.0f, 13.172f)
                lineTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.172f)
                lineTo(8.707f, 10.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.959f, 20.0f, 17.579f, 19.999f, 18.052f, 19.967f)
                curveTo(18.508f, 19.935f, 18.682f, 19.882f, 18.765f, 19.848f)
                curveTo(19.255f, 19.645f, 19.645f, 19.255f, 19.848f, 18.765f)
                curveTo(19.882f, 18.682f, 19.935f, 18.508f, 19.967f, 18.052f)
                curveTo(19.999f, 17.579f, 20.0f, 16.959f, 20.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.864f, 22.0f, 18.796f, 21.695f, 19.531f)
                curveTo(21.289f, 20.511f, 20.511f, 21.289f, 19.531f, 21.695f)
                curveTo(18.796f, 22.0f, 17.864f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 22.0f, 5.204f, 22.0f, 4.469f, 21.695f)
                curveTo(3.489f, 21.289f, 2.71f, 20.511f, 2.304f, 19.531f)
                curveTo(2.0f, 18.796f, 2.0f, 17.864f, 2.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.959f, 4.001f, 17.579f, 4.033f, 18.052f)
                curveTo(4.065f, 18.508f, 4.118f, 18.682f, 4.152f, 18.765f)
                curveTo(4.355f, 19.255f, 4.745f, 19.645f, 5.235f, 19.848f)
                curveTo(5.318f, 19.882f, 5.492f, 19.935f, 5.948f, 19.967f)
                curveTo(6.421f, 19.999f, 7.041f, 20.0f, 8.0f, 20.0f)
                close()
            }
        }
        .build()
        return _downloadOutlineMd!!
    }

private var _downloadOutlineMd: ImageVector? = null
