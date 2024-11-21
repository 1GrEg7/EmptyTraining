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

public val DsIcon.FlameSolidMd: ImageVector
    get() {
        if (_flameSolidMd != null) {
            return _flameSolidMd!!
        }
        _flameSolidMd = Builder(name = "FlameSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 7.0f)
                curveTo(10.434f, 5.325f, 12.0f, 2.5f, 13.0f, 1.0f)
                horizontalLineTo(14.0f)
                curveTo(15.796f, 2.796f, 17.688f, 5.157f, 18.929f, 7.314f)
                curveTo(20.165f, 9.46f, 21.0f, 11.761f, 21.0f, 14.0f)
                curveTo(21.0f, 18.583f, 17.5f, 22.0f, 14.0f, 22.0f)
                lineTo(13.5f, 21.0f)
                curveTo(15.0f, 20.5f, 16.0f, 19.0f, 16.0f, 17.0f)
                curveTo(16.0f, 14.36f, 13.421f, 11.45f, 12.0f, 10.0f)
                curveTo(10.579f, 11.45f, 8.0f, 14.5f, 8.0f, 17.0f)
                curveTo(8.0f, 19.0f, 9.5f, 20.5f, 10.5f, 21.0f)
                lineTo(10.0f, 22.0f)
                curveTo(6.5f, 22.0f, 3.0f, 18.583f, 3.0f, 14.0f)
                curveTo(3.0f, 9.657f, 5.476f, 6.032f, 7.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineTo(9.5f, 7.0f)
                close()
            }
        }
        .build()
        return _flameSolidMd!!
    }

private var _flameSolidMd: ImageVector? = null
