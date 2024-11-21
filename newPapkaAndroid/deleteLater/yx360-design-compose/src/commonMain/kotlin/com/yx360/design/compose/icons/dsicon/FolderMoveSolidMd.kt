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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.FolderMoveSolidMd: ImageVector
    get() {
        if (_folderMoveSolidMd != null) {
            return _folderMoveSolidMd!!
        }
        _folderMoveSolidMd = Builder(name = "FolderMoveSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 2.0f)
                    lineTo(18.586f, 3.45f)
                    lineTo(20.086f, 5.094f)
                    horizontalLineTo(16.4f)
                    verticalLineTo(7.094f)
                    horizontalLineTo(20.086f)
                    lineTo(18.586f, 8.584f)
                    lineTo(20.0f, 9.998f)
                    lineTo(24.004f, 6.094f)
                    lineTo(20.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 5.0f)
                    horizontalLineTo(14.053f)
                    curveTo(14.018f, 5.262f, 14.0f, 5.529f, 14.0f, 5.8f)
                    curveTo(14.0f, 9.113f, 16.686f, 11.8f, 20.0f, 11.8f)
                    curveTo(20.701f, 11.8f, 21.374f, 11.679f, 22.0f, 11.458f)
                    verticalLineTo(14.0f)
                    curveTo(22.0f, 15.864f, 22.0f, 16.796f, 21.695f, 17.531f)
                    curveTo(21.289f, 18.511f, 20.511f, 19.289f, 19.531f, 19.695f)
                    curveTo(18.796f, 20.0f, 17.864f, 20.0f, 16.0f, 20.0f)
                    horizontalLineTo(8.0f)
                    curveTo(6.136f, 20.0f, 5.204f, 20.0f, 4.469f, 19.695f)
                    curveTo(3.489f, 19.289f, 2.71f, 18.511f, 2.304f, 17.531f)
                    curveTo(2.0f, 16.796f, 2.0f, 15.864f, 2.0f, 14.0f)
                    verticalLineTo(9.0f)
                    curveTo(2.0f, 7.136f, 2.0f, 6.204f, 2.304f, 5.469f)
                    curveTo(2.71f, 4.489f, 3.489f, 3.71f, 4.469f, 3.304f)
                    curveTo(5.204f, 3.0f, 6.136f, 3.0f, 8.0f, 3.0f)
                    horizontalLineTo(10.0f)
                    lineTo(12.0f, 5.0f)
                    close()
                }
            }
        }
        .build()
        return _folderMoveSolidMd!!
    }

private var _folderMoveSolidMd: ImageVector? = null
