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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ReadOutlineSm: ImageVector
    get() {
        if (_readOutlineSm != null) {
            return _readOutlineSm!!
        }
        _readOutlineSm = Builder(name = "ReadOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.029f, 12.685f)
                lineTo(15.935f, 5.432f)
                lineTo(14.487f, 4.053f)
                lineTo(7.581f, 11.306f)
                lineTo(9.029f, 12.685f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.012f, 12.691f)
                lineTo(11.909f, 5.431f)
                lineTo(10.459f, 4.053f)
                lineTo(4.975f, 9.826f)
                lineTo(1.465f, 6.316f)
                lineTo(0.051f, 7.73f)
                lineTo(5.012f, 12.691f)
                close()
            }
        }
        .build()
        return _readOutlineSm!!
    }

private var _readOutlineSm: ImageVector? = null
