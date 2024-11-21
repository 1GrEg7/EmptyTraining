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

public val DsIcon.CloseCircleOutlineMd: ImageVector
    get() {
        if (_closeCircleOutlineMd != null) {
            return _closeCircleOutlineMd!!
        }
        _closeCircleOutlineMd = Builder(name = "CloseCircleOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.414f)
                lineTo(8.994f, 16.42f)
                lineTo(7.58f, 15.006f)
                lineTo(10.586f, 12.0f)
                lineTo(7.58f, 8.994f)
                lineTo(8.994f, 7.58f)
                lineTo(12.0f, 10.586f)
                lineTo(15.006f, 7.58f)
                lineTo(16.42f, 8.994f)
                lineTo(13.414f, 12.0f)
                lineTo(16.42f, 15.006f)
                lineTo(15.006f, 16.42f)
                lineTo(12.0f, 13.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.929f, 4.929f)
                curveTo(6.804f, 3.054f, 9.348f, 2.0f, 12.0f, 2.0f)
                curveTo(14.652f, 2.0f, 17.196f, 3.054f, 19.071f, 4.929f)
                curveTo(20.946f, 6.804f, 22.0f, 9.348f, 22.0f, 12.0f)
                curveTo(22.0f, 14.652f, 20.946f, 17.196f, 19.071f, 19.071f)
                curveTo(17.196f, 20.946f, 14.652f, 22.0f, 12.0f, 22.0f)
                curveTo(9.348f, 22.0f, 6.804f, 20.946f, 4.929f, 19.071f)
                curveTo(3.054f, 17.196f, 2.0f, 14.652f, 2.0f, 12.0f)
                curveTo(2.0f, 9.348f, 3.054f, 6.804f, 4.929f, 4.929f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.878f, 4.0f, 7.843f, 4.843f, 6.343f, 6.343f)
                curveTo(4.843f, 7.843f, 4.0f, 9.878f, 4.0f, 12.0f)
                curveTo(4.0f, 14.122f, 4.843f, 16.157f, 6.343f, 17.657f)
                curveTo(7.843f, 19.157f, 9.878f, 20.0f, 12.0f, 20.0f)
                curveTo(14.122f, 20.0f, 16.157f, 19.157f, 17.657f, 17.657f)
                curveTo(19.157f, 16.157f, 20.0f, 14.122f, 20.0f, 12.0f)
                curveTo(20.0f, 9.878f, 19.157f, 7.843f, 17.657f, 6.343f)
                curveTo(16.157f, 4.843f, 14.122f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _closeCircleOutlineMd!!
    }

private var _closeCircleOutlineMd: ImageVector? = null
