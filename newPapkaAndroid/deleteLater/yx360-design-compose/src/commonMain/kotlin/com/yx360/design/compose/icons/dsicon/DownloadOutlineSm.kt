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

public val DsIcon.DownloadOutlineSm: ImageVector
    get() {
        if (_downloadOutlineSm != null) {
            return _downloadOutlineSm!!
        }
        _downloadOutlineSm = Builder(name = "DownloadOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.632f, 4.843f)
                lineTo(8.803f, 6.672f)
                lineTo(8.803f, 1.0f)
                horizontalLineTo(6.803f)
                lineTo(6.803f, 6.672f)
                lineTo(4.975f, 4.843f)
                lineTo(3.561f, 6.257f)
                lineTo(7.803f, 10.5f)
                lineTo(12.046f, 6.257f)
                lineTo(10.632f, 4.843f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 12.552f, 3.448f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.343f, 15.0f, 1.0f, 13.657f, 1.0f, 12.0f)
                close()
            }
        }
        .build()
        return _downloadOutlineSm!!
    }

private var _downloadOutlineSm: ImageVector? = null
