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

public val DsIcon.ChatOutlineMd: ImageVector
    get() {
        if (_chatOutlineMd != null) {
            return _chatOutlineMd!!
        }
        _chatOutlineMd = Builder(name = "ChatOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.249f, 16.923f)
                lineTo(11.145f, 16.975f)
                curveTo(11.425f, 16.992f, 11.71f, 17.0f, 12.0f, 17.0f)
                curveTo(14.474f, 17.0f, 16.517f, 16.399f, 17.886f, 15.39f)
                curveTo(19.185f, 14.433f, 20.0f, 13.03f, 20.0f, 11.0f)
                curveTo(20.0f, 8.97f, 19.185f, 7.567f, 17.886f, 6.61f)
                curveTo(16.517f, 5.601f, 14.474f, 5.0f, 12.0f, 5.0f)
                curveTo(9.526f, 5.0f, 7.483f, 5.601f, 6.114f, 6.61f)
                curveTo(4.815f, 7.567f, 4.0f, 8.97f, 4.0f, 11.0f)
                curveTo(4.0f, 13.365f, 5.112f, 14.938f, 6.937f, 15.905f)
                lineTo(8.0f, 16.468f)
                verticalLineTo(19.172f)
                lineTo(10.249f, 16.923f)
                close()
                moveTo(11.028f, 18.972f)
                curveTo(11.348f, 18.991f, 11.672f, 19.0f, 12.0f, 19.0f)
                curveTo(17.527f, 19.0f, 22.0f, 16.333f, 22.0f, 11.0f)
                curveTo(22.0f, 5.667f, 17.527f, 3.0f, 12.0f, 3.0f)
                curveTo(6.473f, 3.0f, 2.0f, 5.667f, 2.0f, 11.0f)
                curveTo(2.0f, 14.16f, 3.57f, 16.384f, 6.0f, 17.672f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                lineTo(11.028f, 18.972f)
                close()
            }
        }
        .build()
        return _chatOutlineMd!!
    }

private var _chatOutlineMd: ImageVector? = null
