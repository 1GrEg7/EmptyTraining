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

public val DsIcon.PlusOutlineMd: ImageVector
    get() {
        if (_plusOutlineMd != null) {
            return _plusOutlineMd!!
        }
        _plusOutlineMd = Builder(name = "PlusOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.992f)
                verticalLineTo(2.992f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.992f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.992f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.992f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.992f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.992f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _plusOutlineMd!!
    }

private var _plusOutlineMd: ImageVector? = null
