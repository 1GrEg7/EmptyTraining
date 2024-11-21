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

public val DsIcon.MailNewSolidSm: ImageVector
    get() {
        if (_mailNewSolidSm != null) {
            return _mailNewSolidSm!!
        }
        _mailNewSolidSm = Builder(name = "MailNewSolidSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.75f)
                curveTo(16.0f, 4.269f, 14.769f, 5.5f, 13.25f, 5.5f)
                curveTo(11.731f, 5.5f, 10.5f, 4.269f, 10.5f, 2.75f)
                curveTo(10.5f, 1.231f, 11.731f, 0.0f, 13.25f, 0.0f)
                curveTo(14.769f, 0.0f, 16.0f, 1.231f, 16.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.666f, 1.5f)
                horizontalLineTo(4.0f)
                curveTo(1.791f, 1.5f, 0.0f, 3.291f, 0.0f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(0.0f, 12.709f, 1.791f, 14.5f, 4.0f, 14.5f)
                horizontalLineTo(12.0f)
                curveTo(14.209f, 14.5f, 16.0f, 12.709f, 16.0f, 10.5f)
                verticalLineTo(6.623f)
                curveTo(15.224f, 7.175f, 14.275f, 7.5f, 13.25f, 7.5f)
                curveTo(12.017f, 7.5f, 10.894f, 7.03f, 10.05f, 6.26f)
                lineTo(8.0f, 7.364f)
                lineTo(2.374f, 4.335f)
                curveTo(2.737f, 3.829f, 3.33f, 3.5f, 4.0f, 3.5f)
                horizontalLineTo(8.559f)
                curveTo(8.52f, 3.256f, 8.5f, 3.005f, 8.5f, 2.75f)
                curveTo(8.5f, 2.317f, 8.558f, 1.898f, 8.666f, 1.5f)
                close()
            }
        }
        .build()
        return _mailNewSolidSm!!
    }

private var _mailNewSolidSm: ImageVector? = null
