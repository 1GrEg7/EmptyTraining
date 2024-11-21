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

public val DsIcon.ChatOutlineSm: ImageVector
    get() {
        if (_chatOutlineSm != null) {
            return _chatOutlineSm!!
        }
        _chatOutlineSm = Builder(name = "ChatOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.8f, 16.0f)
                horizontalLineTo(3.2f)
                verticalLineTo(12.787f)
                curveTo(0.809f, 11.695f, 0.0f, 9.654f, 0.0f, 7.316f)
                curveTo(0.0f, 3.828f, 3.582f, 1.0f, 8.0f, 1.0f)
                curveTo(12.418f, 1.0f, 16.0f, 3.828f, 16.0f, 7.316f)
                curveTo(16.0f, 10.804f, 12.418f, 13.632f, 8.0f, 13.632f)
                curveTo(7.73f, 13.632f, 7.463f, 13.621f, 7.2f, 13.6f)
                lineTo(4.8f, 16.0f)
                close()
                moveTo(5.2f, 12.772f)
                lineTo(6.438f, 11.535f)
                lineTo(7.356f, 11.606f)
                curveTo(7.567f, 11.623f, 7.782f, 11.632f, 8.0f, 11.632f)
                curveTo(11.78f, 11.632f, 14.0f, 9.285f, 14.0f, 7.316f)
                curveTo(14.0f, 5.347f, 11.78f, 3.0f, 8.0f, 3.0f)
                curveTo(4.22f, 3.0f, 2.0f, 5.347f, 2.0f, 7.316f)
                curveTo(2.0f, 8.267f, 2.166f, 9.011f, 2.468f, 9.577f)
                curveTo(2.752f, 10.11f, 3.214f, 10.594f, 4.031f, 10.967f)
                lineTo(5.2f, 11.501f)
                verticalLineTo(12.772f)
                close()
            }
        }
        .build()
        return _chatOutlineSm!!
    }

private var _chatOutlineSm: ImageVector? = null
