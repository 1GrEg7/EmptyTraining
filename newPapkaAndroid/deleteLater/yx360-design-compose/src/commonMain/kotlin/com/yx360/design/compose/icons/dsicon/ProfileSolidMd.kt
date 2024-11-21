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

public val DsIcon.ProfileSolidMd: ImageVector
    get() {
        if (_profileSolidMd != null) {
            return _profileSolidMd!!
        }
        _profileSolidMd = Builder(name = "ProfileSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(6.004f, 14.0f, 3.0f, 15.5f, 3.0f, 19.0f)
                curveTo(3.0f, 20.66f, 7.028f, 22.0f, 12.0f, 22.0f)
                curveTo(16.972f, 22.0f, 21.0f, 20.66f, 21.0f, 19.0f)
                curveTo(21.0f, 15.5f, 17.996f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(14.25f, 13.0f, 16.5f, 10.3f, 16.5f, 7.0f)
                curveTo(16.5f, 3.0f, 13.688f, 2.0f, 12.0f, 2.0f)
                curveTo(10.313f, 2.0f, 7.5f, 3.0f, 7.5f, 7.0f)
                curveTo(7.5f, 10.3f, 9.75f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _profileSolidMd!!
    }

private var _profileSolidMd: ImageVector? = null
