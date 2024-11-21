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

public val DsIcon.PinOutlineMd: ImageVector
    get() {
        if (_pinOutlineMd != null) {
            return _pinOutlineMd!!
        }
        _pinOutlineMd = Builder(name = "PinOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.608f, 10.258f)
                curveTo(17.108f, 10.553f, 17.582f, 10.898f, 18.021f, 11.288f)
                curveTo(19.68f, 12.763f, 20.74f, 14.796f, 21.0f, 17.0f)
                curveTo(21.0f, 17.989f, 17.766f, 18.816f, 13.479f, 18.973f)
                lineTo(13.044f, 23.0f)
                horizontalLineTo(11.044f)
                lineTo(10.537f, 18.974f)
                curveTo(6.242f, 18.819f, 3.0f, 17.99f, 3.0f, 17.0f)
                curveTo(3.262f, 14.796f, 4.322f, 12.765f, 5.981f, 11.291f)
                curveTo(6.42f, 10.901f, 6.892f, 10.557f, 7.391f, 10.262f)
                lineTo(8.0f, 7.0f)
                lineTo(6.0f, 6.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 3.0f, 8.5f, 2.0f, 12.0f, 2.0f)
                curveTo(15.5f, 2.0f, 18.0f, 3.0f, 18.0f, 4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(17.94f, 16.461f)
                curveTo(18.296f, 16.381f, 18.588f, 16.3f, 18.82f, 16.225f)
                curveTo(18.463f, 14.902f, 17.728f, 13.703f, 16.693f, 12.783f)
                curveTo(16.35f, 12.479f, 15.981f, 12.21f, 15.592f, 11.981f)
                lineTo(14.764f, 11.492f)
                lineTo(13.816f, 5.856f)
                lineTo(16.0f, 4.764f)
                verticalLineTo(4.653f)
                curveTo(15.907f, 4.61f, 15.79f, 4.562f, 15.647f, 4.511f)
                curveTo(14.847f, 4.229f, 13.581f, 4.0f, 12.0f, 4.0f)
                curveTo(10.419f, 4.0f, 9.153f, 4.229f, 8.353f, 4.511f)
                curveTo(8.21f, 4.562f, 8.093f, 4.61f, 8.0f, 4.653f)
                verticalLineTo(4.764f)
                lineTo(10.184f, 5.856f)
                lineTo(9.235f, 11.495f)
                lineTo(8.409f, 11.984f)
                curveTo(8.02f, 12.214f, 7.652f, 12.482f, 7.31f, 12.786f)
                curveTo(6.275f, 13.705f, 5.539f, 14.903f, 5.182f, 16.225f)
                curveTo(5.413f, 16.301f, 5.704f, 16.381f, 6.06f, 16.461f)
                curveTo(7.504f, 16.782f, 9.601f, 17.0f, 12.0f, 17.0f)
                curveTo(14.399f, 17.0f, 16.496f, 16.782f, 17.94f, 16.461f)
                close()
            }
        }
        .build()
        return _pinOutlineMd!!
    }

private var _pinOutlineMd: ImageVector? = null
