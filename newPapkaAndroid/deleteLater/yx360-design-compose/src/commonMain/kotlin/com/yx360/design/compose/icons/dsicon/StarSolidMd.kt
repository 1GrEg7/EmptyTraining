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

public val DsIcon.StarSolidMd: ImageVector
    get() {
        if (_starSolidMd != null) {
            return _starSolidMd!!
        }
        _starSolidMd = Builder(name = "StarSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.72f, 13.839f)
                lineTo(23.0f, 8.679f)
                lineTo(22.85f, 8.199f)
                lineTo(15.55f, 7.139f)
                lineTo(12.26f, 0.499f)
                horizontalLineTo(11.76f)
                lineTo(8.49f, 7.129f)
                lineTo(1.16f, 8.199f)
                lineTo(1.0f, 8.679f)
                lineTo(6.29f, 13.839f)
                lineTo(5.05f, 21.139f)
                lineTo(5.46f, 21.429f)
                lineTo(12.0f, 17.999f)
                lineTo(18.54f, 21.429f)
                lineTo(18.95f, 21.139f)
                lineTo(17.7f, 13.859f)
                lineTo(17.72f, 13.839f)
                close()
            }
        }
        .build()
        return _starSolidMd!!
    }

private var _starSolidMd: ImageVector? = null
