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

public val DsIcon.ViewOutlineMd: ImageVector
    get() {
        if (_viewOutlineMd != null) {
            return _viewOutlineMd!!
        }
        _viewOutlineMd = Builder(name = "ViewOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.611f, 6.246f)
                curveTo(7.546f, 5.103f, 9.752f, 4.499f, 12.0f, 4.5f)
                curveTo(14.248f, 4.499f, 16.454f, 5.103f, 18.389f, 6.246f)
                curveTo(20.324f, 7.39f, 21.917f, 9.031f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.915f, 14.968f, 20.323f, 16.61f, 18.388f, 17.753f)
                curveTo(16.453f, 18.896f, 14.247f, 19.5f, 12.0f, 19.5f)
                curveTo(9.753f, 19.5f, 7.547f, 18.896f, 5.612f, 17.753f)
                curveTo(3.677f, 16.61f, 2.085f, 14.968f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.083f, 9.031f, 3.676f, 7.39f, 5.611f, 6.246f)
                close()
                moveTo(12.0f, 6.5f)
                curveTo(10.067f, 6.5f, 8.5f, 8.067f, 8.5f, 10.0f)
                curveTo(8.5f, 11.933f, 10.067f, 13.5f, 12.0f, 13.5f)
                curveTo(13.933f, 13.5f, 15.5f, 11.933f, 15.5f, 10.0f)
                curveTo(15.5f, 8.068f, 13.934f, 6.501f, 12.003f, 6.5f)
                curveTo(12.002f, 6.5f, 12.001f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(6.968f, 7.776f)
                curveTo(6.667f, 8.456f, 6.5f, 9.208f, 6.5f, 10.0f)
                curveTo(6.5f, 13.038f, 8.962f, 15.5f, 12.0f, 15.5f)
                curveTo(15.038f, 15.5f, 17.5f, 13.038f, 17.5f, 10.0f)
                curveTo(17.5f, 9.208f, 17.333f, 8.456f, 17.032f, 7.776f)
                curveTo(17.146f, 7.838f, 17.259f, 7.902f, 17.372f, 7.968f)
                curveTo(18.857f, 8.846f, 20.102f, 10.072f, 21.0f, 11.538f)
                lineTo(21.25f, 12.0f)
                lineTo(21.0f, 12.462f)
                curveTo(20.1f, 13.927f, 18.855f, 15.154f, 17.371f, 16.031f)
                curveTo(15.743f, 16.992f, 13.888f, 17.5f, 12.0f, 17.5f)
                curveTo(10.112f, 17.5f, 8.257f, 16.992f, 6.629f, 16.031f)
                curveTo(5.145f, 15.154f, 3.9f, 13.927f, 3.0f, 12.462f)
                lineTo(2.75f, 12.0f)
                lineTo(3.0f, 11.538f)
                curveTo(3.898f, 10.072f, 5.143f, 8.846f, 6.628f, 7.968f)
                curveTo(6.741f, 7.902f, 6.854f, 7.838f, 6.968f, 7.776f)
                close()
            }
        }
        .build()
        return _viewOutlineMd!!
    }

private var _viewOutlineMd: ImageVector? = null
