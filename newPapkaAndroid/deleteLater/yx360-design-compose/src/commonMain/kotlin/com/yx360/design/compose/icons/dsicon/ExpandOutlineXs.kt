package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.ExpandOutlineXs: ImageVector
    get() {
        if (_expandOutlineXs != null) {
            return _expandOutlineXs!!
        }
        _expandOutlineXs = Builder(name = "ExpandOutlineXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                lineTo(10.0f, 2.562f)
                lineTo(10.0f, 5.0f)
                lineTo(6.0f, 2.5f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 2.562f)
                lineTo(6.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 12.0f)
                lineTo(2.0f, 9.438f)
                lineTo(2.0f, 7.0f)
                lineTo(6.0f, 9.5f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 9.438f)
                lineTo(6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _expandOutlineXs!!
    }

private var _expandOutlineXs: ImageVector? = null
