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

public val DsIcon.FolderMoveOutlineMd: ImageVector
    get() {
        if (_folderMoveOutlineMd != null) {
            return _folderMoveOutlineMd!!
        }
        _folderMoveOutlineMd = Builder(name = "FolderMoveOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(18.586f, 3.414f)
                lineTo(20.086f, 5.0f)
                horizontalLineTo(16.4f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.086f)
                lineTo(18.586f, 8.578f)
                lineTo(20.0f, 9.992f)
                lineTo(24.0f, 6.0f)
                lineTo(20.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.0f)
                horizontalLineTo(11.172f)
                lineTo(9.172f, 5.0f)
                horizontalLineTo(8.0f)
                curveTo(7.041f, 5.0f, 6.421f, 5.001f, 5.948f, 5.033f)
                curveTo(5.492f, 5.064f, 5.318f, 5.118f, 5.235f, 5.152f)
                curveTo(4.745f, 5.355f, 4.355f, 5.744f, 4.152f, 6.234f)
                curveTo(4.118f, 6.318f, 4.065f, 6.491f, 4.033f, 6.947f)
                curveTo(4.001f, 7.421f, 4.0f, 8.041f, 4.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 14.959f, 4.001f, 15.578f, 4.033f, 16.052f)
                curveTo(4.065f, 16.508f, 4.118f, 16.682f, 4.152f, 16.765f)
                curveTo(4.355f, 17.255f, 4.745f, 17.645f, 5.235f, 17.848f)
                curveTo(5.318f, 17.882f, 5.492f, 17.935f, 5.948f, 17.966f)
                curveTo(6.421f, 17.999f, 7.041f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.959f, 18.0f, 17.579f, 17.999f, 18.052f, 17.966f)
                curveTo(18.508f, 17.935f, 18.682f, 17.882f, 18.765f, 17.848f)
                curveTo(19.255f, 17.645f, 19.645f, 17.255f, 19.848f, 16.765f)
                curveTo(19.882f, 16.682f, 19.935f, 16.508f, 19.967f, 16.052f)
                curveTo(19.999f, 15.578f, 20.0f, 14.959f, 20.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.864f, 22.0f, 16.795f, 21.695f, 17.531f)
                curveTo(21.289f, 18.511f, 20.511f, 19.289f, 19.531f, 19.695f)
                curveTo(18.796f, 20.0f, 17.864f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 20.0f, 5.204f, 20.0f, 4.469f, 19.695f)
                curveTo(3.489f, 19.289f, 2.71f, 18.511f, 2.304f, 17.531f)
                curveTo(2.0f, 16.795f, 2.0f, 15.864f, 2.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 7.136f, 2.0f, 6.204f, 2.304f, 5.469f)
                curveTo(2.71f, 4.489f, 3.489f, 3.71f, 4.469f, 3.304f)
                curveTo(5.204f, 3.0f, 6.136f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 5.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _folderMoveOutlineMd!!
    }

private var _folderMoveOutlineMd: ImageVector? = null
