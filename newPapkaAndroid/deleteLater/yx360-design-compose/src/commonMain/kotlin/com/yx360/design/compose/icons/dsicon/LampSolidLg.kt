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

public val DsIcon.LampSolidLg: ImageVector
    get() {
        if (_lampSolidLg != null) {
            return _lampSolidLg!!
        }
        _lampSolidLg = Builder(name = "LampSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.998f, 1.894f)
                curveTo(10.655f, 1.894f, 6.25f, 6.273f, 6.25f, 11.393f)
                curveTo(6.25f, 13.956f, 7.338f, 16.03f, 8.39f, 17.797f)
                curveTo(8.548f, 18.062f, 8.703f, 18.317f, 8.854f, 18.566f)
                curveTo(9.219f, 19.165f, 9.559f, 19.724f, 9.853f, 20.286f)
                curveTo(9.956f, 20.483f, 10.051f, 20.676f, 10.137f, 20.865f)
                horizontalLineTo(21.736f)
                curveTo(21.824f, 20.658f, 21.923f, 20.448f, 22.034f, 20.233f)
                curveTo(22.344f, 19.628f, 22.716f, 19.027f, 23.119f, 18.378f)
                curveTo(23.241f, 18.181f, 23.366f, 17.979f, 23.493f, 17.771f)
                curveTo(24.558f, 16.03f, 25.684f, 13.983f, 25.684f, 11.393f)
                curveTo(25.684f, 6.238f, 21.344f, 1.894f, 15.998f, 1.894f)
                close()
                moveTo(13.879f, 9.998f)
                lineTo(10.488f, 12.653f)
                lineTo(11.721f, 14.228f)
                lineTo(13.866f, 12.549f)
                lineTo(15.964f, 14.227f)
                lineTo(18.066f, 12.545f)
                lineTo(20.245f, 14.231f)
                lineTo(21.469f, 12.649f)
                lineTo(18.045f, 10.001f)
                lineTo(15.964f, 11.666f)
                lineTo(13.879f, 9.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.985f, 27.1f)
                lineTo(10.656f, 22.865f)
                horizontalLineTo(21.287f)
                lineTo(20.958f, 27.1f)
                lineTo(20.954f, 27.126f)
                curveTo(20.7f, 28.838f, 19.23f, 30.106f, 17.499f, 30.106f)
                horizontalLineTo(14.444f)
                curveTo(12.713f, 30.106f, 11.243f, 28.838f, 10.989f, 27.126f)
                lineTo(10.985f, 27.1f)
                close()
            }
        }
        .build()
        return _lampSolidLg!!
    }

private var _lampSolidLg: ImageVector? = null
