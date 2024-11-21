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

public val DsIcon.ViewOffSolidMd: ImageVector
    get() {
        if (_viewOffSolidMd != null) {
            return _viewOffSolidMd!!
        }
        _viewOffSolidMd = Builder(name = "ViewOffSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.309f, 15.307f)
                lineTo(8.402f, 8.297f)
                curveTo(7.836f, 9.049f, 7.5f, 9.985f, 7.5f, 11.0f)
                curveTo(7.5f, 13.485f, 9.515f, 15.5f, 12.0f, 15.5f)
                curveTo(12.455f, 15.5f, 12.895f, 15.432f, 13.309f, 15.307f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                curveTo(21.999f, 14.816f, 20.566f, 16.354f, 18.83f, 17.479f)
                lineTo(15.885f, 13.272f)
                curveTo(16.276f, 12.605f, 16.5f, 11.829f, 16.5f, 11.0f)
                curveTo(16.5f, 8.515f, 14.485f, 6.5f, 12.0f, 6.5f)
                curveTo(11.725f, 6.5f, 11.456f, 6.525f, 11.195f, 6.572f)
                lineTo(9.871f, 4.681f)
                curveTo(10.572f, 4.561f, 11.284f, 4.5f, 12.0f, 4.5f)
                curveTo(14.248f, 4.499f, 16.454f, 5.103f, 18.389f, 6.246f)
                curveTo(20.324f, 7.39f, 21.917f, 9.031f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _viewOffSolidMd!!
    }

private var _viewOffSolidMd: ImageVector? = null
