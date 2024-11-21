package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsTypography

/**
 * [Figma](https://nda.ya.ru/t/X7rhdxAQ77bRki)
 */
@Composable
fun DsHeading(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    size: DsHeading.Size = DsHeading.Size.Md,
    align: DsHeading.Align = DsHeading.Align.Start,
    titleMaxLines: Int = Int.MAX_VALUE,
    subtitleMaxLines: Int = Int.MAX_VALUE,
    titleOverflow: TextOverflow = TextOverflow.Clip,
    slot: (@Composable () -> Unit)? = null,
) {
    val subtitleStyle = DsTypography.BodyLgRegular
    val titleStyle = when (size) {
        DsHeading.Size.Xl -> {
            DsTypography.HeadingXl
        }

        DsHeading.Size.Lg -> {
            DsTypography.HeadingLg
        }

        DsHeading.Size.Md -> {
            DsTypography.HeadingMd
        }

        DsHeading.Size.Sm -> {
            DsTypography.HeadingSm
        }

        DsHeading.Size.Xs -> {
            DsTypography.HeadingXs
        }
    }
    val textAlign = when (align) {
        DsHeading.Align.Start -> TextAlign.Start
        DsHeading.Align.Center -> TextAlign.Center
    }
    Row(
        modifier = modifier
            .padding(
                top = Ds.Spacing.M6,
                bottom = Ds.Spacing.M4,
                start = Ds.Spacing.M8,
                end = Ds.Spacing.M8
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Ds.Color.TextPrimary,
                textAlign = textAlign,
                style = titleStyle,
                modifier = Modifier.fillMaxWidth(),
                maxLines = titleMaxLines,
                overflow = titleOverflow,
            )
            Spacer(modifier = Modifier.height(Ds.Spacing.M2))
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    color = Ds.Color.TextSecondary,
                    textAlign = textAlign,
                    style = subtitleStyle,
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = subtitleMaxLines,
                )
            }
        }

        if (slot != null) {
            Spacer(modifier = Modifier.width(Ds.Spacing.M8))
            slot()
        }
    }
}

object DsHeading {
    enum class Size {
        Xl,
        Lg,
        Md,
        Sm,
        Xs
    }

    enum class Align {
        Start,
        Center,
    }
}
