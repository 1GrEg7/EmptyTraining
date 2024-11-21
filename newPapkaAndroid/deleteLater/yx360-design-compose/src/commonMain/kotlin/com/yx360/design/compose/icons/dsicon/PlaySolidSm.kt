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

public val DsIcon.PlaySolidSm: ImageVector
    get() {
        if (_playSolidSm != null) {
            return _playSolidSm!!
        }
        _playSolidSm = Builder(name = "PlaySolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.59f, 3.284f)
                curveTo(13.659f, 5.238f, 15.194f, 6.214f, 15.384f, 7.589f)
                curveTo(15.422f, 7.862f, 15.422f, 8.138f, 15.384f, 8.411f)
                curveTo(15.194f, 9.786f, 13.659f, 10.762f, 10.59f, 12.715f)
                curveTo(7.099f, 14.937f, 5.353f, 16.048f, 3.955f, 15.529f)
                curveTo(3.68f, 15.427f, 3.422f, 15.285f, 3.188f, 15.108f)
                curveTo(2.0f, 14.208f, 2.0f, 12.138f, 2.0f, 8.0f)
                curveTo(2.0f, 3.861f, 2.0f, 1.792f, 3.188f, 0.892f)
                curveTo(3.422f, 0.715f, 3.68f, 0.573f, 3.955f, 0.471f)
                curveTo(5.353f, -0.048f, 7.099f, 1.063f, 10.59f, 3.284f)
                close()
            }
        }
        .build()
        return _playSolidSm!!
    }

private var _playSolidSm: ImageVector? = null
