package com.yx360.design.compose.atoms.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.icons.dsicon.FaqSolidMd
import com.yx360.design.compose.icons.dsicon.InfoSolidMd
import com.yx360.design.compose.icons.dsicon.SuccessSolidMd
import com.yx360.design.compose.icons.dsicon.WarningSolidMd

/**
 * [Figma](https://nda.ya.ru/t/Yx6IjqwM77cbNL)
 */
@Composable
fun DsSnackbarFeedback(
    title: String,
    style: DsSnackbarFeedback.Style,
    modifier: Modifier = Modifier,
    topOffset: Dp = Ds.Spacing.M8,
    button: DsSnackbar.Button? = null,
    chevron: DsSnackbar.Chevron? = null,
) {
    val iconTint = when (style) {
        DsSnackbarFeedback.Style.Success -> Ds.Color.TextFeedbackSuccess
        DsSnackbarFeedback.Style.Warning -> Ds.Color.TextFeedbackWarning
        DsSnackbarFeedback.Style.Info -> Ds.Color.TextFeedbackInfo
        DsSnackbarFeedback.Style.Danger -> Ds.Color.TextFeedbackDanger
        DsSnackbarFeedback.Style.Neutral -> Ds.Color.TextFeedbackNeutral
    }
    DsSnackbar(
        modifier = modifier,
        title = title,
        icon = DsSnackbar.Icon(style.icon, iconTint),
        topOffset = topOffset,
        button = button,
        chevron = chevron,
    )
}

object DsSnackbarFeedback {
    enum class Style(val icon: ImageVector) {
        Success(Ds.Icon.SuccessSolidMd),
        Warning(Ds.Icon.WarningSolidMd),
        Info(Ds.Icon.InfoSolidMd),
        Danger(Ds.Icon.WarningSolidMd),
        Neutral(Ds.Icon.FaqSolidMd),
    }
}
