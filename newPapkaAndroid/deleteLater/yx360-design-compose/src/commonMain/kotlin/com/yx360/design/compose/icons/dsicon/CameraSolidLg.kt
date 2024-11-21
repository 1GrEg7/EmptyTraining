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

public val DsIcon.CameraSolidLg: ImageVector
    get() {
        if (_cameraSolidLg != null) {
            return _cameraSolidLg!!
        }
        _cameraSolidLg = Builder(name = "CameraSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.332f, 9.778f)
                curveTo(4.0f, 10.605f, 4.0f, 11.653f, 4.0f, 13.75f)
                verticalLineTo(18.25f)
                curveTo(4.0f, 20.347f, 4.0f, 21.395f, 4.332f, 22.222f)
                curveTo(4.775f, 23.325f, 5.625f, 24.201f, 6.694f, 24.657f)
                curveTo(7.496f, 25.0f, 8.512f, 25.0f, 10.545f, 25.0f)
                horizontalLineTo(14.909f)
                curveTo(16.942f, 25.0f, 17.959f, 25.0f, 18.761f, 24.657f)
                curveTo(19.83f, 24.201f, 20.68f, 23.325f, 21.122f, 22.222f)
                curveTo(21.43f, 21.456f, 21.453f, 20.5f, 21.454f, 18.696f)
                curveTo(21.736f, 18.874f, 22.047f, 19.066f, 22.387f, 19.277f)
                curveTo(24.408f, 20.528f, 25.419f, 21.153f, 26.245f, 20.983f)
                curveTo(26.703f, 20.888f, 27.119f, 20.645f, 27.433f, 20.289f)
                curveTo(28.0f, 19.645f, 28.0f, 18.43f, 28.0f, 16.0f)
                curveTo(28.0f, 13.57f, 28.0f, 12.355f, 27.433f, 11.711f)
                curveTo(27.119f, 11.355f, 26.703f, 11.112f, 26.245f, 11.017f)
                curveTo(25.419f, 10.847f, 24.408f, 11.472f, 22.387f, 12.723f)
                curveTo(22.047f, 12.934f, 21.736f, 13.126f, 21.454f, 13.304f)
                curveTo(21.453f, 11.5f, 21.43f, 10.544f, 21.122f, 9.778f)
                curveTo(20.68f, 8.675f, 19.83f, 7.799f, 18.761f, 7.343f)
                curveTo(17.959f, 7.0f, 16.942f, 7.0f, 14.909f, 7.0f)
                horizontalLineTo(10.545f)
                curveTo(8.512f, 7.0f, 7.496f, 7.0f, 6.694f, 7.343f)
                curveTo(5.625f, 7.799f, 4.775f, 8.675f, 4.332f, 9.778f)
                close()
            }
        }
        .build()
        return _cameraSolidLg!!
    }

private var _cameraSolidLg: ImageVector? = null
