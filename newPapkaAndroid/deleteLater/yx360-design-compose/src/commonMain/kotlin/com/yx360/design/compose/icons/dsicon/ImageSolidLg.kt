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

public val DsIcon.ImageSolidLg: ImageVector
    get() {
        if (_imageSolidLg != null) {
            return _imageSolidLg!!
        }
        _imageSolidLg = Builder(name = "ImageSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 9.515f, 4.0f, 8.272f, 4.406f, 7.292f)
                curveTo(4.947f, 5.986f, 5.986f, 4.947f, 7.292f, 4.406f)
                curveTo(8.272f, 4.0f, 9.515f, 4.0f, 12.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(22.485f, 4.0f, 23.728f, 4.0f, 24.708f, 4.406f)
                curveTo(26.014f, 4.947f, 27.053f, 5.986f, 27.594f, 7.292f)
                curveTo(28.0f, 8.272f, 28.0f, 9.515f, 28.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(28.0f, 22.485f, 28.0f, 23.728f, 27.594f, 24.708f)
                curveTo(27.053f, 26.014f, 26.014f, 27.053f, 24.708f, 27.594f)
                curveTo(23.728f, 28.0f, 22.485f, 28.0f, 20.0f, 28.0f)
                horizontalLineTo(12.0f)
                curveTo(9.515f, 28.0f, 8.272f, 28.0f, 7.292f, 27.594f)
                curveTo(5.986f, 27.053f, 4.947f, 26.014f, 4.406f, 24.708f)
                curveTo(4.0f, 23.728f, 4.0f, 22.485f, 4.0f, 20.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.667f, 16.068f)
                curveTo(14.508f, 16.068f, 16.0f, 14.575f, 16.0f, 12.734f)
                curveTo(16.0f, 10.893f, 14.508f, 9.401f, 12.667f, 9.401f)
                curveTo(10.826f, 9.401f, 9.333f, 10.893f, 9.333f, 12.734f)
                curveTo(9.333f, 14.575f, 10.826f, 16.068f, 12.667f, 16.068f)
                close()
                moveTo(25.332f, 19.698f)
                lineTo(20.665f, 18.003f)
                lineTo(15.332f, 22.003f)
                lineTo(9.998f, 20.67f)
                lineTo(6.771f, 23.309f)
                curveTo(6.804f, 23.515f, 6.841f, 23.624f, 6.868f, 23.69f)
                curveTo(7.139f, 24.344f, 7.658f, 24.863f, 8.311f, 25.133f)
                curveTo(8.422f, 25.179f, 8.654f, 25.25f, 9.262f, 25.292f)
                curveTo(9.894f, 25.335f, 10.719f, 25.336f, 11.998f, 25.336f)
                horizontalLineTo(19.999f)
                curveTo(21.278f, 25.336f, 22.103f, 25.335f, 22.735f, 25.292f)
                curveTo(23.343f, 25.25f, 23.575f, 25.179f, 23.686f, 25.133f)
                curveTo(24.339f, 24.863f, 24.858f, 24.344f, 25.129f, 23.69f)
                curveTo(25.175f, 23.579f, 25.246f, 23.348f, 25.287f, 22.74f)
                curveTo(25.33f, 22.108f, 25.332f, 21.282f, 25.332f, 20.003f)
                verticalLineTo(19.698f)
                close()
            }
        }
        .build()
        return _imageSolidLg!!
    }

private var _imageSolidLg: ImageVector? = null
