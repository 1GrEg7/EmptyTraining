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

public val DsIcon.FullscreenOnOutlineMd: ImageVector
    get() {
        if (_fullscreenOnOutlineMd != null) {
            return _fullscreenOnOutlineMd!!
        }
        _fullscreenOnOutlineMd = Builder(name = "FullscreenOnOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(18.647f, 4.012f)
                lineTo(14.0f, 8.659f)
                lineTo(15.341f, 10.0f)
                lineTo(19.991f, 5.35f)
                lineTo(20.0f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                verticalLineTo(19.988f)
                horizontalLineTo(5.353f)
                lineTo(10.0f, 15.341f)
                lineTo(8.659f, 14.0f)
                lineTo(4.009f, 18.649f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _fullscreenOnOutlineMd!!
    }

private var _fullscreenOnOutlineMd: ImageVector? = null
