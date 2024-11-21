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

public val DsIcon.UserAddSolidMd: ImageVector
    get() {
        if (_userAddSolidMd != null) {
            return _userAddSolidMd!!
        }
        _userAddSolidMd = Builder(name = "UserAddSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 12.5f)
                curveTo(11.5f, 12.5f, 13.5f, 10.517f, 13.5f, 7.543f)
                curveTo(13.5f, 4.239f, 11.1f, 3.0f, 9.5f, 3.0f)
                curveTo(7.9f, 3.0f, 5.5f, 4.239f, 5.5f, 7.543f)
                curveTo(5.5f, 10.517f, 7.5f, 12.5f, 9.5f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 13.988f)
                curveTo(4.503f, 13.988f, 2.0f, 15.597f, 2.0f, 18.5f)
                curveTo(2.0f, 19.877f, 5.356f, 20.988f, 9.5f, 20.988f)
                curveTo(13.644f, 20.988f, 17.0f, 19.877f, 17.0f, 18.5f)
                curveTo(17.0f, 15.597f, 14.497f, 13.988f, 9.5f, 13.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _userAddSolidMd!!
    }

private var _userAddSolidMd: ImageVector? = null
