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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.LikeSolidSm: ImageVector
    get() {
        if (_likeSolidSm != null) {
            return _likeSolidSm!!
        }
        _likeSolidSm = Builder(name = "LikeSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.717f, 6.315f)
                    horizontalLineTo(14.374f)
                    curveTo(15.594f, 6.315f, 15.992f, 7.042f, 16.0f, 7.894f)
                    curveTo(15.959f, 8.532f, 15.668f, 9.037f, 15.187f, 9.473f)
                    curveTo(15.216f, 9.552f, 15.247f, 9.626f, 15.276f, 9.698f)
                    curveTo(15.432f, 10.08f, 15.561f, 10.399f, 15.39f, 11.064f)
                    curveTo(15.187f, 11.854f, 14.374f, 12.434f, 14.374f, 12.434f)
                    curveTo(14.374f, 12.434f, 14.124f, 13.425f, 13.15f, 14.206f)
                    curveTo(12.176f, 14.987f, 11.53f, 14.999f, 10.717f, 14.999f)
                    horizontalLineTo(8.283f)
                    curveTo(7.039f, 14.999f, 5.66f, 14.513f, 4.621f, 13.432f)
                    curveTo(4.621f, 13.432f, 4.214f, 12.631f, 4.214f, 11.052f)
                    curveTo(4.214f, 9.473f, 4.621f, 8.289f, 4.621f, 8.289f)
                    curveTo(6.311f, 5.933f, 7.83f, 2.838f, 8.278f, -0.001f)
                    horizontalLineTo(9.091f)
                    curveTo(11.123f, -0.001f, 11.221f, 2.396f, 11.221f, 3.157f)
                    curveTo(11.221f, 3.918f, 10.966f, 5.276f, 10.717f, 6.315f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 10.837f)
                    curveTo(0.0f, 13.11f, 0.749f, 14.999f, 1.665f, 14.999f)
                    horizontalLineTo(3.749f)
                    curveTo(2.916f, 14.167f, 2.5f, 12.502f, 2.5f, 10.837f)
                    curveTo(2.5f, 9.172f, 2.916f, 7.507f, 3.749f, 6.674f)
                    horizontalLineTo(1.665f)
                    curveTo(0.741f, 6.674f, 0.0f, 8.564f, 0.0f, 10.837f)
                    close()
                }
            }
        }
        .build()
        return _likeSolidSm!!
    }

private var _likeSolidSm: ImageVector? = null
