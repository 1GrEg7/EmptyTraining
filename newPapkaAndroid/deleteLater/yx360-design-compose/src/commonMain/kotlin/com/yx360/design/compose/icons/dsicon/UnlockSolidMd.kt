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

public val DsIcon.UnlockSolidMd: ImageVector
    get() {
        if (_unlockSolidMd != null) {
            return _unlockSolidMd!!
        }
        _unlockSolidMd = Builder(name = "UnlockSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.239f, 2.0f, 7.0f, 4.239f, 7.0f, 7.0f)
                verticalLineTo(11.129f)
                curveTo(6.945f, 11.142f, 6.891f, 11.156f, 6.839f, 11.172f)
                curveTo(5.56f, 11.56f, 4.56f, 12.561f, 4.172f, 13.839f)
                curveTo(4.0f, 14.407f, 4.0f, 15.104f, 4.0f, 16.5f)
                curveTo(4.0f, 17.896f, 4.0f, 18.593f, 4.172f, 19.161f)
                curveTo(4.56f, 20.44f, 5.56f, 21.44f, 6.839f, 21.828f)
                curveTo(7.407f, 22.0f, 8.104f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(14.5f)
                curveTo(15.896f, 22.0f, 16.593f, 22.0f, 17.161f, 21.828f)
                curveTo(18.44f, 21.44f, 19.44f, 20.44f, 19.828f, 19.161f)
                curveTo(20.0f, 18.593f, 20.0f, 17.896f, 20.0f, 16.5f)
                curveTo(20.0f, 15.104f, 20.0f, 14.407f, 19.828f, 13.839f)
                curveTo(19.44f, 12.561f, 18.44f, 11.56f, 17.161f, 11.172f)
                curveTo(16.593f, 11.0f, 15.896f, 11.0f, 14.5f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(9.322f, 11.0f, 9.156f, 11.0f, 9.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(9.0f, 5.343f, 10.343f, 4.0f, 12.0f, 4.0f)
                curveTo(13.657f, 4.0f, 15.0f, 5.343f, 15.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 4.239f, 14.761f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _unlockSolidMd!!
    }

private var _unlockSolidMd: ImageVector? = null
