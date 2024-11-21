package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.KeyOutlineMd: ImageVector
    get() {
        if (_keyOutlineMd != null) {
            return _keyOutlineMd!!
        }
        _keyOutlineMd = Builder(name = "KeyOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 12.985f)
                curveTo(7.508f, 12.966f, 7.154f, 12.923f, 6.839f, 12.828f)
                curveTo(5.56f, 12.44f, 4.56f, 11.439f, 4.172f, 10.161f)
                curveTo(4.0f, 9.593f, 4.0f, 8.896f, 4.0f, 7.5f)
                curveTo(4.0f, 6.104f, 4.0f, 5.407f, 4.172f, 4.839f)
                curveTo(4.56f, 3.56f, 5.56f, 2.56f, 6.839f, 2.172f)
                curveTo(7.407f, 2.0f, 8.104f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.896f, 2.0f, 16.593f, 2.0f, 17.161f, 2.172f)
                curveTo(18.44f, 2.56f, 19.44f, 3.56f, 19.828f, 4.839f)
                curveTo(20.0f, 5.407f, 20.0f, 6.104f, 20.0f, 7.5f)
                curveTo(20.0f, 8.896f, 20.0f, 9.593f, 19.828f, 10.161f)
                curveTo(19.44f, 11.439f, 18.44f, 12.44f, 17.161f, 12.828f)
                curveTo(16.846f, 12.923f, 16.492f, 12.966f, 16.0f, 12.985f)
                verticalLineTo(20.49f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                lineTo(8.0f, 20.49f)
                verticalLineTo(12.985f)
                close()
                moveTo(9.5f, 4.0f)
                horizontalLineTo(14.5f)
                curveTo(16.041f, 4.0f, 16.368f, 4.022f, 16.581f, 4.086f)
                curveTo(17.22f, 4.28f, 17.72f, 4.78f, 17.914f, 5.419f)
                curveTo(17.978f, 5.632f, 18.0f, 5.959f, 18.0f, 7.5f)
                curveTo(18.0f, 9.041f, 17.978f, 9.368f, 17.914f, 9.581f)
                curveTo(17.72f, 10.22f, 17.22f, 10.72f, 16.581f, 10.914f)
                curveTo(16.368f, 10.978f, 16.041f, 11.0f, 14.5f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(7.959f, 11.0f, 7.632f, 10.978f, 7.419f, 10.914f)
                curveTo(6.78f, 10.72f, 6.28f, 10.22f, 6.086f, 9.581f)
                curveTo(6.022f, 9.368f, 6.0f, 9.041f, 6.0f, 7.5f)
                curveTo(6.0f, 5.959f, 6.022f, 5.632f, 6.086f, 5.419f)
                curveTo(6.28f, 4.78f, 6.78f, 4.28f, 7.419f, 4.086f)
                curveTo(7.632f, 4.022f, 7.959f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(10.0f, 13.0f)
                verticalLineTo(19.556f)
                lineTo(11.726f, 21.0f)
                horizontalLineTo(12.274f)
                lineTo(14.0f, 19.556f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _keyOutlineMd!!
    }

private var _keyOutlineMd: ImageVector? = null
