package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.SpeakerMaxSolidMd: ImageVector
    get() {
        if (_speakerMaxSolidMd != null) {
            return _speakerMaxSolidMd!!
        }
        _speakerMaxSolidMd = Builder(name = "SpeakerMaxSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                horizontalLineTo(11.5f)
                lineTo(7.5f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.383f, 7.0f, 3.074f, 7.0f, 2.757f, 7.11f)
                curveTo(2.384f, 7.238f, 1.944f, 7.583f, 1.73f, 7.915f)
                curveTo(1.548f, 8.197f, 1.49f, 8.431f, 1.376f, 8.898f)
                curveTo(1.127f, 9.911f, 1.0f, 10.952f, 1.0f, 12.0f)
                curveTo(1.0f, 13.048f, 1.127f, 14.089f, 1.376f, 15.102f)
                curveTo(1.49f, 15.569f, 1.548f, 15.803f, 1.73f, 16.085f)
                curveTo(1.944f, 16.417f, 2.384f, 16.762f, 2.757f, 16.89f)
                curveTo(3.074f, 17.0f, 3.383f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(7.5f)
                lineTo(11.5f, 22.0f)
                horizontalLineTo(12.5f)
                curveTo(13.72f, 22.0f, 15.0f, 18.0f, 15.0f, 11.983f)
                curveTo(15.0f, 5.966f, 13.773f, 2.0f, 12.5f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.991f)
                curveTo(16.998f, 10.937f, 16.663f, 9.911f, 16.043f, 9.059f)
                lineTo(17.661f, 7.882f)
                curveTo(18.528f, 9.075f, 18.997f, 10.512f, 19.0f, 11.987f)
                curveTo(19.003f, 13.462f, 18.539f, 14.9f, 17.676f, 16.096f)
                lineTo(16.055f, 14.926f)
                curveTo(16.671f, 14.071f, 17.002f, 13.044f, 17.0f, 11.991f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.278f, 6.706f)
                curveTo(20.394f, 8.24f, 20.996f, 10.086f, 21.0f, 11.983f)
                curveTo(21.004f, 13.879f, 20.408f, 15.729f, 19.298f, 17.267f)
                lineTo(20.92f, 18.437f)
                curveTo(22.276f, 16.557f, 23.004f, 14.297f, 23.0f, 11.979f)
                curveTo(22.996f, 9.661f, 22.259f, 7.404f, 20.896f, 5.529f)
                lineTo(19.278f, 6.706f)
                close()
            }
        }
        .build()
        return _speakerMaxSolidMd!!
    }

private var _speakerMaxSolidMd: ImageVector? = null
