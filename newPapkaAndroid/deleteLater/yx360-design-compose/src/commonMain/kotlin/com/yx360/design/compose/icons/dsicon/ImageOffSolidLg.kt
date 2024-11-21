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

public val DsIcon.ImageOffSolidLg: ImageVector
    get() {
        if (_imageOffSolidLg != null) {
            return _imageOffSolidLg!!
        }
        _imageOffSolidLg = Builder(name = "ImageOffSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(4.0f)
                lineTo(6.142f, 5.06f)
                curveTo(5.379f, 5.63f, 4.776f, 6.398f, 4.406f, 7.292f)
                curveTo(4.0f, 8.272f, 4.0f, 9.515f, 4.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 22.485f, 4.0f, 23.728f, 4.406f, 24.708f)
                curveTo(4.947f, 26.014f, 5.986f, 27.053f, 7.292f, 27.594f)
                curveTo(8.272f, 28.0f, 9.515f, 28.0f, 12.0f, 28.0f)
                horizontalLineTo(20.0f)
                curveTo(20.867f, 28.0f, 21.582f, 28.0f, 22.188f, 27.983f)
                lineTo(23.6f, 30.0f)
                horizontalLineTo(26.6f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(11.9f, 4.0f)
                lineTo(22.056f, 18.508f)
                lineTo(25.332f, 19.698f)
                verticalLineTo(20.003f)
                curveTo(25.332f, 21.282f, 25.33f, 22.108f, 25.287f, 22.74f)
                curveTo(25.278f, 22.87f, 25.268f, 22.983f, 25.257f, 23.081f)
                lineTo(27.072f, 25.674f)
                curveTo(27.277f, 25.373f, 27.452f, 25.049f, 27.594f, 24.708f)
                curveTo(28.0f, 23.728f, 28.0f, 22.485f, 28.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(28.0f, 9.515f, 28.0f, 8.272f, 27.594f, 7.292f)
                curveTo(27.053f, 5.986f, 26.014f, 4.947f, 24.708f, 4.406f)
                curveTo(23.728f, 4.0f, 22.485f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(12.0f)
                curveTo(11.966f, 4.0f, 11.933f, 4.0f, 11.9f, 4.0f)
                close()
                moveTo(9.333f, 12.734f)
                curveTo(9.333f, 11.949f, 9.605f, 11.227f, 10.06f, 10.657f)
                lineTo(13.727f, 15.896f)
                curveTo(13.394f, 16.007f, 13.037f, 16.068f, 12.667f, 16.068f)
                curveTo(10.826f, 16.068f, 9.333f, 14.575f, 9.333f, 12.734f)
                close()
                moveTo(15.332f, 22.003f)
                lineTo(17.083f, 20.69f)
                lineTo(20.335f, 25.336f)
                lineTo(19.999f, 25.336f)
                horizontalLineTo(11.998f)
                curveTo(10.719f, 25.336f, 9.894f, 25.335f, 9.262f, 25.292f)
                curveTo(8.654f, 25.25f, 8.422f, 25.179f, 8.311f, 25.133f)
                curveTo(7.658f, 24.863f, 7.139f, 24.344f, 6.868f, 23.69f)
                curveTo(6.841f, 23.624f, 6.804f, 23.515f, 6.771f, 23.309f)
                lineTo(9.998f, 20.67f)
                lineTo(15.332f, 22.003f)
                close()
            }
        }
        .build()
        return _imageOffSolidLg!!
    }

private var _imageOffSolidLg: ImageVector? = null
