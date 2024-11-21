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

public val DsIcon.TagSolidMd: ImageVector
    get() {
        if (_tagSolidMd != null) {
            return _tagSolidMd!!
        }
        _tagSolidMd = Builder(name = "TagSolidMd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.304f, 6.469f)
                curveTo(2.0f, 7.204f, 2.0f, 8.136f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.864f, 2.0f, 16.796f, 2.304f, 17.531f)
                curveTo(2.71f, 18.511f, 3.489f, 19.289f, 4.469f, 19.695f)
                curveTo(5.204f, 20.0f, 6.136f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(14.675f)
                curveTo(15.753f, 20.0f, 16.292f, 20.0f, 16.784f, 19.873f)
                curveTo(17.441f, 19.703f, 18.044f, 19.369f, 18.536f, 18.902f)
                curveTo(18.905f, 18.552f, 19.191f, 18.094f, 19.763f, 17.18f)
                lineTo(21.509f, 14.385f)
                curveTo(21.99f, 13.617f, 22.23f, 13.232f, 22.346f, 12.827f)
                curveTo(22.501f, 12.287f, 22.501f, 11.713f, 22.346f, 11.173f)
                curveTo(22.23f, 10.768f, 21.99f, 10.383f, 21.509f, 9.615f)
                lineTo(19.763f, 6.82f)
                curveTo(19.191f, 5.906f, 18.905f, 5.449f, 18.536f, 5.098f)
                curveTo(18.044f, 4.631f, 17.441f, 4.297f, 16.784f, 4.127f)
                curveTo(16.292f, 4.0f, 15.753f, 4.0f, 14.675f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 4.0f, 5.204f, 4.0f, 4.469f, 4.304f)
                curveTo(3.489f, 4.71f, 2.71f, 5.489f, 2.304f, 6.469f)
                close()
                moveTo(17.0f, 14.0f)
                curveTo(18.105f, 14.0f, 19.0f, 13.105f, 19.0f, 12.0f)
                curveTo(19.0f, 10.895f, 18.105f, 10.0f, 17.0f, 10.0f)
                curveTo(15.895f, 10.0f, 15.0f, 10.895f, 15.0f, 12.0f)
                curveTo(15.0f, 13.105f, 15.895f, 14.0f, 17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _tagSolidMd!!
    }

private var _tagSolidMd: ImageVector? = null
