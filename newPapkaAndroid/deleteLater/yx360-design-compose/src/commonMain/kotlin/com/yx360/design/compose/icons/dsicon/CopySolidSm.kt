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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.CopySolidSm: ImageVector
    get() {
        if (_copySolidSm != null) {
            return _copySolidSm!!
        }
        _copySolidSm = Builder(name = "CopySolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 14.0f)
                    lineTo(10.0f, 14.0f)
                    verticalLineTo(16.0f)
                    lineTo(4.0f, 16.0f)
                    curveTo(1.791f, 16.0f, -0.0f, 14.209f, 0.0f, 12.0f)
                    lineTo(0.0f, 5.0f)
                    horizontalLineTo(2.0f)
                    lineTo(2.0f, 12.0f)
                    curveTo(2.0f, 13.104f, 2.895f, 14.0f, 4.0f, 14.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 0.0f)
                    curveTo(5.343f, 0.0f, 4.0f, 1.343f, 4.0f, 3.0f)
                    lineTo(4.0f, 9.0f)
                    curveTo(4.0f, 10.657f, 5.343f, 12.0f, 7.0f, 12.0f)
                    lineTo(13.0f, 12.0f)
                    curveTo(14.657f, 12.0f, 16.0f, 10.657f, 16.0f, 9.0f)
                    verticalLineTo(3.0f)
                    curveTo(16.0f, 1.343f, 14.657f, 0.0f, 13.0f, 0.0f)
                    lineTo(7.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _copySolidSm!!
    }

private var _copySolidSm: ImageVector? = null
