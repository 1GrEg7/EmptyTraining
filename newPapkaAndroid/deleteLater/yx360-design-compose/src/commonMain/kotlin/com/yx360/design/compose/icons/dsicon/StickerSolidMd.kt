package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.StickerSolidMd: ImageVector
    get() {
        if (_stickerSolidMd != null) {
            return _stickerSolidMd!!
        }
        _stickerSolidMd = Builder(name = "StickerSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.406f, 2.44f)
                curveTo(9.391f, 2.778f, 9.377f, 3.125f, 9.369f, 3.461f)
                curveTo(9.352f, 4.247f, 9.363f, 5.101f, 9.525f, 5.748f)
                curveTo(10.044f, 7.823f, 10.602f, 9.527f, 12.538f, 11.462f)
                curveTo(14.473f, 13.398f, 16.177f, 13.956f, 18.252f, 14.475f)
                curveTo(18.829f, 14.619f, 19.846f, 14.745f, 20.924f, 14.874f)
                lineTo(21.34f, 14.924f)
                curveTo(21.391f, 14.93f, 21.443f, 14.936f, 21.495f, 14.942f)
                curveTo(21.386f, 15.441f, 21.21f, 15.942f, 20.96f, 16.445f)
                curveTo(20.646f, 17.077f, 20.266f, 17.671f, 19.831f, 18.219f)
                curveTo(19.813f, 18.242f, 19.795f, 18.264f, 19.777f, 18.286f)
                curveTo(18.948f, 19.31f, 17.92f, 20.168f, 16.752f, 20.8f)
                curveTo(16.146f, 21.128f, 15.501f, 21.396f, 14.827f, 21.594f)
                curveTo(13.931f, 21.858f, 12.982f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 9.363f, 3.021f, 6.965f, 4.687f, 5.179f)
                curveTo(5.467f, 4.343f, 6.389f, 3.641f, 7.413f, 3.111f)
                curveTo(8.08f, 2.767f, 8.745f, 2.547f, 9.406f, 2.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.407f, 2.443f)
                curveTo(11.889f, 2.521f, 12.366f, 2.653f, 12.839f, 2.832f)
                curveTo(14.547f, 3.483f, 16.166f, 4.752f, 17.707f, 6.293f)
                curveTo(19.749f, 8.334f, 21.323f, 10.588f, 21.594f, 12.94f)
                curveTo(21.587f, 12.939f, 21.581f, 12.939f, 21.574f, 12.938f)
                lineTo(21.162f, 12.889f)
                curveTo(20.023f, 12.752f, 19.161f, 12.641f, 18.737f, 12.535f)
                curveTo(16.813f, 12.054f, 15.517f, 11.613f, 13.952f, 10.048f)
                curveTo(12.387f, 8.483f, 11.946f, 7.187f, 11.465f, 5.262f)
                curveTo(11.377f, 4.909f, 11.351f, 4.305f, 11.369f, 3.506f)
                curveTo(11.376f, 3.163f, 11.391f, 2.806f, 11.407f, 2.443f)
                close()
            }
        }
        .build()
        return _stickerSolidMd!!
    }

private var _stickerSolidMd: ImageVector? = null
