package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.LikeOutlineMd: ImageVector
    get() {
        if (_likeOutlineMd != null) {
            return _likeOutlineMd!!
        }
        _likeOutlineMd = Builder(name = "LikeOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 7.997f)
                horizontalLineTo(15.75f)
                curveTo(15.922f, 7.006f, 16.009f, 6.003f, 16.01f, 4.998f)
                curveTo(16.01f, 2.529f, 14.86f, 1.0f, 13.01f, 1.0f)
                horizontalLineTo(11.01f)
                lineTo(10.87f, 1.81f)
                curveTo(10.313f, 4.646f, 9.388f, 7.398f, 8.12f, 9.995f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 9.995f, 2.0f, 12.494f, 2.0f, 15.503f)
                curveTo(2.0f, 18.511f, 2.89f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.23f, 21.0f, 9.46f, 20.74f, 9.67f, 20.35f)
                curveTo(10.729f, 20.776f, 11.859f, 20.996f, 13.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(17.68f, 21.0f, 19.71f, 19.591f, 20.29f, 17.372f)
                curveTo(20.885f, 16.869f, 21.323f, 16.207f, 21.552f, 15.462f)
                curveTo(21.781f, 14.718f, 21.791f, 13.924f, 21.58f, 13.174f)
                curveTo(22.166f, 12.418f, 22.489f, 11.491f, 22.5f, 10.535f)
                curveTo(22.5f, 8.856f, 21.56f, 7.997f, 20.41f, 7.997f)
                close()
                moveTo(4.59f, 18.991f)
                curveTo(4.16f, 17.876f, 3.96f, 16.687f, 4.0f, 15.493f)
                curveTo(3.961f, 14.299f, 4.161f, 13.109f, 4.59f, 11.995f)
                horizontalLineTo(7.59f)
                curveTo(7.163f, 13.11f, 6.962f, 14.299f, 7.0f, 15.493f)
                curveTo(6.963f, 16.687f, 7.167f, 17.877f, 7.6f, 18.991f)
                horizontalLineTo(4.59f)
                close()
                moveTo(19.75f, 12.314f)
                lineTo(19.33f, 12.824f)
                lineTo(19.6f, 13.444f)
                curveTo(19.777f, 13.901f, 19.789f, 14.406f, 19.634f, 14.871f)
                curveTo(19.479f, 15.336f, 19.166f, 15.733f, 18.75f, 15.993f)
                lineTo(18.43f, 16.232f)
                lineTo(18.36f, 16.622f)
                curveTo(18.05f, 18.361f, 16.36f, 18.981f, 14.96f, 18.981f)
                horizontalLineTo(12.96f)
                curveTo(11.631f, 19.013f, 10.327f, 18.617f, 9.24f, 17.852f)
                curveTo(9.047f, 17.077f, 8.953f, 16.281f, 8.96f, 15.483f)
                curveTo(8.913f, 13.909f, 9.22f, 12.344f, 9.86f, 10.905f)
                curveTo(11.099f, 8.388f, 12.038f, 5.734f, 12.66f, 2.999f)
                horizontalLineTo(13.0f)
                curveTo(13.82f, 2.999f, 14.0f, 4.088f, 14.0f, 4.998f)
                curveTo(14.003f, 6.264f, 13.852f, 7.526f, 13.55f, 8.756f)
                curveTo(13.37f, 9.446f, 13.46f, 9.995f, 14.55f, 9.995f)
                horizontalLineTo(20.46f)
                curveTo(20.554f, 10.41f, 20.538f, 10.843f, 20.414f, 11.249f)
                curveTo(20.289f, 11.656f, 20.06f, 12.023f, 19.75f, 12.314f)
                close()
            }
        }
        .build()
        return _likeOutlineMd!!
    }

private var _likeOutlineMd: ImageVector? = null
