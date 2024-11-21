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

public val DsIcon.ChartBoxSolidSm: ImageVector
    get() {
        if (_chartBoxSolidSm != null) {
            return _chartBoxSolidSm!!
        }
        _chartBoxSolidSm = Builder(name = "ChartBoxSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.936f, 0.0f)
                horizontalLineTo(6.064f)
                curveTo(5.121f, -0.0f, 4.343f, -0.0f, 3.713f, 0.06f)
                curveTo(3.058f, 0.122f, 2.459f, 0.256f, 1.914f, 0.591f)
                curveTo(1.375f, 0.921f, 0.921f, 1.375f, 0.591f, 1.914f)
                curveTo(0.256f, 2.459f, 0.122f, 3.058f, 0.06f, 3.713f)
                curveTo(-0.0f, 4.343f, -0.0f, 5.121f, 0.0f, 6.064f)
                verticalLineTo(8.553f)
                horizontalLineTo(4.038f)
                verticalLineTo(4.665f)
                horizontalLineTo(11.961f)
                verticalLineTo(6.998f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.064f)
                curveTo(16.0f, 5.121f, 16.0f, 4.343f, 15.94f, 3.713f)
                curveTo(15.878f, 3.058f, 15.743f, 2.459f, 15.409f, 1.914f)
                curveTo(15.079f, 1.375f, 14.625f, 0.921f, 14.086f, 0.591f)
                curveTo(13.541f, 0.256f, 12.942f, 0.122f, 12.287f, 0.06f)
                curveTo(11.657f, -0.0f, 10.879f, -0.0f, 9.936f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.957f, 6.998f)
                horizontalLineTo(9.944f)
                verticalLineTo(9.002f)
                horizontalLineTo(9.957f)
                verticalLineTo(16.0f)
                curveTo(9.95f, 16.0f, 9.943f, 16.0f, 9.936f, 16.0f)
                horizontalLineTo(6.064f)
                curveTo(6.057f, 16.0f, 6.05f, 16.0f, 6.042f, 16.0f)
                verticalLineTo(6.669f)
                horizontalLineTo(9.957f)
                verticalLineTo(6.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.038f, 15.965f)
                verticalLineTo(10.557f)
                horizontalLineTo(0.001f)
                curveTo(0.003f, 11.227f, 0.014f, 11.801f, 0.06f, 12.287f)
                curveTo(0.122f, 12.942f, 0.256f, 13.541f, 0.591f, 14.086f)
                curveTo(0.921f, 14.625f, 1.375f, 15.079f, 1.914f, 15.409f)
                curveTo(2.459f, 15.743f, 3.058f, 15.878f, 3.713f, 15.94f)
                curveTo(3.818f, 15.95f, 3.926f, 15.958f, 4.038f, 15.965f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.961f, 15.965f)
                verticalLineTo(9.002f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.936f)
                curveTo(16.0f, 10.879f, 16.0f, 11.657f, 15.94f, 12.287f)
                curveTo(15.878f, 12.942f, 15.743f, 13.541f, 15.409f, 14.086f)
                curveTo(15.079f, 14.625f, 14.625f, 15.079f, 14.086f, 15.409f)
                curveTo(13.541f, 15.743f, 12.942f, 15.878f, 12.287f, 15.94f)
                curveTo(12.182f, 15.95f, 12.074f, 15.958f, 11.961f, 15.965f)
                close()
            }
        }
        .build()
        return _chartBoxSolidSm!!
    }

private var _chartBoxSolidSm: ImageVector? = null
