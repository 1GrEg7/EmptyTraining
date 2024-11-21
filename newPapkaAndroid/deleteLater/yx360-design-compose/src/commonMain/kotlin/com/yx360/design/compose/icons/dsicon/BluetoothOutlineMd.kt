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

public val DsIcon.BluetoothOutlineMd: ImageVector
    get() {
        if (_bluetoothOutlineMd != null) {
            return _bluetoothOutlineMd!!
        }
        _bluetoothOutlineMd = Builder(name = "BluetoothOutlineMd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.776f, 23.0f)
                horizontalLineTo(12.44f)
                lineTo(19.0f, 17.0f)
                lineTo(13.454f, 12.0f)
                lineTo(19.0f, 7.0f)
                lineTo(12.345f, 1.0f)
                horizontalLineTo(10.776f)
                verticalLineTo(9.586f)
                lineTo(6.569f, 5.793f)
                lineTo(5.0f, 7.207f)
                lineTo(10.316f, 12.0f)
                lineTo(5.0f, 16.793f)
                lineTo(6.569f, 18.207f)
                lineTo(10.776f, 14.414f)
                verticalLineTo(23.0f)
                close()
                moveTo(12.994f, 9.586f)
                lineTo(15.863f, 7.0f)
                lineTo(12.994f, 4.414f)
                verticalLineTo(9.586f)
                close()
                moveTo(12.994f, 14.414f)
                verticalLineTo(19.586f)
                lineTo(15.863f, 17.0f)
                lineTo(12.994f, 14.414f)
                close()
            }
        }
        .build()
        return _bluetoothOutlineMd!!
    }

private var _bluetoothOutlineMd: ImageVector? = null
