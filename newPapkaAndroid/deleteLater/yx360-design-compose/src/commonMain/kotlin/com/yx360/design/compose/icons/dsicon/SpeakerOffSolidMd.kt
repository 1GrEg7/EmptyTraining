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

public val DsIcon.SpeakerOffSolidMd: ImageVector
    get() {
        if (_speakerOffSolidMd != null) {
            return _speakerOffSolidMd!!
        }
        _speakerOffSolidMd = Builder(name = "SpeakerOffSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(16.273f, 2.0f, 17.44f, 5.889f, 17.44f, 12.0f)
                curveTo(17.44f, 12.696f, 17.424f, 13.364f, 17.394f, 14.0f)
                lineTo(11.33f, 5.337f)
                lineTo(14.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.495f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.383f, 7.0f, 6.074f, 7.0f, 5.757f, 7.11f)
                curveTo(5.384f, 7.238f, 4.944f, 7.583f, 4.73f, 7.915f)
                curveTo(4.548f, 8.197f, 4.49f, 8.431f, 4.376f, 8.898f)
                curveTo(4.127f, 9.911f, 4.0f, 10.952f, 4.0f, 12.0f)
                curveTo(4.0f, 13.048f, 4.127f, 14.089f, 4.376f, 15.102f)
                curveTo(4.49f, 15.569f, 4.548f, 15.803f, 4.73f, 16.085f)
                curveTo(4.944f, 16.417f, 5.384f, 16.762f, 5.757f, 16.89f)
                curveTo(6.074f, 17.0f, 6.383f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(10.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.66f, 22.0f, 16.32f, 20.861f, 16.787f, 18.847f)
                lineTo(19.0f, 22.008f)
                horizontalLineTo(21.5f)
                lineTo(7.5f, 2.008f)
                horizontalLineTo(5.0f)
                lineTo(8.495f, 7.0f)
                close()
            }
        }
        .build()
        return _speakerOffSolidMd!!
    }

private var _speakerOffSolidMd: ImageVector? = null
