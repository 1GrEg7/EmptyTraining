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

public val DsIcon.QrOutlineSm: ImageVector
    get() {
        if (_qrOutlineSm != null) {
            return _qrOutlineSm!!
        }
        _qrOutlineSm = Builder(name = "QrOutlineSm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 7.0f)
                curveTo(14.552f, 7.0f, 15.0f, 6.552f, 15.0f, 6.0f)
                curveTo(15.0f, 5.448f, 14.552f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                curveTo(11.0f, 1.448f, 10.552f, 1.0f, 10.0f, 1.0f)
                curveTo(9.448f, 1.0f, 9.0f, 1.448f, 9.0f, 2.0f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 6.328f, 9.672f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(2.0f, 9.0f)
                curveTo(1.448f, 9.0f, 1.0f, 9.448f, 1.0f, 10.0f)
                curveTo(1.0f, 10.552f, 1.448f, 11.0f, 2.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 14.552f, 5.448f, 15.0f, 6.0f, 15.0f)
                curveTo(6.552f, 15.0f, 7.0f, 14.552f, 7.0f, 14.0f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 9.672f, 6.328f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(2.2f, 12.6f)
                curveTo(2.863f, 12.6f, 3.4f, 13.137f, 3.4f, 13.8f)
                curveTo(3.4f, 14.463f, 2.863f, 15.0f, 2.2f, 15.0f)
                curveTo(1.537f, 15.0f, 1.0f, 14.463f, 1.0f, 13.8f)
                curveTo(1.0f, 13.137f, 1.537f, 12.6f, 2.2f, 12.6f)
                close()
                moveTo(15.0f, 2.2f)
                curveTo(15.0f, 1.537f, 14.463f, 1.0f, 13.8f, 1.0f)
                curveTo(13.137f, 1.0f, 12.6f, 1.537f, 12.6f, 2.2f)
                curveTo(12.6f, 2.863f, 13.137f, 3.4f, 13.8f, 3.4f)
                curveTo(14.463f, 3.4f, 15.0f, 2.863f, 15.0f, 2.2f)
                close()
                moveTo(7.0f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(7.0f, 6.328f, 6.328f, 7.0f, 5.5f, 7.0f)
                horizontalLineTo(2.5f)
                curveTo(1.672f, 7.0f, 1.0f, 6.328f, 1.0f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(1.0f, 1.672f, 1.672f, 1.0f, 2.5f, 1.0f)
                horizontalLineTo(5.5f)
                curveTo(6.328f, 1.0f, 7.0f, 1.672f, 7.0f, 2.5f)
                close()
                moveTo(15.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 9.672f, 14.328f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(9.672f, 9.0f, 9.0f, 9.672f, 9.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(9.0f, 14.328f, 9.672f, 15.0f, 10.5f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 15.0f, 15.0f, 14.328f, 15.0f, 13.5f)
                close()
            }
        }
        .build()
        return _qrOutlineSm!!
    }

private var _qrOutlineSm: ImageVector? = null
