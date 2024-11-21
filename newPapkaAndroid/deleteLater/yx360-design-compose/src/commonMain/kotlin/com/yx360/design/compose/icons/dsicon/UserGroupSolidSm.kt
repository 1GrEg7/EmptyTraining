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

public val DsIcon.UserGroupSolidSm: ImageVector
    get() {
        if (_userGroupSolidSm != null) {
            return _userGroupSolidSm!!
        }
        _userGroupSolidSm = Builder(name = "UserGroupSolidSm", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.364f, 4.796f)
                curveTo(8.364f, 6.954f, 6.909f, 8.392f, 5.455f, 8.392f)
                curveTo(4.0f, 8.392f, 2.545f, 6.954f, 2.545f, 4.796f)
                curveTo(2.545f, 2.399f, 4.291f, 1.5f, 5.455f, 1.5f)
                curveTo(6.618f, 1.5f, 8.364f, 2.399f, 8.364f, 4.796f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.745f)
                curveTo(0.0f, 10.639f, 1.82f, 9.472f, 5.455f, 9.472f)
                curveTo(9.089f, 9.472f, 10.909f, 10.639f, 10.909f, 12.745f)
                curveTo(10.909f, 13.744f, 8.468f, 14.55f, 5.455f, 14.55f)
                curveTo(2.441f, 14.55f, 0.0f, 13.744f, 0.0f, 12.745f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.182f, 5.759f)
                curveTo(14.182f, 7.36f, 13.091f, 8.392f, 12.0f, 8.392f)
                curveTo(10.909f, 8.392f, 9.818f, 7.36f, 9.818f, 5.759f)
                curveTo(9.818f, 3.981f, 11.127f, 3.314f, 12.0f, 3.314f)
                curveTo(12.873f, 3.314f, 14.182f, 3.981f, 14.182f, 5.759f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.833f)
                curveTo(11.874f, 13.833f, 11.75f, 13.831f, 11.627f, 13.826f)
                curveTo(11.841f, 13.54f, 12.0f, 13.18f, 12.0f, 12.745f)
                curveTo(12.0f, 11.452f, 11.468f, 10.371f, 10.454f, 9.619f)
                curveTo(10.907f, 9.527f, 11.422f, 9.48f, 12.0f, 9.48f)
                curveTo(14.665f, 9.48f, 16.0f, 10.48f, 16.0f, 12.286f)
                curveTo(16.0f, 13.142f, 14.21f, 13.833f, 12.0f, 13.833f)
                close()
            }
        }
        .build()
        return _userGroupSolidSm!!
    }

private var _userGroupSolidSm: ImageVector? = null
