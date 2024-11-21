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

public val DsIcon.TrashSolidMd: ImageVector
    get() {
        if (_trashSolidMd != null) {
            return _trashSolidMd!!
        }
        _trashSolidMd = Builder(name = "TrashSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.197f, 2.0f)
                lineTo(11.091f, 2.0f)
                curveTo(10.66f, 1.999f, 10.229f, 1.998f, 9.837f, 2.13f)
                curveTo(9.322f, 2.302f, 8.877f, 2.638f, 8.57f, 3.086f)
                curveTo(8.336f, 3.427f, 8.218f, 3.841f, 8.101f, 4.256f)
                lineTo(8.101f, 4.256f)
                lineTo(8.072f, 4.357f)
                lineTo(7.832f, 5.196f)
                curveTo(4.952f, 5.495f, 3.0f, 6.131f, 3.0f, 7.06f)
                verticalLineTo(9.0f)
                lineTo(4.51f, 10.0f)
                lineTo(5.904f, 19.826f)
                curveTo(5.968f, 20.275f, 6.051f, 20.74f, 6.368f, 21.065f)
                curveTo(6.946f, 21.656f, 8.401f, 22.5f, 12.0f, 22.5f)
                curveTo(15.62f, 22.5f, 17.071f, 21.646f, 17.642f, 21.054f)
                curveTo(17.95f, 20.735f, 18.032f, 20.28f, 18.095f, 19.84f)
                lineTo(19.51f, 10.0f)
                lineTo(21.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 6.148f, 19.049f, 5.511f, 16.169f, 5.204f)
                lineTo(15.927f, 4.357f)
                lineTo(15.899f, 4.256f)
                curveTo(15.781f, 3.841f, 15.663f, 3.427f, 15.429f, 3.086f)
                curveTo(15.122f, 2.638f, 14.677f, 2.302f, 14.162f, 2.13f)
                curveTo(13.77f, 1.998f, 13.339f, 1.999f, 12.908f, 2.0f)
                lineTo(12.802f, 2.0f)
                horizontalLineTo(11.197f)
                close()
                moveTo(14.044f, 5.046f)
                lineTo(14.004f, 4.907f)
                curveTo(13.836f, 4.317f, 13.804f, 4.252f, 13.78f, 4.217f)
                curveTo(13.719f, 4.128f, 13.63f, 4.061f, 13.527f, 4.026f)
                curveTo(13.487f, 4.013f, 13.416f, 4.0f, 12.802f, 4.0f)
                horizontalLineTo(11.197f)
                curveTo(10.583f, 4.0f, 10.512f, 4.013f, 10.472f, 4.026f)
                curveTo(10.369f, 4.061f, 10.28f, 4.128f, 10.219f, 4.217f)
                curveTo(10.195f, 4.252f, 10.163f, 4.317f, 9.995f, 4.907f)
                lineTo(9.956f, 5.043f)
                curveTo(10.612f, 5.015f, 11.296f, 5.0f, 12.0f, 5.0f)
                curveTo(12.704f, 5.0f, 13.388f, 5.016f, 14.044f, 5.046f)
                close()
                moveTo(10.5f, 19.5f)
                lineTo(10.0f, 9.0f)
                lineTo(8.0f, 9.25f)
                lineTo(9.0f, 19.228f)
                lineTo(10.5f, 19.5f)
                close()
                moveTo(13.5f, 19.5f)
                lineTo(14.0f, 9.0f)
                lineTo(16.0f, 9.25f)
                lineTo(15.01f, 19.252f)
                lineTo(13.5f, 19.5f)
                close()
            }
        }
        .build()
        return _trashSolidMd!!
    }

private var _trashSolidMd: ImageVector? = null
