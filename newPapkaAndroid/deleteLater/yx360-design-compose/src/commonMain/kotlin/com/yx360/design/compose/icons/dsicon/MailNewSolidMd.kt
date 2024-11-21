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

public val DsIcon.MailNewSolidMd: ImageVector
    get() {
        if (_mailNewSolidMd != null) {
            return _mailNewSolidMd!!
        }
        _mailNewSolidMd = Builder(name = "MailNewSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 5.5f)
                curveTo(23.0f, 7.157f, 21.657f, 8.5f, 20.0f, 8.5f)
                curveTo(18.343f, 8.5f, 17.0f, 7.157f, 17.0f, 5.5f)
                curveTo(17.0f, 3.843f, 18.343f, 2.5f, 20.0f, 2.5f)
                curveTo(21.657f, 2.5f, 23.0f, 3.843f, 23.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.229f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.136f, 4.0f, 5.204f, 4.0f, 4.469f, 4.304f)
                curveTo(3.489f, 4.71f, 2.71f, 5.489f, 2.304f, 6.469f)
                curveTo(2.0f, 7.204f, 2.0f, 8.136f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.864f, 2.0f, 16.796f, 2.304f, 17.531f)
                curveTo(2.71f, 18.511f, 3.489f, 19.289f, 4.469f, 19.695f)
                curveTo(5.204f, 20.0f, 6.136f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(17.864f, 20.0f, 18.796f, 20.0f, 19.531f, 19.695f)
                curveTo(20.511f, 19.289f, 21.289f, 18.511f, 21.695f, 17.531f)
                curveTo(22.0f, 16.796f, 22.0f, 15.864f, 22.0f, 14.0f)
                verticalLineTo(10.084f)
                curveTo(21.388f, 10.352f, 20.711f, 10.5f, 20.0f, 10.5f)
                curveTo(18.923f, 10.5f, 17.926f, 10.16f, 17.109f, 9.58f)
                lineTo(12.0f, 12.5f)
                lineTo(4.033f, 7.948f)
                curveTo(4.065f, 7.492f, 4.118f, 7.318f, 4.152f, 7.235f)
                curveTo(4.355f, 6.745f, 4.745f, 6.355f, 5.235f, 6.152f)
                curveTo(5.318f, 6.118f, 5.492f, 6.065f, 5.948f, 6.033f)
                curveTo(6.421f, 6.001f, 7.041f, 6.0f, 8.0f, 6.0f)
                lineTo(15.025f, 6.0f)
                curveTo(15.008f, 5.836f, 15.0f, 5.669f, 15.0f, 5.5f)
                curveTo(15.0f, 4.977f, 15.08f, 4.474f, 15.229f, 4.0f)
                close()
            }
        }
        .build()
        return _mailNewSolidMd!!
    }

private var _mailNewSolidMd: ImageVector? = null
