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

public val DsIcon.MentionSolidLg: ImageVector
    get() {
        if (_mentionSolidLg != null) {
            return _mentionSolidLg!!
        }
        _mentionSolidLg = Builder(name = "MentionSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.477f, 15.964f)
                curveTo(17.477f, 16.625f, 17.583f, 17.222f, 17.772f, 17.748f)
                curveTo(17.294f, 18.261f, 16.613f, 18.58f, 15.858f, 18.58f)
                curveTo(14.413f, 18.58f, 13.241f, 17.409f, 13.241f, 15.964f)
                curveTo(13.241f, 14.519f, 14.413f, 13.347f, 15.858f, 13.347f)
                curveTo(16.105f, 13.347f, 16.541f, 13.462f, 16.915f, 13.725f)
                curveTo(17.264f, 13.971f, 17.451f, 14.263f, 17.477f, 14.584f)
                verticalLineTo(15.964f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.968f, 27.927f)
                curveTo(22.575f, 27.927f, 27.931f, 22.571f, 27.931f, 15.964f)
                curveTo(27.931f, 9.356f, 22.575f, 4.0f, 15.968f, 4.0f)
                curveTo(9.36f, 4.0f, 4.004f, 9.356f, 4.004f, 15.964f)
                curveTo(4.004f, 22.571f, 9.36f, 27.927f, 15.968f, 27.927f)
                close()
                moveTo(8.43f, 15.964f)
                curveTo(8.43f, 11.785f, 11.818f, 8.398f, 15.996f, 8.398f)
                curveTo(20.174f, 8.398f, 23.562f, 11.785f, 23.562f, 15.964f)
                curveTo(23.562f, 16.924f, 23.258f, 17.538f, 22.897f, 17.906f)
                curveTo(22.529f, 18.28f, 22.036f, 18.468f, 21.53f, 18.462f)
                curveTo(20.571f, 18.452f, 19.477f, 17.729f, 19.477f, 15.964f)
                verticalLineTo(14.522f)
                lineTo(19.475f, 14.493f)
                curveTo(19.412f, 13.38f, 18.761f, 12.579f, 18.066f, 12.09f)
                curveTo(17.386f, 11.611f, 16.554f, 11.347f, 15.858f, 11.347f)
                curveTo(13.308f, 11.347f, 11.241f, 13.414f, 11.241f, 15.964f)
                curveTo(11.241f, 18.513f, 13.308f, 20.58f, 15.858f, 20.58f)
                curveTo(17.021f, 20.58f, 18.082f, 20.15f, 18.893f, 19.442f)
                curveTo(19.618f, 20.098f, 20.549f, 20.452f, 21.508f, 20.462f)
                curveTo(22.524f, 20.473f, 23.552f, 20.094f, 24.325f, 19.307f)
                curveTo(25.105f, 18.512f, 25.562f, 17.369f, 25.562f, 15.964f)
                curveTo(25.562f, 10.681f, 21.279f, 6.398f, 15.996f, 6.398f)
                curveTo(10.713f, 6.398f, 6.43f, 10.681f, 6.43f, 15.964f)
                curveTo(6.43f, 21.247f, 10.713f, 25.529f, 15.996f, 25.529f)
                curveTo(17.312f, 25.529f, 18.568f, 25.263f, 19.712f, 24.781f)
                lineTo(18.935f, 22.938f)
                curveTo(18.032f, 23.319f, 17.04f, 23.529f, 15.996f, 23.529f)
                curveTo(11.818f, 23.529f, 8.43f, 20.142f, 8.43f, 15.964f)
                close()
            }
        }
        .build()
        return _mentionSolidLg!!
    }

private var _mentionSolidLg: ImageVector? = null
