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

public val DsIcon.ProfileSolidSm: ImageVector
    get() {
        if (_profileSolidSm != null) {
            return _profileSolidSm!!
        }
        _profileSolidSm = Builder(name = "ProfileSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                curveTo(4.0f, 9.5f, 2.0f, 11.0f, 2.0f, 12.901f)
                curveTo(2.0f, 14.063f, 4.5f, 15.001f, 8.0f, 15.001f)
                curveTo(11.5f, 15.001f, 14.0f, 14.063f, 14.0f, 12.901f)
                curveTo(14.0f, 11.0f, 12.0f, 9.5f, 8.0f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.7f)
                curveTo(9.575f, 8.7f, 11.15f, 6.81f, 11.15f, 4.5f)
                curveTo(11.15f, 1.7f, 9.181f, 1.0f, 8.0f, 1.0f)
                curveTo(6.819f, 1.0f, 4.85f, 1.7f, 4.85f, 4.5f)
                curveTo(4.85f, 6.81f, 6.425f, 8.7f, 8.0f, 8.7f)
                close()
            }
        }
        .build()
        return _profileSolidSm!!
    }

private var _profileSolidSm: ImageVector? = null
