package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.ChatGroupOutlineMd: ImageVector
    get() {
        if (_chatGroupOutlineMd != null) {
            return _chatGroupOutlineMd!!
        }
        _chatGroupOutlineMd = Builder(name = "ChatGroupOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.477f, 2.0f)
                curveTo(6.525f, 2.0f, 4.598f, 3.027f, 3.434f, 4.485f)
                curveTo(2.304f, 5.901f, 2.0f, 7.589f, 2.0f, 8.765f)
                curveTo(2.0f, 10.321f, 2.547f, 12.849f, 4.88f, 14.348f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.051f)
                lineTo(9.194f, 15.526f)
                curveTo(9.287f, 15.528f, 9.381f, 15.529f, 9.477f, 15.529f)
                curveTo(12.428f, 15.529f, 14.356f, 14.502f, 15.52f, 13.044f)
                curveTo(16.649f, 11.629f, 16.953f, 9.941f, 16.953f, 8.765f)
                curveTo(16.953f, 7.374f, 16.591f, 5.672f, 15.416f, 4.303f)
                curveTo(14.215f, 2.905f, 12.293f, 2.0f, 9.477f, 2.0f)
                close()
                moveTo(3.994f, 8.765f)
                curveTo(3.994f, 7.882f, 4.23f, 6.688f, 4.99f, 5.735f)
                curveTo(5.716f, 4.826f, 7.028f, 4.0f, 9.477f, 4.0f)
                curveTo(11.844f, 4.0f, 13.162f, 4.742f, 13.905f, 5.608f)
                curveTo(14.674f, 6.504f, 14.96f, 7.684f, 14.96f, 8.765f)
                curveTo(14.96f, 9.648f, 14.723f, 10.842f, 13.963f, 11.794f)
                curveTo(13.237f, 12.703f, 11.925f, 13.529f, 9.477f, 13.529f)
                curveTo(9.249f, 13.529f, 9.03f, 13.522f, 8.822f, 13.508f)
                lineTo(8.329f, 13.476f)
                lineTo(6.874f, 15.156f)
                verticalLineTo(13.16f)
                lineTo(6.331f, 12.881f)
                curveTo(4.48f, 11.929f, 3.994f, 10.056f, 3.994f, 8.765f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.134f, 7.205f)
                verticalLineTo(9.913f)
                curveTo(19.796f, 10.833f, 20.006f, 11.937f, 20.006f, 12.765f)
                curveTo(20.006f, 14.051f, 19.517f, 15.925f, 17.644f, 16.879f)
                lineTo(17.099f, 17.157f)
                verticalLineTo(19.175f)
                lineTo(15.613f, 17.476f)
                lineTo(15.123f, 17.508f)
                curveTo(14.912f, 17.522f, 14.692f, 17.529f, 14.461f, 17.529f)
                curveTo(13.452f, 17.529f, 12.634f, 17.392f, 11.969f, 17.168f)
                verticalLineTo(19.248f)
                curveTo(12.704f, 19.43f, 13.532f, 19.529f, 14.461f, 19.529f)
                curveTo(14.56f, 19.529f, 14.657f, 19.528f, 14.754f, 19.526f)
                lineTo(16.917f, 22.0f)
                horizontalLineTo(19.092f)
                verticalLineTo(18.351f)
                curveTo(21.445f, 16.854f, 22.0f, 14.325f, 22.0f, 12.765f)
                curveTo(22.0f, 11.587f, 21.693f, 9.897f, 20.552f, 8.482f)
                curveTo(20.165f, 8.002f, 19.696f, 7.57f, 19.134f, 7.205f)
                close()
            }
        }
        .build()
        return _chatGroupOutlineMd!!
    }

private var _chatGroupOutlineMd: ImageVector? = null
