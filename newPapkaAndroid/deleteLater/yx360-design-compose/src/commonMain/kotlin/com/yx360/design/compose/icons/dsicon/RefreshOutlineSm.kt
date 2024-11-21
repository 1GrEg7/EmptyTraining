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

public val DsIcon.RefreshOutlineSm: ImageVector
    get() {
        if (_refreshOutlineSm != null) {
            return _refreshOutlineSm!!
        }
        _refreshOutlineSm = Builder(name = "RefreshOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.101f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.648f)
                verticalLineTo(6.648f)
                horizontalLineTo(14.0f)
                horizontalLineTo(9.272f)
                verticalLineTo(4.648f)
                horizontalLineTo(11.708f)
                curveTo(11.203f, 4.089f, 10.576f, 3.648f, 9.868f, 3.363f)
                curveTo(8.795f, 2.931f, 7.606f, 2.884f, 6.502f, 3.231f)
                curveTo(5.399f, 3.577f, 4.45f, 4.295f, 3.817f, 5.263f)
                curveTo(3.184f, 6.231f, 2.906f, 7.389f, 3.03f, 8.538f)
                curveTo(3.155f, 9.688f, 3.674f, 10.759f, 4.5f, 11.569f)
                curveTo(5.325f, 12.379f, 6.406f, 12.877f, 7.558f, 12.979f)
                curveTo(8.71f, 13.082f, 9.862f, 12.781f, 10.818f, 12.129f)
                curveTo(11.773f, 11.477f, 12.473f, 10.514f, 12.798f, 9.405f)
                lineTo(12.799f, 9.405f)
                lineTo(14.717f, 9.966f)
                lineTo(14.718f, 9.967f)
                curveTo(14.526f, 10.622f, 14.242f, 11.24f, 13.876f, 11.804f)
                curveTo(13.374f, 12.58f, 12.72f, 13.254f, 11.945f, 13.782f)
                curveTo(10.608f, 14.695f, 8.995f, 15.116f, 7.382f, 14.973f)
                curveTo(5.769f, 14.83f, 4.255f, 14.132f, 3.099f, 12.998f)
                curveTo(1.942f, 11.864f, 1.215f, 10.364f, 1.041f, 8.754f)
                curveTo(0.866f, 7.144f, 1.256f, 5.523f, 2.142f, 4.168f)
                curveTo(3.029f, 2.813f, 4.358f, 1.807f, 5.903f, 1.322f)
                curveTo(7.448f, 0.836f, 9.114f, 0.902f, 10.616f, 1.507f)
                curveTo(11.485f, 1.857f, 12.269f, 2.376f, 12.925f, 3.026f)
                curveTo(12.95f, 3.051f, 12.975f, 3.076f, 13.0f, 3.101f)
                close()
            }
        }
        .build()
        return _refreshOutlineSm!!
    }

private var _refreshOutlineSm: ImageVector? = null
