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

public val DsIcon.ImageSolidMd: ImageVector
    get() {
        if (_imageSolidMd != null) {
            return _imageSolidMd!!
        }
        _imageSolidMd = Builder(name = "ImageSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 9.0f)
                curveTo(3.0f, 7.136f, 3.0f, 6.204f, 3.304f, 5.469f)
                curveTo(3.71f, 4.489f, 4.489f, 3.71f, 5.469f, 3.304f)
                curveTo(6.204f, 3.0f, 7.136f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(16.864f, 3.0f, 17.796f, 3.0f, 18.531f, 3.304f)
                curveTo(19.511f, 3.71f, 20.289f, 4.489f, 20.695f, 5.469f)
                curveTo(21.0f, 6.204f, 21.0f, 7.136f, 21.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.864f, 21.0f, 17.796f, 20.695f, 18.531f)
                curveTo(20.289f, 19.511f, 19.511f, 20.289f, 18.531f, 20.695f)
                curveTo(17.796f, 21.0f, 16.864f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(7.136f, 21.0f, 6.204f, 21.0f, 5.469f, 20.695f)
                curveTo(4.489f, 20.289f, 3.71f, 19.511f, 3.304f, 18.531f)
                curveTo(3.0f, 17.796f, 3.0f, 16.864f, 3.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(9.5f, 12.051f)
                curveTo(10.881f, 12.051f, 12.0f, 10.932f, 12.0f, 9.551f)
                curveTo(12.0f, 8.17f, 10.881f, 7.051f, 9.5f, 7.051f)
                curveTo(8.119f, 7.051f, 7.0f, 8.17f, 7.0f, 9.551f)
                curveTo(7.0f, 10.932f, 8.119f, 12.051f, 9.5f, 12.051f)
                close()
                moveTo(18.999f, 14.774f)
                lineTo(15.499f, 13.502f)
                lineTo(11.499f, 16.502f)
                lineTo(7.499f, 15.502f)
                lineTo(5.078f, 17.482f)
                curveTo(5.103f, 17.636f, 5.131f, 17.718f, 5.151f, 17.768f)
                curveTo(5.354f, 18.258f, 5.743f, 18.647f, 6.234f, 18.85f)
                curveTo(6.317f, 18.885f, 6.49f, 18.938f, 6.946f, 18.969f)
                curveTo(7.42f, 19.001f, 8.04f, 19.002f, 8.999f, 19.002f)
                horizontalLineTo(14.999f)
                curveTo(15.958f, 19.002f, 16.577f, 19.001f, 17.051f, 18.969f)
                curveTo(17.507f, 18.938f, 17.681f, 18.885f, 17.764f, 18.85f)
                curveTo(18.254f, 18.647f, 18.644f, 18.258f, 18.847f, 17.768f)
                curveTo(18.881f, 17.684f, 18.934f, 17.511f, 18.965f, 17.055f)
                curveTo(18.998f, 16.581f, 18.999f, 15.962f, 18.999f, 15.002f)
                verticalLineTo(14.774f)
                close()
            }
        }
        .build()
        return _imageSolidMd!!
    }

private var _imageSolidMd: ImageVector? = null
