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

public val DsIcon.ViewOffOutlineSm: ImageVector
    get() {
        if (_viewOffOutlineSm != null) {
            return _viewOffOutlineSm!!
        }
        _viewOffOutlineSm = Builder(name = "ViewOffOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.401f, 13.676f)
                    lineTo(12.0f, 16.0f)
                    horizontalLineTo(14.25f)
                    lineTo(3.25f, 0.008f)
                    horizontalLineTo(1.0f)
                    lineTo(3.286f, 3.332f)
                    curveTo(1.894f, 4.189f, 0.754f, 5.415f, 0.0f, 6.873f)
                    verticalLineTo(9.127f)
                    curveTo(1.496f, 12.021f, 4.517f, 14.0f, 8.0f, 14.0f)
                    curveTo(8.832f, 14.0f, 9.637f, 13.887f, 10.401f, 13.676f)
                    close()
                    moveTo(9.18f, 11.901f)
                    lineTo(7.872f, 9.998f)
                    curveTo(5.722f, 9.93f, 4.0f, 8.166f, 4.0f, 6.0f)
                    curveTo(4.0f, 5.726f, 4.028f, 5.458f, 4.08f, 5.2f)
                    curveTo(3.048f, 5.898f, 2.212f, 6.865f, 1.673f, 8.0f)
                    curveTo(2.797f, 10.367f, 5.21f, 12.0f, 8.0f, 12.0f)
                    curveTo(8.402f, 12.0f, 8.797f, 11.966f, 9.18f, 11.901f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 9.127f)
                    curveTo(15.341f, 10.403f, 14.385f, 11.5f, 13.225f, 12.329f)
                    lineTo(12.091f, 10.681f)
                    curveTo(13.044f, 9.993f, 13.818f, 9.072f, 14.327f, 8.0f)
                    curveTo(13.788f, 6.864f, 12.952f, 5.898f, 11.92f, 5.199f)
                    curveTo(11.972f, 5.458f, 12.0f, 5.726f, 12.0f, 6.0f)
                    curveTo(12.0f, 7.108f, 11.55f, 8.111f, 10.822f, 8.835f)
                    lineTo(9.65f, 7.131f)
                    curveTo(9.871f, 6.809f, 10.0f, 6.42f, 10.0f, 6.0f)
                    curveTo(10.0f, 4.895f, 9.105f, 4.0f, 8.0f, 4.0f)
                    lineTo(7.997f, 4.0f)
                    curveTo(7.837f, 4.0f, 7.682f, 4.019f, 7.534f, 4.055f)
                    lineTo(6.239f, 2.172f)
                    curveTo(6.808f, 2.059f, 7.397f, 2.0f, 8.0f, 2.0f)
                    curveTo(11.483f, 2.0f, 14.504f, 3.978f, 16.0f, 6.873f)
                    verticalLineTo(9.127f)
                    close()
                }
            }
        }
        .build()
        return _viewOffOutlineSm!!
    }

private var _viewOffOutlineSm: ImageVector? = null
