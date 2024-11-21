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

public val DsIcon.FaqSolidSm: ImageVector
    get() {
        if (_faqSolidSm != null) {
            return _faqSolidSm!!
        }
        _faqSolidSm = Builder(name = "FaqSolidSm", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 8.0f)
                    curveTo(16.0f, 12.418f, 12.418f, 16.0f, 8.0f, 16.0f)
                    curveTo(3.582f, 16.0f, 0.0f, 12.418f, 0.0f, 8.0f)
                    curveTo(0.0f, 3.582f, 3.582f, 0.0f, 8.0f, 0.0f)
                    curveTo(12.418f, 0.0f, 16.0f, 3.582f, 16.0f, 8.0f)
                    close()
                    moveTo(9.25f, 11.742f)
                    curveTo(9.25f, 12.432f, 8.69f, 12.992f, 8.0f, 12.992f)
                    curveTo(7.31f, 12.992f, 6.75f, 12.432f, 6.75f, 11.742f)
                    curveTo(6.75f, 11.052f, 7.31f, 10.492f, 8.0f, 10.492f)
                    curveTo(8.69f, 10.492f, 9.25f, 11.052f, 9.25f, 11.742f)
                    close()
                    moveTo(6.996f, 5.779f)
                    horizontalLineTo(4.981f)
                    curveTo(4.914f, 4.769f, 5.479f, 3.0f, 8.188f, 3.0f)
                    curveTo(10.083f, 3.0f, 11.008f, 4.474f, 11.008f, 5.779f)
                    curveTo(11.008f, 6.682f, 10.463f, 7.111f, 9.941f, 7.522f)
                    curveTo(9.46f, 7.901f, 8.998f, 8.264f, 8.998f, 8.968f)
                    horizontalLineTo(6.996f)
                    curveTo(6.996f, 7.729f, 7.699f, 7.16f, 8.273f, 6.696f)
                    curveTo(8.643f, 6.397f, 8.959f, 6.142f, 8.998f, 5.779f)
                    curveTo(9.049f, 5.304f, 8.793f, 4.887f, 8.07f, 4.887f)
                    curveTo(7.348f, 4.887f, 6.996f, 5.341f, 6.996f, 5.779f)
                    close()
                }
            }
        }
        .build()
        return _faqSolidSm!!
    }

private var _faqSolidSm: ImageVector? = null
