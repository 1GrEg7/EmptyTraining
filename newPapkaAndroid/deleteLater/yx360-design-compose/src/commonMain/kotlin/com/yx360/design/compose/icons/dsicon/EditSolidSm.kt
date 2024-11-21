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

public val DsIcon.EditSolidSm: ImageVector
    get() {
        if (_editSolidSm != null) {
            return _editSolidSm!!
        }
        _editSolidSm = Builder(name = "EditSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.102f, 3.458f)
                lineTo(12.495f, 6.851f)
                lineTo(13.311f, 6.035f)
                curveTo(14.235f, 5.111f, 14.235f, 3.613f, 13.311f, 2.689f)
                curveTo(12.387f, 1.765f, 10.889f, 1.765f, 9.965f, 2.689f)
                lineTo(9.102f, 3.458f)
                close()
                moveTo(11.081f, 8.266f)
                lineTo(7.735f, 4.919f)
                lineTo(2.468f, 10.187f)
                lineTo(1.652f, 13.741f)
                lineTo(2.191f, 14.343f)
                lineTo(5.815f, 13.532f)
                lineTo(11.081f, 8.266f)
                close()
            }
        }
        .build()
        return _editSolidSm!!
    }

private var _editSolidSm: ImageVector? = null
