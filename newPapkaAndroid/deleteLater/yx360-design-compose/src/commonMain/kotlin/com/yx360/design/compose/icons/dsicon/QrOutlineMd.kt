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

public val DsIcon.QrOutlineMd: ImageVector
    get() {
        if (_qrOutlineMd != null) {
            return _qrOutlineMd!!
        }
        _qrOutlineMd = Builder(name = "QrOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 7.505f)
                curveTo(21.0f, 8.333f, 20.328f, 9.005f, 19.5f, 9.005f)
                horizontalLineTo(16.5f)
                curveTo(15.672f, 9.005f, 15.0f, 8.333f, 15.0f, 7.505f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.672f, 15.672f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 3.0f, 21.0f, 3.672f, 21.0f, 4.5f)
                verticalLineTo(7.505f)
                close()
                moveTo(9.0f, 7.5f)
                verticalLineTo(4.504f)
                curveTo(9.0f, 3.676f, 8.329f, 3.005f, 7.502f, 3.004f)
                lineTo(4.502f, 3.001f)
                curveTo(3.673f, 3.0f, 3.001f, 3.67f, 3.0f, 4.501f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 8.328f, 3.672f, 9.0f, 4.5f, 9.0f)
                horizontalLineTo(7.5f)
                curveTo(8.328f, 9.0f, 9.0f, 8.328f, 9.0f, 7.5f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineTo(5.001f)
                lineTo(7.0f, 5.003f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.498f, 15.004f)
                lineTo(7.498f, 15.001f)
                curveTo(8.328f, 15.001f, 9.0f, 15.672f, 9.0f, 16.501f)
                verticalLineTo(19.5f)
                curveTo(9.0f, 20.328f, 8.328f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 21.0f, 3.0f, 20.328f, 3.0f, 19.5f)
                verticalLineTo(16.504f)
                curveTo(3.0f, 15.676f, 3.671f, 15.005f, 4.498f, 15.004f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.003f)
                lineTo(7.0f, 17.001f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 5.0f)
                verticalLineTo(7.005f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveTo(19.0f, 15.448f, 19.448f, 15.0f, 20.0f, 15.0f)
                curveTo(20.552f, 15.0f, 21.0f, 15.448f, 21.0f, 16.0f)
                verticalLineTo(19.501f)
                curveTo(21.0f, 20.328f, 20.33f, 21.0f, 19.502f, 21.001f)
                lineTo(16.001f, 21.004f)
                curveTo(15.449f, 21.005f, 15.001f, 20.558f, 15.0f, 20.006f)
                curveTo(14.999f, 19.453f, 15.447f, 19.005f, 15.999f, 19.004f)
                lineTo(19.0f, 19.001f)
                verticalLineTo(16.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 11.0f, 3.0f, 11.448f, 3.0f, 12.0f)
                curveTo(3.0f, 12.552f, 3.448f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                curveTo(11.448f, 3.0f, 11.0f, 3.448f, 11.0f, 4.0f)
                close()
                moveTo(13.0f, 20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                curveTo(11.448f, 21.0f, 11.0f, 20.552f, 11.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 15.448f, 11.448f, 15.0f, 12.0f, 15.0f)
                curveTo(12.552f, 15.0f, 13.0f, 15.448f, 13.0f, 16.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(16.552f, 17.0f, 17.0f, 16.552f, 17.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 13.0f, 21.0f, 12.552f, 21.0f, 12.0f)
                curveTo(21.0f, 11.448f, 20.552f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(15.448f, 11.0f, 15.0f, 11.448f, 15.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.552f, 15.448f, 17.0f, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _qrOutlineMd!!
    }

private var _qrOutlineMd: ImageVector? = null
