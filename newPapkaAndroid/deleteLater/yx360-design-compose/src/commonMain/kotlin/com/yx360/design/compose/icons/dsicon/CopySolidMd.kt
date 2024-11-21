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

public val DsIcon.CopySolidMd: ImageVector
    get() {
        if (_copySolidMd != null) {
            return _copySolidMd!!
        }
        _copySolidMd = Builder(name = "CopySolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.696f, 13.531f)
                curveTo(22.001f, 12.796f, 22.001f, 11.864f, 22.001f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(22.001f, 6.136f, 22.001f, 5.204f, 21.696f, 4.469f)
                curveTo(21.29f, 3.489f, 20.511f, 2.71f, 19.531f, 2.304f)
                curveTo(18.796f, 2.0f, 17.864f, 2.0f, 16.001f, 2.0f)
                horizontalLineTo(14.001f)
                curveTo(12.137f, 2.0f, 11.205f, 2.0f, 10.47f, 2.304f)
                curveTo(9.49f, 2.71f, 8.711f, 3.489f, 8.305f, 4.469f)
                curveTo(8.001f, 5.204f, 8.001f, 6.136f, 8.001f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(8.001f, 11.864f, 8.001f, 12.796f, 8.305f, 13.531f)
                curveTo(8.711f, 14.511f, 9.49f, 15.29f, 10.47f, 15.696f)
                curveTo(11.205f, 16.0f, 12.137f, 16.0f, 14.001f, 16.0f)
                horizontalLineTo(16.001f)
                curveTo(17.864f, 16.0f, 18.796f, 16.0f, 19.531f, 15.696f)
                curveTo(20.511f, 15.29f, 21.29f, 14.511f, 21.696f, 13.531f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                curveTo(15.288f, 18.0f, 15.643f, 17.999f, 15.973f, 17.997f)
                curveTo(15.94f, 18.653f, 15.865f, 19.122f, 15.696f, 19.531f)
                curveTo(15.29f, 20.511f, 14.511f, 21.289f, 13.531f, 21.695f)
                curveTo(12.796f, 22.0f, 11.864f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 22.0f, 5.204f, 22.0f, 4.469f, 21.695f)
                curveTo(3.489f, 21.289f, 2.71f, 20.511f, 2.304f, 19.531f)
                curveTo(2.0f, 18.796f, 2.0f, 17.864f, 2.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 12.136f, 2.0f, 11.204f, 2.304f, 10.469f)
                curveTo(2.71f, 9.489f, 3.489f, 8.71f, 4.469f, 8.304f)
                curveTo(4.878f, 8.135f, 5.347f, 8.06f, 6.003f, 8.027f)
                curveTo(6.001f, 8.357f, 6.0f, 8.712f, 6.0f, 9.0f)
                curveTo(6.0f, 11.796f, 6.0f, 13.193f, 6.457f, 14.296f)
                curveTo(7.066f, 15.766f, 8.234f, 16.934f, 9.704f, 17.543f)
                curveTo(10.807f, 18.0f, 12.204f, 18.0f, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _copySolidMd!!
    }

private var _copySolidMd: ImageVector? = null
