package com.yx360.design.compose.atoms.fab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

/**
 * [Figma](https://nda.ya.ru/t/Ve8FqlEz77PQPP)
 */
@Composable
fun DsButtonFab(
    type: DsButtonFab.Type,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    loadingIndicator: Boolean = false,
) {
    when (type) {
        is DsButtonFab.Type.Icon -> DsButtonFabIcon(
            type.painter,
            onClick,
            modifier,
            loadingIndicator
        )
        is DsButtonFab.Type.Text -> DsButtonFabText(
            type.text,
            onClick,
            modifier,
            loadingIndicator
        )
    }
}

object DsButtonFab {

    sealed interface Type {

        class Icon(val painter: Painter): Type

        class Text(val text: String): Type
    }
}
