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

public val DsIcon.EditOutlineSm: ImageVector
    get() {
        if (_editOutlineSm != null) {
            return _editOutlineSm!!
        }
        _editOutlineSm = Builder(name = "EditOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.663f, 6.389f)
                lineTo(6.064f, 13.988f)
                lineTo(2.012f, 14.895f)
                lineTo(1.105f, 13.881f)
                lineTo(2.011f, 9.935f)
                lineTo(9.61f, 2.336f)
                curveTo(10.729f, 1.216f, 12.544f, 1.216f, 13.663f, 2.336f)
                curveTo(14.782f, 3.455f, 14.782f, 5.269f, 13.663f, 6.389f)
                close()
                moveTo(10.023f, 7.201f)
                lineTo(5.061f, 12.163f)
                lineTo(3.47f, 12.519f)
                lineTo(3.832f, 10.942f)
                lineTo(8.798f, 5.976f)
                lineTo(10.023f, 7.201f)
                close()
                moveTo(11.437f, 5.787f)
                lineTo(12.249f, 4.975f)
                curveTo(12.587f, 4.636f, 12.587f, 4.088f, 12.249f, 3.75f)
                curveTo(11.911f, 3.412f, 11.362f, 3.412f, 11.024f, 3.75f)
                lineTo(10.212f, 4.562f)
                lineTo(11.437f, 5.787f)
                close()
            }
        }
        .build()
        return _editOutlineSm!!
    }

private var _editOutlineSm: ImageVector? = null
