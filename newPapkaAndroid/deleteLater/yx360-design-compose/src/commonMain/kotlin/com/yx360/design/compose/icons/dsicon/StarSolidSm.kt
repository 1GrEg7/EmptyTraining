package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.StarSolidSm: ImageVector
    get() {
        if (_starSolidSm != null) {
            return _starSolidSm!!
        }
        _starSolidSm = Builder(name = "StarSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.64f, 9.484f)
                lineTo(15.0f, 6.203f)
                lineTo(14.905f, 5.897f)
                lineTo(10.259f, 5.223f)
                lineTo(8.165f, 1.0f)
                horizontalLineTo(7.847f)
                lineTo(5.766f, 5.217f)
                lineTo(1.102f, 5.897f)
                lineTo(1.0f, 6.203f)
                lineTo(4.366f, 9.484f)
                lineTo(3.577f, 14.127f)
                lineTo(3.838f, 14.312f)
                lineTo(8.0f, 12.13f)
                lineTo(12.162f, 14.312f)
                lineTo(12.423f, 14.127f)
                lineTo(11.627f, 9.497f)
                lineTo(11.64f, 9.484f)
                close()
            }
        }
        .build()
        return _starSolidSm!!
    }

private var _starSolidSm: ImageVector? = null
