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

public val DsIcon.HistoryOutlineSm: ImageVector
    get() {
        if (_historyOutlineSm != null) {
            return _historyOutlineSm!!
        }
        _historyOutlineSm = Builder(name = "HistoryOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.507f, 13.0f)
                lineTo(3.101f, 13.0f)
                curveTo(3.076f, 12.975f, 3.051f, 12.95f, 3.026f, 12.925f)
                curveTo(2.376f, 12.268f, 1.857f, 11.485f, 1.507f, 10.615f)
                curveTo(0.902f, 9.113f, 0.836f, 7.448f, 1.321f, 5.902f)
                curveTo(1.807f, 4.357f, 2.813f, 3.028f, 4.168f, 2.142f)
                curveTo(5.523f, 1.255f, 7.144f, 0.866f, 8.754f, 1.04f)
                curveTo(10.364f, 1.215f, 11.864f, 1.942f, 12.998f, 3.098f)
                curveTo(14.132f, 4.254f, 14.83f, 5.768f, 14.973f, 7.381f)
                curveTo(15.116f, 8.994f, 14.695f, 10.607f, 13.782f, 11.945f)
                curveTo(13.254f, 12.719f, 12.58f, 13.373f, 11.804f, 13.876f)
                curveTo(11.24f, 14.241f, 10.622f, 14.526f, 9.967f, 14.718f)
                lineTo(9.405f, 12.797f)
                curveTo(10.514f, 12.472f, 11.477f, 11.772f, 12.129f, 10.817f)
                curveTo(12.781f, 9.862f, 13.082f, 8.71f, 12.979f, 7.558f)
                curveTo(12.877f, 6.406f, 12.379f, 5.325f, 11.569f, 4.499f)
                curveTo(10.759f, 3.674f, 9.688f, 3.154f, 8.538f, 3.03f)
                curveTo(7.389f, 2.905f, 6.231f, 3.183f, 5.263f, 3.816f)
                curveTo(4.295f, 4.449f, 3.577f, 5.399f, 3.231f, 6.502f)
                curveTo(2.884f, 7.605f, 2.931f, 8.795f, 3.363f, 9.868f)
                curveTo(3.648f, 10.575f, 4.089f, 11.203f, 4.648f, 11.708f)
                lineTo(4.648f, 10.0f)
                lineTo(6.648f, 10.0f)
                lineTo(6.648f, 15.0f)
                lineTo(1.507f, 15.0f)
                lineTo(1.507f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.003f, 5.005f)
                lineTo(7.223f, 5.0f)
                lineTo(7.0f, 8.984f)
                lineTo(9.831f, 11.0f)
                lineTo(11.0f, 10.053f)
                lineTo(9.226f, 8.238f)
                lineTo(9.003f, 5.005f)
                close()
            }
        }
        .build()
        return _historyOutlineSm!!
    }

private var _historyOutlineSm: ImageVector? = null
