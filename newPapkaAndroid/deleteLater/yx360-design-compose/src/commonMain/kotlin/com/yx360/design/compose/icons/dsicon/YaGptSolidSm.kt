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

public val DsIcon.YaGptSolidSm: ImageVector
    get() {
        if (_yaGptSolidSm != null) {
            return _yaGptSolidSm!!
        }
        _yaGptSolidSm = Builder(name = "YaGptSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                curveTo(9.314f, 0.0f, 12.0f, 2.686f, 12.0f, 6.0f)
                curveTo(12.0f, 9.314f, 9.314f, 12.0f, 6.0f, 12.0f)
                curveTo(2.686f, 12.0f, 0.0f, 9.314f, 0.0f, 6.0f)
                curveTo(0.0f, 2.686f, 2.686f, 0.0f, 6.0f, 0.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(15.105f, 12.0f, 16.0f, 12.895f, 16.0f, 14.0f)
                curveTo(16.0f, 15.105f, 15.105f, 16.0f, 14.0f, 16.0f)
                curveTo(12.895f, 16.0f, 12.0f, 15.105f, 12.0f, 14.0f)
                curveTo(12.0f, 12.895f, 12.895f, 12.0f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _yaGptSolidSm!!
    }

private var _yaGptSolidSm: ImageVector? = null
