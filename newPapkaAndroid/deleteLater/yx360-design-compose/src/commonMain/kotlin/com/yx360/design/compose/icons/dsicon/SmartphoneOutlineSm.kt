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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.SmartphoneOutlineSm: ImageVector
    get() {
        if (_smartphoneOutlineSm != null) {
            return _smartphoneOutlineSm!!
        }
        _smartphoneOutlineSm = Builder(name = "SmartphoneOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 0.0f)
                horizontalLineTo(6.5f)
                curveTo(4.291f, 0.0f, 2.5f, 1.791f, 2.5f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(2.5f, 14.209f, 4.291f, 16.0f, 6.5f, 16.0f)
                horizontalLineTo(9.5f)
                curveTo(11.709f, 16.0f, 13.5f, 14.209f, 13.5f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(13.5f, 1.791f, 11.709f, 0.0f, 9.5f, 0.0f)
                close()
                moveTo(4.5f, 4.0f)
                curveTo(4.5f, 2.895f, 5.395f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(10.605f, 2.0f, 11.5f, 2.895f, 11.5f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(11.5f, 13.105f, 10.605f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(6.5f)
                curveTo(5.395f, 14.0f, 4.5f, 13.105f, 4.5f, 12.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _smartphoneOutlineSm!!
    }

private var _smartphoneOutlineSm: ImageVector? = null
