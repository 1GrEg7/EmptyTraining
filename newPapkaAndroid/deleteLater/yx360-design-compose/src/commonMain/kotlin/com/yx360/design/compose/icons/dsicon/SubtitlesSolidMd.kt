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

public val DsIcon.SubtitlesSolidMd: ImageVector
    get() {
        if (_subtitlesSolidMd != null) {
            return _subtitlesSolidMd!!
        }
        _subtitlesSolidMd = Builder(name = "SubtitlesSolidMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.589f, 5.91f)
                curveTo(2.0f, 6.872f, 2.0f, 8.181f, 2.0f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(2.0f, 15.819f, 2.0f, 17.128f, 2.589f, 18.09f)
                curveTo(2.919f, 18.628f, 3.372f, 19.081f, 3.91f, 19.411f)
                curveTo(4.872f, 20.0f, 6.181f, 20.0f, 8.8f, 20.0f)
                horizontalLineTo(15.2f)
                curveTo(17.819f, 20.0f, 19.128f, 20.0f, 20.09f, 19.411f)
                curveTo(20.628f, 19.081f, 21.081f, 18.628f, 21.411f, 18.09f)
                curveTo(22.0f, 17.128f, 22.0f, 15.819f, 22.0f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(22.0f, 8.181f, 22.0f, 6.872f, 21.411f, 5.91f)
                curveTo(21.081f, 5.372f, 20.628f, 4.919f, 20.09f, 4.589f)
                curveTo(19.128f, 4.0f, 17.819f, 4.0f, 15.2f, 4.0f)
                horizontalLineTo(8.8f)
                curveTo(6.181f, 4.0f, 4.872f, 4.0f, 3.91f, 4.589f)
                curveTo(3.372f, 4.919f, 2.919f, 5.372f, 2.589f, 5.91f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _subtitlesSolidMd!!
    }

private var _subtitlesSolidMd: ImageVector? = null
