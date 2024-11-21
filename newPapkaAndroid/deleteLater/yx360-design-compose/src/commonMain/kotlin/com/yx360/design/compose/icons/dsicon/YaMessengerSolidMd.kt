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

public val DsIcon.YaMessengerSolidMd: ImageVector
    get() {
        if (_yaMessengerSolidMd != null) {
            return _yaMessengerSolidMd!!
        }
        _yaMessengerSolidMd = Builder(name = "YaMessengerSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.001f, 5.214f)
                curveTo(3.269f, 5.073f, 2.762f, 5.087f, 2.402f, 5.3f)
                curveTo(1.982f, 5.55f, 1.668f, 5.945f, 1.519f, 6.411f)
                curveTo(1.245f, 7.269f, 2.029f, 8.587f, 3.599f, 11.223f)
                lineTo(4.062f, 12.0f)
                lineTo(3.599f, 12.778f)
                curveTo(2.03f, 15.414f, 1.245f, 16.732f, 1.519f, 17.59f)
                curveTo(1.668f, 18.056f, 1.982f, 18.451f, 2.402f, 18.701f)
                curveTo(2.762f, 18.914f, 3.269f, 18.927f, 4.001f, 18.787f)
                curveTo(4.006f, 20.482f, 4.055f, 21.381f, 4.512f, 21.89f)
                curveTo(4.793f, 22.204f, 5.167f, 22.42f, 5.579f, 22.509f)
                curveTo(6.327f, 22.67f, 7.247f, 22.145f, 9.087f, 21.094f)
                lineTo(19.834f, 14.952f)
                curveTo(21.698f, 13.887f, 22.631f, 13.354f, 22.87f, 12.621f)
                curveTo(23.002f, 12.218f, 23.002f, 11.783f, 22.87f, 11.38f)
                curveTo(22.631f, 10.646f, 21.698f, 10.114f, 19.834f, 9.048f)
                lineTo(9.087f, 2.907f)
                curveTo(7.247f, 1.856f, 6.327f, 1.33f, 5.579f, 1.492f)
                curveTo(5.167f, 1.58f, 4.793f, 1.797f, 4.512f, 2.111f)
                curveTo(4.055f, 2.62f, 4.006f, 3.519f, 4.001f, 5.214f)
                close()
                moveTo(6.0f, 5.751f)
                curveTo(10.401f, 7.112f, 14.684f, 8.896f, 19.0f, 10.5f)
                lineTo(8.095f, 4.644f)
                curveTo(7.135f, 4.095f, 6.553f, 3.766f, 6.121f, 3.576f)
                curveTo(6.099f, 3.567f, 6.079f, 3.558f, 6.06f, 3.55f)
                curveTo(6.058f, 3.571f, 6.055f, 3.593f, 6.053f, 3.616f)
                curveTo(6.004f, 4.07f, 6.0f, 4.71f, 6.0f, 5.751f)
                close()
                moveTo(5.318f, 13.801f)
                lineTo(6.39f, 12.0f)
                lineTo(20.0f, 12.0f)
                curveTo(19.975f, 12.006f, 16.07f, 12.925f, 14.795f, 13.333f)
                lineTo(6.948f, 15.851f)
                curveTo(5.444f, 16.333f, 4.463f, 16.645f, 3.758f, 16.796f)
                curveTo(3.709f, 16.806f, 3.664f, 16.815f, 3.622f, 16.823f)
                curveTo(3.639f, 16.784f, 3.658f, 16.742f, 3.679f, 16.697f)
                curveTo(3.985f, 16.044f, 4.509f, 15.158f, 5.318f, 13.801f)
                close()
            }
        }
        .build()
        return _yaMessengerSolidMd!!
    }

private var _yaMessengerSolidMd: ImageVector? = null
