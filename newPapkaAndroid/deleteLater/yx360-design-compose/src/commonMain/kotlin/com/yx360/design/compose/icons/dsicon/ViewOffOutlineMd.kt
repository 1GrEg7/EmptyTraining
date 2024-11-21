package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.ViewOffOutlineMd: ImageVector
    get() {
        if (_viewOffOutlineMd != null) {
            return _viewOffOutlineMd!!
        }
        _viewOffOutlineMd = Builder(name = "ViewOffOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.826f, 18.902f)
                lineTo(18.0f, 22.008f)
                horizontalLineTo(20.5f)
                lineTo(6.5f, 2.008f)
                horizontalLineTo(4.0f)
                lineTo(6.599f, 5.72f)
                curveTo(6.263f, 5.881f, 5.933f, 6.056f, 5.611f, 6.246f)
                curveTo(3.676f, 7.39f, 2.083f, 9.031f, 1.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.085f, 14.968f, 3.677f, 16.61f, 5.612f, 17.753f)
                curveTo(7.547f, 18.896f, 9.753f, 19.5f, 12.0f, 19.5f)
                curveTo(13.304f, 19.5f, 14.594f, 19.296f, 15.826f, 18.902f)
                close()
                moveTo(14.614f, 17.171f)
                lineTo(13.331f, 15.338f)
                curveTo(12.905f, 15.444f, 12.459f, 15.5f, 12.0f, 15.5f)
                curveTo(8.962f, 15.5f, 6.5f, 13.038f, 6.5f, 10.0f)
                curveTo(6.5f, 9.208f, 6.667f, 8.456f, 6.968f, 7.776f)
                curveTo(6.854f, 7.838f, 6.741f, 7.902f, 6.628f, 7.968f)
                curveTo(5.143f, 8.846f, 3.898f, 10.072f, 3.0f, 11.538f)
                lineTo(2.75f, 12.0f)
                lineTo(3.0f, 12.462f)
                curveTo(3.9f, 13.927f, 5.145f, 15.154f, 6.629f, 16.031f)
                curveTo(8.257f, 16.992f, 10.112f, 17.5f, 12.0f, 17.5f)
                curveTo(12.885f, 17.5f, 13.763f, 17.388f, 14.614f, 17.171f)
                close()
                moveTo(12.044f, 13.5f)
                lineTo(8.726f, 8.76f)
                curveTo(8.58f, 9.145f, 8.5f, 9.563f, 8.5f, 10.0f)
                curveTo(8.5f, 11.933f, 10.067f, 13.5f, 12.0f, 13.5f)
                curveTo(12.015f, 13.5f, 12.03f, 13.5f, 12.044f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                curveTo(21.999f, 14.816f, 20.566f, 16.354f, 18.83f, 17.479f)
                lineTo(17.682f, 15.839f)
                curveTo(19.03f, 14.979f, 20.164f, 13.824f, 21.0f, 12.462f)
                lineTo(21.25f, 12.0f)
                lineTo(21.0f, 11.538f)
                curveTo(20.102f, 10.072f, 18.857f, 8.846f, 17.372f, 7.968f)
                curveTo(17.259f, 7.902f, 17.146f, 7.838f, 17.032f, 7.776f)
                curveTo(17.333f, 8.456f, 17.5f, 9.208f, 17.5f, 10.0f)
                curveTo(17.5f, 11.39f, 16.984f, 12.66f, 16.134f, 13.628f)
                lineTo(14.932f, 11.911f)
                curveTo(15.291f, 11.362f, 15.5f, 10.705f, 15.5f, 10.0f)
                curveTo(15.5f, 8.068f, 13.934f, 6.501f, 12.003f, 6.5f)
                lineTo(12.0f, 6.5f)
                curveTo(11.727f, 6.5f, 11.462f, 6.531f, 11.208f, 6.59f)
                lineTo(9.871f, 4.681f)
                curveTo(10.572f, 4.561f, 11.284f, 4.5f, 12.0f, 4.5f)
                curveTo(14.248f, 4.499f, 16.454f, 5.103f, 18.389f, 6.246f)
                curveTo(20.324f, 7.39f, 21.917f, 9.031f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _viewOffOutlineMd!!
    }

private var _viewOffOutlineMd: ImageVector? = null
