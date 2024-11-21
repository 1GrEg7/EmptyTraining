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

public val DsIcon.RepeatOutlineMd: ImageVector
    get() {
        if (_repeatOutlineMd != null) {
            return _repeatOutlineMd!!
        }
        _repeatOutlineMd = Builder(name = "RepeatOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.158f, 3.0f)
                    lineTo(20.893f, 8.851f)
                    lineTo(14.801f, 8.478f)
                    lineTo(16.356f, 6.522f)
                    curveTo(13.331f, 4.116f, 8.927f, 4.618f, 6.521f, 7.643f)
                    curveTo(5.318f, 9.156f, 4.841f, 11.013f, 5.044f, 12.792f)
                    lineTo(3.057f, 13.019f)
                    curveTo(2.796f, 10.731f, 3.409f, 8.343f, 4.955f, 6.398f)
                    curveTo(8.05f, 2.508f, 13.711f, 1.863f, 17.601f, 4.957f)
                    lineTo(19.158f, 3.0f)
                    close()
                    moveTo(4.84f, 21.0f)
                    lineTo(3.106f, 15.149f)
                    lineTo(9.198f, 15.522f)
                    lineTo(7.641f, 17.479f)
                    curveTo(7.641f, 17.479f, 7.641f, 17.479f, 7.641f, 17.479f)
                    curveTo(10.667f, 19.885f, 15.071f, 19.384f, 17.477f, 16.358f)
                    curveTo(18.681f, 14.845f, 19.157f, 12.988f, 18.954f, 11.208f)
                    lineTo(20.941f, 10.981f)
                    curveTo(21.202f, 13.27f, 20.59f, 15.658f, 19.042f, 17.603f)
                    curveTo(15.948f, 21.493f, 10.286f, 22.139f, 6.396f, 19.044f)
                    curveTo(6.396f, 19.044f, 6.396f, 19.044f, 6.396f, 19.044f)
                    lineTo(4.84f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _repeatOutlineMd!!
    }

private var _repeatOutlineMd: ImageVector? = null
