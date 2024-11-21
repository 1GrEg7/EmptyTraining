package com.yx360.design.compose.internal

import androidx.compose.runtime.Immutable
import com.yx360.design.compose.DsUserColor
import com.yx360.design.UserTheme

internal object DsUserColorSchemas {
    val Light = DsUserColorScheme(
        Violet = DsVioletColorSchemas.Light,
        Blue = DsBlueColorSchemas.Light,
        Sky = DsSkyColorSchemas.Light,
        Cyan = DsCyanColorSchemas.Light,
        Red = DsRedColorSchemas.Light,
        Pink = DsPinkColorSchemas.Light,
        Orange = DsOrangeColorSchemas.Light,
        Yellow = DsYellowColorSchemas.Light,
        GreenYellow = DsGreenYellowColorSchemas.Light,
        Lime = DsLimeColorSchemas.Light,
        Green = DsGreenColorSchemas.Light,
        Teal = DsTealColorSchemas.Light,
        Gray = DsGrayColorSchemas.Light,
    )

    val Dark = DsUserColorScheme(
        Violet = DsVioletColorSchemas.Dark,
        Blue = DsBlueColorSchemas.Dark,
        Sky = DsSkyColorSchemas.Dark,
        Cyan = DsCyanColorSchemas.Dark,
        Red = DsRedColorSchemas.Dark,
        Pink = DsPinkColorSchemas.Dark,
        Orange = DsOrangeColorSchemas.Dark,
        Yellow = DsYellowColorSchemas.Dark,
        GreenYellow = DsGreenYellowColorSchemas.Dark,
        Lime = DsLimeColorSchemas.Dark,
        Green = DsGreenColorSchemas.Dark,
        Teal = DsTealColorSchemas.Dark,
        Gray = DsGrayColorSchemas.Dark,
    )
}

@Immutable
internal class DsUserColorScheme(
    val Violet: DsUserColor,
    val Blue: DsUserColor,
    val Sky: DsUserColor,
    val Cyan: DsUserColor,
    val Red: DsUserColor,
    val Pink: DsUserColor,
    val Orange: DsUserColor,
    val Yellow: DsUserColor,
    val GreenYellow: DsUserColor,
    val Lime: DsUserColor,
    val Green: DsUserColor,
    val Teal: DsUserColor,
    val Gray: DsUserColor,
)

internal fun DsUserColorScheme.resolveUserTheme(userTheme: UserTheme): DsUserColor {
    return when (userTheme) {
        UserTheme.Violet -> Violet
        UserTheme.Blue -> Blue
        UserTheme.Sky -> Sky
        UserTheme.Cyan -> Cyan
        UserTheme.Red -> Red
        UserTheme.Pink -> Pink
        UserTheme.Orange -> Orange
        UserTheme.Yellow -> Yellow
        UserTheme.GreenYellow -> GreenYellow
        UserTheme.Lime -> Lime
        UserTheme.Green -> Green
        UserTheme.Teal -> Teal
        UserTheme.Gray -> Gray
    }
}
