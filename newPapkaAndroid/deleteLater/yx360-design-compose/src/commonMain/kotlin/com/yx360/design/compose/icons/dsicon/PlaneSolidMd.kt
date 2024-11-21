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

public val DsIcon.PlaneSolidMd: ImageVector
    get() {
        if (_planeSolidMd != null) {
            return _planeSolidMd!!
        }
        _planeSolidMd = Builder(name = "PlaneSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.879f, 2.121f)
                curveTo(21.694f, 1.936f, 21.141f, 1.966f, 20.422f, 2.19f)
                curveTo(18.964f, 2.669f, 17.634f, 3.429f, 16.537f, 4.506f)
                lineTo(10.71f, 10.346f)
                curveTo(9.251f, 11.78f, 8.335f, 13.055f, 7.626f, 14.49f)
                lineTo(3.42f, 13.887f)
                curveTo(2.813f, 13.8f, 2.202f, 14.005f, 1.77f, 14.439f)
                lineTo(1.0f, 15.213f)
                lineTo(5.856f, 18.133f)
                lineTo(8.769f, 23.0f)
                lineTo(9.541f, 22.224f)
                curveTo(9.972f, 21.791f, 10.175f, 21.18f, 10.088f, 20.574f)
                lineTo(9.487f, 16.354f)
                curveTo(10.778f, 15.685f, 11.948f, 14.855f, 13.255f, 13.621f)
                lineTo(17.509f, 23.0f)
                lineTo(18.3f, 22.205f)
                curveTo(18.72f, 21.783f, 18.924f, 21.191f, 18.853f, 20.598f)
                lineTo(17.509f, 9.373f)
                lineTo(17.507f, 9.374f)
                lineTo(19.45f, 7.426f)
                curveTo(20.524f, 6.326f, 21.332f, 5.043f, 21.811f, 3.581f)
                curveTo(22.034f, 2.861f, 22.063f, 2.306f, 21.879f, 2.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.783f, 5.666f)
                curveTo(2.208f, 5.239f, 2.806f, 5.034f, 3.403f, 5.11f)
                lineTo(12.838f, 6.316f)
                curveTo(11.506f, 7.496f, 10.272f, 8.782f, 9.148f, 10.161f)
                lineTo(1.0f, 6.453f)
                lineTo(1.783f, 5.666f)
                close()
            }
        }
        .build()
        return _planeSolidMd!!
    }

private var _planeSolidMd: ImageVector? = null
