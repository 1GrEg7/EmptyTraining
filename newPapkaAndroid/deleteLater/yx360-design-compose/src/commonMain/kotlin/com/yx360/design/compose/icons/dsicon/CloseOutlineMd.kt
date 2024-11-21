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

public val DsIcon.CloseOutlineMd: ImageVector
    get() {
        if (_closeOutlineMd != null) {
            return _closeOutlineMd!!
        }
        _closeOutlineMd = Builder(name = "CloseOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.584f, 12.0f)
                lineTo(4.0f, 5.416f)
                lineTo(5.416f, 4.0f)
                lineTo(12.0f, 10.584f)
                lineTo(18.584f, 4.0f)
                lineTo(20.0f, 5.416f)
                lineTo(13.416f, 12.0f)
                lineTo(20.0f, 18.584f)
                lineTo(18.584f, 20.0f)
                lineTo(12.0f, 13.416f)
                lineTo(5.416f, 20.0f)
                lineTo(4.0f, 18.584f)
                lineTo(10.584f, 12.0f)
                close()
            }
        }
        .build()
        return _closeOutlineMd!!
    }

private var _closeOutlineMd: ImageVector? = null
