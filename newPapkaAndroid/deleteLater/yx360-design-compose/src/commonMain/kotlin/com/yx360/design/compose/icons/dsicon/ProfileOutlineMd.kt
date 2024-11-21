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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.ProfileOutlineMd: ImageVector
    get() {
        if (_profileOutlineMd != null) {
            return _profileOutlineMd!!
        }
        _profileOutlineMd = Builder(name = "ProfileOutlineMd", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.016f, 18.651f)
                curveTo(5.24f, 18.808f, 5.642f, 19.017f, 6.267f, 19.225f)
                curveTo(7.642f, 19.683f, 9.668f, 20.0f, 12.0f, 20.0f)
                curveTo(14.332f, 20.0f, 16.358f, 19.683f, 17.733f, 19.225f)
                curveTo(18.358f, 19.017f, 18.76f, 18.808f, 18.984f, 18.651f)
                curveTo(18.946f, 18.258f, 18.843f, 17.976f, 18.717f, 17.762f)
                curveTo(18.556f, 17.492f, 18.285f, 17.211f, 17.796f, 16.946f)
                curveTo(16.745f, 16.377f, 14.907f, 16.0f, 12.0f, 16.0f)
                curveTo(9.093f, 16.0f, 7.255f, 16.377f, 6.204f, 16.946f)
                curveTo(5.715f, 17.211f, 5.444f, 17.492f, 5.283f, 17.762f)
                curveTo(5.157f, 17.976f, 5.054f, 18.258f, 5.016f, 18.651f)
                close()
                moveTo(3.0f, 19.0f)
                curveTo(3.0f, 15.5f, 6.004f, 14.0f, 12.0f, 14.0f)
                curveTo(17.996f, 14.0f, 21.0f, 15.5f, 21.0f, 19.0f)
                curveTo(21.0f, 20.66f, 16.972f, 22.0f, 12.0f, 22.0f)
                curveTo(7.028f, 22.0f, 3.0f, 20.66f, 3.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 11.004f)
                curveTo(13.188f, 11.004f, 15.0f, 9.719f, 15.0f, 7.004f)
                curveTo(15.0f, 5.558f, 14.482f, 4.74f, 13.933f, 4.26f)
                curveTo(13.325f, 3.727f, 12.553f, 3.504f, 12.0f, 3.504f)
                curveTo(11.447f, 3.504f, 10.675f, 3.727f, 10.067f, 4.26f)
                curveTo(9.518f, 4.74f, 9.0f, 5.558f, 9.0f, 7.004f)
                curveTo(9.0f, 9.719f, 10.812f, 11.004f, 12.0f, 11.004f)
                close()
                moveTo(17.0f, 7.004f)
                curveTo(17.0f, 10.604f, 14.5f, 13.004f, 12.0f, 13.004f)
                curveTo(9.5f, 13.004f, 7.0f, 10.604f, 7.0f, 7.004f)
                curveTo(7.0f, 3.004f, 10.0f, 1.504f, 12.0f, 1.504f)
                curveTo(14.0f, 1.504f, 17.0f, 3.004f, 17.0f, 7.004f)
                close()
            }
        }
        .build()
        return _profileOutlineMd!!
    }

private var _profileOutlineMd: ImageVector? = null
