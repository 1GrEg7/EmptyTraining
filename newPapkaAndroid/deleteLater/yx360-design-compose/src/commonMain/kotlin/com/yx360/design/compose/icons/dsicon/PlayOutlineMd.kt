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

public val DsIcon.PlayOutlineMd: ImageVector
    get() {
        if (_playOutlineMd != null) {
            return _playOutlineMd!!
        }
        _playOutlineMd = Builder(name = "PlayOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.339f, 10.44f)
                curveTo(17.497f, 9.716f, 16.207f, 8.898f, 14.356f, 7.729f)
                lineTo(12.77f, 6.727f)
                curveTo(10.687f, 5.412f, 9.221f, 4.489f, 8.083f, 3.986f)
                curveTo(6.948f, 3.484f, 6.427f, 3.531f, 6.066f, 3.73f)
                curveTo(5.705f, 3.928f, 5.388f, 4.345f, 5.206f, 5.571f)
                curveTo(5.023f, 6.803f, 5.021f, 8.534f, 5.021f, 10.999f)
                verticalLineTo(13.001f)
                curveTo(5.021f, 15.465f, 5.023f, 17.197f, 5.206f, 18.428f)
                curveTo(5.388f, 19.655f, 5.705f, 20.071f, 6.066f, 20.27f)
                curveTo(6.427f, 20.469f, 6.948f, 20.515f, 8.083f, 20.014f)
                curveTo(9.221f, 19.511f, 10.687f, 18.588f, 12.77f, 17.272f)
                lineTo(14.356f, 16.271f)
                curveTo(16.207f, 15.101f, 17.497f, 14.284f, 18.339f, 13.56f)
                curveTo(19.167f, 12.846f, 19.355f, 12.396f, 19.355f, 12.0f)
                curveTo(19.355f, 11.604f, 19.167f, 11.153f, 18.339f, 10.44f)
                close()
                moveTo(19.657f, 8.909f)
                curveTo(20.651f, 9.764f, 21.375f, 10.726f, 21.375f, 12.0f)
                curveTo(21.375f, 13.274f, 20.651f, 14.235f, 19.657f, 15.091f)
                curveTo(18.688f, 15.925f, 17.269f, 16.821f, 15.508f, 17.933f)
                lineTo(13.773f, 19.029f)
                curveTo(11.783f, 20.286f, 10.191f, 21.291f, 8.9f, 21.862f)
                curveTo(7.587f, 22.442f, 6.298f, 22.705f, 5.091f, 22.04f)
                curveTo(3.883f, 21.375f, 3.417f, 20.144f, 3.207f, 18.725f)
                curveTo(3.0f, 17.327f, 3.0f, 15.445f, 3.0f, 13.091f)
                lineTo(3.0f, 10.909f)
                curveTo(3.0f, 8.555f, 3.0f, 6.672f, 3.207f, 5.275f)
                curveTo(3.417f, 3.856f, 3.883f, 2.625f, 5.091f, 1.96f)
                curveTo(6.298f, 1.294f, 7.587f, 1.557f, 8.9f, 2.138f)
                curveTo(10.191f, 2.709f, 11.783f, 3.714f, 13.773f, 4.971f)
                lineTo(15.508f, 6.067f)
                curveTo(17.269f, 7.179f, 18.688f, 8.075f, 19.657f, 8.909f)
                close()
            }
        }
        .build()
        return _playOutlineMd!!
    }

private var _playOutlineMd: ImageVector? = null
