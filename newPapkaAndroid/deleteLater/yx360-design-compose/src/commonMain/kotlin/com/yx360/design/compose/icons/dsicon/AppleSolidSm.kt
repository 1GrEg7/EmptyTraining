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

public val DsIcon.AppleSolidSm: ImageVector
    get() {
        if (_appleSolidSm != null) {
            return _appleSolidSm!!
        }
        _appleSolidSm = Builder(name = "AppleSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.766f, 2.701f)
                curveTo(11.334f, 1.971f, 11.62f, 1.183f, 11.62f, 0.338f)
                curveTo(11.62f, 0.226f, 11.615f, 0.113f, 11.603f, 0.0f)
                curveTo(11.207f, 0.022f, 10.785f, 0.152f, 10.34f, 0.387f)
                curveTo(9.894f, 0.625f, 9.525f, 0.923f, 9.236f, 1.283f)
                curveTo(8.656f, 1.993f, 8.33f, 2.861f, 8.33f, 3.672f)
                curveTo(8.33f, 3.779f, 8.336f, 3.886f, 8.348f, 3.992f)
                curveTo(9.248f, 4.071f, 10.079f, 3.569f, 10.766f, 2.701f)
                close()
                moveTo(13.739f, 14.05f)
                curveTo(14.084f, 13.576f, 14.38f, 13.066f, 14.62f, 12.53f)
                curveTo(14.722f, 12.297f, 14.818f, 12.053f, 14.91f, 11.8f)
                curveTo(14.492f, 11.633f, 14.107f, 11.391f, 13.774f, 11.087f)
                curveTo(13.027f, 10.424f, 12.648f, 9.589f, 12.636f, 8.585f)
                curveTo(12.625f, 7.297f, 13.235f, 6.293f, 14.47f, 5.577f)
                curveTo(13.78f, 4.637f, 12.743f, 4.115f, 11.363f, 4.009f)
                curveTo(10.853f, 3.967f, 10.232f, 4.073f, 9.495f, 4.327f)
                curveTo(8.716f, 4.601f, 8.256f, 4.738f, 8.121f, 4.738f)
                curveTo(7.94f, 4.738f, 7.526f, 4.621f, 6.882f, 4.389f)
                curveTo(6.235f, 4.158f, 5.716f, 4.04f, 5.319f, 4.04f)
                curveTo(4.611f, 4.046f, 3.916f, 4.235f, 3.299f, 4.587f)
                curveTo(2.686f, 4.931f, 2.172f, 5.43f, 1.805f, 6.035f)
                curveTo(1.329f, 6.797f, 1.092f, 7.706f, 1.092f, 8.759f)
                curveTo(1.092f, 9.679f, 1.268f, 10.629f, 1.62f, 11.611f)
                curveTo(1.948f, 12.519f, 2.366f, 13.316f, 2.876f, 14.003f)
                curveTo(3.351f, 14.647f, 3.747f, 15.101f, 4.064f, 15.365f)
                curveTo(4.561f, 15.809f, 5.058f, 16.018f, 5.558f, 15.998f)
                curveTo(5.886f, 15.988f, 6.315f, 15.88f, 6.847f, 15.673f)
                curveTo(7.38f, 15.468f, 7.877f, 15.366f, 8.341f, 15.366f)
                curveTo(8.783f, 15.366f, 9.267f, 15.468f, 9.793f, 15.673f)
                curveTo(10.318f, 15.88f, 10.768f, 15.982f, 11.141f, 15.982f)
                curveTo(11.663f, 15.97f, 12.148f, 15.766f, 12.602f, 15.366f)
                curveTo(12.895f, 15.122f, 13.275f, 14.683f, 13.739f, 14.05f)
                close()
            }
        }
        .build()
        return _appleSolidSm!!
    }

private var _appleSolidSm: ImageVector? = null
