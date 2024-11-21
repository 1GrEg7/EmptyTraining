package com.yx360.design.compose.icons.dsicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val DsIcon.FaqOutlineSm: ImageVector
    get() {
        if (_faqOutlineSm != null) {
            return _faqOutlineSm!!
        }
        _faqOutlineSm = Builder(name = "FaqOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 14.0f)
                    curveTo(11.314f, 14.0f, 14.0f, 11.314f, 14.0f, 8.0f)
                    curveTo(14.0f, 4.686f, 11.314f, 2.0f, 8.0f, 2.0f)
                    curveTo(4.686f, 2.0f, 2.0f, 4.686f, 2.0f, 8.0f)
                    curveTo(2.0f, 11.314f, 4.686f, 14.0f, 8.0f, 14.0f)
                    close()
                    moveTo(8.0f, 16.0f)
                    curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                    curveTo(16.0f, 3.582f, 12.418f, 0.0f, 8.0f, 0.0f)
                    curveTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f)
                    curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 11.5f)
                    curveTo(9.0f, 12.052f, 8.552f, 12.5f, 8.0f, 12.5f)
                    curveTo(7.448f, 12.5f, 7.0f, 12.052f, 7.0f, 11.5f)
                    curveTo(7.0f, 10.948f, 7.448f, 10.5f, 8.0f, 10.5f)
                    curveTo(8.552f, 10.5f, 9.0f, 10.948f, 9.0f, 11.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.981f, 6.287f)
                    horizontalLineTo(6.996f)
                    curveTo(6.996f, 5.849f, 7.348f, 5.395f, 8.07f, 5.395f)
                    curveTo(8.793f, 5.395f, 9.049f, 5.812f, 8.998f, 6.287f)
                    curveTo(8.898f, 7.213f, 6.996f, 7.438f, 6.996f, 9.476f)
                    horizontalLineTo(8.998f)
                    curveTo(8.998f, 8.007f, 11.008f, 8.02f, 11.008f, 6.287f)
                    curveTo(11.008f, 4.981f, 10.083f, 3.508f, 8.188f, 3.508f)
                    curveTo(5.479f, 3.508f, 4.914f, 5.276f, 4.981f, 6.287f)
                    close()
                }
            }
        }
        .build()
        return _faqOutlineSm!!
    }

private var _faqOutlineSm: ImageVector? = null
