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

public val DsIcon.FolderSolidLg: ImageVector
    get() {
        if (_folderSolidLg != null) {
            return _folderSolidLg!!
        }
        _folderSolidLg = Builder(name = "FolderSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.588f)
                verticalLineTo(12.412f)
                curveTo(4.0f, 10.109f, 4.0f, 8.958f, 4.365f, 8.05f)
                curveTo(4.853f, 6.84f, 5.787f, 5.878f, 6.963f, 5.376f)
                curveTo(7.845f, 5.0f, 8.963f, 5.0f, 11.2f, 5.0f)
                horizontalLineTo(13.6f)
                lineTo(16.0f, 7.471f)
                horizontalLineTo(20.8f)
                curveTo(23.037f, 7.471f, 24.155f, 7.471f, 25.037f, 7.847f)
                curveTo(26.213f, 8.348f, 27.147f, 9.31f, 27.635f, 10.521f)
                curveTo(28.0f, 11.429f, 28.0f, 12.58f, 28.0f, 14.882f)
                verticalLineTo(18.588f)
                curveTo(28.0f, 20.89f, 28.0f, 22.042f, 27.635f, 22.95f)
                curveTo(27.147f, 24.16f, 26.213f, 25.122f, 25.037f, 25.624f)
                curveTo(24.155f, 26.0f, 23.037f, 26.0f, 20.8f, 26.0f)
                horizontalLineTo(11.2f)
                curveTo(8.963f, 26.0f, 7.845f, 26.0f, 6.963f, 25.624f)
                curveTo(5.787f, 25.122f, 4.853f, 24.16f, 4.365f, 22.95f)
                curveTo(4.0f, 22.042f, 4.0f, 20.89f, 4.0f, 18.588f)
                close()
            }
        }
        .build()
        return _folderSolidLg!!
    }

private var _folderSolidLg: ImageVector? = null
