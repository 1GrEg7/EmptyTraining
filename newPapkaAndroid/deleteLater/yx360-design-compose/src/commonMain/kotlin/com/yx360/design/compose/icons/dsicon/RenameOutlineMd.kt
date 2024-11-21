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

public val DsIcon.RenameOutlineMd: ImageVector
    get() {
        if (_renameOutlineMd != null) {
            return _renameOutlineMd!!
        }
        _renameOutlineMd = Builder(name = "RenameOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(3.0f, 19.0f)
                horizontalLineTo(5.0f)
                lineTo(6.714f, 15.0f)
                horizontalLineTo(13.286f)
                lineTo(15.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(7.571f, 13.0f)
                lineTo(10.0f, 7.333f)
                lineTo(12.429f, 13.0f)
                horizontalLineTo(7.571f)
                close()
            }
        }
        .build()
        return _renameOutlineMd!!
    }

private var _renameOutlineMd: ImageVector? = null
