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

public val DsIcon.EditSolidMd: ImageVector
    get() {
        if (_editSolidMd != null) {
            return _editSolidMd!!
        }
        _editSolidMd = Builder(name = "EditSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.93f, 11.347f)
                lineTo(8.754f, 19.54f)
                lineTo(4.165f, 20.457f)
                lineTo(3.543f, 19.836f)
                lineTo(4.461f, 15.248f)
                lineTo(12.698f, 7.081f)
                lineTo(16.93f, 11.347f)
                close()
                moveTo(18.352f, 9.941f)
                lineTo(16.219f, 7.79f)
                lineTo(14.068f, 5.622f)
                lineTo(15.364f, 4.363f)
                curveTo(15.722f, 4.005f, 15.866f, 3.863f, 15.998f, 3.764f)
                curveTo(16.888f, 3.093f, 18.115f, 3.092f, 19.006f, 3.762f)
                curveTo(19.137f, 3.861f, 19.281f, 4.003f, 19.64f, 4.36f)
                curveTo(20.001f, 4.719f, 20.145f, 4.863f, 20.244f, 4.995f)
                curveTo(20.921f, 5.886f, 20.922f, 7.119f, 20.248f, 8.012f)
                curveTo(20.148f, 8.144f, 20.006f, 8.288f, 19.646f, 8.648f)
                lineTo(18.352f, 9.941f)
                close()
            }
        }
        .build()
        return _editSolidMd!!
    }

private var _editSolidMd: ImageVector? = null
