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

public val DsIcon.ShopTrolleySolidMd: ImageVector
    get() {
        if (_shopTrolleySolidMd != null) {
            return _shopTrolleySolidMd!!
        }
        _shopTrolleySolidMd = Builder(name = "ShopTrolleySolidMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.0f)
                horizontalLineTo(5.281f)
                lineTo(6.45f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.888f)
                curveTo(22.0f, 8.957f, 22.0f, 9.824f, 21.938f, 10.53f)
                curveTo(21.875f, 11.262f, 21.74f, 11.905f, 21.422f, 12.507f)
                curveTo(21.097f, 13.123f, 20.647f, 13.664f, 20.1f, 14.096f)
                curveTo(19.566f, 14.518f, 18.959f, 14.767f, 18.251f, 14.964f)
                curveTo(17.567f, 15.153f, 16.715f, 15.311f, 15.664f, 15.505f)
                lineTo(6.758f, 17.154f)
                lineTo(3.719f, 5.0f)
                lineTo(1.0f, 4.75f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                curveTo(18.0f, 21.105f, 17.105f, 22.0f, 16.0f, 22.0f)
                curveTo(14.895f, 22.0f, 14.0f, 21.105f, 14.0f, 20.0f)
                curveTo(14.0f, 18.895f, 14.895f, 18.0f, 16.0f, 18.0f)
                curveTo(17.105f, 18.0f, 18.0f, 18.895f, 18.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(6.105f, 22.0f, 7.0f, 21.105f, 7.0f, 20.0f)
                curveTo(7.0f, 18.895f, 6.105f, 18.0f, 5.0f, 18.0f)
                curveTo(3.895f, 18.0f, 3.0f, 18.895f, 3.0f, 20.0f)
                curveTo(3.0f, 21.105f, 3.895f, 22.0f, 5.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shopTrolleySolidMd!!
    }

private var _shopTrolleySolidMd: ImageVector? = null
