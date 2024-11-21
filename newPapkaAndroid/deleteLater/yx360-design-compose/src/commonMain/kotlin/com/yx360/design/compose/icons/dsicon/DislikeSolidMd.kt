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

public val DsIcon.DislikeSolidMd: ImageVector
    get() {
        if (_dislikeSolidMd != null) {
            return _dislikeSolidMd!!
        }
        _dislikeSolidMd = Builder(name = "DislikeSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.004f, 14.011f)
                horizontalLineTo(3.504f)
                curveTo(2.003f, 14.011f, 1.514f, 13.091f, 1.504f, 12.011f)
                curveTo(1.554f, 11.202f, 1.912f, 10.564f, 2.504f, 10.011f)
                curveTo(2.468f, 9.911f, 2.431f, 9.817f, 2.395f, 9.726f)
                curveTo(2.203f, 9.242f, 2.043f, 8.838f, 2.254f, 7.996f)
                curveTo(2.504f, 6.995f, 3.504f, 6.261f, 3.504f, 6.261f)
                curveTo(3.504f, 6.261f, 3.812f, 5.005f, 5.01f, 4.016f)
                curveTo(6.209f, 3.026f, 7.004f, 3.011f, 8.004f, 3.011f)
                horizontalLineTo(10.998f)
                curveTo(12.529f, 3.011f, 14.226f, 3.626f, 15.504f, 4.996f)
                curveTo(15.504f, 4.996f, 16.004f, 6.011f, 16.004f, 8.011f)
                curveTo(16.004f, 10.011f, 15.504f, 11.511f, 15.504f, 11.511f)
                curveTo(13.424f, 14.495f, 11.556f, 18.416f, 11.004f, 22.011f)
                horizontalLineTo(10.004f)
                curveTo(7.504f, 22.011f, 7.384f, 18.975f, 7.384f, 18.011f)
                curveTo(7.384f, 17.047f, 7.697f, 15.327f, 8.004f, 14.011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.004f, 8.0f)
                curveTo(21.004f, 5.27f, 20.104f, 3.0f, 19.004f, 3.0f)
                horizontalLineTo(16.004f)
                curveTo(17.004f, 4.0f, 17.504f, 6.0f, 17.504f, 8.0f)
                curveTo(17.504f, 10.0f, 17.004f, 12.0f, 16.004f, 13.0f)
                horizontalLineTo(19.004f)
                curveTo(20.114f, 13.0f, 21.004f, 10.73f, 21.004f, 8.0f)
                close()
            }
        }
        .build()
        return _dislikeSolidMd!!
    }

private var _dislikeSolidMd: ImageVector? = null
