package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.FolderSolidSm: ImageVector
    get() {
        if (_folderSolidSm != null) {
            return _folderSolidSm!!
        }
        _folderSolidSm = Builder(name = "FolderSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.093f, 2.538f)
                lineTo(6.593f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 1.0f, 0.0f, 2.791f, 0.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(0.0f, 13.209f, 1.791f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 15.0f, 16.0f, 13.209f, 16.0f, 11.0f)
                verticalLineTo(6.538f)
                curveTo(16.0f, 4.329f, 14.209f, 2.538f, 12.0f, 2.538f)
                horizontalLineTo(8.093f)
                close()
            }
        }
        .build()
        return _folderSolidSm!!
    }

private var _folderSolidSm: ImageVector? = null
