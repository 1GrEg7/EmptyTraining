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

public val DsIcon.TagSolidSm: ImageVector
    get() {
        if (_tagSolidSm != null) {
            return _tagSolidSm!!
        }
        _tagSolidSm = Builder(name = "TagSolidSm", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.442f, 3.432f)
                curveTo(0.0f, 4.154f, 0.0f, 5.136f, 0.0f, 7.1f)
                verticalLineTo(8.9f)
                curveTo(0.0f, 10.864f, 0.0f, 11.846f, 0.442f, 12.568f)
                curveTo(0.689f, 12.971f, 1.029f, 13.311f, 1.433f, 13.558f)
                curveTo(2.154f, 14.0f, 3.136f, 14.0f, 5.1f, 14.0f)
                horizontalLineTo(9.415f)
                curveTo(10.546f, 14.0f, 11.112f, 14.0f, 11.615f, 13.814f)
                curveTo(11.9f, 13.709f, 12.167f, 13.561f, 12.408f, 13.376f)
                curveTo(12.832f, 13.049f, 13.133f, 12.569f, 13.734f, 11.611f)
                lineTo(14.299f, 10.711f)
                curveTo(14.977f, 9.63f, 15.316f, 9.09f, 15.416f, 8.502f)
                curveTo(15.472f, 8.17f, 15.472f, 7.83f, 15.416f, 7.498f)
                curveTo(15.316f, 6.91f, 14.977f, 6.37f, 14.299f, 5.289f)
                lineTo(13.734f, 4.389f)
                curveTo(13.133f, 3.431f, 12.832f, 2.951f, 12.408f, 2.624f)
                curveTo(12.167f, 2.439f, 11.9f, 2.291f, 11.615f, 2.186f)
                curveTo(11.112f, 2.0f, 10.546f, 2.0f, 9.415f, 2.0f)
                horizontalLineTo(5.1f)
                curveTo(3.136f, 2.0f, 2.154f, 2.0f, 1.433f, 2.442f)
                curveTo(1.029f, 2.689f, 0.689f, 3.029f, 0.442f, 3.432f)
                close()
                moveTo(11.5f, 9.5f)
                curveTo(12.328f, 9.5f, 13.0f, 8.828f, 13.0f, 8.0f)
                curveTo(13.0f, 7.172f, 12.328f, 6.5f, 11.5f, 6.5f)
                curveTo(10.672f, 6.5f, 10.0f, 7.172f, 10.0f, 8.0f)
                curveTo(10.0f, 8.828f, 10.672f, 9.5f, 11.5f, 9.5f)
                close()
            }
        }
        .build()
        return _tagSolidSm!!
    }

private var _tagSolidSm: ImageVector? = null
