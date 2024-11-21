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

public val DsIcon.CameraOffSolidMd: ImageVector
    get() {
        if (_cameraOffSolidMd != null) {
            return _cameraOffSolidMd!!
        }
        _cameraOffSolidMd = Builder(name = "CameraOffSolidMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.413f, 19.741f)
                lineTo(16.0f, 22.008f)
                horizontalLineTo(18.5f)
                lineTo(4.5f, 2.008f)
                horizontalLineTo(2.0f)
                lineTo(3.578f, 4.262f)
                curveTo(3.541f, 4.276f, 3.505f, 4.29f, 3.469f, 4.304f)
                curveTo(2.489f, 4.71f, 1.71f, 5.489f, 1.304f, 6.469f)
                curveTo(1.0f, 7.204f, 1.0f, 8.136f, 1.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.864f, 1.0f, 16.796f, 1.304f, 17.531f)
                curveTo(1.71f, 18.511f, 2.489f, 19.289f, 3.469f, 19.695f)
                curveTo(4.204f, 20.0f, 5.136f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(11.0f)
                curveTo(12.766f, 20.0f, 13.695f, 20.0f, 14.413f, 19.741f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.397f)
                curveTo(16.999f, 15.878f, 16.981f, 16.716f, 16.755f, 17.373f)
                lineTo(7.395f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(12.864f, 4.0f, 13.796f, 4.0f, 14.531f, 4.304f)
                curveTo(15.511f, 4.71f, 16.289f, 5.489f, 16.695f, 6.469f)
                curveTo(16.978f, 7.15f, 16.998f, 8.0f, 17.0f, 9.603f)
                curveTo(17.258f, 9.445f, 17.543f, 9.274f, 17.855f, 9.087f)
                curveTo(19.707f, 7.976f, 20.634f, 7.42f, 21.392f, 7.571f)
                curveTo(21.811f, 7.655f, 22.193f, 7.871f, 22.48f, 8.188f)
                curveTo(23.0f, 8.76f, 23.0f, 9.84f, 23.0f, 12.0f)
                curveTo(23.0f, 14.16f, 23.0f, 15.24f, 22.48f, 15.812f)
                curveTo(22.193f, 16.129f, 21.811f, 16.345f, 21.392f, 16.429f)
                curveTo(20.634f, 16.58f, 19.707f, 16.024f, 17.855f, 14.913f)
                curveTo(17.543f, 14.726f, 17.258f, 14.555f, 17.0f, 14.397f)
                close()
            }
        }
        .build()
        return _cameraOffSolidMd!!
    }

private var _cameraOffSolidMd: ImageVector? = null
