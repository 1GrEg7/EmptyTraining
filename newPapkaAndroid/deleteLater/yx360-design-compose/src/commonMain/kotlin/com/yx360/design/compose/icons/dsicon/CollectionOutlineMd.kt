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

public val DsIcon.CollectionOutlineMd: ImageVector
    get() {
        if (_collectionOutlineMd != null) {
            return _collectionOutlineMd!!
        }
        _collectionOutlineMd = Builder(name = "CollectionOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.136f, 21.0f, 5.204f, 20.695f, 4.469f)
                curveTo(20.289f, 3.489f, 19.511f, 2.71f, 18.531f, 2.304f)
                curveTo(17.796f, 2.0f, 16.864f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(11.136f, 2.0f, 10.204f, 2.0f, 9.469f, 2.304f)
                curveTo(8.489f, 2.71f, 7.71f, 3.489f, 7.304f, 4.469f)
                curveTo(7.133f, 4.882f, 7.058f, 5.358f, 7.026f, 6.026f)
                curveTo(6.358f, 6.058f, 5.882f, 6.133f, 5.469f, 6.304f)
                curveTo(4.489f, 6.71f, 3.71f, 7.489f, 3.304f, 8.469f)
                curveTo(3.0f, 9.204f, 3.0f, 10.136f, 3.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                lineTo(10.0f, 19.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(12.041f, 4.0f, 11.422f, 4.001f, 10.948f, 4.033f)
                curveTo(10.491f, 4.065f, 10.318f, 4.118f, 10.235f, 4.152f)
                curveTo(9.745f, 4.355f, 9.355f, 4.745f, 9.152f, 5.235f)
                curveTo(9.118f, 5.318f, 9.065f, 5.492f, 9.033f, 5.948f)
                curveTo(9.032f, 5.965f, 9.031f, 5.982f, 9.03f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(12.864f, 6.0f, 13.796f, 6.0f, 14.531f, 6.304f)
                curveTo(15.511f, 6.71f, 16.289f, 7.489f, 16.695f, 8.469f)
                curveTo(17.0f, 9.204f, 17.0f, 10.136f, 17.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 7.041f, 18.999f, 6.421f, 18.967f, 5.948f)
                curveTo(18.935f, 5.492f, 18.882f, 5.318f, 18.848f, 5.235f)
                curveTo(18.645f, 4.745f, 18.255f, 4.355f, 17.765f, 4.152f)
                curveTo(17.682f, 4.118f, 17.508f, 4.065f, 17.052f, 4.033f)
                curveTo(16.579f, 4.001f, 15.959f, 4.0f, 15.0f, 4.0f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(19.668f)
                lineTo(10.0f, 16.668f)
                lineTo(15.0f, 19.668f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 11.041f, 14.999f, 10.422f, 14.967f, 9.948f)
                curveTo(14.936f, 9.492f, 14.882f, 9.318f, 14.848f, 9.235f)
                curveTo(14.645f, 8.745f, 14.255f, 8.355f, 13.765f, 8.152f)
                curveTo(13.682f, 8.118f, 13.509f, 8.065f, 13.052f, 8.033f)
                curveTo(12.578f, 8.001f, 11.959f, 8.0f, 11.0f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(8.041f, 8.0f, 7.421f, 8.001f, 6.948f, 8.033f)
                curveTo(6.492f, 8.065f, 6.318f, 8.118f, 6.235f, 8.152f)
                curveTo(5.745f, 8.355f, 5.355f, 8.745f, 5.152f, 9.235f)
                curveTo(5.118f, 9.318f, 5.065f, 9.492f, 5.033f, 9.948f)
                curveTo(5.001f, 10.422f, 5.0f, 11.041f, 5.0f, 12.0f)
                close()
            }
        }
        .build()
        return _collectionOutlineMd!!
    }

private var _collectionOutlineMd: ImageVector? = null
