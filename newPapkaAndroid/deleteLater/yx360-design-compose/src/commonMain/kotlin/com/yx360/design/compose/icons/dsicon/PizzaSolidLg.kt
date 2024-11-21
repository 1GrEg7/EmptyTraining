package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.PizzaSolidLg: ImageVector
    get() {
        if (_pizzaSolidLg != null) {
            return _pizzaSolidLg!!
        }
        _pizzaSolidLg = Builder(name = "PizzaSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.365f, 4.112f)
                curveTo(19.657f, 6.035f, 25.435f, 11.677f, 27.55f, 18.889f)
                curveTo(28.129f, 20.864f, 26.787f, 22.703f, 24.959f, 23.118f)
                lineTo(23.987f, 23.338f)
                curveTo(23.287f, 14.908f, 16.492f, 8.209f, 8.02f, 7.659f)
                lineTo(8.217f, 6.754f)
                curveTo(8.612f, 4.943f, 10.402f, 3.594f, 12.365f, 4.112f)
                close()
                moveTo(7.589f, 9.638f)
                curveTo(15.306f, 9.987f, 21.519f, 16.108f, 22.015f, 23.786f)
                lineTo(18.647f, 24.55f)
                curveTo(18.466f, 22.801f, 16.987f, 21.437f, 15.19f, 21.437f)
                curveTo(13.271f, 21.437f, 11.715f, 22.992f, 11.715f, 24.912f)
                curveTo(11.715f, 25.32f, 11.786f, 25.712f, 11.915f, 26.076f)
                lineTo(5.436f, 27.546f)
                lineTo(4.0f, 26.123f)
                lineTo(5.57f, 18.912f)
                curveTo(6.023f, 19.128f, 6.529f, 19.249f, 7.064f, 19.249f)
                curveTo(8.983f, 19.249f, 10.539f, 17.693f, 10.539f, 15.774f)
                curveTo(10.539f, 13.854f, 8.983f, 12.299f, 7.064f, 12.299f)
                curveTo(7.046f, 12.299f, 7.028f, 12.299f, 7.01f, 12.299f)
                lineTo(7.589f, 9.638f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.365f, 4.112f)
                curveTo(19.657f, 6.035f, 25.435f, 11.677f, 27.55f, 18.889f)
                curveTo(28.129f, 20.864f, 26.787f, 22.703f, 24.959f, 23.118f)
                lineTo(23.987f, 23.338f)
                curveTo(23.287f, 14.908f, 16.492f, 8.209f, 8.02f, 7.659f)
                lineTo(8.217f, 6.754f)
                curveTo(8.612f, 4.943f, 10.402f, 3.594f, 12.365f, 4.112f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.589f, 9.638f)
                curveTo(15.306f, 9.987f, 21.519f, 16.108f, 22.015f, 23.786f)
                lineTo(18.647f, 24.55f)
                curveTo(18.466f, 22.801f, 16.987f, 21.437f, 15.19f, 21.437f)
                curveTo(13.271f, 21.437f, 11.715f, 22.992f, 11.715f, 24.912f)
                curveTo(11.715f, 25.32f, 11.786f, 25.712f, 11.915f, 26.076f)
                lineTo(5.436f, 27.546f)
                lineTo(4.0f, 26.123f)
                lineTo(5.57f, 18.912f)
                curveTo(6.023f, 19.128f, 6.529f, 19.249f, 7.064f, 19.249f)
                curveTo(8.983f, 19.249f, 10.539f, 17.693f, 10.539f, 15.774f)
                curveTo(10.539f, 13.854f, 8.983f, 12.299f, 7.064f, 12.299f)
                curveTo(7.046f, 12.299f, 7.028f, 12.299f, 7.01f, 12.299f)
                lineTo(7.589f, 9.638f)
                close()
            }
        }
        .build()
        return _pizzaSolidLg!!
    }

private var _pizzaSolidLg: ImageVector? = null
