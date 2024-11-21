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

public val DsIcon.MailOutlineSm: ImageVector
    get() {
        if (_mailOutlineSm != null) {
            return _mailOutlineSm!!
        }
        _mailOutlineSm = Builder(name = "MailOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.5f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 1.5f, 0.0f, 3.291f, 0.0f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(0.0f, 12.709f, 1.791f, 14.5f, 4.0f, 14.5f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 14.5f, 16.0f, 12.709f, 16.0f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 3.291f, 14.209f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(2.374f, 4.335f)
                curveTo(2.737f, 3.829f, 3.33f, 3.5f, 4.0f, 3.5f)
                horizontalLineTo(12.0f)
                curveTo(12.67f, 3.5f, 13.263f, 3.829f, 13.626f, 4.335f)
                lineTo(8.0f, 7.364f)
                lineTo(2.374f, 4.335f)
                close()
                moveTo(2.0f, 6.405f)
                verticalLineTo(10.5f)
                curveTo(2.0f, 11.605f, 2.895f, 12.5f, 4.0f, 12.5f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 12.5f, 14.0f, 11.605f, 14.0f, 10.5f)
                verticalLineTo(6.405f)
                lineTo(8.474f, 9.38f)
                curveTo(8.178f, 9.54f, 7.822f, 9.54f, 7.526f, 9.38f)
                lineTo(2.0f, 6.405f)
                close()
            }
        }
        .build()
        return _mailOutlineSm!!
    }

private var _mailOutlineSm: ImageVector? = null
