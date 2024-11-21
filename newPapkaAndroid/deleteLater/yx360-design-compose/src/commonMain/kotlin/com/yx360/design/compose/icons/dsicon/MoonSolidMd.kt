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

public val DsIcon.MoonSolidMd: ImageVector
    get() {
        if (_moonSolidMd != null) {
            return _moonSolidMd!!
        }
        _moonSolidMd = Builder(name = "MoonSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.255f, 3.05f)
                curveTo(14.218f, 2.94f, 14.188f, 2.851f, 14.161f, 2.768f)
                curveTo(14.087f, 2.548f, 14.03f, 2.376f, 13.901f, 2.001f)
                horizontalLineTo(12.954f)
                curveTo(11.214f, 1.983f, 9.5f, 2.429f, 7.987f, 3.294f)
                curveTo(6.08f, 4.4f, 4.591f, 6.109f, 3.753f, 8.155f)
                curveTo(2.914f, 10.201f, 2.772f, 12.468f, 3.349f, 14.604f)
                curveTo(3.926f, 16.739f, 5.19f, 18.622f, 6.944f, 19.96f)
                curveTo(8.697f, 21.298f, 10.842f, 22.015f, 13.044f, 22.0f)
                curveTo(14.735f, 22.003f, 16.399f, 21.565f, 17.871f, 20.727f)
                curveTo(19.688f, 19.683f, 21.133f, 18.09f, 22.0f, 16.175f)
                lineTo(21.172f, 15.206f)
                curveTo(20.223f, 15.691f, 19.149f, 15.964f, 18.011f, 15.964f)
                curveTo(14.155f, 15.964f, 11.03f, 12.827f, 11.03f, 8.957f)
                curveTo(11.03f, 6.475f, 12.315f, 4.295f, 14.255f, 3.05f)
                close()
            }
        }
        .build()
        return _moonSolidMd!!
    }

private var _moonSolidMd: ImageVector? = null
