package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.PhotoSolidSm: ImageVector
    get() {
        if (_photoSolidSm != null) {
            return _photoSolidSm!!
        }
        _photoSolidSm = Builder(name = "PhotoSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.318f, 2.373f)
                lineTo(2.254f, 2.889f)
                curveTo(0.875f, 3.558f, 0.0f, 4.956f, 0.0f, 6.488f)
                verticalLineTo(11.0f)
                curveTo(0.0f, 13.209f, 1.791f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 15.0f, 16.0f, 13.209f, 16.0f, 11.0f)
                verticalLineTo(6.488f)
                curveTo(16.0f, 4.956f, 15.125f, 3.558f, 13.746f, 2.889f)
                lineTo(12.682f, 2.373f)
                lineTo(11.946f, 1.301f)
                curveTo(11.387f, 0.487f, 10.462f, 0.0f, 9.474f, 0.0f)
                horizontalLineTo(6.526f)
                curveTo(5.538f, 0.0f, 4.613f, 0.487f, 4.053f, 1.301f)
                lineTo(3.318f, 2.373f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(5.791f, 4.0f, 4.0f, 5.791f, 4.0f, 8.0f)
                curveTo(4.0f, 10.209f, 5.791f, 12.0f, 8.0f, 12.0f)
                curveTo(10.209f, 12.0f, 12.0f, 10.209f, 12.0f, 8.0f)
                curveTo(12.0f, 5.791f, 10.209f, 4.0f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _photoSolidSm!!
    }

private var _photoSolidSm: ImageVector? = null
