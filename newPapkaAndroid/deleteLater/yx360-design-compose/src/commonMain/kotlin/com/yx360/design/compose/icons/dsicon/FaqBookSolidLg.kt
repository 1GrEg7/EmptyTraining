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

public val DsIcon.FaqBookSolidLg: ImageVector
    get() {
        if (_faqBookSolidLg != null) {
            return _faqBookSolidLg!!
        }
        _faqBookSolidLg = Builder(name = "FaqBookSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.514f, 4.0f)
                curveTo(6.573f, 4.0f, 5.0f, 5.573f, 5.0f, 7.514f)
                lineTo(5.0f, 23.857f)
                curveTo(5.0f, 24.078f, 5.0f, 24.271f, 5.0f, 24.486f)
                curveTo(5.0f, 26.427f, 6.573f, 28.0f, 8.514f, 28.0f)
                horizontalLineTo(27.371f)
                verticalLineTo(26.0f)
                horizontalLineTo(8.514f)
                curveTo(7.678f, 26.0f, 7.0f, 25.322f, 7.0f, 24.486f)
                curveTo(7.0f, 23.649f, 7.678f, 22.971f, 8.514f, 22.971f)
                horizontalLineTo(25.486f)
                curveTo(26.385f, 22.971f, 27.114f, 22.242f, 27.114f, 21.343f)
                verticalLineTo(5.629f)
                curveTo(27.114f, 4.729f, 26.385f, 4.0f, 25.486f, 4.0f)
                horizontalLineTo(8.514f)
                close()
                moveTo(14.683f, 10.186f)
                curveTo(14.386f, 10.431f, 14.176f, 10.787f, 14.176f, 11.33f)
                horizontalLineTo(12.176f)
                curveTo(12.176f, 10.176f, 12.664f, 9.257f, 13.413f, 8.641f)
                curveTo(14.138f, 8.045f, 15.061f, 7.766f, 15.94f, 7.742f)
                curveTo(16.817f, 7.719f, 17.744f, 7.948f, 18.479f, 8.488f)
                curveTo(19.242f, 9.05f, 19.758f, 9.926f, 19.758f, 11.045f)
                curveTo(19.758f, 11.888f, 19.513f, 12.537f, 19.086f, 13.048f)
                curveTo(18.734f, 13.47f, 18.281f, 13.758f, 17.97f, 13.955f)
                lineTo(17.89f, 14.006f)
                curveTo(17.533f, 14.235f, 17.33f, 14.384f, 17.188f, 14.576f)
                curveTo(17.07f, 14.736f, 16.944f, 14.998f, 16.944f, 15.528f)
                horizontalLineTo(14.944f)
                curveTo(14.944f, 14.637f, 15.17f, 13.942f, 15.58f, 13.388f)
                curveTo(15.965f, 12.865f, 16.465f, 12.544f, 16.812f, 12.322f)
                curveTo(17.205f, 12.07f, 17.406f, 11.94f, 17.551f, 11.767f)
                curveTo(17.651f, 11.646f, 17.758f, 11.462f, 17.758f, 11.045f)
                curveTo(17.758f, 10.601f, 17.576f, 10.307f, 17.293f, 10.099f)
                curveTo(16.981f, 9.869f, 16.512f, 9.728f, 15.994f, 9.742f)
                curveTo(15.477f, 9.756f, 15.005f, 9.921f, 14.683f, 10.186f)
                close()
                moveTo(15.91f, 19.275f)
                curveTo(16.666f, 19.275f, 17.279f, 18.662f, 17.279f, 17.905f)
                curveTo(17.279f, 17.149f, 16.666f, 16.536f, 15.91f, 16.536f)
                curveTo(15.153f, 16.536f, 14.54f, 17.149f, 14.54f, 17.905f)
                curveTo(14.54f, 18.662f, 15.153f, 19.275f, 15.91f, 19.275f)
                close()
            }
        }
        .build()
        return _faqBookSolidLg!!
    }

private var _faqBookSolidLg: ImageVector? = null
