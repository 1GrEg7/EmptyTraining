package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.PlusCircleSolidSm: ImageVector
    get() {
        if (_plusCircleSolidSm != null) {
            return _plusCircleSolidSm!!
        }
        _plusCircleSolidSm = Builder(name = "PlusCircleSolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 16.0f)
                    curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                    curveTo(16.0f, 3.582f, 12.418f, 0.0f, 8.0f, 0.0f)
                    curveTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f)
                    curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f)
                    close()
                    moveTo(9.0f, 4.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _plusCircleSolidSm!!
    }

private var _plusCircleSolidSm: ImageVector? = null
