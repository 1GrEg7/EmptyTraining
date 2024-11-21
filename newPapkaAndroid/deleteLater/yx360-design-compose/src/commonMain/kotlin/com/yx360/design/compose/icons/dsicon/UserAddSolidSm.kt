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

public val DsIcon.UserAddSolidSm: ImageVector
    get() {
        if (_userAddSolidSm != null) {
            return _userAddSolidSm!!
        }
        _userAddSolidSm = Builder(name = "UserAddSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.667f, 5.031f)
                curveTo(7.667f, 7.015f, 6.333f, 8.337f, 5.0f, 8.337f)
                curveTo(3.667f, 8.337f, 2.333f, 7.015f, 2.333f, 5.031f)
                curveTo(2.333f, 2.827f, 3.933f, 2.0f, 5.0f, 2.0f)
                curveTo(6.067f, 2.0f, 7.667f, 2.827f, 7.667f, 5.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.84f)
                curveTo(0.0f, 10.903f, 1.669f, 9.83f, 5.0f, 9.83f)
                curveTo(8.331f, 9.83f, 10.0f, 10.903f, 10.0f, 12.84f)
                curveTo(10.0f, 13.759f, 7.762f, 14.5f, 5.0f, 14.5f)
                curveTo(2.237f, 14.5f, 0.0f, 13.759f, 0.0f, 12.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _userAddSolidSm!!
    }

private var _userAddSolidSm: ImageVector? = null
