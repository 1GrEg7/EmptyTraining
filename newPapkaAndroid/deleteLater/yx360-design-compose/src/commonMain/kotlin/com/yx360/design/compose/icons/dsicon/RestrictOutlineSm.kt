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

public val DsIcon.RestrictOutlineSm: ImageVector
    get() {
        if (_restrictOutlineSm != null) {
            return _restrictOutlineSm!!
        }
        _restrictOutlineSm = Builder(name = "RestrictOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.539f)
                lineTo(3.0f, 1.0f)
                lineTo(8.0f, 4.518f)
                lineTo(13.0f, 1.0f)
                lineTo(13.0f, 3.5f)
                lineTo(8.0f, 7.0f)
                lineTo(3.0f, 3.539f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.461f)
                lineTo(13.0f, 15.0f)
                lineTo(8.0f, 11.482f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 12.5f)
                lineTo(8.0f, 9.0f)
                lineTo(13.0f, 12.461f)
                close()
            }
        }
        .build()
        return _restrictOutlineSm!!
    }

private var _restrictOutlineSm: ImageVector? = null
