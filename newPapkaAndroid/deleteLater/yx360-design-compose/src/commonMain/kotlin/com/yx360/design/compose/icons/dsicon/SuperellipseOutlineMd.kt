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

public val DsIcon.SuperellipseOutlineMd: ImageVector
    get() {
        if (_superellipseOutlineMd != null) {
            return _superellipseOutlineMd!!
        }
        _superellipseOutlineMd = Builder(name = "SuperellipseOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.801f, 19.908f)
                curveTo(8.798f, 19.998f, 10.094f, 20.0f, 12.0f, 20.0f)
                curveTo(13.906f, 20.0f, 15.202f, 19.998f, 16.199f, 19.908f)
                curveTo(17.169f, 19.82f, 17.659f, 19.661f, 18.0f, 19.464f)
                curveTo(18.608f, 19.113f, 19.113f, 18.608f, 19.464f, 18.0f)
                curveTo(19.661f, 17.659f, 19.82f, 17.169f, 19.908f, 16.199f)
                curveTo(19.998f, 15.202f, 20.0f, 13.906f, 20.0f, 12.0f)
                curveTo(20.0f, 10.094f, 19.998f, 8.798f, 19.908f, 7.801f)
                curveTo(19.82f, 6.831f, 19.661f, 6.341f, 19.464f, 6.0f)
                curveTo(19.113f, 5.392f, 18.608f, 4.887f, 18.0f, 4.536f)
                curveTo(17.659f, 4.339f, 17.169f, 4.18f, 16.199f, 4.092f)
                curveTo(15.202f, 4.002f, 13.906f, 4.0f, 12.0f, 4.0f)
                curveTo(10.094f, 4.0f, 8.798f, 4.002f, 7.801f, 4.092f)
                curveTo(6.831f, 4.18f, 6.341f, 4.339f, 6.0f, 4.536f)
                curveTo(5.392f, 4.887f, 4.887f, 5.392f, 4.536f, 6.0f)
                curveTo(4.339f, 6.341f, 4.18f, 6.831f, 4.092f, 7.801f)
                curveTo(4.002f, 8.798f, 4.0f, 10.094f, 4.0f, 12.0f)
                curveTo(4.0f, 13.906f, 4.002f, 15.202f, 4.092f, 16.199f)
                curveTo(4.18f, 17.169f, 4.339f, 17.659f, 4.536f, 18.0f)
                curveTo(4.887f, 18.608f, 5.392f, 19.113f, 6.0f, 19.464f)
                curveTo(6.341f, 19.661f, 6.831f, 19.82f, 7.801f, 19.908f)
                close()
                moveTo(2.804f, 5.0f)
                curveTo(2.0f, 6.392f, 2.0f, 8.262f, 2.0f, 12.0f)
                curveTo(2.0f, 15.738f, 2.0f, 17.608f, 2.804f, 19.0f)
                curveTo(3.33f, 19.912f, 4.088f, 20.67f, 5.0f, 21.196f)
                curveTo(6.392f, 22.0f, 8.262f, 22.0f, 12.0f, 22.0f)
                curveTo(15.738f, 22.0f, 17.608f, 22.0f, 19.0f, 21.196f)
                curveTo(19.912f, 20.67f, 20.67f, 19.912f, 21.196f, 19.0f)
                curveTo(22.0f, 17.608f, 22.0f, 15.738f, 22.0f, 12.0f)
                curveTo(22.0f, 8.262f, 22.0f, 6.392f, 21.196f, 5.0f)
                curveTo(20.67f, 4.088f, 19.912f, 3.33f, 19.0f, 2.804f)
                curveTo(17.608f, 2.0f, 15.738f, 2.0f, 12.0f, 2.0f)
                curveTo(8.262f, 2.0f, 6.392f, 2.0f, 5.0f, 2.804f)
                curveTo(4.088f, 3.33f, 3.33f, 4.088f, 2.804f, 5.0f)
                close()
            }
        }
        .build()
        return _superellipseOutlineMd!!
    }

private var _superellipseOutlineMd: ImageVector? = null
