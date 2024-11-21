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

public val DsIcon.BugSolidMd: ImageVector
    get() {
        if (_bugSolidMd != null) {
            return _bugSolidMd!!
        }
        _bugSolidMd = Builder(name = "BugSolidMd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.383f, 2.697f)
                curveTo(10.089f, 2.251f, 10.96f, 2.0f, 12.013f, 2.0f)
                curveTo(13.066f, 2.0f, 13.933f, 2.25f, 14.632f, 2.697f)
                curveTo(15.331f, 3.144f, 15.818f, 3.759f, 16.153f, 4.415f)
                curveTo(16.526f, 5.147f, 16.718f, 5.947f, 16.813f, 6.671f)
                curveTo(15.674f, 7.5f, 14.186f, 8.233f, 12.013f, 8.233f)
                curveTo(9.814f, 8.233f, 8.317f, 7.483f, 7.172f, 6.641f)
                curveTo(7.266f, 5.921f, 7.464f, 5.135f, 7.84f, 4.414f)
                curveTo(8.183f, 3.756f, 8.679f, 3.143f, 9.383f, 2.697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.482f, 8.493f)
                curveTo(7.639f, 9.278f, 9.125f, 9.973f, 11.104f, 10.138f)
                verticalLineTo(16.235f)
                horizontalLineTo(12.952f)
                verticalLineTo(10.136f)
                curveTo(14.946f, 9.963f, 16.438f, 9.253f, 17.598f, 8.457f)
                curveTo(17.899f, 8.732f, 18.16f, 9.04f, 18.382f, 9.376f)
                lineTo(21.02f, 8.076f)
                lineTo(21.892f, 10.03f)
                lineTo(19.211f, 11.351f)
                curveTo(19.385f, 12.091f, 19.445f, 12.877f, 19.408f, 13.666f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.824f)
                horizontalLineTo(19.068f)
                curveTo(19.038f, 15.935f, 19.006f, 16.045f, 18.972f, 16.154f)
                curveTo(18.822f, 16.645f, 18.632f, 17.131f, 18.404f, 17.601f)
                lineTo(20.905f, 19.76f)
                lineTo(19.601f, 21.427f)
                lineTo(17.26f, 19.406f)
                curveTo(16.018f, 20.931f, 14.261f, 22.0f, 12.059f, 22.0f)
                curveTo(9.828f, 22.0f, 8.055f, 20.902f, 6.81f, 19.346f)
                lineTo(4.4f, 21.427f)
                lineTo(3.096f, 19.76f)
                lineTo(5.68f, 17.528f)
                curveTo(5.467f, 17.081f, 5.289f, 16.62f, 5.146f, 16.154f)
                curveTo(5.112f, 16.045f, 5.081f, 15.935f, 5.051f, 15.824f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.666f)
                horizontalLineTo(4.71f)
                curveTo(4.674f, 12.895f, 4.731f, 12.128f, 4.895f, 11.403f)
                lineTo(2.108f, 10.03f)
                lineTo(2.98f, 8.076f)
                lineTo(5.707f, 9.42f)
                curveTo(5.926f, 9.082f, 6.184f, 8.771f, 6.482f, 8.493f)
                close()
            }
        }
        .build()
        return _bugSolidMd!!
    }

private var _bugSolidMd: ImageVector? = null
