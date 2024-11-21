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

public val DsIcon.PauseSolidSm: ImageVector
    get() {
        if (_pauseSolidSm != null) {
            return _pauseSolidSm!!
        }
        _pauseSolidSm = Builder(name = "PauseSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.152f, 2.235f)
                curveTo(1.0f, 2.602f, 1.0f, 3.068f, 1.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 12.932f, 1.0f, 13.398f, 1.152f, 13.765f)
                curveTo(1.355f, 14.255f, 1.745f, 14.645f, 2.235f, 14.848f)
                curveTo(2.602f, 15.0f, 3.068f, 15.0f, 4.0f, 15.0f)
                curveTo(4.932f, 15.0f, 5.398f, 15.0f, 5.765f, 14.848f)
                curveTo(6.255f, 14.645f, 6.645f, 14.255f, 6.848f, 13.765f)
                curveTo(7.0f, 13.398f, 7.0f, 12.932f, 7.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(7.0f, 3.068f, 7.0f, 2.602f, 6.848f, 2.235f)
                curveTo(6.645f, 1.745f, 6.255f, 1.355f, 5.765f, 1.152f)
                curveTo(5.398f, 1.0f, 4.932f, 1.0f, 4.0f, 1.0f)
                curveTo(3.068f, 1.0f, 2.602f, 1.0f, 2.235f, 1.152f)
                curveTo(1.745f, 1.355f, 1.355f, 1.745f, 1.152f, 2.235f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.152f, 2.235f)
                curveTo(9.0f, 2.602f, 9.0f, 3.068f, 9.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(9.0f, 12.932f, 9.0f, 13.398f, 9.152f, 13.765f)
                curveTo(9.355f, 14.255f, 9.745f, 14.645f, 10.235f, 14.848f)
                curveTo(10.602f, 15.0f, 11.068f, 15.0f, 12.0f, 15.0f)
                curveTo(12.932f, 15.0f, 13.398f, 15.0f, 13.765f, 14.848f)
                curveTo(14.255f, 14.645f, 14.645f, 14.255f, 14.848f, 13.765f)
                curveTo(15.0f, 13.398f, 15.0f, 12.932f, 15.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 3.068f, 15.0f, 2.602f, 14.848f, 2.235f)
                curveTo(14.645f, 1.745f, 14.255f, 1.355f, 13.765f, 1.152f)
                curveTo(13.398f, 1.0f, 12.932f, 1.0f, 12.0f, 1.0f)
                curveTo(11.068f, 1.0f, 10.602f, 1.0f, 10.235f, 1.152f)
                curveTo(9.745f, 1.355f, 9.355f, 1.745f, 9.152f, 2.235f)
                close()
            }
        }
        .build()
        return _pauseSolidSm!!
    }

private var _pauseSolidSm: ImageVector? = null
