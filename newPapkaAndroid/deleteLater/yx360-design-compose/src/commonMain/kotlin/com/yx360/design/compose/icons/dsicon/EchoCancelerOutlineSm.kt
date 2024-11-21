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

public val DsIcon.EchoCancelerOutlineSm: ImageVector
    get() {
        if (_echoCancelerOutlineSm != null) {
            return _echoCancelerOutlineSm!!
        }
        _echoCancelerOutlineSm = Builder(name = "EchoCancelerOutlineSm", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.041f)
                curveTo(2.0f, 9.687f, 2.668f, 11.176f, 3.747f, 12.253f)
                lineTo(2.333f, 13.668f)
                curveTo(0.892f, 12.228f, 0.0f, 10.239f, 0.0f, 8.041f)
                curveTo(0.0f, 5.823f, 0.908f, 3.816f, 2.374f, 2.374f)
                lineTo(3.788f, 3.788f)
                curveTo(2.685f, 4.869f, 2.0f, 6.375f, 2.0f, 8.041f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.164f, 3.836f)
                curveTo(13.239f, 4.913f, 13.904f, 6.399f, 13.904f, 8.041f)
                curveTo(13.904f, 9.662f, 13.256f, 11.132f, 12.205f, 12.205f)
                lineTo(13.619f, 13.619f)
                curveTo(15.032f, 12.184f, 15.904f, 10.214f, 15.904f, 8.041f)
                curveTo(15.904f, 5.847f, 15.015f, 3.861f, 13.578f, 2.422f)
                lineTo(12.164f, 3.836f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.34f, 10.446f)
                lineTo(7.567f, 7.013f)
                lineTo(9.318f, 11.979f)
                lineTo(11.017f, 11.974f)
                lineTo(12.893f, 6.565f)
                horizontalLineTo(10.988f)
                lineTo(10.16f, 8.953f)
                lineTo(8.421f, 4.024f)
                lineTo(6.725f, 4.021f)
                lineTo(5.439f, 7.618f)
                lineTo(5.012f, 6.565f)
                horizontalLineTo(3.069f)
                lineTo(4.658f, 10.481f)
                lineTo(6.34f, 10.446f)
                close()
            }
        }
        .build()
        return _echoCancelerOutlineSm!!
    }

private var _echoCancelerOutlineSm: ImageVector? = null
