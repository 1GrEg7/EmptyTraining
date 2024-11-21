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

public val DsIcon.WindowsSolidMd: ImageVector
    get() {
        if (_windowsSolidMd != null) {
            return _windowsSolidMd!!
        }
        _windowsSolidMd = Builder(name = "WindowsSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.501f, 4.463f)
                verticalLineTo(11.536f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.51f)
                lineTo(10.501f, 4.463f)
                close()
                moveTo(11.502f, 4.324f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(11.537f)
                horizontalLineTo(11.501f)
                verticalLineTo(4.323f)
                lineTo(11.502f, 4.324f)
                close()
                moveTo(21.0f, 12.541f)
                verticalLineTo(21.0f)
                lineTo(11.501f, 19.717f)
                verticalLineTo(12.541f)
                horizontalLineTo(21.0f)
                close()
                moveTo(10.501f, 19.583f)
                lineTo(3.0f, 18.569f)
                verticalLineTo(12.541f)
                horizontalLineTo(10.501f)
                verticalLineTo(19.583f)
                close()
            }
        }
        .build()
        return _windowsSolidMd!!
    }

private var _windowsSolidMd: ImageVector? = null
