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

public val DsIcon.SpeakerMuteSolidMd: ImageVector
    get() {
        if (_speakerMuteSolidMd != null) {
            return _speakerMuteSolidMd!!
        }
        _speakerMuteSolidMd = Builder(name = "SpeakerMuteSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(13.273f, 2.0f, 14.5f, 6.0f, 14.5f, 12.0f)
                curveTo(14.5f, 18.0f, 13.22f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(11.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(3.383f, 17.0f, 3.074f, 17.0f, 2.757f, 16.89f)
                curveTo(2.384f, 16.762f, 1.944f, 16.417f, 1.73f, 16.085f)
                curveTo(1.548f, 15.803f, 1.49f, 15.569f, 1.376f, 15.102f)
                curveTo(1.127f, 14.089f, 1.0f, 13.048f, 1.0f, 12.0f)
                curveTo(1.0f, 10.952f, 1.127f, 9.911f, 1.376f, 8.898f)
                curveTo(1.49f, 8.431f, 1.548f, 8.197f, 1.73f, 7.915f)
                curveTo(1.944f, 7.583f, 2.384f, 7.238f, 2.757f, 7.11f)
                curveTo(3.074f, 7.0f, 3.383f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(7.0f)
                lineTo(11.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.95f, 12.0f)
                lineTo(23.071f, 9.879f)
                lineTo(21.657f, 8.464f)
                lineTo(19.535f, 10.586f)
                lineTo(17.414f, 8.464f)
                lineTo(16.0f, 9.879f)
                lineTo(18.121f, 12.0f)
                lineTo(16.0f, 14.121f)
                lineTo(17.414f, 15.535f)
                lineTo(19.535f, 13.414f)
                lineTo(21.657f, 15.535f)
                lineTo(23.071f, 14.121f)
                lineTo(20.95f, 12.0f)
                close()
            }
        }
        .build()
        return _speakerMuteSolidMd!!
    }

private var _speakerMuteSolidMd: ImageVector? = null
