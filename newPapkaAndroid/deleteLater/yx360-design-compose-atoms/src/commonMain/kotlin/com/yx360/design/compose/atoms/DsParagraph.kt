package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import com.yx360.design.compose.Ds

/**
 * [Figma](https://nda.ya.ru/t/PxO41zOK77jckS)
 */
@Composable
fun DsParagraph(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Ds.Color.TextPrimary,
    size: DsParagraph.Size = DsParagraph.Size.Lg,
) {
    DsParagraph(
        text = remember(text) { AnnotatedString(text) },
        modifier = modifier,
        color = color,
        size = size
    )
}

@Composable
fun DsParagraph(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Ds.Color.TextPrimary,
    size: DsParagraph.Size = DsParagraph.Size.Lg,
) {
    val paragraphSize = when (size) {
        DsParagraph.Size.Lg -> Ds.Typography.BodyLgRegular
        DsParagraph.Size.LgShort -> Ds.Typography.BodyShortLgRegular
        DsParagraph.Size.Md -> Ds.Typography.BodyMdRegular
        DsParagraph.Size.MdShort -> Ds.Typography.BodyShortMdRegular
        DsParagraph.Size.Sm -> Ds.Typography.CaptionMdRegular
    }

    Text(
        text = text,
        color = color,
        style = paragraphSize,
        modifier = modifier.padding(horizontal = Ds.Spacing.M8, vertical = Ds.Spacing.M4)
    )
}

object DsParagraph {
    enum class Size {
        Lg,
        LgShort,
        Md,
        MdShort,
        Sm
    }
}
