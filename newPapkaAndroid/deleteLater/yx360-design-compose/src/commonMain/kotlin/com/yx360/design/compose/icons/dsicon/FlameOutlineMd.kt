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

public val DsIcon.FlameOutlineMd: ImageVector
    get() {
        if (_flameOutlineMd != null) {
            return _flameOutlineMd!!
        }
        _flameOutlineMd = Builder(name = "FlameOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.467f, 6.427f)
                curveTo(10.401f, 4.752f, 11.848f, 2.536f, 13.0f, 1.0f)
                horizontalLineTo(14.0f)
                curveTo(15.796f, 2.796f, 17.688f, 5.157f, 18.929f, 7.314f)
                curveTo(20.165f, 9.46f, 21.0f, 11.761f, 21.0f, 14.0f)
                curveTo(21.0f, 18.583f, 17.5f, 22.0f, 13.5f, 22.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.851f, 19.936f, 14.463f, 18.087f, 14.262f, 16.765f)
                curveTo(14.083f, 15.595f, 13.421f, 14.244f, 12.0f, 12.794f)
                curveTo(10.579f, 14.244f, 9.917f, 15.595f, 9.739f, 16.765f)
                curveTo(9.537f, 18.087f, 10.149f, 19.936f, 11.0f, 21.0f)
                lineTo(10.5f, 22.0f)
                curveTo(6.5f, 22.0f, 3.0f, 18.583f, 3.0f, 14.0f)
                curveTo(3.0f, 9.657f, 5.476f, 6.032f, 7.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineTo(9.467f, 6.427f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(19.0f, 12.239f, 18.335f, 10.29f, 17.196f, 8.311f)
                curveTo(16.246f, 6.662f, 14.883f, 4.985f, 13.5f, 3.5f)
                curveTo(12.278f, 5.252f, 10.822f, 7.855f, 10.0f, 9.5f)
                horizontalLineTo(9.0f)
                lineTo(7.5f, 6.5f)
                curveTo(6.271f, 8.339f, 5.0f, 11.061f, 5.0f, 14.0f)
                curveTo(5.0f, 16.411f, 6.268f, 18.197f, 7.935f, 19.192f)
                curveTo(7.687f, 18.338f, 7.615f, 17.421f, 7.761f, 16.463f)
                curveTo(8.164f, 13.827f, 9.992f, 12.003f, 11.789f, 10.211f)
                curveTo(11.859f, 10.141f, 11.93f, 10.07f, 12.0f, 10.0f)
                curveTo(12.07f, 10.07f, 12.141f, 10.141f, 12.211f, 10.211f)
                curveTo(14.008f, 12.003f, 15.836f, 13.827f, 16.239f, 16.463f)
                curveTo(16.385f, 17.421f, 16.313f, 18.338f, 16.065f, 19.192f)
                curveTo(17.732f, 18.197f, 19.0f, 16.411f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _flameOutlineMd!!
    }

private var _flameOutlineMd: ImageVector? = null
