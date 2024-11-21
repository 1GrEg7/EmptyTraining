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

public val DsIcon.ReplyOutlineMd: ImageVector
    get() {
        if (_replyOutlineMd != null) {
            return _replyOutlineMd!!
        }
        _replyOutlineMd = Builder(name = "ReplyOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.001f)
                curveTo(12.669f, 16.001f, 13.338f, 16.056f, 14.0f, 16.162f)
                curveTo(16.544f, 16.569f, 18.985f, 17.735f, 20.927f, 19.46f)
                curveTo(21.123f, 19.634f, 21.314f, 19.814f, 21.5f, 20.0f)
                horizontalLineTo(23.0f)
                curveTo(22.956f, 19.568f, 22.903f, 19.101f, 22.835f, 18.665f)
                curveTo(22.825f, 18.602f, 22.815f, 18.539f, 22.805f, 18.477f)
                curveTo(22.776f, 18.311f, 22.746f, 18.151f, 22.712f, 18.0f)
                curveTo(22.693f, 17.913f, 22.673f, 17.83f, 22.652f, 17.751f)
                curveTo(21.141f, 12.095f, 16.83f, 8.805f, 12.0f, 8.027f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.5f)
                lineTo(1.5f, 12.0f)
                lineTo(10.5f, 21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.001f)
                close()
                moveTo(10.0f, 17.672f)
                verticalLineTo(14.001f)
                horizontalLineTo(12.0f)
                curveTo(14.821f, 14.001f, 17.619f, 14.837f, 20.023f, 16.311f)
                curveTo(18.373f, 12.679f, 15.203f, 10.569f, 11.682f, 10.002f)
                lineTo(10.0f, 9.731f)
                verticalLineTo(6.328f)
                lineTo(4.328f, 12.0f)
                lineTo(10.0f, 17.672f)
                close()
            }
        }
        .build()
        return _replyOutlineMd!!
    }

private var _replyOutlineMd: ImageVector? = null
