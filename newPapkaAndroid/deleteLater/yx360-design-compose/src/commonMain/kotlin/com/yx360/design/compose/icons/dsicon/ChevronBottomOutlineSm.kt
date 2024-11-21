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

public val DsIcon.ChevronBottomOutlineSm: ImageVector
    get() {
        if (_chevronBottomOutlineSm != null) {
            return _chevronBottomOutlineSm!!
        }
        _chevronBottomOutlineSm = Builder(name = "ChevronBottomOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.539f)
                verticalLineTo(4.0f)
                lineTo(8.0f, 9.518f)
                lineTo(15.0f, 4.0f)
                verticalLineTo(6.539f)
                lineTo(8.0f, 12.0f)
                lineTo(1.0f, 6.539f)
                close()
            }
        }
        .build()
        return _chevronBottomOutlineSm!!
    }

private var _chevronBottomOutlineSm: ImageVector? = null
