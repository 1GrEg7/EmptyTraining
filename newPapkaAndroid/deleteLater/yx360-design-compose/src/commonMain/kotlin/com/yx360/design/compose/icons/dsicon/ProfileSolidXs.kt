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

public val DsIcon.ProfileSolidXs: ImageVector
    get() {
        if (_profileSolidXs != null) {
            return _profileSolidXs!!
        }
        _profileSolidXs = Builder(name = "ProfileSolidXs", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.071f)
                curveTo(3.167f, 7.071f, 1.75f, 8.143f, 1.75f, 9.5f)
                curveTo(1.75f, 10.33f, 3.521f, 11.0f, 6.0f, 11.0f)
                curveTo(8.479f, 11.0f, 10.25f, 10.33f, 10.25f, 9.5f)
                curveTo(10.25f, 8.143f, 8.833f, 7.071f, 6.0f, 7.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.5f)
                curveTo(7.116f, 6.5f, 8.231f, 5.15f, 8.231f, 3.5f)
                curveTo(8.231f, 1.5f, 6.837f, 1.0f, 6.0f, 1.0f)
                curveTo(5.163f, 1.0f, 3.769f, 1.5f, 3.769f, 3.5f)
                curveTo(3.769f, 5.15f, 4.884f, 6.5f, 6.0f, 6.5f)
                close()
            }
        }
        .build()
        return _profileSolidXs!!
    }

private var _profileSolidXs: ImageVector? = null
