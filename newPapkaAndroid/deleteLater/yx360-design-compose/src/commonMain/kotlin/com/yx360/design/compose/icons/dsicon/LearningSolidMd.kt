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

public val DsIcon.LearningSolidMd: ImageVector
    get() {
        if (_learningSolidMd != null) {
            return _learningSolidMd!!
        }
        _learningSolidMd = Builder(name = "LearningSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.774f)
                lineTo(12.0f, 4.229f)
                lineTo(24.0f, 7.774f)
                lineTo(24.0f, 9.748f)
                lineTo(12.0f, 13.647f)
                lineTo(2.124f, 10.438f)
                lineTo(2.911f, 16.104f)
                horizontalLineTo(0.031f)
                lineTo(0.688f, 9.971f)
                lineTo(0.0f, 9.748f)
                verticalLineTo(7.774f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.274f)
                lineTo(18.699f, 13.097f)
                curveTo(18.715f, 13.244f, 18.73f, 13.394f, 18.745f, 13.547f)
                curveTo(18.867f, 14.771f, 19.0f, 16.437f, 19.0f, 17.0f)
                curveTo(19.0f, 19.0f, 15.0f, 20.0f, 12.0f, 20.0f)
                curveTo(9.0f, 20.0f, 5.0f, 19.0f, 5.0f, 17.0f)
                curveTo(5.0f, 16.437f, 5.133f, 14.771f, 5.255f, 13.547f)
                curveTo(5.27f, 13.394f, 5.285f, 13.244f, 5.3f, 13.097f)
                lineTo(12.0f, 15.274f)
                close()
            }
        }
        .build()
        return _learningSolidMd!!
    }

private var _learningSolidMd: ImageVector? = null
