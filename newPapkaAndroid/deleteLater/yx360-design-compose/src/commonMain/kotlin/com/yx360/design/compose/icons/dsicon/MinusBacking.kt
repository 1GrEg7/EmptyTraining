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

@Suppress("MagicNumber")
public val DsIcon.MinusBacking: ImageVector
    get() {
        if (_minusBacking != null) {
            return _minusBacking!!
        }
        _minusBacking = Builder(
            name = "MinusBacking", defaultWidth = 28.0.dp, defaultHeight =
            28.0.dp, viewportWidth = 28.0f, viewportHeight = 28.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB5B7C0)), stroke = null, fillAlpha = 0.3f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-16.0f)
                close()
            }
        }
            .build()
        return _minusBacking!!
    }

private var _minusBacking: ImageVector? = null
