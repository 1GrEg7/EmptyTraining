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

public val DsIcon.NfcOutlineMd: ImageVector
    get() {
        if (_nfcOutlineMd != null) {
            return _nfcOutlineMd!!
        }
        _nfcOutlineMd = Builder(name = "NfcOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.569f, 23.31f)
                lineTo(13.155f, 21.896f)
                curveTo(15.69f, 19.362f, 17.258f, 15.861f, 17.258f, 11.993f)
                curveTo(17.258f, 8.131f, 15.694f, 4.634f, 13.164f, 2.101f)
                lineTo(14.578f, 0.687f)
                curveTo(17.47f, 3.581f, 19.258f, 7.579f, 19.258f, 11.993f)
                curveTo(19.258f, 16.413f, 17.466f, 20.414f, 14.569f, 23.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.74f, 20.482f)
                curveTo(13.913f, 18.31f, 15.258f, 15.309f, 15.258f, 11.993f)
                curveTo(15.258f, 8.683f, 13.917f, 5.686f, 11.75f, 3.515f)
                lineTo(10.336f, 4.929f)
                curveTo(12.141f, 6.738f, 13.258f, 9.235f, 13.258f, 11.993f)
                curveTo(13.258f, 14.756f, 12.137f, 17.257f, 10.326f, 19.067f)
                lineTo(11.74f, 20.482f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.258f, 11.993f)
                curveTo(11.258f, 14.204f, 10.361f, 16.205f, 8.912f, 17.653f)
                lineTo(7.498f, 16.239f)
                curveTo(8.585f, 15.153f, 9.258f, 13.652f, 9.258f, 11.993f)
                curveTo(9.258f, 10.34f, 8.589f, 8.843f, 7.507f, 7.758f)
                lineTo(8.921f, 6.343f)
                curveTo(10.365f, 7.791f, 11.258f, 9.788f, 11.258f, 11.993f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.233f, 12.125f)
                curveTo(7.237f, 13.158f, 6.88f, 14.16f, 6.223f, 14.958f)
                lineTo(4.812f, 13.661f)
                curveTo(5.186f, 13.207f, 5.329f, 12.72f, 5.327f, 12.131f)
                curveTo(5.325f, 11.543f, 5.118f, 10.973f, 4.74f, 10.521f)
                lineTo(6.084f, 9.193f)
                curveTo(6.746f, 9.986f, 7.23f, 11.092f, 7.233f, 12.125f)
                close()
            }
        }
        .build()
        return _nfcOutlineMd!!
    }

private var _nfcOutlineMd: ImageVector? = null
