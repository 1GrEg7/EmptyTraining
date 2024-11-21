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

public val DsIcon.SignInOutlineSm: ImageVector
    get() {
        if (_signInOutlineSm != null) {
            return _signInOutlineSm!!
        }
        _signInOutlineSm = Builder(name = "SignInOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(12.0f)
                curveTo(13.657f, 1.0f, 15.0f, 2.343f, 15.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(4.843f, 5.368f)
                lineTo(6.672f, 7.197f)
                lineTo(1.0f, 7.197f)
                verticalLineTo(9.197f)
                lineTo(6.672f, 9.197f)
                lineTo(4.843f, 11.025f)
                lineTo(6.257f, 12.439f)
                lineTo(10.5f, 8.197f)
                lineTo(6.257f, 3.954f)
                lineTo(4.843f, 5.368f)
                close()
            }
        }
        .build()
        return _signInOutlineSm!!
    }

private var _signInOutlineSm: ImageVector? = null
