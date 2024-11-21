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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.icons.DsIcon

public val DsIcon.RestrictOutlineXs: ImageVector
    get() {
        if (_restrictOutlineXs != null) {
            return _restrictOutlineXs!!
        }
        _restrictOutlineXs = Builder(name = "RestrictOutlineXs", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.0f, 9.562f)
                    lineTo(6.0f, 7.0f)
                    lineTo(2.0f, 9.562f)
                    lineTo(2.0f, 12.0f)
                    lineTo(6.0f, 9.5f)
                    lineTo(10.0f, 12.0f)
                    lineTo(10.0f, 9.562f)
                    close()
                    moveTo(2.0f, 2.438f)
                    lineTo(6.0f, 5.0f)
                    lineTo(10.0f, 2.438f)
                    lineTo(10.0f, -0.0f)
                    lineTo(6.0f, 2.5f)
                    lineTo(2.0f, -0.0f)
                    lineTo(2.0f, 2.438f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 5.0f)
                    lineTo(2.0f, 2.438f)
                    lineTo(2.0f, -0.0f)
                    lineTo(6.0f, 2.5f)
                    lineTo(10.0f, -0.0f)
                    lineTo(10.0f, 2.438f)
                    lineTo(6.0f, 5.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 7.0f)
                    lineTo(10.0f, 9.562f)
                    lineTo(10.0f, 12.0f)
                    lineTo(6.0f, 9.5f)
                    lineTo(2.0f, 12.0f)
                    lineTo(2.0f, 9.562f)
                    lineTo(6.0f, 7.0f)
                    close()
                }
            }
        }
        .build()
        return _restrictOutlineXs!!
    }

private var _restrictOutlineXs: ImageVector? = null
