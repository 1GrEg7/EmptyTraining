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

public val DsIcon.BookmarkOutlineMd: ImageVector
    get() {
        if (_bookmarkOutlineMd != null) {
            return _bookmarkOutlineMd!!
        }
        _bookmarkOutlineMd = Builder(name = "BookmarkOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 15.597f)
                lineTo(18.0f, 19.597f)
                lineTo(18.0f, 8.0f)
                curveTo(18.0f, 7.041f, 17.999f, 6.422f, 17.967f, 5.948f)
                curveTo(17.935f, 5.492f, 17.882f, 5.318f, 17.848f, 5.235f)
                curveTo(17.645f, 4.745f, 17.255f, 4.355f, 16.765f, 4.152f)
                curveTo(16.682f, 4.118f, 16.508f, 4.065f, 16.052f, 4.034f)
                curveTo(15.578f, 4.001f, 14.959f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(9.041f, 4.0f, 8.421f, 4.001f, 7.948f, 4.034f)
                curveTo(7.492f, 4.065f, 7.318f, 4.118f, 7.235f, 4.152f)
                curveTo(6.745f, 4.355f, 6.355f, 4.745f, 6.152f, 5.235f)
                curveTo(6.118f, 5.318f, 6.065f, 5.492f, 6.033f, 5.948f)
                curveTo(6.001f, 6.422f, 6.0f, 7.041f, 6.0f, 8.0f)
                lineTo(6.0f, 19.597f)
                lineTo(12.0f, 15.597f)
                close()
                moveTo(6.0f, 22.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 8.0f)
                curveTo(4.0f, 6.136f, 4.0f, 5.205f, 4.304f, 4.47f)
                curveTo(4.71f, 3.489f, 5.489f, 2.711f, 6.469f, 2.305f)
                curveTo(7.204f, 2.0f, 8.136f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.864f, 2.0f, 16.796f, 2.0f, 17.531f, 2.305f)
                curveTo(18.511f, 2.711f, 19.289f, 3.489f, 19.695f, 4.47f)
                curveTo(20.0f, 5.205f, 20.0f, 6.136f, 20.0f, 8.0f)
                lineTo(20.0f, 22.0f)
                horizontalLineTo(18.0f)
                lineTo(12.0f, 18.0f)
                lineTo(6.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bookmarkOutlineMd!!
    }

private var _bookmarkOutlineMd: ImageVector? = null
