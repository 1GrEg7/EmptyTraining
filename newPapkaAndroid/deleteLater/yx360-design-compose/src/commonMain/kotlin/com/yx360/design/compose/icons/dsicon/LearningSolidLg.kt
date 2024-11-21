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

public val DsIcon.LearningSolidLg: ImageVector
    get() {
        if (_learningSolidLg != null) {
            return _learningSolidLg!!
        }
        _learningSolidLg = Builder(name = "LearningSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.854f, 20.969f)
                lineTo(1.739f, 12.711f)
                horizontalLineTo(3.188f)
                lineTo(4.335f, 20.969f)
                horizontalLineTo(0.854f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.065f)
                lineTo(15.967f, 6.347f)
                lineTo(31.934f, 11.065f)
                lineTo(31.934f, 13.691f)
                lineTo(15.967f, 18.88f)
                lineTo(0.0f, 13.691f)
                verticalLineTo(11.065f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.712f, 18.058f)
                lineTo(15.967f, 20.899f)
                lineTo(7.221f, 18.058f)
                curveTo(7.197f, 18.293f, 7.173f, 18.536f, 7.148f, 18.783f)
                curveTo(6.988f, 20.383f, 6.815f, 22.562f, 6.815f, 23.298f)
                curveTo(6.815f, 25.912f, 12.044f, 27.22f, 15.967f, 27.22f)
                curveTo(19.889f, 27.22f, 25.119f, 25.912f, 25.119f, 23.298f)
                curveTo(25.119f, 22.562f, 24.945f, 20.383f, 24.785f, 18.783f)
                curveTo(24.76f, 18.536f, 24.736f, 18.293f, 24.712f, 18.058f)
                close()
            }
        }
        .build()
        return _learningSolidLg!!
    }

private var _learningSolidLg: ImageVector? = null
