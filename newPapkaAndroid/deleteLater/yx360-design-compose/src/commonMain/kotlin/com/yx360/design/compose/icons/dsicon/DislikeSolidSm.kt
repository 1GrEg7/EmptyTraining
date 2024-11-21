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

public val DsIcon.DislikeSolidSm: ImageVector
    get() {
        if (_dislikeSolidSm != null) {
            return _dislikeSolidSm!!
        }
        _dislikeSolidSm = Builder(name = "DislikeSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.283f, 9.684f)
                horizontalLineTo(1.626f)
                curveTo(0.406f, 9.684f, 0.008f, 8.958f, 0.0f, 8.105f)
                curveTo(0.041f, 7.467f, 0.332f, 6.963f, 0.813f, 6.526f)
                curveTo(0.784f, 6.447f, 0.753f, 6.373f, 0.724f, 6.302f)
                curveTo(0.568f, 5.919f, 0.438f, 5.601f, 0.61f, 4.935f)
                curveTo(0.813f, 4.146f, 1.626f, 3.566f, 1.626f, 3.566f)
                curveTo(1.626f, 3.566f, 1.876f, 2.574f, 2.85f, 1.793f)
                curveTo(3.824f, 1.012f, 4.47f, 1.0f, 5.283f, 1.0f)
                lineTo(7.717f, 1.0f)
                curveTo(8.961f, 1.0f, 10.34f, 1.486f, 11.379f, 2.567f)
                curveTo(11.379f, 2.567f, 11.786f, 3.368f, 11.786f, 4.947f)
                curveTo(11.786f, 6.526f, 11.379f, 7.71f, 11.379f, 7.71f)
                curveTo(9.689f, 10.066f, 8.17f, 13.161f, 7.722f, 16.0f)
                horizontalLineTo(6.909f)
                curveTo(4.877f, 16.0f, 4.779f, 13.603f, 4.779f, 12.842f)
                curveTo(4.779f, 12.081f, 5.034f, 10.723f, 5.283f, 9.684f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.162f)
                curveTo(16.0f, 2.89f, 15.251f, 1.0f, 14.335f, 1.0f)
                lineTo(12.251f, 1.0f)
                curveTo(13.084f, 1.832f, 13.5f, 3.497f, 13.5f, 5.162f)
                curveTo(13.5f, 6.827f, 13.084f, 8.492f, 12.251f, 9.325f)
                horizontalLineTo(14.335f)
                curveTo(15.259f, 9.325f, 16.0f, 7.435f, 16.0f, 5.162f)
                close()
            }
        }
        .build()
        return _dislikeSolidSm!!
    }

private var _dislikeSolidSm: ImageVector? = null
