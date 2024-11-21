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

public val DsIcon.WhatappSolidMd: ImageVector
    get() {
        if (_whatappSolidMd != null) {
            return _whatappSolidMd!!
        }
        _whatappSolidMd = Builder(name = "WhatappSolidMd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.702f, 17.578f)
                curveTo(2.593f, 15.929f, 2.0f, 13.987f, 2.0f, 12.0f)
                curveTo(2.0f, 6.479f, 6.481f, 2.0f, 12.0f, 2.0f)
                curveTo(17.521f, 2.0f, 22.0f, 6.479f, 22.0f, 12.0f)
                curveTo(22.0f, 17.521f, 17.521f, 22.0f, 12.0f, 22.0f)
                curveTo(10.112f, 22.003f, 8.263f, 21.469f, 6.667f, 20.461f)
                lineTo(2.825f, 21.787f)
                curveTo(2.785f, 21.801f, 2.741f, 21.803f, 2.699f, 21.794f)
                curveTo(2.658f, 21.785f, 2.619f, 21.764f, 2.589f, 21.735f)
                curveTo(2.558f, 21.705f, 2.536f, 21.668f, 2.524f, 21.627f)
                curveTo(2.513f, 21.586f, 2.514f, 21.542f, 2.526f, 21.501f)
                lineTo(3.702f, 17.578f)
                close()
                moveTo(7.307f, 8.283f)
                curveTo(7.604f, 7.734f, 8.127f, 7.295f, 8.889f, 7.013f)
                curveTo(8.966f, 6.985f, 9.341f, 6.981f, 9.476f, 7.207f)
                curveTo(9.979f, 8.051f, 10.402f, 8.745f, 10.736f, 9.295f)
                lineTo(11.105f, 9.903f)
                curveTo(11.136f, 9.955f, 11.278f, 10.288f, 11.036f, 10.52f)
                curveTo(10.839f, 10.71f, 10.456f, 11.1f, 10.456f, 11.1f)
                curveTo(11.336f, 12.59f, 12.328f, 13.692f, 13.664f, 14.321f)
                curveTo(13.664f, 14.321f, 14.104f, 13.891f, 14.318f, 13.672f)
                curveTo(14.533f, 13.453f, 14.881f, 13.585f, 14.938f, 13.622f)
                curveTo(15.828f, 14.177f, 16.716f, 14.733f, 17.603f, 15.292f)
                curveTo(17.843f, 15.442f, 17.778f, 15.786f, 17.746f, 15.862f)
                curveTo(17.423f, 16.642f, 16.952f, 17.172f, 16.383f, 17.47f)
                curveTo(15.757f, 17.798f, 15.031f, 17.842f, 14.277f, 17.685f)
                curveTo(12.769f, 17.373f, 11.133f, 16.275f, 9.784f, 14.895f)
                curveTo(8.435f, 13.515f, 7.371f, 11.856f, 7.079f, 10.357f)
                curveTo(6.932f, 9.607f, 6.98f, 8.887f, 7.307f, 8.283f)
                close()
            }
        }
        .build()
        return _whatappSolidMd!!
    }

private var _whatappSolidMd: ImageVector? = null
