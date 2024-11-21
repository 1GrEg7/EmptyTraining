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

public val DsIcon.UploadOutlineSm: ImageVector
    get() {
        if (_uploadOutlineSm != null) {
            return _uploadOutlineSm!!
        }
        _uploadOutlineSm = Builder(name = "UploadOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.803f, 4.828f)
                lineTo(4.975f, 6.657f)
                lineTo(3.561f, 5.243f)
                lineTo(7.096f, 1.707f)
                lineTo(7.803f, 1.0f)
                lineTo(8.51f, 1.707f)
                lineTo(12.046f, 5.243f)
                lineTo(10.632f, 6.657f)
                lineTo(8.803f, 4.828f)
                lineTo(8.803f, 10.5f)
                horizontalLineTo(6.803f)
                lineTo(6.803f, 4.828f)
                close()
                moveTo(1.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 13.657f, 2.343f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _uploadOutlineSm!!
    }

private var _uploadOutlineSm: ImageVector? = null
