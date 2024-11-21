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

public val DsIcon.MinusOutlineXxs: ImageVector
    get() {
        if (_minusOutlineXxs != null) {
            return _minusOutlineXxs!!
        }
        _minusOutlineXxs = Builder(name = "MinusOutlineXxs", defaultWidth = 8.0.dp, defaultHeight =
                8.0.dp, viewportWidth = 8.0f, viewportHeight = 8.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _minusOutlineXxs!!
    }

private var _minusOutlineXxs: ImageVector? = null
