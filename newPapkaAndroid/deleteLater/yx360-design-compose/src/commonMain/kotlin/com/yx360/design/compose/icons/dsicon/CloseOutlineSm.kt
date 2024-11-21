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

public val DsIcon.CloseOutlineSm: ImageVector
    get() {
        if (_closeOutlineSm != null) {
            return _closeOutlineSm!!
        }
        _closeOutlineSm = Builder(name = "CloseOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.576f, 8.0f)
                lineTo(1.5f, 3.0f)
                lineTo(2.895f, 1.605f)
                lineTo(8.0f, 6.576f)
                lineTo(13.0f, 1.5f)
                lineTo(14.414f, 2.895f)
                lineTo(9.404f, 8.0f)
                lineTo(14.414f, 13.086f)
                lineTo(13.0f, 14.5f)
                lineTo(8.0f, 9.404f)
                lineTo(3.0f, 14.5f)
                lineTo(1.605f, 13.086f)
                lineTo(6.576f, 8.0f)
                close()
            }
        }
        .build()
        return _closeOutlineSm!!
    }

private var _closeOutlineSm: ImageVector? = null
