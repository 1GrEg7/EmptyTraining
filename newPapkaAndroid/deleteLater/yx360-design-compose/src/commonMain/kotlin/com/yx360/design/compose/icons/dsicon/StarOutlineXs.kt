package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.StarOutlineXs: ImageVector
    get() {
        if (_starOutlineXs != null) {
            return _starOutlineXs!!
        }
        _starOutlineXs = Builder(name = "StarOutlineXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.269f, 0.0f)
                    horizontalLineTo(5.743f)
                    lineTo(4.023f, 3.514f)
                    lineTo(0.168f, 4.081f)
                    lineTo(0.0f, 4.587f)
                    lineTo(2.784f, 7.322f)
                    lineTo(2.131f, 11.193f)
                    lineTo(2.562f, 11.5f)
                    lineTo(6.001f, 9.683f)
                    lineTo(9.44f, 11.5f)
                    lineTo(9.871f, 11.193f)
                    lineTo(9.213f, 7.333f)
                    lineTo(12.0f, 4.589f)
                    lineTo(11.842f, 4.081f)
                    lineTo(8.0f, 3.519f)
                    lineTo(6.269f, 0.0f)
                    close()
                    moveTo(5.001f, 4.87f)
                    lineTo(6.009f, 2.812f)
                    lineTo(7.023f, 4.876f)
                    lineTo(9.268f, 5.204f)
                    lineTo(8.11f, 6.344f)
                    lineTo(7.632f, 6.825f)
                    lineTo(8.015f, 9.071f)
                    lineTo(6.001f, 8.007f)
                    lineTo(3.983f, 9.074f)
                    lineTo(4.366f, 6.804f)
                    lineTo(2.736f, 5.203f)
                    lineTo(5.001f, 4.87f)
                    close()
                }
            }
        }
        .build()
        return _starOutlineXs!!
    }

private var _starOutlineXs: ImageVector? = null
