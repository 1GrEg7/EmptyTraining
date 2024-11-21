package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.AvatarNotLoaded: ImageVector
    get() {
        if (_avatarNotLoaded != null) {
            return _avatarNotLoaded!!
        }
        _avatarNotLoaded = Builder(name = "AvatarNotLoaded", defaultWidth = 56.0.dp, defaultHeight =
                56.0.dp, viewportWidth = 56.0f, viewportHeight = 56.0f).apply {
            path(fill = SolidColor(Color(0xFF9799A3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.9208f, 50.3108f)
                curveTo(51.653f, 45.1971f, 56.0f, 37.1062f, 56.0f, 28.0f)
                curveTo(56.0f, 12.536f, 43.464f, 0.0f, 28.0f, 0.0f)
                curveTo(12.536f, 0.0f, 0.0f, 12.536f, 0.0f, 28.0f)
                curveTo(0.0f, 35.1231f, 2.65987f, 41.625f, 7.04055f, 46.5666f)
                curveTo(11.8972f, 45.4631f, 19.762f, 43.5195f, 22.0335f, 42.6666f)
                curveTo(22.7515f, 37.6666f, 22.0335f, 32.8395f, 22.0335f, 32.8395f)
                curveTo(22.0335f, 32.8395f, 21.2672f, 34.1013f, 19.479f, 32.4609f)
                curveTo(17.8186f, 30.6943f, 16.2859f, 22.4405f, 19.479f, 24.3333f)
                curveTo(19.479f, 24.3333f, 19.2236f, 19.3333f, 19.479f, 16.3333f)
                curveTo(19.3016f, 15.4799f, 18.8587f, 15.1339f, 18.4181f, 14.795f)
                curveTo(18.7515f, 14.4617f, 19.4181f, 14.3333f, 20.0848f, 14.4165f)
                curveTo(20.0848f, 14.4165f, 21.3565f, 12.6541f, 23.758f, 10.8016f)
                curveTo(24.7971f, 9.99998f, 26.6492f, 9.93079f, 28.0848f, 9.99998f)
                curveTo(34.0848f, 10.2891f, 35.8277f, 8.74084f, 35.8277f, 8.74084f)
                curveTo(35.8277f, 8.74084f, 36.7515f, 12.0f, 34.9336f, 12.6499f)
                curveTo(34.9336f, 12.6499f, 37.1689f, 12.9642f, 39.0848f, 12.3333f)
                curveTo(39.0848f, 12.3333f, 38.4181f, 14.3333f, 36.2109f, 14.4165f)
                curveTo(36.2109f, 14.4165f, 38.7579f, 15.055f, 39.7515f, 14.795f)
                curveTo(39.5773f, 15.8289f, 38.4181f, 16.3333f, 38.4181f, 16.3333f)
                curveTo(38.4181f, 16.3333f, 39.4181f, 16.6667f, 39.7515f, 17.6667f)
                curveTo(38.7515f, 17.6667f, 38.4181f, 18.0f, 38.0848f, 18.3333f)
                verticalLineTo(20.6865f)
                curveTo(38.0848f, 20.6865f, 38.4298f, 20.7568f, 38.7636f, 20.6865f)
                curveTo(38.6758f, 21.442f, 38.5001f, 21.7406f, 37.8845f, 22.3344f)
                curveTo(37.8845f, 22.988f, 37.7908f, 24.2777f, 37.4881f, 24.7636f)
                curveTo(37.4881f, 24.7636f, 38.7653f, 23.628f, 39.1485f, 24.7636f)
                curveTo(39.6386f, 26.2163f, 37.3604f, 33.9752f, 35.8277f, 32.3347f)
                curveTo(35.8277f, 32.3347f, 33.6564f, 41.1677f, 29.0583f, 41.2939f)
                curveTo(25.3395f, 41.2939f, 24.5041f, 39.7222f, 24.359f, 39.0922f)
                curveTo(25.0848f, 44.6666f, 29.7515f, 44.6666f, 34.0848f, 43.6666f)
                curveTo(34.0848f, 43.6666f, 38.2203f, 45.648f, 44.9208f, 50.3108f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9799A3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0231f, 56.0f)
                curveTo(27.9984f, 56.0f, 27.9736f, 56.0f, 27.949f, 56.0f)
                curveTo(27.966f, 56.0f, 27.983f, 56.0f, 28.0f, 56.0f)
                curveTo(28.0077f, 56.0f, 28.0154f, 56.0f, 28.0231f, 56.0f)
                close()
            }
        }
        .build()
        return _avatarNotLoaded!!
    }

private var _avatarNotLoaded: ImageVector? = null
