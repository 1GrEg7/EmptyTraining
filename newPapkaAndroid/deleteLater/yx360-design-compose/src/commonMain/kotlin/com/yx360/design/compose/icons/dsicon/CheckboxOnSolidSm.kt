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

public val DsIcon.CheckboxOnSolidSm: ImageVector
    get() {
        if (_checkboxOnSolidSm != null) {
            return _checkboxOnSolidSm!!
        }
        _checkboxOnSolidSm = Builder(name = "CheckboxOnSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.545f, 2.73f)
                    curveTo(0.0f, 3.8f, 0.0f, 5.2f, 0.0f, 8.0f)
                    curveTo(0.0f, 10.8f, 0.0f, 12.2f, 0.545f, 13.27f)
                    curveTo(1.024f, 14.211f, 1.789f, 14.976f, 2.73f, 15.455f)
                    curveTo(3.8f, 16.0f, 5.2f, 16.0f, 8.0f, 16.0f)
                    curveTo(10.8f, 16.0f, 12.2f, 16.0f, 13.27f, 15.455f)
                    curveTo(14.211f, 14.976f, 14.976f, 14.211f, 15.455f, 13.27f)
                    curveTo(16.0f, 12.2f, 16.0f, 10.8f, 16.0f, 8.0f)
                    curveTo(16.0f, 5.2f, 16.0f, 3.8f, 15.455f, 2.73f)
                    curveTo(14.976f, 1.789f, 14.211f, 1.024f, 13.27f, 0.545f)
                    curveTo(12.2f, 0.0f, 10.8f, 0.0f, 8.0f, 0.0f)
                    curveTo(5.2f, 0.0f, 3.8f, 0.0f, 2.73f, 0.545f)
                    curveTo(1.789f, 1.024f, 1.024f, 1.789f, 0.545f, 2.73f)
                    close()
                    moveTo(12.557f, 4.0f)
                    lineTo(14.0f, 5.449f)
                    lineTo(8.923f, 10.546f)
                    lineTo(8.5f, 11.0f)
                    lineTo(7.485f, 12.0f)
                    lineTo(3.0f, 7.498f)
                    lineTo(4.443f, 6.049f)
                    lineTo(7.479f, 9.097f)
                    lineTo(12.557f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _checkboxOnSolidSm!!
    }

private var _checkboxOnSolidSm: ImageVector? = null
