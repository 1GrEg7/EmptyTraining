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

public val DsIcon.CameraOutlineSm: ImageVector
    get() {
        if (_cameraOutlineSm != null) {
            return _cameraOutlineSm!!
        }
        _cameraOutlineSm = Builder(name = "CameraOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 2.0f, 0.0f, 3.791f, 0.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(0.0f, 12.209f, 1.791f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(8.0f)
                curveTo(9.693f, 14.0f, 11.14f, 12.948f, 11.724f, 11.462f)
                lineTo(11.854f, 11.576f)
                curveTo(13.47f, 12.99f, 16.0f, 11.842f, 16.0f, 9.694f)
                verticalLineTo(6.306f)
                curveTo(16.0f, 4.158f, 13.47f, 3.01f, 11.854f, 4.424f)
                lineTo(11.724f, 4.538f)
                curveTo(11.14f, 3.052f, 9.693f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(12.0f, 7.181f)
                verticalLineTo(8.819f)
                curveTo(12.0f, 8.964f, 12.062f, 9.101f, 12.171f, 9.196f)
                lineTo(13.171f, 10.071f)
                curveTo(13.494f, 10.354f, 14.0f, 10.124f, 14.0f, 9.694f)
                verticalLineTo(6.306f)
                curveTo(14.0f, 5.876f, 13.494f, 5.646f, 13.171f, 5.929f)
                lineTo(12.171f, 6.804f)
                curveTo(12.062f, 6.899f, 12.0f, 7.036f, 12.0f, 7.181f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 4.895f, 9.105f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 4.0f, 2.0f, 4.895f, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 11.105f, 2.895f, 12.0f, 4.0f, 12.0f)
                horizontalLineTo(8.0f)
                curveTo(9.105f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _cameraOutlineSm!!
    }

private var _cameraOutlineSm: ImageVector? = null
