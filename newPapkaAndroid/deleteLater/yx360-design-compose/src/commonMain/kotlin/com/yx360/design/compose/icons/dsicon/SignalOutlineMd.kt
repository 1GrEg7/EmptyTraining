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

public val DsIcon.SignalOutlineMd: ImageVector
    get() {
        if (_signalOutlineMd != null) {
            return _signalOutlineMd!!
        }
        _signalOutlineMd = Builder(name = "SignalOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.002f)
                curveTo(3.0f, 15.411f, 4.895f, 18.378f, 7.69f, 19.905f)
                lineTo(6.732f, 21.661f)
                curveTo(3.316f, 19.794f, 1.0f, 16.169f, 1.0f, 12.002f)
                curveTo(1.0f, 7.836f, 3.316f, 4.211f, 6.732f, 2.344f)
                lineTo(7.69f, 4.1f)
                curveTo(4.895f, 5.627f, 3.0f, 8.594f, 3.0f, 12.002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.002f)
                curveTo(21.0f, 15.411f, 19.105f, 18.378f, 16.31f, 19.905f)
                lineTo(17.268f, 21.661f)
                curveTo(20.684f, 19.794f, 23.0f, 16.169f, 23.0f, 12.002f)
                curveTo(23.0f, 7.836f, 20.684f, 4.211f, 17.268f, 2.344f)
                lineTo(16.31f, 4.1f)
                curveTo(19.105f, 5.627f, 21.0f, 8.594f, 21.0f, 12.002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.647f, 18.149f)
                curveTo(6.474f, 16.961f, 5.0f, 14.654f, 5.0f, 12.002f)
                curveTo(5.0f, 9.351f, 6.474f, 7.044f, 8.647f, 5.856f)
                lineTo(9.605f, 7.612f)
                curveTo(8.053f, 8.461f, 7.0f, 10.109f, 7.0f, 12.002f)
                curveTo(7.0f, 13.896f, 8.053f, 15.544f, 9.605f, 16.393f)
                lineTo(8.647f, 18.149f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.395f, 16.393f)
                lineTo(15.353f, 18.149f)
                curveTo(17.526f, 16.961f, 19.0f, 14.654f, 19.0f, 12.002f)
                curveTo(19.0f, 9.351f, 17.526f, 7.044f, 15.353f, 5.856f)
                lineTo(14.395f, 7.612f)
                curveTo(15.947f, 8.461f, 17.0f, 10.109f, 17.0f, 12.002f)
                curveTo(17.0f, 13.896f, 15.947f, 15.544f, 14.395f, 16.393f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 14.502f)
                curveTo(13.383f, 14.502f, 14.502f, 13.383f, 14.502f, 12.002f)
                curveTo(14.502f, 10.622f, 13.383f, 9.502f, 12.002f, 9.502f)
                curveTo(10.621f, 9.502f, 9.502f, 10.622f, 9.502f, 12.002f)
                curveTo(9.502f, 13.383f, 10.621f, 14.502f, 12.002f, 14.502f)
                close()
            }
        }
        .build()
        return _signalOutlineMd!!
    }

private var _signalOutlineMd: ImageVector? = null
