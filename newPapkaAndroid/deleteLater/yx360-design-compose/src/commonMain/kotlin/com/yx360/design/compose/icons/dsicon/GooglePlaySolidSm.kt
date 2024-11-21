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

public val DsIcon.GooglePlaySolidSm: ImageVector
    get() {
        if (_googlePlaySolidSm != null) {
            return _googlePlaySolidSm!!
        }
        _googlePlaySolidSm = Builder(name = "GooglePlaySolidSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.752f)
                lineTo(7.633f, 8.0f)
                lineTo(1.0f, 13.248f)
                verticalLineTo(2.752f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 1.477f)
                verticalLineTo(1.171f)
                curveTo(1.0f, 0.246f, 1.99f, -0.342f, 2.802f, 0.1f)
                lineTo(11.58f, 4.877f)
                lineTo(8.439f, 7.362f)
                lineTo(1.0f, 1.477f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.535f, 5.396f)
                lineTo(9.245f, 8.0f)
                lineTo(12.536f, 10.603f)
                lineTo(15.352f, 9.071f)
                curveTo(16.2f, 8.609f, 16.2f, 7.391f, 15.352f, 6.929f)
                lineTo(12.535f, 5.396f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.581f, 11.123f)
                lineTo(8.439f, 8.637f)
                lineTo(1.0f, 14.523f)
                verticalLineTo(14.829f)
                curveTo(1.0f, 15.754f, 1.99f, 16.342f, 2.802f, 15.9f)
                lineTo(11.581f, 11.123f)
                close()
            }
        }
        .build()
        return _googlePlaySolidSm!!
    }

private var _googlePlaySolidSm: ImageVector? = null
