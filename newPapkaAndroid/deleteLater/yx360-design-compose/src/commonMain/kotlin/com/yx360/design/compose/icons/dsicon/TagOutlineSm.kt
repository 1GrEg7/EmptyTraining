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

public val DsIcon.TagOutlineSm: ImageVector
    get() {
        if (_tagOutlineSm != null) {
            return _tagOutlineSm!!
        }
        _tagOutlineSm = Builder(name = "TagOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 9.5f)
                curveTo(11.328f, 9.5f, 12.0f, 8.828f, 12.0f, 8.0f)
                curveTo(12.0f, 7.172f, 11.328f, 6.5f, 10.5f, 6.5f)
                curveTo(9.672f, 6.5f, 9.0f, 7.172f, 9.0f, 8.0f)
                curveTo(9.0f, 8.828f, 9.672f, 9.5f, 10.5f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 7.1f)
                curveTo(0.0f, 5.136f, 0.0f, 4.154f, 0.442f, 3.432f)
                curveTo(0.689f, 3.029f, 1.029f, 2.689f, 1.433f, 2.442f)
                curveTo(2.154f, 2.0f, 3.136f, 2.0f, 5.1f, 2.0f)
                horizontalLineTo(9.415f)
                curveTo(10.546f, 2.0f, 11.112f, 2.0f, 11.615f, 2.186f)
                curveTo(11.9f, 2.291f, 12.167f, 2.439f, 12.408f, 2.624f)
                curveTo(12.832f, 2.951f, 13.133f, 3.431f, 13.734f, 4.389f)
                lineTo(14.299f, 5.289f)
                curveTo(14.977f, 6.37f, 15.316f, 6.91f, 15.416f, 7.498f)
                curveTo(15.472f, 7.83f, 15.472f, 8.17f, 15.416f, 8.502f)
                curveTo(15.316f, 9.09f, 14.977f, 9.63f, 14.299f, 10.711f)
                lineTo(13.734f, 11.611f)
                curveTo(13.133f, 12.569f, 12.832f, 13.049f, 12.408f, 13.376f)
                curveTo(12.167f, 13.561f, 11.9f, 13.709f, 11.615f, 13.814f)
                curveTo(11.112f, 14.0f, 10.546f, 14.0f, 9.415f, 14.0f)
                horizontalLineTo(5.1f)
                curveTo(3.136f, 14.0f, 2.154f, 14.0f, 1.433f, 13.558f)
                curveTo(1.029f, 13.311f, 0.689f, 12.971f, 0.442f, 12.568f)
                curveTo(0.0f, 11.846f, 0.0f, 10.864f, 0.0f, 8.9f)
                verticalLineTo(7.1f)
                close()
                moveTo(5.1f, 4.0f)
                horizontalLineTo(9.415f)
                curveTo(10.698f, 4.0f, 10.834f, 4.029f, 10.922f, 4.062f)
                curveTo(11.017f, 4.097f, 11.106f, 4.146f, 11.187f, 4.208f)
                curveTo(11.261f, 4.266f, 11.358f, 4.365f, 12.04f, 5.452f)
                lineTo(12.605f, 6.352f)
                curveTo(13.375f, 7.58f, 13.427f, 7.73f, 13.444f, 7.833f)
                curveTo(13.463f, 7.943f, 13.463f, 8.057f, 13.444f, 8.167f)
                curveTo(13.427f, 8.27f, 13.375f, 8.42f, 12.605f, 9.648f)
                lineTo(12.04f, 10.548f)
                curveTo(11.358f, 11.635f, 11.261f, 11.734f, 11.187f, 11.792f)
                curveTo(11.106f, 11.854f, 11.017f, 11.903f, 10.922f, 11.938f)
                curveTo(10.834f, 11.971f, 10.698f, 12.0f, 9.415f, 12.0f)
                horizontalLineTo(5.1f)
                curveTo(4.079f, 12.0f, 3.454f, 11.998f, 2.99f, 11.954f)
                curveTo(2.773f, 11.933f, 2.645f, 11.908f, 2.568f, 11.886f)
                curveTo(2.502f, 11.868f, 2.48f, 11.854f, 2.478f, 11.853f)
                curveTo(2.343f, 11.77f, 2.23f, 11.657f, 2.147f, 11.523f)
                curveTo(2.146f, 11.52f, 2.132f, 11.498f, 2.114f, 11.432f)
                curveTo(2.093f, 11.355f, 2.067f, 11.227f, 2.046f, 11.01f)
                curveTo(2.002f, 10.546f, 2.0f, 9.921f, 2.0f, 8.9f)
                verticalLineTo(7.1f)
                curveTo(2.0f, 6.079f, 2.002f, 5.454f, 2.046f, 4.99f)
                curveTo(2.067f, 4.773f, 2.093f, 4.645f, 2.114f, 4.568f)
                curveTo(2.132f, 4.502f, 2.146f, 4.48f, 2.147f, 4.478f)
                curveTo(2.23f, 4.343f, 2.343f, 4.23f, 2.477f, 4.147f)
                curveTo(2.48f, 4.146f, 2.502f, 4.132f, 2.568f, 4.114f)
                curveTo(2.645f, 4.093f, 2.773f, 4.067f, 2.99f, 4.046f)
                curveTo(3.454f, 4.002f, 4.079f, 4.0f, 5.1f, 4.0f)
                close()
            }
        }
        .build()
        return _tagOutlineSm!!
    }

private var _tagOutlineSm: ImageVector? = null
