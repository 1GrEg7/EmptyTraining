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

public val DsIcon.CloudOffOutlineLg: ImageVector
    get() {
        if (_cloudOffOutlineLg != null) {
            return _cloudOffOutlineLg!!
        }
        _cloudOffOutlineLg = Builder(name = "CloudOffOutlineLg", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.583f, 27.0f)
                lineTo(23.0f, 29.0f)
                horizontalLineTo(25.5f)
                lineTo(8.5f, 5.008f)
                horizontalLineTo(6.0f)
                lineTo(9.049f, 9.312f)
                curveTo(8.384f, 10.383f, 8.0f, 11.646f, 8.0f, 13.0f)
                curveTo(8.0f, 13.392f, 8.032f, 13.777f, 8.095f, 14.152f)
                curveTo(5.18f, 14.795f, 3.0f, 17.393f, 3.0f, 20.5f)
                curveTo(3.0f, 24.09f, 5.91f, 27.0f, 9.5f, 27.0f)
                horizontalLineTo(21.5f)
                curveTo(21.528f, 27.0f, 21.555f, 27.0f, 21.583f, 27.0f)
                close()
                moveTo(20.166f, 25.0f)
                lineTo(10.353f, 11.151f)
                curveTo(10.125f, 11.723f, 10.0f, 12.347f, 10.0f, 13.0f)
                curveTo(10.0f, 13.587f, 10.101f, 14.148f, 10.285f, 14.669f)
                lineTo(10.514f, 15.316f)
                lineTo(10.057f, 15.983f)
                lineTo(9.37f, 16.002f)
                curveTo(6.945f, 16.07f, 5.0f, 18.058f, 5.0f, 20.5f)
                curveTo(5.0f, 22.985f, 7.015f, 25.0f, 9.5f, 25.0f)
                horizontalLineTo(20.166f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 19.5f)
                curveTo(29.0f, 22.387f, 27.369f, 24.893f, 24.978f, 26.146f)
                lineTo(23.807f, 24.494f)
                curveTo(25.692f, 23.622f, 27.0f, 21.714f, 27.0f, 19.5f)
                curveTo(27.0f, 16.462f, 24.538f, 14.0f, 21.5f, 14.0f)
                curveTo(21.235f, 14.0f, 20.947f, 14.042f, 20.655f, 14.105f)
                lineTo(20.0f, 13.449f)
                verticalLineTo(13.0f)
                curveTo(20.0f, 10.239f, 17.761f, 8.0f, 15.0f, 8.0f)
                curveTo(14.117f, 8.0f, 13.287f, 8.229f, 12.567f, 8.631f)
                lineTo(11.406f, 6.992f)
                curveTo(12.457f, 6.362f, 13.686f, 6.0f, 15.0f, 6.0f)
                curveTo(18.531f, 6.0f, 21.451f, 8.614f, 21.931f, 12.012f)
                curveTo(25.872f, 12.235f, 29.0f, 15.502f, 29.0f, 19.5f)
                close()
            }
        }
        .build()
        return _cloudOffOutlineLg!!
    }

private var _cloudOffOutlineLg: ImageVector? = null
