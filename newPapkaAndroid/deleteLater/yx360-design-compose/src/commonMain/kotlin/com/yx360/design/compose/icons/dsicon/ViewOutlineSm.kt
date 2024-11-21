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

public val DsIcon.ViewOutlineSm: ImageVector
    get() {
        if (_viewOutlineSm != null) {
            return _viewOutlineSm!!
        }
        _viewOutlineSm = Builder(name = "ViewOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 6.873f)
                verticalLineTo(9.127f)
                curveTo(1.496f, 12.021f, 4.517f, 14.0f, 8.0f, 14.0f)
                curveTo(11.483f, 14.0f, 14.504f, 12.022f, 16.0f, 9.127f)
                verticalLineTo(6.873f)
                curveTo(14.504f, 3.978f, 11.483f, 2.0f, 8.0f, 2.0f)
                curveTo(4.517f, 2.0f, 1.496f, 3.978f, 0.0f, 6.873f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(5.21f, 12.0f, 2.797f, 10.367f, 1.673f, 8.0f)
                curveTo(2.212f, 6.865f, 3.048f, 5.898f, 4.08f, 5.2f)
                curveTo(4.028f, 5.458f, 4.0f, 5.726f, 4.0f, 6.0f)
                curveTo(4.0f, 8.209f, 5.791f, 10.0f, 8.0f, 10.0f)
                curveTo(10.209f, 10.0f, 12.0f, 8.209f, 12.0f, 6.0f)
                curveTo(12.0f, 5.726f, 11.972f, 5.458f, 11.92f, 5.199f)
                curveTo(12.952f, 5.898f, 13.788f, 6.864f, 14.327f, 8.0f)
                curveTo(13.203f, 10.367f, 10.79f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(9.105f, 4.0f, 10.0f, 4.895f, 10.0f, 6.0f)
                curveTo(10.0f, 7.105f, 9.105f, 8.0f, 8.0f, 8.0f)
                curveTo(6.895f, 8.0f, 6.0f, 7.105f, 6.0f, 6.0f)
                curveTo(6.0f, 4.897f, 6.894f, 4.002f, 7.997f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _viewOutlineSm!!
    }

private var _viewOutlineSm: ImageVector? = null
