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

public val DsIcon.ImageOffSolidMd: ImageVector
    get() {
        if (_imageOffSolidMd != null) {
            return _imageOffSolidMd!!
        }
        _imageOffSolidMd = Builder(name = "ImageOffSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(3.0f)
                lineTo(4.383f, 3.975f)
                curveTo(3.916f, 4.379f, 3.545f, 4.889f, 3.304f, 5.469f)
                curveTo(3.0f, 6.204f, 3.0f, 7.136f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.864f, 3.0f, 17.796f, 3.304f, 18.531f)
                curveTo(3.71f, 19.511f, 4.489f, 20.289f, 5.469f, 20.695f)
                curveTo(6.204f, 21.0f, 7.136f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(15.493f, 21.0f, 15.92f, 21.0f, 16.296f, 20.994f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(19.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(8.201f, 3.001f)
                lineTo(15.57f, 13.528f)
                lineTo(18.999f, 14.774f)
                verticalLineTo(15.002f)
                curveTo(18.999f, 15.962f, 18.998f, 16.581f, 18.965f, 17.055f)
                curveTo(18.934f, 17.511f, 18.881f, 17.684f, 18.847f, 17.768f)
                curveTo(18.81f, 17.857f, 18.766f, 17.943f, 18.718f, 18.025f)
                lineTo(19.916f, 19.738f)
                curveTo(20.244f, 19.389f, 20.509f, 18.981f, 20.695f, 18.531f)
                curveTo(21.0f, 17.796f, 21.0f, 16.864f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 7.136f, 21.0f, 6.204f, 20.695f, 5.469f)
                curveTo(20.289f, 4.489f, 19.511f, 3.71f, 18.531f, 3.304f)
                curveTo(17.796f, 3.0f, 16.864f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(8.712f, 3.0f, 8.447f, 3.0f, 8.201f, 3.001f)
                close()
                moveTo(7.0f, 9.551f)
                curveTo(7.0f, 9.071f, 7.135f, 8.623f, 7.369f, 8.242f)
                lineTo(10.0f, 12.001f)
                curveTo(9.839f, 12.033f, 9.671f, 12.051f, 9.5f, 12.051f)
                curveTo(8.119f, 12.051f, 7.0f, 10.932f, 7.0f, 9.551f)
                close()
                moveTo(11.499f, 16.502f)
                lineTo(12.583f, 15.689f)
                lineTo(14.902f, 19.002f)
                horizontalLineTo(8.999f)
                curveTo(8.04f, 19.002f, 7.42f, 19.001f, 6.946f, 18.969f)
                curveTo(6.49f, 18.938f, 6.317f, 18.885f, 6.234f, 18.85f)
                curveTo(5.743f, 18.647f, 5.354f, 18.258f, 5.151f, 17.768f)
                curveTo(5.131f, 17.718f, 5.103f, 17.636f, 5.078f, 17.482f)
                lineTo(7.499f, 15.502f)
                lineTo(11.499f, 16.502f)
                close()
            }
        }
        .build()
        return _imageOffSolidMd!!
    }

private var _imageOffSolidMd: ImageVector? = null
