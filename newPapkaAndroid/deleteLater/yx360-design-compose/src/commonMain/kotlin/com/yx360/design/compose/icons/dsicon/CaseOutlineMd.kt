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

public val DsIcon.CaseOutlineMd: ImageVector
    get() {
        if (_caseOutlineMd != null) {
            return _caseOutlineMd!!
        }
        _caseOutlineMd = Builder(name = "CaseOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.191f, 6.286f)
                horizontalLineTo(17.533f)
                curveTo(17.466f, 6.028f, 17.382f, 5.775f, 17.279f, 5.528f)
                curveTo(16.992f, 4.834f, 16.571f, 4.204f, 16.041f, 3.674f)
                curveTo(15.51f, 3.143f, 14.88f, 2.722f, 14.187f, 2.435f)
                curveTo(13.493f, 2.148f, 12.75f, 2.0f, 12.0f, 2.0f)
                curveTo(11.25f, 2.0f, 10.507f, 2.148f, 9.813f, 2.435f)
                curveTo(9.12f, 2.722f, 8.49f, 3.143f, 7.959f, 3.674f)
                curveTo(7.429f, 4.204f, 7.008f, 4.834f, 6.721f, 5.528f)
                curveTo(6.618f, 5.775f, 6.534f, 6.028f, 6.467f, 6.286f)
                horizontalLineTo(5.81f)
                curveTo(3.706f, 6.286f, 2.0f, 7.991f, 2.0f, 10.095f)
                verticalLineTo(18.191f)
                curveTo(2.0f, 20.294f, 3.706f, 22.0f, 5.81f, 22.0f)
                horizontalLineTo(18.191f)
                curveTo(20.294f, 22.0f, 22.0f, 20.294f, 22.0f, 18.191f)
                verticalLineTo(10.095f)
                curveTo(22.0f, 7.991f, 20.294f, 6.286f, 18.191f, 6.286f)
                close()
                moveTo(15.544f, 6.246f)
                lineTo(15.56f, 6.286f)
                horizontalLineTo(8.44f)
                lineTo(8.456f, 6.246f)
                curveTo(8.649f, 5.781f, 8.931f, 5.358f, 9.288f, 5.002f)
                curveTo(9.644f, 4.646f, 10.067f, 4.363f, 10.532f, 4.17f)
                curveTo(10.997f, 3.978f, 11.496f, 3.878f, 12.0f, 3.878f)
                curveTo(12.504f, 3.878f, 13.003f, 3.978f, 13.468f, 4.17f)
                curveTo(13.933f, 4.363f, 14.356f, 4.646f, 14.712f, 5.002f)
                curveTo(15.069f, 5.358f, 15.351f, 5.781f, 15.544f, 6.246f)
                close()
                moveTo(3.905f, 10.059f)
                lineTo(9.0f, 13.001f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.001f)
                lineTo(20.095f, 10.06f)
                curveTo(20.076f, 9.024f, 19.231f, 8.19f, 18.191f, 8.19f)
                horizontalLineTo(5.81f)
                curveTo(4.77f, 8.19f, 3.924f, 9.024f, 3.905f, 10.059f)
                close()
                moveTo(9.0f, 15.31f)
                lineTo(3.905f, 12.368f)
                verticalLineTo(18.191f)
                curveTo(3.905f, 19.242f, 4.758f, 20.095f, 5.81f, 20.095f)
                horizontalLineTo(18.191f)
                curveTo(19.242f, 20.095f, 20.095f, 19.242f, 20.095f, 18.191f)
                verticalLineTo(12.369f)
                lineTo(15.0f, 15.311f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.31f)
                close()
            }
        }
        .build()
        return _caseOutlineMd!!
    }

private var _caseOutlineMd: ImageVector? = null
