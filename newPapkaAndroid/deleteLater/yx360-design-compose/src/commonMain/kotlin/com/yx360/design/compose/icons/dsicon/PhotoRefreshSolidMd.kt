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

public val DsIcon.PhotoRefreshSolidMd: ImageVector
    get() {
        if (_photoRefreshSolidMd != null) {
            return _photoRefreshSolidMd!!
        }
        _photoRefreshSolidMd = Builder(name = "PhotoRefreshSolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.63f, 6.16f)
                curveTo(4.138f, 5.787f, 4.793f, 5.569f, 6.103f, 5.132f)
                lineTo(6.5f, 5.0f)
                lineTo(6.756f, 4.488f)
                curveTo(7.157f, 3.686f, 7.358f, 3.285f, 7.64f, 2.976f)
                curveTo(8.015f, 2.565f, 8.498f, 2.266f, 9.034f, 2.114f)
                curveTo(9.436f, 2.0f, 9.885f, 2.0f, 10.781f, 2.0f)
                horizontalLineTo(13.219f)
                curveTo(14.115f, 2.0f, 14.564f, 2.0f, 14.966f, 2.114f)
                curveTo(15.502f, 2.266f, 15.985f, 2.565f, 16.36f, 2.976f)
                curveTo(16.755f, 3.408f, 17.013f, 3.964f, 17.265f, 4.506f)
                lineTo(17.265f, 4.506f)
                curveTo(17.343f, 4.673f, 17.42f, 4.839f, 17.5f, 5.0f)
                curveTo(17.707f, 5.069f, 17.92f, 5.134f, 18.134f, 5.2f)
                lineTo(18.135f, 5.2f)
                curveTo(18.916f, 5.438f, 19.722f, 5.684f, 20.369f, 6.16f)
                curveTo(21.046f, 6.658f, 21.549f, 7.355f, 21.806f, 8.154f)
                curveTo(22.0f, 8.753f, 22.0f, 9.619f, 22.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 16.864f, 22.0f, 17.796f, 21.695f, 18.531f)
                curveTo(21.289f, 19.511f, 20.511f, 20.289f, 19.531f, 20.695f)
                curveTo(18.796f, 21.0f, 17.864f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 21.0f, 5.204f, 21.0f, 4.469f, 20.695f)
                curveTo(3.489f, 20.289f, 2.71f, 19.511f, 2.304f, 18.531f)
                curveTo(2.0f, 17.796f, 2.0f, 16.864f, 2.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 9.619f, 2.0f, 8.753f, 2.193f, 8.154f)
                curveTo(2.451f, 7.355f, 2.954f, 6.658f, 3.63f, 6.16f)
                close()
                moveTo(11.993f, 8.932f)
                curveTo(10.142f, 8.932f, 8.641f, 10.433f, 8.641f, 12.284f)
                horizontalLineTo(6.641f)
                curveTo(6.641f, 9.328f, 9.037f, 6.932f, 11.993f, 6.932f)
                curveTo(13.178f, 6.932f, 14.276f, 7.319f, 15.164f, 7.973f)
                lineTo(15.988f, 7.058f)
                lineTo(16.914f, 10.58f)
                lineTo(13.293f, 10.05f)
                lineTo(13.815f, 9.471f)
                curveTo(13.291f, 9.13f, 12.666f, 8.932f, 11.993f, 8.932f)
                close()
                moveTo(11.993f, 15.635f)
                curveTo(13.833f, 15.635f, 15.356f, 14.098f, 15.356f, 12.236f)
                horizontalLineTo(17.356f)
                curveTo(17.356f, 15.181f, 14.959f, 17.635f, 11.993f, 17.635f)
                curveTo(10.844f, 17.635f, 9.778f, 17.272f, 8.905f, 16.656f)
                lineTo(8.5f, 17.287f)
                curveTo(8.414f, 17.421f, 8.213f, 17.406f, 8.149f, 17.26f)
                lineTo(6.929f, 14.491f)
                curveTo(6.87f, 14.359f, 6.967f, 14.211f, 7.111f, 14.211f)
                lineTo(10.108f, 14.211f)
                curveTo(10.266f, 14.211f, 10.361f, 14.385f, 10.276f, 14.519f)
                lineTo(9.987f, 14.969f)
                curveTo(10.546f, 15.388f, 11.24f, 15.635f, 11.993f, 15.635f)
                close()
            }
        }
        .build()
        return _photoRefreshSolidMd!!
    }

private var _photoRefreshSolidMd: ImageVector? = null
