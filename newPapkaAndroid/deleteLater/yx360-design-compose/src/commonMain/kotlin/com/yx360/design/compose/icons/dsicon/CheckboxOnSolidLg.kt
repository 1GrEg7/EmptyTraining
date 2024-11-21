package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CheckboxOnSolidLg: ImageVector
    get() {
        if (_checkboxOnSolidLg != null) {
            return _checkboxOnSolidLg!!
        }
        _checkboxOnSolidLg = Builder(name = "CheckboxOnSolidLg", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.609f, 8.939f)
                curveTo(4.0f, 10.409f, 4.0f, 12.273f, 4.0f, 16.0f)
                curveTo(4.0f, 19.728f, 4.0f, 21.591f, 4.609f, 23.062f)
                curveTo(5.421f, 25.022f, 6.978f, 26.579f, 8.939f, 27.391f)
                curveTo(10.409f, 28.0f, 12.273f, 28.0f, 16.0f, 28.0f)
                curveTo(19.728f, 28.0f, 21.591f, 28.0f, 23.062f, 27.391f)
                curveTo(25.022f, 26.579f, 26.579f, 25.022f, 27.391f, 23.062f)
                curveTo(28.0f, 21.591f, 28.0f, 19.728f, 28.0f, 16.0f)
                curveTo(28.0f, 12.273f, 28.0f, 10.409f, 27.391f, 8.939f)
                curveTo(26.579f, 6.978f, 25.022f, 5.421f, 23.062f, 4.609f)
                curveTo(21.591f, 4.0f, 19.728f, 4.0f, 16.0f, 4.0f)
                curveTo(12.273f, 4.0f, 10.409f, 4.0f, 8.939f, 4.609f)
                curveTo(6.978f, 5.421f, 5.421f, 6.978f, 4.609f, 8.939f)
                close()
                moveTo(8.5f, 16.502f)
                lineTo(14.001f, 22.005f)
                lineTo(23.503f, 12.5f)
                lineTo(22.003f, 11.0f)
                lineTo(14.001f, 19.065f)
                lineTo(9.997f, 15.001f)
                lineTo(8.5f, 16.502f)
                close()
            }
        }
        .build()
        return _checkboxOnSolidLg!!
    }

private var _checkboxOnSolidLg: ImageVector? = null
