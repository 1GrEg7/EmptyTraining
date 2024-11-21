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

public val DsIcon.ProfileOutlineSm: ImageVector
    get() {
        if (_profileOutlineSm != null) {
            return _profileOutlineSm!!
        }
        _profileOutlineSm = Builder(name = "ProfileOutlineSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 4.75f)
                curveTo(11.5f, 7.0f, 10.0f, 9.0f, 8.0f, 9.0f)
                curveTo(6.0f, 9.0f, 4.5f, 7.0f, 4.5f, 4.75f)
                curveTo(4.5f, 2.5f, 6.0f, 1.0f, 8.0f, 1.0f)
                curveTo(10.0f, 1.0f, 11.5f, 2.5f, 11.5f, 4.75f)
                close()
                moveTo(9.5f, 4.75f)
                curveTo(9.5f, 5.446f, 9.264f, 6.062f, 8.938f, 6.469f)
                curveTo(8.621f, 6.866f, 8.286f, 7.0f, 8.0f, 7.0f)
                curveTo(7.714f, 7.0f, 7.379f, 6.866f, 7.062f, 6.469f)
                curveTo(6.736f, 6.062f, 6.5f, 5.446f, 6.5f, 4.75f)
                curveTo(6.5f, 4.077f, 6.718f, 3.653f, 6.948f, 3.411f)
                curveTo(7.176f, 3.172f, 7.518f, 3.0f, 8.0f, 3.0f)
                curveTo(8.482f, 3.0f, 8.824f, 3.172f, 9.052f, 3.411f)
                curveTo(9.282f, 3.653f, 9.5f, 4.077f, 9.5f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 13.0f)
                curveTo(2.0f, 10.777f, 4.003f, 9.5f, 8.0f, 9.5f)
                curveTo(11.998f, 9.5f, 14.0f, 10.777f, 14.0f, 13.0f)
                curveTo(14.0f, 13.983f, 12.5f, 15.0f, 8.0f, 15.0f)
                curveTo(3.5f, 15.0f, 2.0f, 13.777f, 2.0f, 13.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(5.941f, 13.0f, 4.745f, 12.721f, 4.137f, 12.469f)
                curveTo(4.218f, 12.351f, 4.342f, 12.244f, 4.526f, 12.134f)
                curveTo(5.079f, 11.804f, 6.158f, 11.5f, 8.0f, 11.5f)
                curveTo(9.842f, 11.5f, 10.921f, 11.804f, 11.474f, 12.134f)
                curveTo(11.689f, 12.262f, 11.822f, 12.387f, 11.9f, 12.529f)
                curveTo(11.294f, 12.762f, 10.096f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(12.242f, 12.362f)
                curveTo(12.242f, 12.362f, 12.236f, 12.368f, 12.22f, 12.379f)
                curveTo(12.233f, 12.367f, 12.242f, 12.362f, 12.242f, 12.362f)
                close()
            }
        }
        .build()
        return _profileOutlineSm!!
    }

private var _profileOutlineSm: ImageVector? = null
