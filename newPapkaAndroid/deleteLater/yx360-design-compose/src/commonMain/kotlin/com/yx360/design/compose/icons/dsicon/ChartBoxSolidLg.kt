package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val DsIcon.ChartBoxSolidLg: ImageVector
    get() {
        if (_chartBoxSolidLg != null) {
            return _chartBoxSolidLg!!
        }
        _chartBoxSolidLg = Builder(name = "ChartBoxSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.545f, 4.0f)
                horizontalLineTo(13.455f)
                curveTo(11.861f, 4.0f, 10.593f, 4.0f, 9.576f, 4.097f)
                curveTo(8.534f, 4.196f, 7.652f, 4.404f, 6.867f, 4.885f)
                curveTo(6.059f, 5.38f, 5.38f, 6.059f, 4.885f, 6.867f)
                curveTo(4.404f, 7.652f, 4.196f, 8.534f, 4.097f, 9.576f)
                curveTo(4.0f, 10.593f, 4.0f, 11.861f, 4.0f, 13.455f)
                verticalLineTo(17.855f)
                horizontalLineTo(10.058f)
                verticalLineTo(11.021f)
                horizontalLineTo(21.984f)
                verticalLineTo(14.972f)
                horizontalLineTo(28.0f)
                verticalLineTo(13.455f)
                curveTo(28.0f, 11.861f, 28.0f, 10.593f, 27.903f, 9.576f)
                curveTo(27.804f, 8.534f, 27.596f, 7.652f, 27.115f, 6.867f)
                curveTo(26.62f, 6.059f, 25.941f, 5.38f, 25.133f, 4.885f)
                curveTo(24.348f, 4.404f, 23.466f, 4.196f, 22.424f, 4.097f)
                curveTo(21.407f, 4.0f, 20.139f, 4.0f, 18.545f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.984f, 16.973f)
                verticalLineTo(27.938f)
                curveTo(22.136f, 27.928f, 22.282f, 27.917f, 22.424f, 27.903f)
                curveTo(23.466f, 27.804f, 24.348f, 27.596f, 25.133f, 27.115f)
                curveTo(25.941f, 26.62f, 26.62f, 25.941f, 27.115f, 25.133f)
                curveTo(27.596f, 24.348f, 27.804f, 23.466f, 27.903f, 22.424f)
                curveTo(28.0f, 21.407f, 28.0f, 20.139f, 28.0f, 18.545f)
                verticalLineTo(16.973f)
                horizontalLineTo(21.984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.983f, 27.997f)
                verticalLineTo(13.022f)
                horizontalLineTo(12.059f)
                verticalLineTo(27.997f)
                curveTo(12.495f, 28.0f, 12.959f, 28.0f, 13.455f, 28.0f)
                horizontalLineTo(18.545f)
                curveTo(19.057f, 28.0f, 19.535f, 28.0f, 19.983f, 27.997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.058f, 27.941f)
                verticalLineTo(19.857f)
                horizontalLineTo(4.002f)
                curveTo(4.008f, 20.856f, 4.028f, 21.703f, 4.097f, 22.424f)
                curveTo(4.196f, 23.466f, 4.404f, 24.348f, 4.885f, 25.133f)
                curveTo(5.38f, 25.941f, 6.059f, 26.62f, 6.867f, 27.115f)
                curveTo(7.652f, 27.596f, 8.534f, 27.804f, 9.576f, 27.903f)
                curveTo(9.731f, 27.918f, 9.892f, 27.931f, 10.058f, 27.941f)
                close()
            }
        }
        .build()
        return _chartBoxSolidLg!!
    }

private var _chartBoxSolidLg: ImageVector? = null
