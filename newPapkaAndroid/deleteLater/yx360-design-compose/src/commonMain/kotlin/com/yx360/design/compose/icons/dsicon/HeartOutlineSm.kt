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

public val DsIcon.HeartOutlineSm: ImageVector
    get() {
        if (_heartOutlineSm != null) {
            return _heartOutlineSm!!
        }
        _heartOutlineSm = Builder(name = "HeartOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.776f, 3.397f)
                curveTo(2.297f, 3.833f, 1.875f, 4.584f, 1.875f, 5.875f)
                curveTo(1.875f, 7.756f, 3.03f, 9.412f, 4.523f, 10.756f)
                curveTo(5.771f, 11.879f, 7.157f, 12.693f, 7.992f, 13.137f)
                curveTo(8.807f, 12.677f, 10.201f, 11.767f, 11.463f, 10.581f)
                curveTo(12.988f, 9.148f, 14.125f, 7.493f, 14.125f, 5.875f)
                curveTo(14.125f, 4.568f, 13.721f, 3.819f, 13.26f, 3.391f)
                curveTo(12.783f, 2.948f, 12.138f, 2.75f, 11.5f, 2.75f)
                curveTo(10.42f, 2.75f, 9.79f, 3.35f, 9.385f, 4.059f)
                curveTo(9.179f, 4.418f, 9.047f, 4.786f, 8.966f, 5.069f)
                curveTo(8.926f, 5.208f, 8.75f, 5.875f, 8.75f, 5.875f)
                horizontalLineTo(7.25f)
                curveTo(7.25f, 5.875f, 7.074f, 5.208f, 7.034f, 5.069f)
                curveTo(6.953f, 4.786f, 6.821f, 4.418f, 6.615f, 4.059f)
                curveTo(6.21f, 3.35f, 5.58f, 2.75f, 4.5f, 2.75f)
                curveTo(3.929f, 2.75f, 3.276f, 2.943f, 2.776f, 3.397f)
                close()
                moveTo(8.0f, 2.968f)
                curveTo(8.623f, 1.992f, 9.716f, 1.0f, 11.5f, 1.0f)
                curveTo(12.477f, 1.0f, 13.582f, 1.302f, 14.451f, 2.109f)
                curveTo(15.336f, 2.931f, 15.875f, 4.182f, 15.875f, 5.875f)
                curveTo(15.875f, 8.257f, 14.262f, 10.352f, 12.662f, 11.856f)
                curveTo(11.029f, 13.391f, 9.206f, 14.5f, 8.391f, 14.908f)
                lineTo(8.0f, 15.103f)
                lineTo(7.609f, 14.908f)
                curveTo(6.832f, 14.519f, 5.001f, 13.54f, 3.352f, 12.057f)
                curveTo(1.72f, 10.588f, 0.125f, 8.494f, 0.125f, 5.875f)
                curveTo(0.125f, 4.166f, 0.703f, 2.917f, 1.599f, 2.103f)
                curveTo(2.474f, 1.307f, 3.571f, 1.0f, 4.5f, 1.0f)
                curveTo(6.284f, 1.0f, 7.377f, 1.992f, 8.0f, 2.968f)
                close()
            }
        }
        .build()
        return _heartOutlineSm!!
    }

private var _heartOutlineSm: ImageVector? = null
