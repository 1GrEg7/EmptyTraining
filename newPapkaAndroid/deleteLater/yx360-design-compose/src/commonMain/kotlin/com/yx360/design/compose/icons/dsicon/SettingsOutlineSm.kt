package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val DsIcon.SettingsOutlineSm: ImageVector
    get() {
        if (_settingsOutlineSm != null) {
            return _settingsOutlineSm!!
        }
        _settingsOutlineSm = Builder(name = "SettingsOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.0f, 8.0f)
                    curveTo(11.0f, 9.657f, 9.657f, 11.0f, 8.0f, 11.0f)
                    curveTo(6.343f, 11.0f, 5.0f, 9.657f, 5.0f, 8.0f)
                    curveTo(5.0f, 6.343f, 6.343f, 5.0f, 8.0f, 5.0f)
                    curveTo(9.657f, 5.0f, 11.0f, 6.343f, 11.0f, 8.0f)
                    close()
                    moveTo(9.25f, 8.0f)
                    curveTo(9.25f, 8.69f, 8.69f, 9.25f, 8.0f, 9.25f)
                    curveTo(7.31f, 9.25f, 6.75f, 8.69f, 6.75f, 8.0f)
                    curveTo(6.75f, 7.31f, 7.31f, 6.75f, 8.0f, 6.75f)
                    curveTo(8.69f, 6.75f, 9.25f, 7.31f, 9.25f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.702f, 0.0f)
                    horizontalLineTo(6.298f)
                    lineTo(5.129f, 2.212f)
                    lineTo(4.304f, 2.692f)
                    lineTo(1.767f, 2.558f)
                    lineTo(0.0f, 5.46f)
                    lineTo(1.41f, 7.584f)
                    verticalLineTo(8.473f)
                    lineTo(0.086f, 10.492f)
                    lineTo(1.728f, 13.527f)
                    lineTo(4.358f, 13.376f)
                    lineTo(5.217f, 13.827f)
                    lineTo(6.255f, 16.0f)
                    horizontalLineTo(9.745f)
                    lineTo(10.783f, 13.827f)
                    lineTo(11.642f, 13.376f)
                    lineTo(14.272f, 13.527f)
                    lineTo(15.914f, 10.492f)
                    lineTo(14.59f, 8.473f)
                    verticalLineTo(7.584f)
                    lineTo(16.0f, 5.46f)
                    lineTo(14.233f, 2.558f)
                    lineTo(11.696f, 2.692f)
                    lineTo(10.871f, 2.212f)
                    lineTo(9.702f, 0.0f)
                    close()
                    moveTo(7.461f, 2.0f)
                    horizontalLineTo(8.539f)
                    lineTo(9.42f, 3.667f)
                    lineTo(11.227f, 4.719f)
                    lineTo(13.185f, 4.616f)
                    lineTo(13.67f, 5.413f)
                    lineTo(12.637f, 6.969f)
                    verticalLineTo(9.083f)
                    lineTo(13.627f, 10.592f)
                    lineTo(13.158f, 11.46f)
                    lineTo(11.223f, 11.348f)
                    lineTo(9.314f, 12.35f)
                    lineTo(8.526f, 14.0f)
                    horizontalLineTo(7.474f)
                    lineTo(6.686f, 12.35f)
                    lineTo(4.777f, 11.348f)
                    lineTo(2.842f, 11.46f)
                    lineTo(2.373f, 10.592f)
                    lineTo(3.363f, 9.083f)
                    verticalLineTo(6.969f)
                    lineTo(2.33f, 5.413f)
                    lineTo(2.815f, 4.616f)
                    lineTo(4.773f, 4.719f)
                    lineTo(6.58f, 3.667f)
                    lineTo(7.461f, 2.0f)
                    close()
                }
            }
        }
        .build()
        return _settingsOutlineSm!!
    }

private var _settingsOutlineSm: ImageVector? = null
