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

public val DsIcon.KeySolidMd: ImageVector
    get() {
        if (_keySolidMd != null) {
            return _keySolidMd!!
        }
        _keySolidMd = Builder(name = "KeySolidMd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 7.5f)
                curveTo(4.0f, 6.104f, 4.0f, 5.407f, 4.172f, 4.839f)
                curveTo(4.56f, 3.56f, 5.56f, 2.56f, 6.839f, 2.172f)
                curveTo(7.407f, 2.0f, 8.104f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.896f, 2.0f, 16.593f, 2.0f, 17.161f, 2.172f)
                curveTo(18.44f, 2.56f, 19.44f, 3.56f, 19.828f, 4.839f)
                curveTo(20.0f, 5.407f, 20.0f, 6.104f, 20.0f, 7.5f)
                curveTo(20.0f, 8.896f, 20.0f, 9.593f, 19.828f, 10.161f)
                curveTo(19.44f, 11.439f, 18.44f, 12.44f, 17.161f, 12.828f)
                curveTo(16.666f, 12.978f, 16.071f, 12.997f, 15.0f, 13.0f)
                verticalLineTo(20.992f)
                lineTo(13.0f, 22.992f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 20.992f)
                verticalLineTo(13.0f)
                curveTo(7.929f, 12.997f, 7.334f, 12.978f, 6.839f, 12.828f)
                curveTo(5.56f, 12.44f, 4.56f, 11.439f, 4.172f, 10.161f)
                curveTo(4.0f, 9.593f, 4.0f, 8.896f, 4.0f, 7.5f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _keySolidMd!!
    }

private var _keySolidMd: ImageVector? = null
