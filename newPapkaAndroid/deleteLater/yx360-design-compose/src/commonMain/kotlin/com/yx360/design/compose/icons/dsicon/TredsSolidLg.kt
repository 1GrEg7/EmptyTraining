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

public val DsIcon.TredsSolidLg: ImageVector
    get() {
        if (_tredsSolidLg != null) {
            return _tredsSolidLg!!
        }
        _tredsSolidLg = Builder(name = "TredsSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 14.684f)
                curveTo(4.0f, 8.228f, 9.367f, 5.0f, 16.0f, 5.0f)
                curveTo(22.633f, 5.0f, 28.0f, 8.228f, 28.0f, 14.684f)
                curveTo(28.0f, 21.14f, 22.633f, 24.368f, 16.0f, 24.368f)
                curveTo(15.703f, 24.368f, 15.409f, 24.362f, 15.118f, 24.349f)
                lineTo(11.8f, 28.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(23.316f)
                curveTo(6.412f, 21.889f, 4.0f, 19.012f, 4.0f, 14.684f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _tredsSolidLg!!
    }

private var _tredsSolidLg: ImageVector? = null
