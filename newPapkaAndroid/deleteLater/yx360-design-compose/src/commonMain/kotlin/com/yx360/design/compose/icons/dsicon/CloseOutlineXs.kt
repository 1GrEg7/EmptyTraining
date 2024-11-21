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

public val DsIcon.CloseOutlineXs: ImageVector
    get() {
        if (_closeOutlineXs != null) {
            return _closeOutlineXs!!
        }
        _closeOutlineXs = Builder(name = "CloseOutlineXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.002f, 4.586f)
                lineTo(2.413f, 1.0f)
                lineTo(1.002f, 2.412f)
                lineTo(4.587f, 5.999f)
                lineTo(1.0f, 9.585f)
                lineTo(2.42f, 11.0f)
                lineTo(6.002f, 7.415f)
                lineTo(9.566f, 10.981f)
                lineTo(10.986f, 9.566f)
                lineTo(7.416f, 5.999f)
                lineTo(11.0f, 2.412f)
                lineTo(9.589f, 1.0f)
                lineTo(6.002f, 4.586f)
                close()
            }
        }
        .build()
        return _closeOutlineXs!!
    }

private var _closeOutlineXs: ImageVector? = null
