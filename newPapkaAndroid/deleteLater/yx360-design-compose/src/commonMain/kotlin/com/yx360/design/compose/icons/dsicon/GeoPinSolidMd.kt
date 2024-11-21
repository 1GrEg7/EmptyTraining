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

public val DsIcon.GeoPinSolidMd: ImageVector
    get() {
        if (_geoPinSolidMd != null) {
            return _geoPinSolidMd!!
        }
        _geoPinSolidMd = Builder(name = "GeoPinSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.012f, 23.0f)
                horizontalLineTo(13.009f)
                curveTo(13.684f, 21.222f, 15.378f, 19.828f, 16.783f, 18.712f)
                curveTo(17.385f, 18.233f, 17.943f, 17.789f, 18.361f, 17.37f)
                curveTo(19.621f, 16.111f, 20.479f, 14.507f, 20.827f, 12.759f)
                curveTo(21.174f, 11.012f, 20.996f, 9.2f, 20.315f, 7.554f)
                curveTo(19.634f, 5.908f, 18.48f, 4.502f, 17.0f, 3.513f)
                curveTo(15.519f, 2.524f, 13.779f, 1.998f, 12.0f, 2.0f)
                curveTo(10.221f, 1.998f, 8.481f, 2.524f, 7.0f, 3.513f)
                curveTo(5.52f, 4.502f, 4.366f, 5.908f, 3.685f, 7.554f)
                curveTo(3.004f, 9.2f, 2.826f, 11.012f, 3.173f, 12.759f)
                curveTo(3.521f, 14.507f, 4.379f, 16.111f, 5.639f, 17.37f)
                curveTo(6.058f, 17.792f, 6.62f, 18.24f, 7.227f, 18.723f)
                curveTo(8.627f, 19.837f, 10.328f, 21.355f, 11.012f, 23.0f)
                close()
                moveTo(10.068f, 8.13f)
                curveTo(10.643f, 7.745f, 11.319f, 7.54f, 12.01f, 7.54f)
                curveTo(12.937f, 7.54f, 13.826f, 7.909f, 14.482f, 8.565f)
                curveTo(15.137f, 9.221f, 15.506f, 10.112f, 15.506f, 11.04f)
                curveTo(15.506f, 11.732f, 15.301f, 12.409f, 14.917f, 12.984f)
                curveTo(14.533f, 13.56f, 13.987f, 14.009f, 13.348f, 14.273f)
                curveTo(12.709f, 14.538f, 12.007f, 14.608f, 11.328f, 14.473f)
                curveTo(10.65f, 14.338f, 10.028f, 14.004f, 9.539f, 13.515f)
                curveTo(9.05f, 13.025f, 8.717f, 12.402f, 8.582f, 11.723f)
                curveTo(8.447f, 11.044f, 8.517f, 10.34f, 8.781f, 9.7f)
                curveTo(9.046f, 9.061f, 9.494f, 8.514f, 10.068f, 8.13f)
                close()
            }
        }
        .build()
        return _geoPinSolidMd!!
    }

private var _geoPinSolidMd: ImageVector? = null
