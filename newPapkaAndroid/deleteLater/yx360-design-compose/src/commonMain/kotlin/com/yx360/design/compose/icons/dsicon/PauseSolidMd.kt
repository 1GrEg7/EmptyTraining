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

public val DsIcon.PauseSolidMd: ImageVector
    get() {
        if (_pauseSolidMd != null) {
            return _pauseSolidMd!!
        }
        _pauseSolidMd = Builder(name = "PauseSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.848f, 3.235f)
                curveTo(10.0f, 3.602f, 10.0f, 4.068f, 10.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 19.932f, 10.0f, 20.398f, 9.848f, 20.765f)
                curveTo(9.645f, 21.255f, 9.255f, 21.645f, 8.765f, 21.848f)
                curveTo(8.398f, 22.0f, 7.932f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.068f, 22.0f, 4.602f, 22.0f, 4.235f, 21.848f)
                curveTo(3.745f, 21.645f, 3.355f, 21.255f, 3.152f, 20.765f)
                curveTo(3.0f, 20.398f, 3.0f, 19.932f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.068f, 3.0f, 3.602f, 3.152f, 3.235f)
                curveTo(3.355f, 2.745f, 3.745f, 2.355f, 4.235f, 2.152f)
                curveTo(4.602f, 2.0f, 5.068f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(7.932f, 2.0f, 8.398f, 2.0f, 8.765f, 2.152f)
                curveTo(9.255f, 2.355f, 9.645f, 2.745f, 9.848f, 3.235f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.848f, 3.235f)
                curveTo(21.0f, 3.602f, 21.0f, 4.068f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.932f, 21.0f, 20.398f, 20.848f, 20.765f)
                curveTo(20.645f, 21.255f, 20.255f, 21.645f, 19.765f, 21.848f)
                curveTo(19.398f, 22.0f, 18.932f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(16.068f, 22.0f, 15.602f, 22.0f, 15.235f, 21.848f)
                curveTo(14.745f, 21.645f, 14.355f, 21.255f, 14.152f, 20.765f)
                curveTo(14.0f, 20.398f, 14.0f, 19.932f, 14.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 4.068f, 14.0f, 3.602f, 14.152f, 3.235f)
                curveTo(14.355f, 2.745f, 14.745f, 2.355f, 15.235f, 2.152f)
                curveTo(15.602f, 2.0f, 16.068f, 2.0f, 17.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.932f, 2.0f, 19.398f, 2.0f, 19.765f, 2.152f)
                curveTo(20.255f, 2.355f, 20.645f, 2.745f, 20.848f, 3.235f)
                close()
            }
        }
        .build()
        return _pauseSolidMd!!
    }

private var _pauseSolidMd: ImageVector? = null
