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

public val DsIcon.CameraOutlineMd: ImageVector
    get() {
        if (_cameraOutlineMd != null) {
            return _cameraOutlineMd!!
        }
        _cameraOutlineMd = Builder(name = "CameraOutlineMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 10.0f)
                curveTo(1.0f, 8.136f, 1.0f, 7.204f, 1.304f, 6.469f)
                curveTo(1.71f, 5.489f, 2.489f, 4.71f, 3.469f, 4.304f)
                curveTo(4.204f, 4.0f, 5.136f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(12.864f, 4.0f, 13.796f, 4.0f, 14.531f, 4.304f)
                curveTo(15.511f, 4.71f, 16.289f, 5.489f, 16.695f, 6.469f)
                curveTo(16.925f, 7.024f, 16.982f, 7.69f, 16.996f, 8.784f)
                curveTo(17.037f, 8.759f, 17.079f, 8.734f, 17.122f, 8.709f)
                lineTo(17.245f, 8.637f)
                curveTo(18.098f, 8.135f, 18.826f, 7.707f, 19.43f, 7.454f)
                curveTo(20.05f, 7.194f, 20.784f, 7.01f, 21.522f, 7.341f)
                curveTo(21.672f, 7.408f, 21.815f, 7.49f, 21.948f, 7.585f)
                curveTo(22.608f, 8.053f, 22.822f, 8.779f, 22.912f, 9.446f)
                curveTo(23.0f, 10.095f, 23.0f, 10.939f, 23.0f, 11.928f)
                verticalLineTo(12.072f)
                curveTo(23.0f, 13.061f, 23.0f, 13.905f, 22.912f, 14.554f)
                curveTo(22.822f, 15.221f, 22.608f, 15.947f, 21.948f, 16.415f)
                curveTo(21.815f, 16.51f, 21.672f, 16.592f, 21.522f, 16.659f)
                curveTo(20.784f, 16.99f, 20.05f, 16.806f, 19.43f, 16.546f)
                curveTo(18.826f, 16.293f, 18.098f, 15.865f, 17.245f, 15.363f)
                lineTo(17.122f, 15.291f)
                curveTo(17.079f, 15.266f, 17.037f, 15.241f, 16.996f, 15.216f)
                curveTo(16.982f, 16.31f, 16.925f, 16.976f, 16.695f, 17.531f)
                curveTo(16.289f, 18.511f, 15.511f, 19.289f, 14.531f, 19.695f)
                curveTo(13.796f, 20.0f, 12.864f, 20.0f, 11.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(5.136f, 20.0f, 4.204f, 20.0f, 3.469f, 19.695f)
                curveTo(2.489f, 19.289f, 1.71f, 18.511f, 1.304f, 17.531f)
                curveTo(1.0f, 16.796f, 1.0f, 15.864f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(11.959f, 6.0f, 12.578f, 6.001f, 13.052f, 6.033f)
                curveTo(13.509f, 6.065f, 13.682f, 6.118f, 13.765f, 6.152f)
                curveTo(14.255f, 6.355f, 14.645f, 6.745f, 14.848f, 7.235f)
                curveTo(14.882f, 7.318f, 14.936f, 7.492f, 14.967f, 7.948f)
                curveTo(14.999f, 8.421f, 15.0f, 9.041f, 15.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 14.959f, 14.999f, 15.578f, 14.967f, 16.052f)
                curveTo(14.936f, 16.508f, 14.882f, 16.682f, 14.848f, 16.765f)
                curveTo(14.645f, 17.255f, 14.255f, 17.645f, 13.765f, 17.848f)
                curveTo(13.682f, 17.882f, 13.509f, 17.935f, 13.052f, 17.967f)
                curveTo(12.578f, 17.999f, 11.959f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.041f, 18.0f, 5.421f, 17.999f, 4.948f, 17.967f)
                curveTo(4.492f, 17.935f, 4.318f, 17.882f, 4.235f, 17.848f)
                curveTo(3.745f, 17.645f, 3.355f, 17.255f, 3.152f, 16.765f)
                curveTo(3.118f, 16.682f, 3.065f, 16.508f, 3.033f, 16.052f)
                curveTo(3.001f, 15.578f, 3.0f, 14.959f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 9.041f, 3.001f, 8.421f, 3.033f, 7.948f)
                curveTo(3.065f, 7.492f, 3.118f, 7.318f, 3.152f, 7.235f)
                curveTo(3.355f, 6.745f, 3.745f, 6.355f, 4.235f, 6.152f)
                curveTo(4.318f, 6.118f, 4.492f, 6.065f, 4.948f, 6.033f)
                curveTo(5.421f, 6.001f, 6.041f, 6.0f, 7.0f, 6.0f)
                close()
                moveTo(17.0f, 12.886f)
                curveTo(17.32f, 13.086f, 17.714f, 13.319f, 18.197f, 13.603f)
                curveTo(19.129f, 14.151f, 19.739f, 14.507f, 20.202f, 14.701f)
                curveTo(20.425f, 14.795f, 20.56f, 14.827f, 20.638f, 14.835f)
                curveTo(20.674f, 14.838f, 20.691f, 14.837f, 20.697f, 14.836f)
                curveTo(20.701f, 14.835f, 20.702f, 14.835f, 20.704f, 14.834f)
                curveTo(20.734f, 14.82f, 20.763f, 14.804f, 20.79f, 14.785f)
                curveTo(20.792f, 14.783f, 20.793f, 14.783f, 20.795f, 14.779f)
                curveTo(20.799f, 14.775f, 20.809f, 14.761f, 20.824f, 14.729f)
                curveTo(20.857f, 14.657f, 20.898f, 14.525f, 20.93f, 14.285f)
                curveTo(20.998f, 13.787f, 21.0f, 13.081f, 21.0f, 12.0f)
                curveTo(21.0f, 10.919f, 20.998f, 10.213f, 20.93f, 9.715f)
                curveTo(20.898f, 9.475f, 20.857f, 9.343f, 20.824f, 9.271f)
                curveTo(20.809f, 9.239f, 20.799f, 9.225f, 20.795f, 9.221f)
                curveTo(20.793f, 9.217f, 20.792f, 9.217f, 20.79f, 9.215f)
                curveTo(20.763f, 9.196f, 20.734f, 9.18f, 20.704f, 9.166f)
                curveTo(20.702f, 9.165f, 20.701f, 9.165f, 20.697f, 9.164f)
                curveTo(20.691f, 9.163f, 20.674f, 9.162f, 20.638f, 9.165f)
                curveTo(20.56f, 9.173f, 20.425f, 9.205f, 20.202f, 9.299f)
                curveTo(19.739f, 9.493f, 19.129f, 9.849f, 18.197f, 10.397f)
                curveTo(17.714f, 10.681f, 17.32f, 10.914f, 17.0f, 11.114f)
                verticalLineTo(12.886f)
                close()
            }
        }
        .build()
        return _cameraOutlineMd!!
    }

private var _cameraOutlineMd: ImageVector? = null
