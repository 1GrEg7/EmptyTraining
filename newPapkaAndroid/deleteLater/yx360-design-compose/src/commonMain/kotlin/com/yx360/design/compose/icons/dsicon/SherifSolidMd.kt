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

public val DsIcon.SherifSolidMd: ImageVector
    get() {
        if (_sherifSolidMd != null) {
            return _sherifSolidMd!!
        }
        _sherifSolidMd = Builder(name = "SherifSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.636f, 3.727f)
                curveTo(15.884f, 4.292f, 17.57f, 4.52f, 19.412f, 4.125f)
                lineTo(20.313f, 5.825f)
                curveTo(19.968f, 6.156f, 19.181f, 7.377f, 19.429f, 8.822f)
                curveTo(19.452f, 8.954f, 19.508f, 9.154f, 19.581f, 9.41f)
                curveTo(20.029f, 10.995f, 21.09f, 14.744f, 18.574f, 18.025f)
                curveTo(16.831f, 20.298f, 13.785f, 21.708f, 11.84f, 22.422f)
                lineTo(11.5f, 22.548f)
                lineTo(11.158f, 22.425f)
                curveTo(9.243f, 21.739f, 6.159f, 20.298f, 4.416f, 18.025f)
                curveTo(1.9f, 14.744f, 2.961f, 10.995f, 3.41f, 9.41f)
                curveTo(3.482f, 9.154f, 3.539f, 8.954f, 3.562f, 8.822f)
                curveTo(3.81f, 7.377f, 3.023f, 6.156f, 2.678f, 5.825f)
                lineTo(3.579f, 4.125f)
                curveTo(5.421f, 4.52f, 7.116f, 4.293f, 8.375f, 3.726f)
                curveTo(9.655f, 3.149f, 10.371f, 2.285f, 10.533f, 1.465f)
                horizontalLineTo(12.495f)
                curveTo(12.657f, 2.29f, 13.369f, 3.152f, 14.636f, 3.727f)
                close()
                moveTo(11.495f, 7.039f)
                lineTo(13.071f, 9.808f)
                lineTo(16.192f, 10.451f)
                lineTo(14.045f, 12.805f)
                lineTo(14.398f, 15.972f)
                lineTo(11.495f, 14.658f)
                lineTo(8.593f, 15.972f)
                lineTo(8.945f, 12.805f)
                lineTo(6.799f, 10.451f)
                lineTo(9.919f, 9.808f)
                lineTo(11.495f, 7.039f)
                close()
            }
        }
        .build()
        return _sherifSolidMd!!
    }

private var _sherifSolidMd: ImageVector? = null
