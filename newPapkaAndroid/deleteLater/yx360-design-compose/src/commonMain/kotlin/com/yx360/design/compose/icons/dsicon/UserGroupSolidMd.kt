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

public val DsIcon.UserGroupSolidMd: ImageVector
    get() {
        if (_userGroupSolidMd != null) {
            return _userGroupSolidMd!!
        }
        _userGroupSolidMd = Builder(name = "UserGroupSolidMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 7.543f)
                curveTo(12.5f, 10.517f, 10.5f, 12.5f, 8.5f, 12.5f)
                curveTo(6.5f, 12.5f, 4.5f, 10.517f, 4.5f, 7.543f)
                curveTo(4.5f, 4.239f, 6.9f, 3.0f, 8.5f, 3.0f)
                curveTo(10.1f, 3.0f, 12.5f, 4.239f, 12.5f, 7.543f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 18.5f)
                curveTo(1.0f, 15.597f, 3.503f, 13.988f, 8.5f, 13.988f)
                curveTo(13.497f, 13.988f, 16.0f, 15.597f, 16.0f, 18.5f)
                curveTo(16.0f, 19.877f, 12.644f, 20.988f, 8.5f, 20.988f)
                curveTo(4.356f, 20.988f, 1.0f, 19.877f, 1.0f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 8.871f)
                curveTo(20.5f, 11.077f, 19.0f, 12.5f, 17.5f, 12.5f)
                curveTo(16.0f, 12.5f, 14.5f, 11.077f, 14.5f, 8.871f)
                curveTo(14.5f, 6.419f, 16.3f, 5.5f, 17.5f, 5.5f)
                curveTo(18.7f, 5.5f, 20.5f, 6.419f, 20.5f, 8.871f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 20.0f)
                curveTo(17.327f, 20.0f, 17.156f, 19.997f, 16.987f, 19.991f)
                curveTo(17.281f, 19.596f, 17.5f, 19.1f, 17.5f, 18.5f)
                curveTo(17.5f, 16.718f, 16.768f, 15.229f, 15.375f, 14.192f)
                curveTo(15.997f, 14.065f, 16.705f, 14.0f, 17.5f, 14.0f)
                curveTo(21.164f, 14.0f, 23.0f, 15.379f, 23.0f, 17.867f)
                curveTo(23.0f, 19.047f, 20.539f, 20.0f, 17.5f, 20.0f)
                close()
            }
        }
        .build()
        return _userGroupSolidMd!!
    }

private var _userGroupSolidMd: ImageVector? = null
