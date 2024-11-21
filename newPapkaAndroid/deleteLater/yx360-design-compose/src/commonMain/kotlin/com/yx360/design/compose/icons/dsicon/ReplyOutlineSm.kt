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

public val DsIcon.ReplyOutlineSm: ImageVector
    get() {
        if (_replyOutlineSm != null) {
            return _replyOutlineSm!!
        }
        _replyOutlineSm = Builder(name = "ReplyOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 11.102f)
                curveTo(11.05f, 11.285f, 12.175f, 11.735f, 13.429f, 12.59f)
                curveTo(13.616f, 12.718f, 13.806f, 12.854f, 14.0f, 13.0f)
                horizontalLineTo(15.5f)
                curveTo(15.422f, 12.295f, 15.307f, 11.627f, 15.147f, 11.0f)
                curveTo(14.288f, 7.622f, 12.139f, 5.422f, 7.5f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                lineTo(0.0f, 8.0f)
                lineTo(6.0f, 14.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.0f)
                curveTo(8.25f, 11.0f, 8.906f, 11.031f, 9.5f, 11.102f)
                close()
                moveTo(5.67f, 11.412f)
                lineTo(5.5f, 9.836f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                curveTo(9.102f, 9.0f, 10.451f, 9.132f, 11.722f, 9.529f)
                curveTo(12.023f, 9.623f, 12.725f, 10.073f, 13.163f, 10.462f)
                curveTo(12.838f, 9.733f, 12.158f, 9.134f, 11.895f, 8.845f)
                curveTo(11.074f, 7.942f, 9.725f, 7.211f, 7.319f, 6.992f)
                lineTo(5.5f, 6.826f)
                verticalLineTo(6.077f)
                lineTo(5.676f, 4.709f)
                curveTo(5.246f, 5.345f, 4.765f, 5.946f, 4.239f, 6.504f)
                lineTo(2.828f, 8.0f)
                lineTo(3.886f, 9.132f)
                curveTo(4.547f, 9.839f, 5.143f, 10.601f, 5.67f, 11.412f)
                close()
            }
        }
        .build()
        return _replyOutlineSm!!
    }

private var _replyOutlineSm: ImageVector? = null
