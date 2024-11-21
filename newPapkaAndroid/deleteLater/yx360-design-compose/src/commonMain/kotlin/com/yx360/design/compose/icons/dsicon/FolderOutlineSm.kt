package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.FolderOutlineSm: ImageVector
    get() {
        if (_folderOutlineSm != null) {
            return _folderOutlineSm!!
        }
        _folderOutlineSm = Builder(name = "FolderOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.593f, 1.0f)
                lineTo(8.093f, 2.538f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 2.538f, 16.0f, 4.329f, 16.0f, 6.538f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 13.209f, 14.209f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 15.0f, 0.0f, 13.209f, 0.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(0.0f, 2.791f, 1.791f, 1.0f, 4.0f, 1.0f)
                horizontalLineTo(6.593f)
                close()
                moveTo(7.25f, 4.538f)
                lineTo(5.75f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 3.0f, 2.0f, 3.895f, 2.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 12.105f, 2.895f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 13.0f, 14.0f, 12.105f, 14.0f, 11.0f)
                verticalLineTo(6.538f)
                curveTo(14.0f, 5.434f, 13.105f, 4.538f, 12.0f, 4.538f)
                horizontalLineTo(7.25f)
                close()
            }
        }
        .build()
        return _folderOutlineSm!!
    }

private var _folderOutlineSm: ImageVector? = null
