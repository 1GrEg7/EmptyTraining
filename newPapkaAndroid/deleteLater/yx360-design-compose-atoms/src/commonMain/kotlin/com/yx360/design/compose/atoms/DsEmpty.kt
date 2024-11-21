package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.yx360.design.compose.Ds

/**
 * [Figma](https://nda.ya.ru/t/VO5RN_iM77CbKu)
 */
@Composable
fun DsEmpty(
    title: String? = null,
    description: String? = null,
    modifier: Modifier = Modifier,
    image: (@Composable () -> Unit)? = null,
    button: (@Composable () -> Unit)? = null
) {
    Column(
        modifier
            .padding(Ds.Size.M16)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (image != null) {
            image.invoke()
            Spacer(modifier = Modifier.height(Ds.Size.M8))
        }
        if (title != null) {
            Text(
                text = title,
                color = Ds.Color.TextPrimary,
                style = Ds.Typography.HeadingXs,
                textAlign = TextAlign.Center,
            )
            if (description != null) {
                Spacer(modifier = Modifier.height(Ds.Size.M2))
            }
        }
        if (description != null) {
            Text(
                text = description,
                color = Ds.Color.TextSecondary,
                style = Ds.Typography.BodyLgRegular,
                textAlign = TextAlign.Center
            )
        }
        if (button != null) {
            Spacer(modifier = Modifier.height(Ds.Size.M8))
            button.invoke()
        }
    }
}

@Composable
fun DsEmpty(
    title: String? = null,
    description: String? = null,
    image: (@Composable () -> Unit)? = null,
    buttonTitle: String? = null,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    DsEmpty(
        description = description,
        modifier = modifier,
        title = title,
        image = image,
        button = buttonTitle?.let {
            {
                DsButton(
                    title = buttonTitle,
                    variant = DsButton.Style.Neutral,
                    onClick = onClick
                )
            }
        }
    )
}
