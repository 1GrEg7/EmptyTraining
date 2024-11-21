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

public val DsIcon.HomeSolidLg: ImageVector
    get() {
        if (_homeSolidLg != null) {
            return _homeSolidLg!!
        }
        _homeSolidLg = Builder(name = "HomeSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.056f, 5.486f)
                lineTo(6.885f, 10.969f)
                curveTo(6.193f, 11.498f, 5.848f, 11.762f, 5.598f, 12.095f)
                curveTo(5.378f, 12.39f, 5.213f, 12.723f, 5.113f, 13.077f)
                curveTo(5.0f, 13.477f, 5.0f, 13.912f, 5.0f, 14.783f)
                verticalLineTo(23.2f)
                curveTo(5.0f, 24.88f, 5.0f, 25.72f, 5.327f, 26.362f)
                curveTo(5.615f, 26.926f, 6.074f, 27.385f, 6.638f, 27.673f)
                curveTo(7.28f, 28.0f, 8.12f, 28.0f, 9.8f, 28.0f)
                horizontalLineTo(22.2f)
                curveTo(23.88f, 28.0f, 24.72f, 28.0f, 25.362f, 27.673f)
                curveTo(25.927f, 27.385f, 26.385f, 26.926f, 26.673f, 26.362f)
                curveTo(27.0f, 25.72f, 27.0f, 24.88f, 27.0f, 23.2f)
                verticalLineTo(14.783f)
                curveTo(27.0f, 13.912f, 27.0f, 13.477f, 26.887f, 13.077f)
                curveTo(26.787f, 12.723f, 26.622f, 12.39f, 26.402f, 12.095f)
                curveTo(26.152f, 11.762f, 25.807f, 11.498f, 25.115f, 10.969f)
                lineTo(17.944f, 5.486f)
                curveTo(17.248f, 4.954f, 16.9f, 4.688f, 16.516f, 4.585f)
                curveTo(16.178f, 4.495f, 15.822f, 4.495f, 15.484f, 4.585f)
                curveTo(15.1f, 4.688f, 14.752f, 4.954f, 14.056f, 5.486f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _homeSolidLg!!
    }

private var _homeSolidLg: ImageVector? = null
