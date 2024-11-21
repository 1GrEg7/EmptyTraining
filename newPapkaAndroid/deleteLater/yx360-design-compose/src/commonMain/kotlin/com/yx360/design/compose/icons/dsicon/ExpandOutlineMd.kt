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

public val DsIcon.ExpandOutlineMd: ImageVector
    get() {
        if (_expandOutlineMd != null) {
            return _expandOutlineMd!!
        }
        _expandOutlineMd = Builder(name = "ExpandOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.461f)
                lineTo(19.0f, 10.0f)
                lineTo(12.0f, 4.482f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 7.461f)
                lineTo(12.0f, 2.0f)
                lineTo(19.0f, 7.461f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.539f)
                lineTo(5.0f, 14.0f)
                lineTo(12.0f, 19.518f)
                lineTo(19.0f, 14.0f)
                verticalLineTo(16.539f)
                lineTo(12.0f, 22.0f)
                lineTo(5.0f, 16.539f)
                close()
            }
        }
        .build()
        return _expandOutlineMd!!
    }

private var _expandOutlineMd: ImageVector? = null
