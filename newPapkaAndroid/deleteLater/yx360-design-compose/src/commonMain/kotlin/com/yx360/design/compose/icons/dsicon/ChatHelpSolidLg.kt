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

public val DsIcon.ChatHelpSolidLg: ImageVector
    get() {
        if (_chatHelpSolidLg != null) {
            return _chatHelpSolidLg!!
        }
        _chatHelpSolidLg = Builder(name = "ChatHelpSolidLg", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.238f, 14.5f)
                curveTo(28.238f, 20.833f, 22.871f, 24.0f, 16.238f, 24.0f)
                curveTo(15.748f, 24.0f, 15.265f, 23.983f, 14.79f, 23.948f)
                lineTo(10.738f, 28.0f)
                horizontalLineTo(9.238f)
                verticalLineTo(22.525f)
                curveTo(6.209f, 21.013f, 4.238f, 18.338f, 4.238f, 14.5f)
                curveTo(4.238f, 8.167f, 9.606f, 5.0f, 16.238f, 5.0f)
                curveTo(22.871f, 5.0f, 28.238f, 8.167f, 28.238f, 14.5f)
                close()
                moveTo(14.811f, 10.879f)
                curveTo(14.536f, 11.136f, 14.294f, 11.568f, 14.294f, 12.3f)
                horizontalLineTo(12.294f)
                curveTo(12.294f, 11.079f, 12.72f, 10.094f, 13.447f, 9.417f)
                curveTo(14.156f, 8.754f, 15.073f, 8.458f, 15.943f, 8.438f)
                curveTo(16.81f, 8.418f, 17.706f, 8.67f, 18.408f, 9.203f)
                curveTo(19.13f, 9.752f, 19.638f, 10.599f, 19.638f, 11.663f)
                curveTo(19.638f, 12.573f, 19.418f, 13.279f, 19.016f, 13.845f)
                curveTo(18.643f, 14.37f, 18.158f, 14.703f, 17.82f, 14.935f)
                lineTo(17.804f, 14.947f)
                curveTo(17.425f, 15.207f, 17.221f, 15.353f, 17.075f, 15.548f)
                curveTo(16.96f, 15.701f, 16.838f, 15.946f, 16.838f, 16.458f)
                horizontalLineTo(14.838f)
                curveTo(14.838f, 15.575f, 15.066f, 14.892f, 15.476f, 14.347f)
                curveTo(15.832f, 13.872f, 16.294f, 13.556f, 16.614f, 13.337f)
                lineTo(16.672f, 13.298f)
                curveTo(17.034f, 13.05f, 17.239f, 12.894f, 17.385f, 12.688f)
                curveTo(17.508f, 12.514f, 17.638f, 12.23f, 17.638f, 11.663f)
                curveTo(17.638f, 11.29f, 17.478f, 11.009f, 17.198f, 10.796f)
                curveTo(16.898f, 10.569f, 16.458f, 10.427f, 15.989f, 10.438f)
                curveTo(15.523f, 10.448f, 15.104f, 10.606f, 14.811f, 10.879f)
                close()
                moveTo(15.854f, 19.854f)
                curveTo(16.505f, 19.854f, 17.033f, 19.326f, 17.033f, 18.674f)
                curveTo(17.033f, 18.023f, 16.505f, 17.495f, 15.854f, 17.495f)
                curveTo(15.202f, 17.495f, 14.674f, 18.023f, 14.674f, 18.674f)
                curveTo(14.674f, 19.326f, 15.202f, 19.854f, 15.854f, 19.854f)
                close()
            }
        }
        .build()
        return _chatHelpSolidLg!!
    }

private var _chatHelpSolidLg: ImageVector? = null
