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

public val DsIcon.SpeakerMuteOutlineMd: ImageVector
    get() {
        if (_speakerMuteOutlineMd != null) {
            return _speakerMuteOutlineMd!!
        }
        _speakerMuteOutlineMd = Builder(name = "SpeakerMuteOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.56f, 2.0f)
                horizontalLineTo(11.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.383f, 7.0f, 3.074f, 7.0f, 2.757f, 7.11f)
                curveTo(2.384f, 7.238f, 1.944f, 7.583f, 1.73f, 7.915f)
                curveTo(1.548f, 8.197f, 1.49f, 8.431f, 1.376f, 8.898f)
                curveTo(1.127f, 9.911f, 1.0f, 10.952f, 1.0f, 12.0f)
                curveTo(1.0f, 13.048f, 1.127f, 14.089f, 1.376f, 15.102f)
                curveTo(1.49f, 15.569f, 1.548f, 15.803f, 1.73f, 16.085f)
                curveTo(1.944f, 16.417f, 2.384f, 16.762f, 2.757f, 16.89f)
                curveTo(3.074f, 17.0f, 3.383f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(7.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineTo(12.56f)
                curveTo(13.78f, 22.0f, 15.0f, 18.111f, 15.0f, 12.0f)
                curveTo(15.0f, 5.889f, 13.833f, 2.0f, 12.56f, 2.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineTo(7.961f)
                lineTo(11.928f, 4.041f)
                curveTo(12.045f, 4.298f, 12.184f, 4.679f, 12.322f, 5.211f)
                curveTo(12.716f, 6.731f, 13.0f, 9.05f, 13.0f, 12.0f)
                curveTo(13.0f, 14.942f, 12.704f, 17.261f, 12.304f, 18.782f)
                curveTo(12.167f, 19.301f, 12.03f, 19.68f, 11.913f, 19.94f)
                lineTo(7.961f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.842f, 15.0f, 3.722f, 15.0f, 3.618f, 14.998f)
                curveTo(3.526f, 14.997f, 3.464f, 14.995f, 3.421f, 14.992f)
                lineTo(3.418f, 14.99f)
                lineTo(3.41f, 14.983f)
                curveTo(3.404f, 14.964f, 3.397f, 14.937f, 3.387f, 14.901f)
                curveTo(3.368f, 14.83f, 3.348f, 14.747f, 3.318f, 14.625f)
                curveTo(3.107f, 13.768f, 3.0f, 12.887f, 3.0f, 12.0f)
                curveTo(3.0f, 11.113f, 3.107f, 10.232f, 3.318f, 9.375f)
                curveTo(3.348f, 9.254f, 3.368f, 9.17f, 3.387f, 9.099f)
                curveTo(3.397f, 9.063f, 3.404f, 9.036f, 3.41f, 9.016f)
                lineTo(3.418f, 9.01f)
                lineTo(3.421f, 9.008f)
                curveTo(3.464f, 9.005f, 3.526f, 9.003f, 3.618f, 9.002f)
                curveTo(3.722f, 9.0f, 3.842f, 9.0f, 4.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.071f, 9.414f)
                lineTo(20.95f, 11.535f)
                lineTo(23.071f, 13.657f)
                lineTo(21.657f, 15.071f)
                lineTo(19.535f, 12.95f)
                lineTo(17.414f, 15.071f)
                lineTo(16.0f, 13.657f)
                lineTo(18.121f, 11.535f)
                lineTo(16.0f, 9.414f)
                lineTo(17.414f, 8.0f)
                lineTo(19.535f, 10.121f)
                lineTo(21.657f, 8.0f)
                lineTo(23.071f, 9.414f)
                close()
            }
        }
        .build()
        return _speakerMuteOutlineMd!!
    }

private var _speakerMuteOutlineMd: ImageVector? = null
