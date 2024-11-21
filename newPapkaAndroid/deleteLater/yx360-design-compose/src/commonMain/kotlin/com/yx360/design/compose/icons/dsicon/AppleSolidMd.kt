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

public val DsIcon.AppleSolidMd: ImageVector
    get() {
        if (_appleSolidMd != null) {
            return _appleSolidMd!!
        }
        _appleSolidMd = Builder(name = "AppleSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.802f, 4.714f)
                curveTo(16.583f, 3.711f, 16.976f, 2.626f, 16.976f, 1.465f)
                curveTo(16.976f, 1.311f, 16.97f, 1.156f, 16.954f, 1.0f)
                curveTo(16.409f, 1.03f, 15.829f, 1.209f, 15.216f, 1.532f)
                curveTo(14.603f, 1.86f, 14.096f, 2.27f, 13.698f, 2.765f)
                curveTo(12.901f, 3.74f, 12.452f, 4.933f, 12.452f, 6.049f)
                curveTo(12.453f, 6.196f, 12.461f, 6.343f, 12.478f, 6.489f)
                curveTo(13.715f, 6.597f, 14.857f, 5.908f, 15.802f, 4.714f)
                close()
                moveTo(19.889f, 20.319f)
                curveTo(20.365f, 19.667f, 20.771f, 18.966f, 21.102f, 18.229f)
                curveTo(21.242f, 17.908f, 21.374f, 17.573f, 21.5f, 17.225f)
                curveTo(20.926f, 16.995f, 20.396f, 16.663f, 19.938f, 16.244f)
                curveTo(18.912f, 15.333f, 18.389f, 14.184f, 18.374f, 12.805f)
                curveTo(18.358f, 11.034f, 19.197f, 9.653f, 20.895f, 8.668f)
                curveTo(19.947f, 7.376f, 18.521f, 6.659f, 16.622f, 6.512f)
                curveTo(15.922f, 6.455f, 15.068f, 6.6f, 14.055f, 6.949f)
                curveTo(12.983f, 7.326f, 12.351f, 7.515f, 12.165f, 7.515f)
                curveTo(11.916f, 7.515f, 11.348f, 7.353f, 10.461f, 7.034f)
                curveTo(9.573f, 6.717f, 8.858f, 6.555f, 8.312f, 6.555f)
                curveTo(7.339f, 6.564f, 6.383f, 6.823f, 5.535f, 7.307f)
                curveTo(4.692f, 7.781f, 3.985f, 8.467f, 3.481f, 9.299f)
                curveTo(2.827f, 10.345f, 2.5f, 11.596f, 2.5f, 13.044f)
                curveTo(2.5f, 14.309f, 2.742f, 15.615f, 3.226f, 16.965f)
                curveTo(3.677f, 18.214f, 4.253f, 19.309f, 4.954f, 20.255f)
                curveTo(5.606f, 21.139f, 6.152f, 21.763f, 6.587f, 22.127f)
                curveTo(7.27f, 22.737f, 7.954f, 23.026f, 8.641f, 22.998f)
                curveTo(9.092f, 22.983f, 9.682f, 22.835f, 10.414f, 22.551f)
                curveTo(11.147f, 22.268f, 11.83f, 22.128f, 12.468f, 22.128f)
                curveTo(13.076f, 22.128f, 13.741f, 22.268f, 14.464f, 22.551f)
                curveTo(15.186f, 22.835f, 15.805f, 22.975f, 16.318f, 22.975f)
                curveTo(17.035f, 22.96f, 17.703f, 22.678f, 18.327f, 22.128f)
                curveTo(18.73f, 21.793f, 19.252f, 21.19f, 19.889f, 20.319f)
                close()
            }
        }
        .build()
        return _appleSolidMd!!
    }

private var _appleSolidMd: ImageVector? = null
