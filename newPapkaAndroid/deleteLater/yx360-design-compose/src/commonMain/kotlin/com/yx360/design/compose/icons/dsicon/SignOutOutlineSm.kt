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

public val DsIcon.SignOutOutlineSm: ImageVector
    get() {
        if (_signOutOutlineSm != null) {
            return _signOutOutlineSm!!
        }
        _signOutOutlineSm = Builder(name = "SignOutOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.172f, 6.803f)
                lineTo(9.343f, 4.975f)
                lineTo(10.757f, 3.561f)
                lineTo(15.0f, 7.803f)
                lineTo(10.757f, 12.046f)
                lineTo(9.343f, 10.632f)
                lineTo(11.172f, 8.803f)
                lineTo(5.5f, 8.803f)
                verticalLineTo(6.803f)
                lineTo(11.172f, 6.803f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(2.343f, 1.0f, 1.0f, 2.343f, 1.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 13.657f, 2.343f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _signOutOutlineSm!!
    }

private var _signOutOutlineSm: ImageVector? = null
