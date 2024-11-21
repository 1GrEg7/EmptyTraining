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

public val DsIcon.BugSolidSm: ImageVector
    get() {
        if (_bugSolidSm != null) {
            return _bugSolidSm!!
        }
        _bugSolidSm = Builder(name = "BugSolidSm", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.648f, 2.048f)
                curveTo(11.92f, 2.556f, 12.08f, 3.098f, 12.173f, 3.604f)
                curveTo(12.028f, 3.703f, 11.805f, 3.824f, 11.493f, 3.944f)
                curveTo(10.743f, 4.235f, 9.57f, 4.489f, 7.987f, 4.489f)
                curveTo(6.406f, 4.489f, 5.263f, 4.235f, 4.524f, 3.946f)
                curveTo(4.168f, 3.806f, 3.92f, 3.664f, 3.764f, 3.549f)
                curveTo(3.859f, 3.054f, 4.022f, 2.533f, 4.291f, 2.043f)
                curveTo(4.593f, 1.492f, 5.036f, 0.969f, 5.67f, 0.588f)
                curveTo(6.305f, 0.206f, 7.076f, 0.0f, 7.981f, 0.0f)
                curveTo(8.886f, 0.0f, 9.655f, 0.205f, 10.286f, 0.589f)
                curveTo(10.917f, 0.972f, 11.352f, 1.497f, 11.648f, 2.048f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.113f, 5.541f)
                curveTo(12.409f, 5.427f, 12.677f, 5.3f, 12.911f, 5.163f)
                curveTo(13.074f, 5.323f, 13.222f, 5.495f, 13.355f, 5.675f)
                lineTo(15.148f, 4.841f)
                lineTo(16.0f, 6.666f)
                lineTo(14.166f, 7.52f)
                curveTo(14.28f, 8.037f, 14.325f, 8.577f, 14.31f, 9.115f)
                horizontalLineTo(15.975f)
                verticalLineTo(11.13f)
                horizontalLineTo(13.982f)
                curveTo(13.967f, 11.177f, 13.953f, 11.225f, 13.937f, 11.272f)
                curveTo(13.815f, 11.651f, 13.66f, 12.028f, 13.476f, 12.395f)
                lineTo(15.203f, 13.843f)
                lineTo(13.907f, 15.386f)
                lineTo(12.329f, 14.064f)
                curveTo(11.282f, 15.204f, 9.831f, 16.0f, 8.018f, 16.0f)
                curveTo(6.197f, 16.0f, 4.74f, 15.196f, 3.691f, 14.046f)
                lineTo(2.093f, 15.386f)
                lineTo(0.796f, 13.843f)
                lineTo(2.55f, 12.373f)
                curveTo(2.37f, 12.013f, 2.219f, 11.643f, 2.099f, 11.272f)
                curveTo(2.084f, 11.225f, 2.069f, 11.177f, 2.055f, 11.13f)
                horizontalLineTo(0.024f)
                verticalLineTo(9.115f)
                horizontalLineTo(1.727f)
                curveTo(1.712f, 8.582f, 1.756f, 8.048f, 1.867f, 7.536f)
                lineTo(0.0f, 6.666f)
                lineTo(0.852f, 4.841f)
                lineTo(2.673f, 5.688f)
                curveTo(2.806f, 5.505f, 2.954f, 5.332f, 3.119f, 5.17f)
                curveTo(3.348f, 5.302f, 3.608f, 5.426f, 3.898f, 5.54f)
                curveTo(4.702f, 5.855f, 5.774f, 6.102f, 7.119f, 6.178f)
                verticalLineTo(10.926f)
                horizontalLineTo(8.834f)
                verticalLineTo(6.179f)
                curveTo(10.195f, 6.105f, 11.295f, 5.857f, 12.113f, 5.541f)
                close()
            }
        }
        .build()
        return _bugSolidSm!!
    }

private var _bugSolidSm: ImageVector? = null
