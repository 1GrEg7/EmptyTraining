package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val DsIcon.TrashOutlineSm: ImageVector
    get() {
        if (_trashOutlineSm != null) {
            return _trashOutlineSm!!
        }
        _trashOutlineSm = Builder(name = "TrashOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.989f, 5.427f)
                lineTo(5.254f, 5.752f)
                lineTo(5.937f, 12.574f)
                lineTo(7.362f, 12.943f)
                lineTo(6.989f, 5.427f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.628f, 5.752f)
                lineTo(8.87f, 5.427f)
                lineTo(8.659f, 12.943f)
                lineTo(10.047f, 12.589f)
                lineTo(10.628f, 5.752f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.766f, 0.0f)
                curveTo(6.064f, 0.0f, 5.413f, 0.369f, 5.051f, 0.971f)
                lineTo(4.334f, 2.167f)
                curveTo(3.139f, 2.298f, 2.426f, 2.486f, 1.993f, 2.654f)
                curveTo(1.245f, 2.945f, 1.0f, 3.656f, 1.0f, 4.179f)
                verticalLineTo(5.752f)
                lineTo(2.194f, 6.573f)
                lineTo(3.139f, 13.486f)
                curveTo(3.251f, 14.303f, 3.742f, 15.201f, 4.738f, 15.533f)
                curveTo(5.448f, 15.771f, 6.519f, 16.0f, 8.0f, 16.0f)
                curveTo(9.481f, 16.0f, 10.552f, 15.771f, 11.262f, 15.533f)
                curveTo(12.258f, 15.201f, 12.749f, 14.303f, 12.861f, 13.486f)
                lineTo(13.806f, 6.573f)
                lineTo(15.0f, 5.752f)
                verticalLineTo(4.179f)
                curveTo(15.0f, 3.656f, 14.755f, 2.945f, 14.007f, 2.654f)
                curveTo(13.575f, 2.486f, 12.861f, 2.298f, 11.667f, 2.167f)
                lineTo(10.949f, 0.971f)
                curveTo(10.587f, 0.369f, 9.936f, 0.0f, 9.234f, 0.0f)
                horizontalLineTo(6.766f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(5.049f, 4.0f, 3.628f, 4.25f, 3.0f, 4.426f)
                verticalLineTo(4.7f)
                lineTo(4.056f, 5.427f)
                lineTo(5.121f, 13.215f)
                curveTo(5.14f, 13.355f, 5.186f, 13.461f, 5.234f, 13.528f)
                curveTo(5.279f, 13.59f, 5.324f, 13.62f, 5.372f, 13.636f)
                curveTo(5.872f, 13.804f, 6.729f, 14.0f, 8.0f, 14.0f)
                curveTo(9.271f, 14.0f, 10.127f, 13.804f, 10.628f, 13.636f)
                curveTo(10.676f, 13.62f, 10.721f, 13.59f, 10.766f, 13.528f)
                curveTo(10.814f, 13.461f, 10.86f, 13.355f, 10.879f, 13.215f)
                lineTo(11.944f, 5.427f)
                lineTo(13.0f, 4.7f)
                verticalLineTo(4.426f)
                curveTo(12.372f, 4.25f, 10.951f, 4.0f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _trashOutlineSm!!
    }

private var _trashOutlineSm: ImageVector? = null
