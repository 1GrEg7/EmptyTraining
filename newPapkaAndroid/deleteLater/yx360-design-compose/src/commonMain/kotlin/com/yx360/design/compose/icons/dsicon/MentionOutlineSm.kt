package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.MentionOutlineSm: ImageVector
    get() {
        if (_mentionOutlineSm != null) {
            return _mentionOutlineSm!!
        }
        _mentionOutlineSm = Builder(name = "MentionOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 2.051f)
                    curveTo(4.725f, 2.051f, 2.07f, 4.706f, 2.07f, 7.98f)
                    curveTo(2.07f, 11.255f, 4.725f, 13.91f, 8.0f, 13.91f)
                    curveTo(8.818f, 13.91f, 9.596f, 13.744f, 10.302f, 13.446f)
                    lineTo(11.08f, 15.289f)
                    curveTo(10.132f, 15.689f, 9.09f, 15.91f, 8.0f, 15.91f)
                    curveTo(3.62f, 15.91f, 0.07f, 12.36f, 0.07f, 7.98f)
                    curveTo(0.07f, 3.601f, 3.62f, 0.051f, 8.0f, 0.051f)
                    curveTo(12.379f, 0.051f, 15.929f, 3.601f, 15.929f, 7.98f)
                    curveTo(15.929f, 9.16f, 15.544f, 10.135f, 14.873f, 10.819f)
                    curveTo(14.209f, 11.495f, 13.327f, 11.82f, 12.457f, 11.811f)
                    curveTo(11.687f, 11.802f, 10.941f, 11.536f, 10.342f, 11.045f)
                    curveTo(9.67f, 11.583f, 8.817f, 11.906f, 7.888f, 11.906f)
                    curveTo(5.72f, 11.906f, 3.962f, 10.149f, 3.962f, 7.98f)
                    curveTo(3.962f, 5.812f, 5.72f, 4.055f, 7.888f, 4.055f)
                    curveTo(8.493f, 4.055f, 9.205f, 4.283f, 9.784f, 4.69f)
                    curveTo(10.379f, 5.109f, 10.949f, 5.805f, 11.005f, 6.78f)
                    lineTo(11.007f, 6.808f)
                    verticalLineTo(7.98f)
                    curveTo(11.007f, 9.306f, 11.809f, 9.803f, 12.478f, 9.811f)
                    curveTo(12.839f, 9.815f, 13.187f, 9.681f, 13.446f, 9.417f)
                    curveTo(13.698f, 9.161f, 13.929f, 8.715f, 13.929f, 7.98f)
                    curveTo(13.929f, 4.706f, 11.274f, 2.051f, 8.0f, 2.051f)
                    close()
                    moveTo(9.218f, 9.374f)
                    curveTo(9.082f, 8.956f, 9.006f, 8.491f, 9.006f, 7.98f)
                    verticalLineTo(6.873f)
                    curveTo(8.989f, 6.687f, 8.88f, 6.5f, 8.633f, 6.326f)
                    curveTo(8.36f, 6.134f, 8.045f, 6.055f, 7.888f, 6.055f)
                    curveTo(6.824f, 6.055f, 5.962f, 6.917f, 5.962f, 7.98f)
                    curveTo(5.962f, 9.044f, 6.824f, 9.906f, 7.888f, 9.906f)
                    curveTo(8.403f, 9.906f, 8.871f, 9.704f, 9.218f, 9.374f)
                    close()
                }
            }
        }
        .build()
        return _mentionOutlineSm!!
    }

private var _mentionOutlineSm: ImageVector? = null
