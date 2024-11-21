package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.PhotoOutlineSm: ImageVector
    get() {
        if (_photoOutlineSm != null) {
            return _photoOutlineSm!!
        }
        _photoOutlineSm = Builder(name = "PhotoOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 5.791f, 5.791f, 4.0f, 8.0f, 4.0f)
                curveTo(10.209f, 4.0f, 12.0f, 5.791f, 12.0f, 8.0f)
                curveTo(12.0f, 10.209f, 10.209f, 12.0f, 8.0f, 12.0f)
                curveTo(5.791f, 12.0f, 4.0f, 10.209f, 4.0f, 8.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(6.895f, 10.0f, 6.0f, 9.105f, 6.0f, 8.0f)
                curveTo(6.0f, 6.895f, 6.895f, 6.0f, 8.0f, 6.0f)
                curveTo(9.105f, 6.0f, 10.0f, 6.895f, 10.0f, 8.0f)
                curveTo(10.0f, 9.105f, 9.105f, 10.0f, 8.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.254f, 2.889f)
                lineTo(3.318f, 2.373f)
                lineTo(4.053f, 1.301f)
                curveTo(4.613f, 0.487f, 5.538f, 0.0f, 6.526f, 0.0f)
                horizontalLineTo(9.474f)
                curveTo(10.462f, 0.0f, 11.387f, 0.487f, 11.946f, 1.301f)
                lineTo(12.682f, 2.373f)
                lineTo(13.746f, 2.889f)
                curveTo(15.125f, 3.558f, 16.0f, 4.956f, 16.0f, 6.488f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 13.209f, 14.209f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 15.0f, 0.0f, 13.209f, 0.0f, 11.0f)
                verticalLineTo(6.488f)
                curveTo(0.0f, 4.956f, 0.875f, 3.558f, 2.254f, 2.889f)
                close()
                moveTo(10.298f, 2.434f)
                lineTo(11.333f, 3.941f)
                lineTo(12.873f, 4.688f)
                curveTo(13.562f, 5.023f, 14.0f, 5.722f, 14.0f, 6.488f)
                verticalLineTo(11.0f)
                curveTo(14.0f, 12.105f, 13.105f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 13.0f, 2.0f, 12.105f, 2.0f, 11.0f)
                verticalLineTo(6.488f)
                curveTo(2.0f, 5.722f, 2.438f, 5.023f, 3.127f, 4.688f)
                lineTo(4.667f, 3.941f)
                lineTo(5.702f, 2.434f)
                curveTo(5.889f, 2.162f, 6.197f, 2.0f, 6.526f, 2.0f)
                horizontalLineTo(9.474f)
                curveTo(9.803f, 2.0f, 10.111f, 2.162f, 10.298f, 2.434f)
                close()
            }
        }
        .build()
        return _photoOutlineSm!!
    }

private var _photoOutlineSm: ImageVector? = null
