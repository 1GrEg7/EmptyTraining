package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.InfoSolidMd: ImageVector
    get() {
        if (_infoSolidMd != null) {
            return _infoSolidMd!!
        }
        _infoSolidMd = Builder(name = "InfoSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.304f, 18.466f)
                curveTo(11.934f, 18.466f, 12.636f, 18.178f, 13.5f, 17.008f)
                lineTo(14.411f, 15.788f)
                curveTo(14.413f, 15.786f, 14.415f, 15.784f, 14.416f, 15.781f)
                curveTo(14.523f, 15.631f, 14.487f, 15.423f, 14.337f, 15.316f)
                curveTo(14.179f, 15.203f, 13.96f, 15.229f, 13.832f, 15.375f)
                lineTo(12.357f, 17.055f)
                curveTo(12.287f, 17.134f, 12.174f, 17.159f, 12.078f, 17.116f)
                curveTo(11.984f, 17.074f, 11.934f, 16.972f, 11.959f, 16.872f)
                lineTo(13.816f, 9.426f)
                curveTo(13.834f, 9.357f, 13.836f, 9.285f, 13.823f, 9.215f)
                curveTo(13.773f, 8.944f, 13.513f, 8.764f, 13.241f, 8.813f)
                lineTo(9.891f, 9.426f)
                curveTo(9.756f, 9.45f, 9.648f, 9.551f, 9.615f, 9.684f)
                lineTo(9.529f, 10.018f)
                curveTo(9.524f, 10.038f, 9.522f, 10.059f, 9.522f, 10.08f)
                curveTo(9.522f, 10.218f, 9.634f, 10.33f, 9.772f, 10.33f)
                horizontalLineTo(11.502f)
                lineTo(10.026f, 16.252f)
                curveTo(9.972f, 16.486f, 9.882f, 16.882f, 9.882f, 17.17f)
                curveTo(9.882f, 17.836f, 10.278f, 18.466f, 11.304f, 18.466f)
                close()
                moveTo(13.134f, 7.93f)
                curveTo(13.836f, 7.93f, 14.376f, 7.516f, 14.52f, 6.886f)
                curveTo(14.556f, 6.742f, 14.574f, 6.58f, 14.574f, 6.472f)
                curveTo(14.574f, 5.968f, 14.178f, 5.5f, 13.44f, 5.5f)
                curveTo(12.738f, 5.5f, 12.198f, 5.914f, 12.054f, 6.544f)
                curveTo(12.018f, 6.688f, 12.0f, 6.85f, 12.0f, 6.958f)
                curveTo(12.0f, 7.462f, 12.396f, 7.93f, 13.134f, 7.93f)
                close()
            }
        }
        .build()
        return _infoSolidMd!!
    }

private var _infoSolidMd: ImageVector? = null
