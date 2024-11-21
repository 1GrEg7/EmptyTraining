package com.yx360.design.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush

/**
 * Automatically generated file. DO NOT MODIFY
 */
@Suppress("MagicNumber")
object DsGradient {
    val YaPlus @Composable get() = arrayOf(
        0.0f to Ds.Color.MiscGradientYaPlus01,
        0.5f to Ds.Color.MiscGradientYaPlus02,
        1.0f to Ds.Color.MiscGradientYaPlus03,
    )
    val YaPlusBrush @Composable get() = Brush.horizontalGradient(
        colorStops = YaPlus,
    )

    val User @Composable get() = arrayOf(
        0.0f to Ds.UserColor.SurfaceUser,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val UserBrush @Composable get() = Brush.verticalGradient(
        colorStops = User,
    )

    val FeedbackInfo @Composable get() = arrayOf(
        0.0f to Ds.Color.SurfaceFeedbackInfo,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val FeedbackInfoBrush @Composable get() = Brush.verticalGradient(
        colorStops = FeedbackInfo,
    )

    val FeedbackSuccess @Composable get() = arrayOf(
        0.0f to Ds.Color.SurfaceFeedbackSuccess,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val FeedbackSuccessBrush @Composable get() = Brush.verticalGradient(
        colorStops = FeedbackSuccess,
    )

    val FeedbackWarning @Composable get() = arrayOf(
        0.0f to Ds.Color.SurfaceFeedbackWarning,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val FeedbackWarningBrush @Composable get() = Brush.verticalGradient(
        colorStops = FeedbackWarning,
    )

    val FeedbackDanger @Composable get() = arrayOf(
        0.0f to Ds.Color.SurfaceFeedbackDanger,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val FeedbackDangerBrush @Composable get() = Brush.verticalGradient(
        colorStops = FeedbackDanger,
    )

    val FeedbackNeutral @Composable get() = arrayOf(
        0.0f to Ds.Color.SurfaceFeedbackNeutral,
        1.0f to Ds.Color.MiscGradientFade,
    )
    val FeedbackNeutralBrush @Composable get() = Brush.verticalGradient(
        colorStops = FeedbackNeutral,
    )
}
