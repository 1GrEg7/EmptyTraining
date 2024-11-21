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

public val DsIcon.LearningSolidSm: ImageVector
    get() {
        if (_learningSolidSm != null) {
            return _learningSolidSm!!
        }
        _learningSolidSm = Builder(name = "LearningSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.01f, 1.541f)
                lineTo(0.0f, 4.286f)
                verticalLineTo(6.06f)
                lineTo(0.0f, 6.06f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.829f)
                lineTo(8.007f, 9.137f)
                lineTo(16.0f, 6.087f)
                lineTo(16.0f, 4.313f)
                lineTo(8.01f, 1.541f)
                close()
                moveTo(2.937f, 9.105f)
                curveTo(2.954f, 8.92f, 2.971f, 8.738f, 2.987f, 8.565f)
                lineTo(8.008f, 10.437f)
                lineTo(12.915f, 8.565f)
                curveTo(12.931f, 8.738f, 12.948f, 8.92f, 12.965f, 9.105f)
                curveTo(13.05f, 10.04f, 13.144f, 11.147f, 13.144f, 11.554f)
                curveTo(13.144f, 12.194f, 12.725f, 12.627f, 12.425f, 12.859f)
                curveTo(12.095f, 13.113f, 11.678f, 13.309f, 11.242f, 13.46f)
                curveTo(10.36f, 13.765f, 9.198f, 13.951f, 7.951f, 13.951f)
                curveTo(6.703f, 13.951f, 5.542f, 13.765f, 4.66f, 13.46f)
                curveTo(4.224f, 13.309f, 3.806f, 13.113f, 3.477f, 12.859f)
                curveTo(3.176f, 12.627f, 2.758f, 12.194f, 2.758f, 11.554f)
                curveTo(2.758f, 11.147f, 2.852f, 10.04f, 2.937f, 9.105f)
                close()
            }
        }
        .build()
        return _learningSolidSm!!
    }

private var _learningSolidSm: ImageVector? = null
