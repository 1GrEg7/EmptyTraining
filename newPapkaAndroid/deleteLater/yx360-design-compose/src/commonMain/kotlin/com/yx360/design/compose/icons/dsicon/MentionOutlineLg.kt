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

public val DsIcon.MentionOutlineLg: ImageVector
    get() {
        if (_mentionOutlineLg != null) {
            return _mentionOutlineLg!!
        }
        _mentionOutlineLg = Builder(name = "MentionOutlineLg", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 5.964f)
                curveTo(10.477f, 5.964f, 6.0f, 10.441f, 6.0f, 15.964f)
                curveTo(6.0f, 21.486f, 10.477f, 25.963f, 16.0f, 25.963f)
                curveTo(17.379f, 25.963f, 18.691f, 25.685f, 19.884f, 25.181f)
                lineTo(20.661f, 27.024f)
                curveTo(19.227f, 27.629f, 17.651f, 27.963f, 16.0f, 27.963f)
                curveTo(9.372f, 27.963f, 4.0f, 22.591f, 4.0f, 15.964f)
                curveTo(4.0f, 9.336f, 9.372f, 3.964f, 16.0f, 3.964f)
                curveTo(22.627f, 3.964f, 28.0f, 9.336f, 28.0f, 15.964f)
                curveTo(28.0f, 17.705f, 27.434f, 19.098f, 26.492f, 20.058f)
                curveTo(25.557f, 21.01f, 24.313f, 21.47f, 23.082f, 21.456f)
                curveTo(21.84f, 21.443f, 20.631f, 20.954f, 19.725f, 20.042f)
                curveTo(18.712f, 21.011f, 17.337f, 21.608f, 15.823f, 21.608f)
                curveTo(12.705f, 21.608f, 10.178f, 19.081f, 10.178f, 15.964f)
                curveTo(10.178f, 12.846f, 12.705f, 10.319f, 15.823f, 10.319f)
                curveTo(16.652f, 10.319f, 17.665f, 10.638f, 18.494f, 11.221f)
                curveTo(19.339f, 11.816f, 20.109f, 12.774f, 20.184f, 14.091f)
                lineTo(20.186f, 14.12f)
                verticalLineTo(15.964f)
                curveTo(20.186f, 18.382f, 21.712f, 19.441f, 23.104f, 19.456f)
                curveTo(23.825f, 19.464f, 24.535f, 19.196f, 25.065f, 18.656f)
                curveTo(25.588f, 18.124f, 26.0f, 17.26f, 26.0f, 15.964f)
                curveTo(26.0f, 10.441f, 21.522f, 5.964f, 16.0f, 5.964f)
                close()
                moveTo(18.607f, 18.315f)
                curveTo(18.338f, 17.633f, 18.186f, 16.847f, 18.186f, 15.964f)
                verticalLineTo(14.181f)
                curveTo(18.147f, 13.656f, 17.842f, 13.208f, 17.343f, 12.857f)
                curveTo(16.82f, 12.489f, 16.204f, 12.319f, 15.823f, 12.319f)
                curveTo(13.81f, 12.319f, 12.178f, 13.951f, 12.178f, 15.964f)
                curveTo(12.178f, 17.976f, 13.81f, 19.608f, 15.823f, 19.608f)
                curveTo(16.938f, 19.608f, 17.938f, 19.107f, 18.607f, 18.315f)
                close()
            }
        }
        .build()
        return _mentionOutlineLg!!
    }

private var _mentionOutlineLg: ImageVector? = null
