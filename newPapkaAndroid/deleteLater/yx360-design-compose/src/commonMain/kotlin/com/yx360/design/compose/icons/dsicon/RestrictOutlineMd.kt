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

public val DsIcon.RestrictOutlineMd: ImageVector
    get() {
        if (_restrictOutlineMd != null) {
            return _restrictOutlineMd!!
        }
        _restrictOutlineMd = Builder(name = "RestrictOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.539f)
                verticalLineTo(3.0f)
                lineTo(12.0f, 8.518f)
                lineTo(19.0f, 3.0f)
                verticalLineTo(5.539f)
                lineTo(12.0f, 11.0f)
                lineTo(5.0f, 5.539f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.461f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 15.482f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 18.461f)
                lineTo(12.0f, 13.0f)
                lineTo(19.0f, 18.461f)
                close()
            }
        }
        .build()
        return _restrictOutlineMd!!
    }

private var _restrictOutlineMd: ImageVector? = null
