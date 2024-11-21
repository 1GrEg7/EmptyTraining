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

public val DsIcon.StreamPauseOutlineMd: ImageVector
    get() {
        if (_streamPauseOutlineMd != null) {
            return _streamPauseOutlineMd!!
        }
        _streamPauseOutlineMd = Builder(name = "StreamPauseOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                curveTo(23.0f, 17.071f, 20.788f, 20.626f, 17.501f, 22.528f)
                lineTo(16.501f, 20.795f)
                curveTo(19.19f, 19.239f, 21.0f, 16.331f, 21.0f, 13.0f)
                curveTo(21.0f, 8.029f, 16.971f, 4.0f, 12.0f, 4.0f)
                curveTo(7.029f, 4.0f, 3.0f, 8.029f, 3.0f, 13.0f)
                curveTo(3.0f, 16.331f, 4.81f, 19.239f, 7.499f, 20.795f)
                lineTo(6.499f, 22.528f)
                curveTo(3.212f, 20.626f, 1.0f, 17.071f, 1.0f, 13.0f)
                curveTo(1.0f, 6.925f, 5.925f, 2.0f, 12.0f, 2.0f)
                curveTo(18.075f, 2.0f, 23.0f, 6.925f, 23.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(19.0f, 15.591f, 17.593f, 17.853f, 15.501f, 19.063f)
                lineTo(14.5f, 17.331f)
                curveTo(15.995f, 16.466f, 17.0f, 14.851f, 17.0f, 13.0f)
                curveTo(17.0f, 10.239f, 14.761f, 8.0f, 12.0f, 8.0f)
                curveTo(9.239f, 8.0f, 7.0f, 10.239f, 7.0f, 13.0f)
                curveTo(7.0f, 14.851f, 8.005f, 16.466f, 9.5f, 17.331f)
                lineTo(8.499f, 19.063f)
                curveTo(6.407f, 17.853f, 5.0f, 15.591f, 5.0f, 13.0f)
                curveTo(5.0f, 9.134f, 8.134f, 6.0f, 12.0f, 6.0f)
                curveTo(15.866f, 6.0f, 19.0f, 9.134f, 19.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.512f, 11.0f)
                curveTo(9.512f, 10.448f, 9.959f, 10.0f, 10.512f, 10.0f)
                curveTo(11.064f, 10.0f, 11.512f, 10.448f, 11.512f, 11.0f)
                lineTo(11.5f, 15.0f)
                curveTo(11.5f, 15.552f, 11.052f, 16.0f, 10.5f, 16.0f)
                curveTo(9.948f, 16.0f, 9.5f, 15.552f, 9.5f, 15.0f)
                lineTo(9.512f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 10.0f)
                curveTo(12.948f, 10.0f, 12.5f, 10.448f, 12.5f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(12.5f, 15.552f, 12.948f, 16.0f, 13.5f, 16.0f)
                curveTo(14.052f, 16.0f, 14.5f, 15.552f, 14.5f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(14.5f, 10.448f, 14.052f, 10.0f, 13.5f, 10.0f)
                close()
            }
        }
        .build()
        return _streamPauseOutlineMd!!
    }

private var _streamPauseOutlineMd: ImageVector? = null
