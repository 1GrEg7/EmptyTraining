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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ViewOffSolidSm: ImageVector
    get() {
        if (_viewOffSolidSm != null) {
            return _viewOffSolidSm!!
        }
        _viewOffSolidSm = Builder(name = "ViewOffSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.368f, 13.627f)
                    lineTo(12.0f, 16.0f)
                    horizontalLineTo(14.25f)
                    lineTo(3.25f, 0.008f)
                    horizontalLineTo(1.0f)
                    lineTo(3.34f, 3.409f)
                    curveTo(1.942f, 4.262f, 0.731f, 5.458f, 0.0f, 6.873f)
                    verticalLineTo(9.127f)
                    curveTo(1.496f, 12.021f, 5.0f, 14.0f, 8.0f, 14.0f)
                    curveTo(8.77f, 14.0f, 9.574f, 13.87f, 10.368f, 13.627f)
                    close()
                    moveTo(8.21f, 10.49f)
                    lineTo(4.812f, 5.55f)
                    curveTo(4.612f, 5.991f, 4.5f, 6.48f, 4.5f, 6.996f)
                    curveTo(4.5f, 8.929f, 6.067f, 10.496f, 8.0f, 10.496f)
                    curveTo(8.071f, 10.496f, 8.141f, 10.494f, 8.21f, 10.49f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 9.127f)
                    curveTo(15.36f, 10.365f, 14.353f, 11.436f, 13.175f, 12.256f)
                    lineTo(10.903f, 8.953f)
                    curveTo(11.28f, 8.394f, 11.5f, 7.721f, 11.5f, 6.996f)
                    curveTo(11.5f, 5.063f, 9.933f, 3.496f, 8.0f, 3.496f)
                    curveTo(7.729f, 3.496f, 7.464f, 3.527f, 7.211f, 3.586f)
                    lineTo(6.261f, 2.205f)
                    curveTo(6.848f, 2.071f, 7.433f, 2.0f, 8.0f, 2.0f)
                    curveTo(11.0f, 2.0f, 14.504f, 3.978f, 16.0f, 6.873f)
                    verticalLineTo(9.127f)
                    close()
                }
            }
        }
        .build()
        return _viewOffSolidSm!!
    }

private var _viewOffSolidSm: ImageVector? = null
