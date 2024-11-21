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

public val DsIcon.SpeakerOffOutlineMd: ImageVector
    get() {
        if (_speakerOffOutlineMd != null) {
            return _speakerOffOutlineMd!!
        }
        _speakerOffOutlineMd = Builder(name = "SpeakerOffOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.56f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(11.33f, 5.337f)
                lineTo(12.526f, 7.044f)
                lineTo(14.928f, 4.041f)
                curveTo(15.045f, 4.298f, 15.184f, 4.679f, 15.322f, 5.211f)
                curveTo(15.716f, 6.731f, 16.0f, 9.05f, 16.0f, 12.0f)
                verticalLineTo(12.008f)
                lineTo(17.912f, 14.74f)
                curveTo(17.969f, 13.887f, 18.0f, 12.972f, 18.0f, 12.0f)
                curveTo(18.0f, 5.889f, 16.833f, 2.0f, 15.56f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.495f, 7.0f)
                lineTo(5.0f, 2.008f)
                horizontalLineTo(7.5f)
                lineTo(21.5f, 22.008f)
                horizontalLineTo(19.0f)
                lineTo(17.199f, 19.435f)
                curveTo(16.746f, 21.081f, 16.153f, 22.0f, 15.56f, 22.0f)
                horizontalLineTo(14.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(6.383f, 17.0f, 6.074f, 17.0f, 5.757f, 16.89f)
                curveTo(5.384f, 16.762f, 4.944f, 16.417f, 4.73f, 16.085f)
                curveTo(4.548f, 15.803f, 4.49f, 15.569f, 4.376f, 15.102f)
                curveTo(4.127f, 14.089f, 4.0f, 13.048f, 4.0f, 12.0f)
                curveTo(4.0f, 10.952f, 4.127f, 9.911f, 4.376f, 8.898f)
                curveTo(4.49f, 8.431f, 4.548f, 8.197f, 4.73f, 7.915f)
                curveTo(4.944f, 7.583f, 5.384f, 7.238f, 5.757f, 7.11f)
                curveTo(6.074f, 7.0f, 6.383f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(8.495f)
                close()
                moveTo(15.632f, 17.196f)
                curveTo(15.535f, 17.794f, 15.424f, 18.324f, 15.304f, 18.782f)
                curveTo(15.167f, 19.301f, 15.03f, 19.68f, 14.913f, 19.94f)
                lineTo(10.961f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.842f, 15.0f, 6.722f, 15.0f, 6.618f, 14.998f)
                curveTo(6.526f, 14.997f, 6.464f, 14.995f, 6.421f, 14.992f)
                lineTo(6.418f, 14.99f)
                lineTo(6.41f, 14.983f)
                curveTo(6.404f, 14.964f, 6.397f, 14.937f, 6.387f, 14.901f)
                curveTo(6.368f, 14.83f, 6.348f, 14.747f, 6.318f, 14.625f)
                curveTo(6.107f, 13.768f, 6.0f, 12.887f, 6.0f, 12.0f)
                curveTo(6.0f, 11.113f, 6.107f, 10.232f, 6.318f, 9.375f)
                curveTo(6.348f, 9.254f, 6.368f, 9.17f, 6.387f, 9.099f)
                curveTo(6.397f, 9.063f, 6.404f, 9.036f, 6.41f, 9.016f)
                lineTo(6.418f, 9.01f)
                lineTo(6.421f, 9.008f)
                curveTo(6.464f, 9.005f, 6.526f, 9.003f, 6.618f, 9.002f)
                curveTo(6.722f, 9.0f, 6.842f, 9.0f, 7.0f, 9.0f)
                horizontalLineTo(9.895f)
                lineTo(15.632f, 17.196f)
                close()
            }
        }
        .build()
        return _speakerOffOutlineMd!!
    }

private var _speakerOffOutlineMd: ImageVector? = null
