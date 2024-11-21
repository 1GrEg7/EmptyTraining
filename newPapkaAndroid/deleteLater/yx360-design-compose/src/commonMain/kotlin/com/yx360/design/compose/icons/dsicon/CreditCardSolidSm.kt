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

public val DsIcon.CreditCardSolidSm: ImageVector
    get() {
        if (_creditCardSolidSm != null) {
            return _creditCardSolidSm!!
        }
        _creditCardSolidSm = Builder(name = "CreditCardSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 7.1f)
                curveTo(0.0f, 5.136f, 0.0f, 4.154f, 0.442f, 3.432f)
                curveTo(0.689f, 3.029f, 1.029f, 2.689f, 1.433f, 2.442f)
                curveTo(2.154f, 2.0f, 3.136f, 2.0f, 5.1f, 2.0f)
                horizontalLineTo(10.9f)
                curveTo(12.864f, 2.0f, 13.846f, 2.0f, 14.568f, 2.442f)
                curveTo(14.971f, 2.689f, 15.311f, 3.029f, 15.558f, 3.432f)
                curveTo(16.0f, 4.154f, 16.0f, 5.136f, 16.0f, 7.1f)
                verticalLineTo(8.9f)
                curveTo(16.0f, 10.864f, 16.0f, 11.846f, 15.558f, 12.568f)
                curveTo(15.311f, 12.971f, 14.971f, 13.311f, 14.568f, 13.558f)
                curveTo(13.846f, 14.0f, 12.864f, 14.0f, 10.9f, 14.0f)
                horizontalLineTo(5.1f)
                curveTo(3.136f, 14.0f, 2.154f, 14.0f, 1.433f, 13.558f)
                curveTo(1.029f, 13.311f, 0.689f, 12.971f, 0.442f, 12.568f)
                curveTo(0.0f, 11.846f, 0.0f, 10.864f, 0.0f, 8.9f)
                verticalLineTo(7.1f)
                close()
                moveTo(2.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _creditCardSolidSm!!
    }

private var _creditCardSolidSm: ImageVector? = null
