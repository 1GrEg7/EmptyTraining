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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.PizzaSolidSm: ImageVector
    get() {
        if (_pizzaSolidSm != null) {
            return _pizzaSolidSm!!
        }
        _pizzaSolidSm = Builder(name = "PizzaSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.65f, 0.141f)
                    curveTo(10.576f, 1.448f, 14.479f, 5.282f, 15.908f, 10.182f)
                    curveTo(16.299f, 11.524f, 15.393f, 12.774f, 14.158f, 13.056f)
                    lineTo(13.708f, 13.158f)
                    curveTo(13.188f, 7.37f, 8.542f, 2.779f, 2.752f, 2.386f)
                    lineTo(2.849f, 1.937f)
                    curveTo(3.115f, 0.706f, 4.324f, -0.211f, 5.65f, 0.141f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.364f, 4.178f)
                    curveTo(7.474f, 4.39f, 11.596f, 8.456f, 11.934f, 13.563f)
                    lineTo(9.481f, 14.123f)
                    curveTo(9.351f, 12.942f, 8.356f, 12.023f, 7.148f, 12.023f)
                    curveTo(5.851f, 12.023f, 4.8f, 13.08f, 4.8f, 14.384f)
                    curveTo(4.8f, 14.656f, 4.846f, 14.918f, 4.93f, 15.161f)
                    lineTo(0.97f, 16.065f)
                    lineTo(0.0f, 15.098f)
                    lineTo(0.99f, 10.525f)
                    curveTo(1.296f, 10.672f, 1.639f, 10.754f, 2.0f, 10.754f)
                    curveTo(3.297f, 10.754f, 4.348f, 9.697f, 4.348f, 8.393f)
                    curveTo(4.348f, 7.089f, 3.297f, 6.031f, 2.0f, 6.031f)
                    curveTo(1.993f, 6.031f, 1.985f, 6.031f, 1.978f, 6.031f)
                    curveTo(1.973f, 6.032f, 1.968f, 6.032f, 1.962f, 6.032f)
                    lineTo(2.364f, 4.178f)
                    close()
                }
            }
        }
        .build()
        return _pizzaSolidSm!!
    }

private var _pizzaSolidSm: ImageVector? = null
