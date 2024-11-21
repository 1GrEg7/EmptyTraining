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

public val DsIcon.QuestionOutlineXs: ImageVector
    get() {
        if (_questionOutlineXs != null) {
            return _questionOutlineXs!!
        }
        _questionOutlineXs = Builder(name = "QuestionOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.009f, 3.794f)
                horizontalLineTo(3.005f)
                curveTo(2.938f, 2.778f, 3.5f, 1.0f, 6.195f, 1.0f)
                curveTo(8.08f, 1.0f, 9.0f, 2.482f, 9.0f, 3.794f)
                curveTo(9.0f, 4.702f, 8.458f, 5.133f, 7.938f, 5.547f)
                curveTo(7.459f, 5.927f, 7.0f, 6.292f, 7.0f, 7.0f)
                horizontalLineTo(5.009f)
                curveTo(5.009f, 5.754f, 5.709f, 5.182f, 6.279f, 4.716f)
                curveTo(6.647f, 4.416f, 6.961f, 4.159f, 7.0f, 3.794f)
                curveTo(7.051f, 3.317f, 6.797f, 2.897f, 6.078f, 2.897f)
                curveTo(5.359f, 2.897f, 5.009f, 3.354f, 5.009f, 3.794f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                curveTo(6.69f, 11.0f, 7.25f, 10.44f, 7.25f, 9.75f)
                curveTo(7.25f, 9.06f, 6.69f, 8.5f, 6.0f, 8.5f)
                curveTo(5.31f, 8.5f, 4.75f, 9.06f, 4.75f, 9.75f)
                curveTo(4.75f, 10.44f, 5.31f, 11.0f, 6.0f, 11.0f)
                close()
            }
        }
        .build()
        return _questionOutlineXs!!
    }

private var _questionOutlineXs: ImageVector? = null
