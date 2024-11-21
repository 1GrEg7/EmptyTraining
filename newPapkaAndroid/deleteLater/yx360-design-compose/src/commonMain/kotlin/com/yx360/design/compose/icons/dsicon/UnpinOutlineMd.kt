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

public val DsIcon.UnpinOutlineMd: ImageVector
    get() {
        if (_unpinOutlineMd != null) {
            return _unpinOutlineMd!!
        }
        _unpinOutlineMd = Builder(name = "UnpinOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.608f, 10.258f)
                curveTo(17.108f, 10.553f, 17.582f, 10.898f, 18.021f, 11.288f)
                curveTo(19.68f, 12.763f, 20.74f, 14.796f, 21.0f, 17.0f)
                curveTo(21.0f, 17.439f, 20.362f, 17.847f, 19.276f, 18.178f)
                lineTo(18.043f, 16.437f)
                curveTo(18.353f, 16.365f, 18.611f, 16.293f, 18.82f, 16.225f)
                curveTo(18.463f, 14.902f, 17.728f, 13.703f, 16.693f, 12.783f)
                curveTo(16.35f, 12.479f, 15.981f, 12.21f, 15.592f, 11.981f)
                lineTo(14.764f, 11.492f)
                lineTo(13.816f, 5.856f)
                lineTo(16.0f, 4.764f)
                verticalLineTo(4.653f)
                curveTo(15.907f, 4.61f, 15.79f, 4.562f, 15.647f, 4.511f)
                curveTo(14.847f, 4.229f, 13.581f, 4.0f, 12.0f, 4.0f)
                curveTo(10.992f, 4.0f, 10.112f, 4.093f, 9.399f, 4.234f)
                lineTo(8.155f, 2.476f)
                curveTo(9.171f, 2.185f, 10.493f, 2.0f, 12.0f, 2.0f)
                curveTo(15.5f, 2.0f, 18.0f, 3.0f, 18.0f, 4.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.754f, 2.438f)
                lineTo(5.445f, 2.004f)
                lineTo(3.076f, 2.004f)
                lineTo(7.695f, 8.633f)
                lineTo(7.391f, 10.262f)
                curveTo(6.892f, 10.557f, 6.42f, 10.901f, 5.981f, 11.291f)
                curveTo(4.322f, 12.765f, 3.262f, 14.796f, 3.0f, 17.0f)
                curveTo(3.0f, 17.99f, 6.242f, 18.819f, 10.537f, 18.974f)
                lineTo(11.044f, 23.0f)
                horizontalLineTo(13.044f)
                lineTo(13.479f, 18.973f)
                curveTo(13.95f, 18.956f, 14.407f, 18.931f, 14.85f, 18.898f)
                lineTo(17.685f, 22.967f)
                lineTo(20.031f, 22.967f)
                lineTo(5.754f, 2.438f)
                close()
                moveTo(9.235f, 11.495f)
                lineTo(9.324f, 10.969f)
                lineTo(13.506f, 16.971f)
                curveTo(13.021f, 16.99f, 12.517f, 17.0f, 12.0f, 17.0f)
                curveTo(9.601f, 17.0f, 7.504f, 16.782f, 6.06f, 16.461f)
                curveTo(5.704f, 16.381f, 5.413f, 16.301f, 5.182f, 16.225f)
                curveTo(5.539f, 14.903f, 6.275f, 13.705f, 7.31f, 12.786f)
                curveTo(7.652f, 12.482f, 8.02f, 12.214f, 8.409f, 11.984f)
                lineTo(9.235f, 11.495f)
                close()
            }
        }
        .build()
        return _unpinOutlineMd!!
    }

private var _unpinOutlineMd: ImageVector? = null
